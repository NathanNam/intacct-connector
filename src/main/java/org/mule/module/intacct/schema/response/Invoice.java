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
@XmlType(name = "", propOrder = {"key", "customerid", "datecreated", "dateposted", "datedue", "datepaid",
    "termname", "batchkey", "invoiceno", "ponumber", "totalamount", "totalpaid", "totaldue", "description",
    "trxTotalamount", "trxTotalpaid", "trxTotaldue", "basecurr", "currency", "billto", "shipto",
    "whenmodified", "state", "invoiceitems"})
@XmlRootElement(name = "invoice")
public class Invoice
{

    protected Key key;
    protected String customerid;
    protected Datecreated datecreated;
    protected Dateposted dateposted;
    protected Datedue datedue;
    protected String datepaid;
    protected String termname;
    protected String batchkey;
    protected String invoiceno;
    protected String ponumber;
    protected String totalamount;
    protected String totalpaid;
    protected String totaldue;
    protected String description;
    @XmlElement(name = "trx_totalamount")
    protected String trxTotalamount;
    @XmlElement(name = "trx_totalpaid")
    protected String trxTotalpaid;
    @XmlElement(name = "trx_totaldue")
    protected String trxTotaldue;
    protected String basecurr;
    protected String currency;
    protected Billto billto;
    protected Shipto shipto;
    protected String whenmodified;
    protected String state;
    protected Invoiceitems invoiceitems;

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
     * Gets the value of the invoiceno property.
     * 
     * @return possible object is {@link String }
     */
    public String getInvoiceno()
    {
        return invoiceno;
    }

    /**
     * Sets the value of the invoiceno property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setInvoiceno(String value)
    {
        this.invoiceno = value;
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
     * Gets the value of the billto property.
     * 
     * @return possible object is {@link Billto }
     */
    public Billto getBillto()
    {
        return billto;
    }

    /**
     * Sets the value of the billto property.
     * 
     * @param value allowed object is {@link Billto }
     */
    public void setBillto(Billto value)
    {
        this.billto = value;
    }

    /**
     * Gets the value of the shipto property.
     * 
     * @return possible object is {@link Shipto }
     */
    public Shipto getShipto()
    {
        return shipto;
    }

    /**
     * Sets the value of the shipto property.
     * 
     * @param value allowed object is {@link Shipto }
     */
    public void setShipto(Shipto value)
    {
        this.shipto = value;
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

    /**
     * Gets the value of the invoiceitems property.
     * 
     * @return possible object is {@link Invoiceitems }
     */
    public Invoiceitems getInvoiceitems()
    {
        return invoiceitems;
    }

    /**
     * Sets the value of the invoiceitems property.
     * 
     * @param value allowed object is {@link Invoiceitems }
     */
    public void setInvoiceitems(Invoiceitems value)
    {
        this.invoiceitems = value;
    }

}
