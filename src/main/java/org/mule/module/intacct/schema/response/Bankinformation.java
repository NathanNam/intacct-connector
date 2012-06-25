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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"bankaccountid", "bankaccountno", "bankname"})
@XmlRootElement(name = "bankinformation")
public class Bankinformation
{

    @XmlElement(required = true)
    protected String bankaccountid;
    @XmlElement(required = true)
    protected String bankaccountno;
    @XmlElement(required = true)
    protected String bankname;

    /**
     * Gets the value of the bankaccountid property.
     * 
     * @return possible object is {@link String }
     */
    public String getBankaccountid()
    {
        return bankaccountid;
    }

    /**
     * Sets the value of the bankaccountid property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setBankaccountid(String value)
    {
        this.bankaccountid = value;
    }

    /**
     * Gets the value of the bankaccountno property.
     * 
     * @return possible object is {@link String }
     */
    public String getBankaccountno()
    {
        return bankaccountno;
    }

    /**
     * Sets the value of the bankaccountno property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setBankaccountno(String value)
    {
        this.bankaccountno = value;
    }

    /**
     * Gets the value of the bankname property.
     * 
     * @return possible object is {@link String }
     */
    public String getBankname()
    {
        return bankname;
    }

    /**
     * Sets the value of the bankname property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setBankname(String value)
    {
        this.bankname = value;
    }

}
