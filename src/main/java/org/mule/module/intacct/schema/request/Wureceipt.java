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

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"bankaccountid", "datecreated", "depositid", "depositdate",
    "customeridOrPayer", "referenceno", "description", "wureceiptitems"})
@XmlRootElement(name = "wureceipt")
public class Wureceipt
{

    @XmlElement(required = true)
    protected Bankaccountid bankaccountid;
    @XmlElement(required = true)
    protected Datecreated datecreated;
    @XmlElement(required = true)
    protected String depositid;
    @XmlElement(required = true)
    protected Depositdate depositdate;
    @XmlElements({@XmlElement(name = "customerid", required = true, type = Customerid.class),
        @XmlElement(name = "payer", required = true, type = Payer.class)})
    protected List<Object> customeridOrPayer;
    protected String referenceno;
    protected String description;
    @XmlElement(required = true)
    protected Wureceiptitems wureceiptitems;

    /**
     * Gets the value of the bankaccountid property.
     * 
     * @return possible object is {@link Bankaccountid }
     */
    public Bankaccountid getBankaccountid()
    {
        return bankaccountid;
    }

    /**
     * Sets the value of the bankaccountid property.
     * 
     * @param value allowed object is {@link Bankaccountid }
     */
    public void setBankaccountid(Bankaccountid value)
    {
        this.bankaccountid = value;
    }

    /**
     * Gets the value of the datecreated property.
     * 
     * @return possible object is {@link Datecreated }
     */
    public Datecreated getDatecreated()
    {
        return datecreated;
    }

    /**
     * Sets the value of the datecreated property.
     * 
     * @param value allowed object is {@link Datecreated }
     */
    public void setDatecreated(Datecreated value)
    {
        this.datecreated = value;
    }

    /**
     * Gets the value of the depositid property.
     * 
     * @return possible object is {@link String }
     */
    public String getDepositid()
    {
        return depositid;
    }

    /**
     * Sets the value of the depositid property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setDepositid(String value)
    {
        this.depositid = value;
    }

    /**
     * Gets the value of the depositdate property.
     * 
     * @return possible object is {@link Depositdate }
     */
    public Depositdate getDepositdate()
    {
        return depositdate;
    }

    /**
     * Sets the value of the depositdate property.
     * 
     * @param value allowed object is {@link Depositdate }
     */
    public void setDepositdate(Depositdate value)
    {
        this.depositdate = value;
    }

    /**
     * Gets the value of the customeridOrPayer property.
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
     * the customeridOrPayer property.
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getCustomeridOrPayer().add(newItem);
     * </pre>
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Customerid }
     * {@link Payer }
     */
    public List<Object> getCustomeridOrPayer()
    {
        if (customeridOrPayer == null)
        {
            customeridOrPayer = new ArrayList<Object>();
        }
        return this.customeridOrPayer;
    }

    /**
     * Gets the value of the referenceno property.
     * 
     * @return possible object is {@link String }
     */
    public String getReferenceno()
    {
        return referenceno;
    }

    /**
     * Sets the value of the referenceno property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setReferenceno(String value)
    {
        this.referenceno = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return possible object is {@link String }
     */
    public String getDescription()
    {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setDescription(String value)
    {
        this.description = value;
    }

    /**
     * Gets the value of the wureceiptitems property.
     * 
     * @return possible object is {@link Wureceiptitems }
     */
    public Wureceiptitems getWureceiptitems()
    {
        return wureceiptitems;
    }

    /**
     * Sets the value of the wureceiptitems property.
     * 
     * @param value allowed object is {@link Wureceiptitems }
     */
    public void setWureceiptitems(Wureceiptitems value)
    {
        this.wureceiptitems = value;
    }

}
