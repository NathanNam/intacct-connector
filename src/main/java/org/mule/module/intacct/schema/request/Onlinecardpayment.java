/*
 * Mule Intacct Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.3-hudson-jaxb-ri-2.2.3-3- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.01.20 at 12:04:16 PM ART 
//

package org.mule.module.intacct.schema.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"cardnum", "expirydate", "cardtype", "securitycode", "usedefaultcard"})
@XmlRootElement(name = "onlinecardpayment")
public class Onlinecardpayment
{

    @XmlElement(required = true)
    protected String cardnum;
    @XmlElement(required = true)
    protected Expirydate expirydate;
    @XmlElement(required = true)
    protected String cardtype;
    protected String securitycode;
    protected String usedefaultcard;

    /**
     * Gets the value of the cardnum property.
     * 
     * @return possible object is {@link String }
     */
    public String getCardnum()
    {
        return cardnum;
    }

    /**
     * Sets the value of the cardnum property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setCardnum(String value)
    {
        this.cardnum = value;
    }

    /**
     * Gets the value of the expirydate property.
     * 
     * @return possible object is {@link Expirydate }
     */
    public Expirydate getExpirydate()
    {
        return expirydate;
    }

    /**
     * Sets the value of the expirydate property.
     * 
     * @param value allowed object is {@link Expirydate }
     */
    public void setExpirydate(Expirydate value)
    {
        this.expirydate = value;
    }

    /**
     * Gets the value of the cardtype property.
     * 
     * @return possible object is {@link String }
     */
    public String getCardtype()
    {
        return cardtype;
    }

    /**
     * Sets the value of the cardtype property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setCardtype(String value)
    {
        this.cardtype = value;
    }

    /**
     * Gets the value of the securitycode property.
     * 
     * @return possible object is {@link String }
     */
    public String getSecuritycode()
    {
        return securitycode;
    }

    /**
     * Sets the value of the securitycode property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setSecuritycode(String value)
    {
        this.securitycode = value;
    }

    /**
     * Gets the value of the usedefaultcard property.
     * 
     * @return possible object is {@link String }
     */
    public String getUsedefaultcard()
    {
        return usedefaultcard;
    }

    /**
     * Sets the value of the usedefaultcard property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setUsedefaultcard(String value)
    {
        this.usedefaultcard = value;
    }

}
