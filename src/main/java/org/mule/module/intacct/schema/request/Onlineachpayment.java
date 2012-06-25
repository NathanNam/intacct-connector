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
@XmlType(name = "", propOrder = {"bankname", "accounttype", "accountnumber", "routingnumber",
    "accountholder", "usedefaultaccount"})
@XmlRootElement(name = "onlineachpayment")
public class Onlineachpayment
{

    @XmlElement(required = true)
    protected String bankname;
    @XmlElement(required = true)
    protected String accounttype;
    @XmlElement(required = true)
    protected String accountnumber;
    @XmlElement(required = true)
    protected String routingnumber;
    @XmlElement(required = true)
    protected String accountholder;
    protected String usedefaultaccount;

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
     * Gets the value of the accounttype property.
     * 
     * @return possible object is {@link String }
     */
    public String getAccounttype()
    {
        return accounttype;
    }

    /**
     * Sets the value of the accounttype property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setAccounttype(String value)
    {
        this.accounttype = value;
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
     * Gets the value of the routingnumber property.
     * 
     * @return possible object is {@link String }
     */
    public String getRoutingnumber()
    {
        return routingnumber;
    }

    /**
     * Sets the value of the routingnumber property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setRoutingnumber(String value)
    {
        this.routingnumber = value;
    }

    /**
     * Gets the value of the accountholder property.
     * 
     * @return possible object is {@link String }
     */
    public String getAccountholder()
    {
        return accountholder;
    }

    /**
     * Sets the value of the accountholder property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setAccountholder(String value)
    {
        this.accountholder = value;
    }

    /**
     * Gets the value of the usedefaultaccount property.
     * 
     * @return possible object is {@link String }
     */
    public String getUsedefaultaccount()
    {
        return usedefaultaccount;
    }

    /**
     * Sets the value of the usedefaultaccount property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setUsedefaultaccount(String value)
    {
        this.usedefaultaccount = value;
    }

}
