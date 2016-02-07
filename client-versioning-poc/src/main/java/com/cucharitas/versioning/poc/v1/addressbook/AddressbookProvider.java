
package com.cucharitas.versioning.poc.v1.addressbook;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebService(name = "addressbookProvider", targetNamespace = "http://www.cipal.be/poc/v1/addressbook")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    com.cucharitas.versioning.poc.v1.addressbook.ObjectFactory.class,
    com.cucharitas.versioning.poc.v1.addressbook.response.ObjectFactory.class,
    com.cucharitas.versioning.poc.common_types.ObjectFactory.class
})
public interface AddressbookProvider {


    /**
     * 
     * @param parameters
     * @return
     *     returns be.cipal.poc.v1.addressbook.AddressResponseV10
     */
    @WebMethod
    @WebResult(name = "AddressResponse-v1_0", targetNamespace = "http://www.cipal.be/poc/v1/addressbook", partName = "parameters")
    public AddressResponseV10 getAddress(
        @WebParam(name = "AddressRequest-v1_0", targetNamespace = "http://www.cipal.be/poc/v1/addressbook", partName = "parameters")
        AddressRequestV10 parameters);

}