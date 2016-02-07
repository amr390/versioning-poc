package com.cucharitas.versioning.poc

import groovy.util.logging.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.ws.server.endpoint.annotation.Endpoint
import org.springframework.ws.server.endpoint.annotation.PayloadRoot
import org.springframework.ws.server.endpoint.annotation.RequestPayload
import org.springframework.ws.server.endpoint.annotation.ResponsePayload

import com.cucharitas.versioning.poc.v1.addressbook.AddressRequestV10
import com.cucharitas.versioning.poc.v1.addressbook.AddressResponseV10
import com.cucharitas.versioning.poc.v1.addressbook.VoidRequestV11
import com.cucharitas.versioning.poc.v1.addressbook.AddressResponseV11
import com.cucharitas.versioning.poc.v1.addressbook.response.Person
import com.cucharitas.versioning.poc.v1.addressbook.response.Persons

import javax.xml.bind.JAXBElement
import javax.xml.namespace.QName

@Endpoint
@Slf4j
public class AddressBookEndpoint {
    private static final String NAMESPACE_URI = "http://www.versioning.cucharitas.com/poc/addressbook"

    private AddressRepository repository

    @Autowired
    public AddressBookEndpoint(AddressRepository repository) {
        this.repository = repository
    }

    @PayloadRoot(namespace = "http://www.versioning.cucharitas.com/poc/v1/addressbook", localPart = "AddressRequest-v1_0")
    @ResponsePayload
    public JAXBElement<AddressResponseV10> getAddressBook(@RequestPayload JAXBElement<AddressRequestV10> request){
        AddressResponseV10 response = new AddressResponseV10()
        response.setPerson(repository.findAddress(request.getValue()?.getName()))

        new JAXBElement<>(
            new QName(NAMESPACE_URI, "AddressResponse-v1_0"),
            AddressResponseV10.class,
            response)
    }

    @PayloadRoot(namespace = "http://www.versioning.cucharitas.com/poc/v1/addressbook", localPart = "ListAddressRequest-v1_0")
    @ResponsePayload
    public JAXBElement<AddressResponseV11> listAddressBook(@RequestPayload JAXBElement<VoidRequestV11> request){
        AddressResponseV11 response = new AddressResponseV11()
        Persons people = new Persons()
        people.getPerson().addAll(repository.people)
        response.setPersons(people)

        new JAXBElement<>(
            new QName(NAMESPACE_URI, "AddressResponse-v1_0"),
            AddressResponseV11.class,
            response)
    }

}
