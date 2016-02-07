package be.cipal.poc

import javax.xml.bind.JAXBElement
import javax.xml.namespace.QName

import org.springframework.beans.factory.annotation.Autowired

import be.cipal.poc.v1.addressbook.response.Person
import be.cipal.poc.v1.addressbook.response.Persons

import spock.lang.Specification

class AddressRepositorySpec extends Specification{

    AddressRepository repository

    def "Find Person by first name FN 1"() {
        given: "A repository"
        repository = new AddressRepository()

        when: "call findAddress giving a name"
        Person p =  repository.findAddress("FN 1")

        then: "It should return the person, call the repository once"
        "FN 1" == p.firstName
        "LN 1" == p.lastName
        "10000001a" == p.idn
    }

    def "get all people "() {
        given: "A repository"
        repository = new AddressRepository()

        when: "call findAddress giving a name"
        List<Persons> p =  repository.people

        then: "It should return the person, call the repository once"
        p.size() == 100
        p.get(0).firstName == "FN 1"
        p.get(p.size()-1).firstName == "FN 100"
    }

}
