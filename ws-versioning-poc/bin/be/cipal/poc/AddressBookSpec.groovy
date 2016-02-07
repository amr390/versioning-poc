package be.cipal.poc

import javax.xml.bind.JAXBElement
import javax.xml.namespace.QName

import org.springframework.beans.factory.annotation.Autowired

import be.cipal.poc.v1.addressbook.AddressRequestV10
import be.cipal.poc.v1.addressbook.AddressResponseV10
import be.cipal.poc.v1.addressbook.response.Person

import spock.lang.Specification

class AddressBookSpec extends Specification{

    private static final String NAMESPACE_URI = "http://www.cipal.be/poc/addressbook"

    AddressRepository repository

    AddressBookEndpoint endpoint

    def "Person name should be John from mocked Repo"() {
        given: "A request with a name to filter addressses"
        repository = Mock()
        endpoint =  new AddressBookEndpoint(repository)

        AddressRequestV10 req = new AddressRequestV10(name: "John")
        JAXBElement<AddressRequestV10> reqJxb = new JAXBElement<>(
            new QName(NAMESPACE_URI, "AddressRequest"),
            AddressRequestV10.class,
            req)

        when: "Call the endpoint web service"
        JAXBElement<AddressResponseV10> resJxb = endpoint.getAddressBook(reqJxb)

        then: "It should return the name, call the repository once"
        resJxb?.getValue()?.getPerson()?.firstName == "John"
        1*repository.findAddress("John") >> new Person(
            firstName: "John",
            lastName:"Smith",
            idn: "12345678A")
    }

    def "Person name should be FN 1 from real Repo"() {
        given: "A request with a name to filter addressses"
        repository = new AddressRepository()
        repository.initData()
        endpoint =  new AddressBookEndpoint(repository)

        AddressRequestV10 req = new AddressRequestV10(name: "FN 1")
        JAXBElement<AddressRequestV10> reqJxb = new JAXBElement<>(
            new QName(NAMESPACE_URI, "AddressRequest"),
            AddressRequestV10.class,
            req)

        when: "Call the endpoint web service"
        JAXBElement<AddressResponseV10> resJxb = endpoint.getAddressBook(reqJxb)
        println resJxb.getValue()

        then: "It should return the name, call the repository once"
        //1*repository.findAddress("FN 1")
        resJxb.getValue()?.getPerson()?.firstName == "FN 1"

    }

}
