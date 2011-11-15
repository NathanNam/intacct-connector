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
@XmlType(name = "", propOrder = {"recordno", "customerid", "bankname", "bankadd1", "bankadd2", "aba",
    "accountnumber", "bankaccounttype"})
@XmlRootElement(name = "customerachinfo")
public class Customerachinfo
{

    @XmlElement(required = true)
    protected String recordno;
    @XmlElement(required = true)
    protected String customerid;
    @XmlElement(required = true)
    protected String bankname;
    protected String bankadd1;
    protected String bankadd2;
    @XmlElement(required = true)
    protected String aba;
    @XmlElement(required = true)
    protected String accountnumber;
    @XmlElement(required = true)
    protected String bankaccounttype;

    /**
     * Gets the value of the recordno property.
     * 
     * @return possible object is {@link String }
     */
    public String getRecordno()
    {
        return recordno;
    }

    /**
     * Sets the value of the recordno property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setRecordno(String value)
    {
        this.recordno = value;
    }

    /**
     * Gets the value of the customerid property.
     * 
     * @return possible object is {@link String }
     */
    public String getCustomerid()
    {
        return customerid;
    }

    /**
     * Sets the value of the customerid property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setCustomerid(String value)
    {
        this.customerid = value;
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

    /**
     * Gets the value of the bankadd1 property.
     * 
     * @return possible object is {@link String }
     */
    public String getBankadd1()
    {
        return bankadd1;
    }

    /**
     * Sets the value of the bankadd1 property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setBankadd1(String value)
    {
        this.bankadd1 = value;
    }

    /**
     * Gets the value of the bankadd2 property.
     * 
     * @return possible object is {@link String }
     */
    public String getBankadd2()
    {
        return bankadd2;
    }

    /**
     * Sets the value of the bankadd2 property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setBankadd2(String value)
    {
        this.bankadd2 = value;
    }

    /**
     * Gets the value of the aba property.
     * 
     * @return possible object is {@link String }
     */
    public String getAba()
    {
        return aba;
    }

    /**
     * Sets the value of the aba property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setAba(String value)
    {
        this.aba = value;
    }

    /**
     * Gets the value of the accountnumber property.
     * 
     * @return possible object is {@link String }
     */
    public String getAccountnumber()
    {
        return accountnumber;
    }

    /**
     * Sets the value of the accountnumber property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setAccountnumber(String value)
    {
        this.accountnumber = value;
    }

    /**
     * Gets the value of the bankaccounttype property.
     * 
     * @return possible object is {@link String }
     */
    public String getBankaccounttype()
    {
        return bankaccounttype;
    }

    /**
     * Sets the value of the bankaccounttype property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setBankaccounttype(String value)
    {
        this.bankaccounttype = value;
    }

}
