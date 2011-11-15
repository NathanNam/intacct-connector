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
@XmlType(name = "", propOrder = {"key", "vendorid", "datecreated", "dateposted", "datedue", "datepaid",
    "termname", "batchkey", "billno", "ponumber", "totalamount", "totalpaid", "totaldue", "onhold",
    "description", "trxTotalamount", "trxTotalpaid", "trxTotaldue", "basecurr", "currency", "customfields",
    "billitems", "payto", "returnto", "whenmodified", "state"})
@XmlRootElement(name = "bill")
public class Bill
{

    protected Key key;
    protected String vendorid;
    protected Datecreated datecreated;
    protected Dateposted dateposted;
    protected Datedue datedue;
    protected String datepaid;
    protected String termname;
    protected String batchkey;
    protected String billno;
    protected String ponumber;
    protected String totalamount;
    protected String totalpaid;
    protected String totaldue;
    protected String onhold;
    protected String description;
    @XmlElement(name = "trx_totalamount")
    protected String trxTotalamount;
    @XmlElement(name = "trx_totalpaid")
    protected String trxTotalpaid;
    @XmlElement(name = "trx_totaldue")
    protected String trxTotaldue;
    protected String basecurr;
    protected String currency;
    protected Customfields customfields;
    protected Billitems billitems;
    protected Payto payto;
    protected Returnto returnto;
    protected String whenmodified;
    protected String state;

    /**
     * Gets the value of the key property.
     * 
     * @return possible object is {@link Key }
     */
    public Key getKey()
    {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value allowed object is {@link Key }
     */
    public void setKey(Key value)
    {
        this.key = value;
    }

    /**
     * Gets the value of the vendorid property.
     * 
     * @return possible object is {@link String }
     */
    public String getVendorid()
    {
        return vendorid;
    }

    /**
     * Sets the value of the vendorid property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setVendorid(String value)
    {
        this.vendorid = value;
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
     * Gets the value of the dateposted property.
     * 
     * @return possible object is {@link Dateposted }
     */
    public Dateposted getDateposted()
    {
        return dateposted;
    }

    /**
     * Sets the value of the dateposted property.
     * 
     * @param value allowed object is {@link Dateposted }
     */
    public void setDateposted(Dateposted value)
    {
        this.dateposted = value;
    }

    /**
     * Gets the value of the datedue property.
     * 
     * @return possible object is {@link Datedue }
     */
    public Datedue getDatedue()
    {
        return datedue;
    }

    /**
     * Sets the value of the datedue property.
     * 
     * @param value allowed object is {@link Datedue }
     */
    public void setDatedue(Datedue value)
    {
        this.datedue = value;
    }

    /**
     * Gets the value of the datepaid property.
     * 
     * @return possible object is {@link String }
     */
    public String getDatepaid()
    {
        return datepaid;
    }

    /**
     * Sets the value of the datepaid property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setDatepaid(String value)
    {
        this.datepaid = value;
    }

    /**
     * Gets the value of the termname property.
     * 
     * @return possible object is {@link String }
     */
    public String getTermname()
    {
        return termname;
    }

    /**
     * Sets the value of the termname property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setTermname(String value)
    {
        this.termname = value;
    }

    /**
     * Gets the value of the batchkey property.
     * 
     * @return possible object is {@link String }
     */
    public String getBatchkey()
    {
        return batchkey;
    }

    /**
     * Sets the value of the batchkey property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setBatchkey(String value)
    {
        this.batchkey = value;
    }

    /**
     * Gets the value of the billno property.
     * 
     * @return possible object is {@link String }
     */
    public String getBillno()
    {
        return billno;
    }

    /**
     * Sets the value of the billno property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setBillno(String value)
    {
        this.billno = value;
    }

    /**
     * Gets the value of the ponumber property.
     * 
     * @return possible object is {@link String }
     */
    public String getPonumber()
    {
        return ponumber;
    }

    /**
     * Sets the value of the ponumber property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setPonumber(String value)
    {
        this.ponumber = value;
    }

    /**
     * Gets the value of the totalamount property.
     * 
     * @return possible object is {@link String }
     */
    public String getTotalamount()
    {
        return totalamount;
    }

    /**
     * Sets the value of the totalamount property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setTotalamount(String value)
    {
        this.totalamount = value;
    }

    /**
     * Gets the value of the totalpaid property.
     * 
     * @return possible object is {@link String }
     */
    public String getTotalpaid()
    {
        return totalpaid;
    }

    /**
     * Sets the value of the totalpaid property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setTotalpaid(String value)
    {
        this.totalpaid = value;
    }

    /**
     * Gets the value of the totaldue property.
     * 
     * @return possible object is {@link String }
     */
    public String getTotaldue()
    {
        return totaldue;
    }

    /**
     * Sets the value of the totaldue property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setTotaldue(String value)
    {
        this.totaldue = value;
    }

    /**
     * Gets the value of the onhold property.
     * 
     * @return possible object is {@link String }
     */
    public String getOnhold()
    {
        return onhold;
    }

    /**
     * Sets the value of the onhold property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setOnhold(String value)
    {
        this.onhold = value;
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
     * Gets the value of the trxTotalamount property.
     * 
     * @return possible object is {@link String }
     */
    public String getTrxTotalamount()
    {
        return trxTotalamount;
    }

    /**
     * Sets the value of the trxTotalamount property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setTrxTotalamount(String value)
    {
        this.trxTotalamount = value;
    }

    /**
     * Gets the value of the trxTotalpaid property.
     * 
     * @return possible object is {@link String }
     */
    public String getTrxTotalpaid()
    {
        return trxTotalpaid;
    }

    /**
     * Sets the value of the trxTotalpaid property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setTrxTotalpaid(String value)
    {
        this.trxTotalpaid = value;
    }

    /**
     * Gets the value of the trxTotaldue property.
     * 
     * @return possible object is {@link String }
     */
    public String getTrxTotaldue()
    {
        return trxTotaldue;
    }

    /**
     * Sets the value of the trxTotaldue property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setTrxTotaldue(String value)
    {
        this.trxTotaldue = value;
    }

    /**
     * Gets the value of the basecurr property.
     * 
     * @return possible object is {@link String }
     */
    public String getBasecurr()
    {
        return basecurr;
    }

    /**
     * Sets the value of the basecurr property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setBasecurr(String value)
    {
        this.basecurr = value;
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
     * Gets the value of the customfields property.
     * 
     * @return possible object is {@link Customfields }
     */
    public Customfields getCustomfields()
    {
        return customfields;
    }

    /**
     * Sets the value of the customfields property.
     * 
     * @param value allowed object is {@link Customfields }
     */
    public void setCustomfields(Customfields value)
    {
        this.customfields = value;
    }

    /**
     * Gets the value of the billitems property.
     * 
     * @return possible object is {@link Billitems }
     */
    public Billitems getBillitems()
    {
        return billitems;
    }

    /**
     * Sets the value of the billitems property.
     * 
     * @param value allowed object is {@link Billitems }
     */
    public void setBillitems(Billitems value)
    {
        this.billitems = value;
    }

    /**
     * Gets the value of the payto property.
     * 
     * @return possible object is {@link Payto }
     */
    public Payto getPayto()
    {
        return payto;
    }

    /**
     * Sets the value of the payto property.
     * 
     * @param value allowed object is {@link Payto }
     */
    public void setPayto(Payto value)
    {
        this.payto = value;
    }

    /**
     * Gets the value of the returnto property.
     * 
     * @return possible object is {@link Returnto }
     */
    public Returnto getReturnto()
    {
        return returnto;
    }

    /**
     * Sets the value of the returnto property.
     * 
     * @param value allowed object is {@link Returnto }
     */
    public void setReturnto(Returnto value)
    {
        this.returnto = value;
    }

    /**
     * Gets the value of the whenmodified property.
     * 
     * @return possible object is {@link String }
     */
    public String getWhenmodified()
    {
        return whenmodified;
    }

    /**
     * Sets the value of the whenmodified property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setWhenmodified(String value)
    {
        this.whenmodified = value;
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

}
