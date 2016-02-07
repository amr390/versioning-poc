
package com.cucharitas.versioning.poc.v1.addressbook.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Address complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Address">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="housenr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="streetName" type="{http://www.versioning.cucharitas.com/poc/common-types}LabelType"/>
 *         &lt;element name="city" type="{http://www.versioning.cucharitas.com/poc/common-types}LabelType"/>
 *         &lt;element name="state" type="{http://www.versioning.cucharitas.com/poc/v1/addressbook/response}StateType"/>
 *         &lt;element name="zip" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="phoneNumber" type="{http://www.versioning.cucharitas.com/poc/v1/addressbook/response}Phone"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Address", propOrder = {
    "housenr",
    "streetName",
    "city",
    "state",
    "zip",
    "phoneNumber"
})
public class Address {

    protected int housenr;
    @XmlElement(required = true)
    protected String streetName;
    @XmlElement(required = true)
    protected String city;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected StateType state;
    protected int zip;
    @XmlElement(required = true)
    protected Phone phoneNumber;

    /**
     * Gets the value of the housenr property.
     * 
     */
    public int getHousenr() {
        return housenr;
    }

    /**
     * Sets the value of the housenr property.
     * 
     */
    public void setHousenr(int value) {
        this.housenr = value;
    }

    /**
     * Gets the value of the streetName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetName() {
        return streetName;
    }

    /**
     * Sets the value of the streetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetName(String value) {
        this.streetName = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link StateType }
     *     
     */
    public StateType getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link StateType }
     *     
     */
    public void setState(StateType value) {
        this.state = value;
    }

    /**
     * Gets the value of the zip property.
     * 
     */
    public int getZip() {
        return zip;
    }

    /**
     * Sets the value of the zip property.
     * 
     */
    public void setZip(int value) {
        this.zip = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Phone }
     *     
     */
    public Phone getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Phone }
     *     
     */
    public void setPhoneNumber(Phone value) {
        this.phoneNumber = value;
    }

}
