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
@XmlType(name = "", propOrder = {"lineNum", "accountlabel", "glaccountno", "amount", "memo", "locationid",
    "departmentid", "item1099", "key", "totalpaid", "totaldue", "trxAmount", "trxTotalpaid", "trxTotaldue",
    "currency"})
@XmlRootElement(name = "lineitem")
public class Lineitem
{

    @XmlElement(name = "line_num")
    protected String lineNum;
    protected Accountlabel accountlabel;
    protected Glaccountno glaccountno;
    protected Amount amount;
    protected String memo;
    protected Locationid locationid;
    protected Departmentid departmentid;
    protected String item1099;
    protected Key key;
    protected String totalpaid;
    protected String totaldue;
    @XmlElement(name = "trx_amount")
    protected String trxAmount;
    @XmlElement(name = "trx_totalpaid")
    protected String trxTotalpaid;
    @XmlElement(name = "trx_totaldue")
    protected String trxTotaldue;
    protected String currency;

    /**
     * Gets the value of the lineNum property.
     * 
     * @return possible object is {@link String }
     */
    public String getLineNum()
    {
        return lineNum;
    }

    /**
     * Sets the value of the lineNum property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setLineNum(String value)
    {
        this.lineNum = value;
    }

    /**
     * Gets the value of the accountlabel property.
     * 
     * @return possible object is {@link Accountlabel }
     */
    public Accountlabel getAccountlabel()
    {
        return accountlabel;
    }

    /**
     * Sets the value of the accountlabel property.
     * 
     * @param value allowed object is {@link Accountlabel }
     */
    public void setAccountlabel(Accountlabel value)
    {
        this.accountlabel = value;
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
     * Gets the value of the item1099 property.
     * 
     * @return possible object is {@link String }
     */
    public String getItem1099()
    {
        return item1099;
    }

    /**
     * Sets the value of the item1099 property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setItem1099(String value)
    {
        this.item1099 = value;
    }

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

}
