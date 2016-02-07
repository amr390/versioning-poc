
package com.cucharitas.versioning.poc.v1.addressbook;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the be.cipal.poc.v1.addressbook package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddressRequestV10_QNAME = new QName("http://www.cipal.be/poc/v1/addressbook", "AddressRequest-v1_0");
    private final static QName _AddressResponseV10_QNAME = new QName("http://www.cipal.be/poc/v1/addressbook", "AddressResponse-v1_0");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: be.cipal.poc.v1.addressbook
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddressResponseV10 }
     * 
     */
    public AddressResponseV10 createAddressResponseV10() {
        return new AddressResponseV10();
    }

    /**
     * Create an instance of {@link AddressRequestV10 }
     * 
     */
    public AddressRequestV10 createAddressRequestV10() {
        return new AddressRequestV10();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressRequestV10 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cipal.be/poc/v1/addressbook", name = "AddressRequest-v1_0")
    public JAXBElement<AddressRequestV10> createAddressRequestV10(AddressRequestV10 value) {
        return new JAXBElement<AddressRequestV10>(_AddressRequestV10_QNAME, AddressRequestV10 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressResponseV10 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cipal.be/poc/v1/addressbook", name = "AddressResponse-v1_0")
    public JAXBElement<AddressResponseV10> createAddressResponseV10(AddressResponseV10 value) {
        return new JAXBElement<AddressResponseV10>(_AddressResponseV10_QNAME, AddressResponseV10 .class, null, value);
    }

}
