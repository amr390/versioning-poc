package com.cucharitas.versioning.poc

import groovy.util.logging.Slf4j
import javax.annotation.PostConstruct
import org.springframework.stereotype.Component
import org.springframework.util.Assert

import com.cucharitas.versioning.poc.v1.addressbook.response.*

@Slf4j
@Component
public class AddressRepository{
    private static final List<Person> people = []

    @PostConstruct
    public void initData(){
        (1..100).each{
            String id = 10000000 + it + "a"
            Phone phone = new Phone(
                areaCode: 32,
                exchange: "+",
                number: "678111222"
            )
            Address a = new Address(
                housenr: it,
                streetName: "Street N$it",
                city: "City N$it",
                state: StateType.BR,
                zip: it,
                phoneNumber: phone
            )
            Person p = new Person(
                firstName:"FN $it",
                lastName:"LN $it",
                idn: id,
                address: a)

            people.add(p)
        }
    }

    public Person findAddress(String name){
        Assert.notNull(name)

        log.info "looking for $name"
        Person p = people.find{ it ->
            log.info "---> Person name: $it.firstName"
            it.firstName == name || it.lastName == name ||
            it.idn == name
        }

        p
    }
}
