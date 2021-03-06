/**
 * Mule Intacct Cloud Connector
 *
 * (c) 2003-2012 MuleSoft, Inc. This software is protected under international
 * copyright law. All use of this software is subject to MuleSoft's Master
 * Subscription Agreement (or other Terms of Service) separately entered
 * into between you and MuleSoft. If such an agreement is not in
 * place, you may not use the software.
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.3-hudson-jaxb-ri-2.2.3-3- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.01.20 at 12:04:27 PM ART 
//

package org.mule.module.intacct.schema.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"address1", "address2", "city", "state", "zip", "country", "isocountrycode"})
@XmlRootElement(name = "mailaddress")
public class Mailaddress
{

    protected String address1;
    protected String address2;
    protected String city;
    protected String state;
    protected String zip;
    protected String country;
    protected String isocountrycode;

    /**
     * Gets the value of the address1 property.
     * 
     * @return possible object is {@link String }
     */
    public String getAddress1()
    {
        return address1;
    }

    /**
     * Sets the value of the address1 property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setAddress1(String value)
    {
        this.address1 = value;
    }

    /**
     * Gets the value of the address2 property.
     * 
     * @return possible object is {@link String }
     */
    public String getAddress2()
    {
        return address2;
    }

    /**
     * Sets the value of the address2 property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setAddress2(String value)
    {
        this.address2 = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return possible object is {@link String }
     */
    public String getCity()
    {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setCity(String value)
    {
        this.city = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return possible object is {@link String }
     */
    public String getState()
    {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setState(String value)
    {
        this.state = value;
    }

    /**
     * Gets the value of the zip property.
     * 
     * @return possible object is {@link String }
     */
    public String getZip()
    {
        return zip;
    }

    /**
     * Sets the value of the zip property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setZip(String value)
    {
        this.zip = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return possible object is {@link String }
     */
    public String getCountry()
    {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setCountry(String value)
    {
        this.country = value;
    }

    /**
     * Gets the value of the isocountrycode property.
     * 
     * @return possible object is {@link String }
     */
    public String getIsocountrycode()
    {
        return isocountrycode;
    }

    /**
     * Sets the value of the isocountrycode property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setIsocountrycode(String value)
    {
        this.isocountrycode = value;
    }

}
