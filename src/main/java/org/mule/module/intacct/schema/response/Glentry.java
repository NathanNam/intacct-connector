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
@XmlType(name = "", propOrder = {"trtype", "amount", "glaccountno", "document", "datecreated", "memo",
    "locationid", "departmentid", "journalid", "batchno", "trxAmount", "exchRateDate", "exchRateTypeId",
    "exchangeRate", "reconDate"})
@XmlRootElement(name = "glentry")
public class Glentry
{

    protected String trtype;
    protected Amount amount;
    protected Glaccountno glaccountno;
    protected String document;
    protected Datecreated datecreated;
    protected String memo;
    protected Locationid locationid;
    protected Departmentid departmentid;
    protected String journalid;
    protected String batchno;
    @XmlElement(name = "trx_amount")
    protected String trxAmount;
    @XmlElement(name = "exch_rate_date")
    protected String exchRateDate;
    @XmlElement(name = "exch_rate_type_id")
    protected String exchRateTypeId;
    @XmlElement(name = "exchange_rate")
    protected String exchangeRate;
    @XmlElement(name = "recon_date")
    protected ReconDate reconDate;

    /**
     * Gets the value of the trtype property.
     * 
     * @return possible object is {@link String }
     */
    public String getTrtype()
    {
        return trtype;
    }

    /**
     * Sets the value of the trtype property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setTrtype(String value)
    {
        this.trtype = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return possible object is {@link Amount }
     */
    public Amount getAmount()
    {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value allowed object is {@link Amount }
     */
    public void setAmount(Amount value)
    {
        this.amount = value;
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
     * Gets the value of the document property.
     * 
     * @return possible object is {@link String }
     */
    public String getDocument()
    {
        return document;
    }

    /**
     * Sets the value of the document property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setDocument(String value)
    {
        this.document = value;
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
     * Gets the value of the memo property.
     * 
     * @return possible object is {@link String }
     */
    public String getMemo()
    {
        return memo;
    }

    /**
     * Sets the value of the memo property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setMemo(String value)
    {
        this.memo = value;
    }

    /**
     * Gets the value of the locationid property.
     * 
     * @return possible object is {@link Locationid }
     */
    public Locationid getLocationid()
    {
        return locationid;
    }

    /**
     * Sets the value of the locationid property.
     * 
     * @param value allowed object is {@link Locationid }
     */
    public void setLocationid(Locationid value)
    {
        this.locationid = value;
    }

    /**
     * Gets the value of the departmentid property.
     * 
     * @return possible object is {@link Departmentid }
     */
    public Departmentid getDepartmentid()
    {
        return departmentid;
    }

    /**
     * Sets the value of the departmentid property.
     * 
     * @param value allowed object is {@link Departmentid }
     */
    public void setDepartmentid(Departmentid value)
    {
        this.departmentid = value;
    }

    /**
     * Gets the value of the journalid property.
     * 
     * @return possible object is {@link String }
     */
    public String getJournalid()
    {
        return journalid;
    }

    /**
     * Sets the value of the journalid property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setJournalid(String value)
    {
        this.journalid = value;
    }

    /**
     * Gets the value of the batchno property.
     * 
     * @return possible object is {@link String }
     */
    public String getBatchno()
    {
        return batchno;
    }

    /**
     * Sets the value of the batchno property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setBatchno(String value)
    {
        this.batchno = value;
    }

    /**
     * Gets the value of the trxAmount property.
     * 
     * @return possible object is {@link String }
     */
    public String getTrxAmount()
    {
        return trxAmount;
    }

    /**
     * Sets the value of the trxAmount property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setTrxAmount(String value)
    {
        this.trxAmount = value;
    }

    /**
     * Gets the value of the exchRateDate property.
     * 
     * @return possible object is {@link String }
     */
    public String getExchRateDate()
    {
        return exchRateDate;
    }

    /**
     * Sets the value of the exchRateDate property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setExchRateDate(String value)
    {
        this.exchRateDate = value;
    }

    /**
     * Gets the value of the exchRateTypeId property.
     * 
     * @return possible object is {@link String }
     */
    public String getExchRateTypeId()
    {
        return exchRateTypeId;
    }

    /**
     * Sets the value of the exchRateTypeId property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setExchRateTypeId(String value)
    {
        this.exchRateTypeId = value;
    }

    /**
     * Gets the value of the exchangeRate property.
     * 
     * @return possible object is {@link String }
     */
    public String getExchangeRate()
    {
        return exchangeRate;
    }

    /**
     * Sets the value of the exchangeRate property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setExchangeRate(String value)
    {
        this.exchangeRate = value;
    }

    /**
     * Gets the value of the reconDate property.
     * 
     * @return possible object is {@link ReconDate }
     */
    public ReconDate getReconDate()
    {
        return reconDate;
    }

    /**
     * Sets the value of the reconDate property.
     * 
     * @param value allowed object is {@link ReconDate }
     */
    public void setReconDate(ReconDate value)
    {
        this.reconDate = value;
    }

}
