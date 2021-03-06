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
@XmlType(name = "", propOrder = {"bankaccountid", "bankaccountno", "glaccountno", "bankname", "routingno",
    "branchid", "bankaccounttype", "phone", "nextcheck", "status", "lastreconciledbalance",
    "lastreconcileddate", "currency", "mailaddress"})
@XmlRootElement(name = "bankaccount")
public class Bankaccount
{

    protected String bankaccountid;
    protected String bankaccountno;
    protected Glaccountno glaccountno;
    protected String bankname;
    protected String routingno;
    protected String branchid;
    protected String bankaccounttype;
    protected String phone;
    protected String nextcheck;
    protected String status;
    protected String lastreconciledbalance;
    protected Lastreconcileddate lastreconcileddate;
    protected String currency;
    protected Mailaddress mailaddress;

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
     * Gets the value of the glaccountno property.
     * 
     * @return possible object is {@link Glaccountno }
     */
    public Glaccountno getGlaccountno()
    {
        return glaccountno;
    }

    /**
     * Sets the value of the glaccountno property.
     * 
     * @param value allowed object is {@link Glaccountno }
     */
    public void setGlaccountno(Glaccountno value)
    {
        this.glaccountno = value;
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
     * Gets the value of the routingno property.
     * 
     * @return possible object is {@link String }
     */
    public String getRoutingno()
    {
        return routingno;
    }

    /**
     * Sets the value of the routingno property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setRoutingno(String value)
    {
        this.routingno = value;
    }

    /**
     * Gets the value of the branchid property.
     * 
     * @return possible object is {@link String }
     */
    public String getBranchid()
    {
        return branchid;
    }

    /**
     * Sets the value of the branchid property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setBranchid(String value)
    {
        this.branchid = value;
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

    /**
     * Gets the value of the phone property.
     * 
     * @return possible object is {@link String }
     */
    public String getPhone()
    {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setPhone(String value)
    {
        this.phone = value;
    }

    /**
     * Gets the value of the nextcheck property.
     * 
     * @return possible object is {@link String }
     */
    public String getNextcheck()
    {
        return nextcheck;
    }

    /**
     * Sets the value of the nextcheck property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setNextcheck(String value)
    {
        this.nextcheck = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return possible object is {@link String }
     */
    public String getStatus()
    {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setStatus(String value)
    {
        this.status = value;
    }

    /**
     * Gets the value of the lastreconciledbalance property.
     * 
     * @return possible object is {@link String }
     */
    public String getLastreconciledbalance()
    {
        return lastreconciledbalance;
    }

    /**
     * Sets the value of the lastreconciledbalance property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setLastreconciledbalance(String value)
    {
        this.lastreconciledbalance = value;
    }

    /**
     * Gets the value of the lastreconcileddate property.
     * 
     * @return possible object is {@link Lastreconcileddate }
     */
    public Lastreconcileddate getLastreconcileddate()
    {
        return lastreconcileddate;
    }

    /**
     * Sets the value of the lastreconcileddate property.
     * 
     * @param value allowed object is {@link Lastreconcileddate }
     */
    public void setLastreconcileddate(Lastreconcileddate value)
    {
        this.lastreconcileddate = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return possible object is {@link String }
     */
    public String getCurrency()
    {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setCurrency(String value)
    {
        this.currency = value;
    }

    /**
     * Gets the value of the mailaddress property.
     * 
     * @return possible object is {@link Mailaddress }
     */
    public Mailaddress getMailaddress()
    {
        return mailaddress;
    }

    /**
     * Sets the value of the mailaddress property.
     * 
     * @param value allowed object is {@link Mailaddress }
     */
    public void setMailaddress(Mailaddress value)
    {
        this.mailaddress = value;
    }

}
