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
@XmlType(name = "", propOrder = {"recordno", "dochdrno", "docid", "bundlenumber", "itemid", "itemdesc",
    "lineNo", "warehouseid", "quantity", "unit", "price", "retailprice", "totalamount", "locationid",
    "departmentid", "memo", "discsurchargememo", "customfields", "revrectemplate", "revrecstartdate",
    "revrecenddate", "renewalmacro", "currency", "exchratedate", "exchratetype", "exchrate", "trxPrice",
    "trxValue"})
@XmlRootElement(name = "sotransitem")
public class Sotransitem
{

    protected String recordno;
    protected String dochdrno;
    protected String docid;
    protected String bundlenumber;
    protected String itemid;
    protected String itemdesc;
    @XmlElement(name = "line_no")
    protected String lineNo;
    protected String warehouseid;
    protected String quantity;
    protected String unit;
    protected String price;
    protected String retailprice;
    protected String totalamount;
    protected Locationid locationid;
    protected Departmentid departmentid;
    protected String memo;
    protected String discsurchargememo;
    protected Customfields customfields;
    protected Revrectemplate revrectemplate;
    protected Revrecstartdate revrecstartdate;
    protected Revrecenddate revrecenddate;
    protected Renewalmacro renewalmacro;
    protected String currency;
    protected Exchratedate exchratedate;
    protected String exchratetype;
    protected String exchrate;
    @XmlElement(name = "trx_price")
    protected String trxPrice;
    @XmlElement(name = "trx_value")
    protected String trxValue;

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
     * Gets the value of the dochdrno property.
     * 
     * @return possible object is {@link String }
     */
    public String getDochdrno()
    {
        return dochdrno;
    }

    /**
     * Sets the value of the dochdrno property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setDochdrno(String value)
    {
        this.dochdrno = value;
    }

    /**
     * Gets the value of the docid property.
     * 
     * @return possible object is {@link String }
     */
    public String getDocid()
    {
        return docid;
    }

    /**
     * Sets the value of the docid property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setDocid(String value)
    {
        this.docid = value;
    }

    /**
     * Gets the value of the bundlenumber property.
     * 
     * @return possible object is {@link String }
     */
    public String getBundlenumber()
    {
        return bundlenumber;
    }

    /**
     * Sets the value of the bundlenumber property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setBundlenumber(String value)
    {
        this.bundlenumber = value;
    }

    /**
     * Gets the value of the itemid property.
     * 
     * @return possible object is {@link String }
     */
    public String getItemid()
    {
        return itemid;
    }

    /**
     * Sets the value of the itemid property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setItemid(String value)
    {
        this.itemid = value;
    }

    /**
     * Gets the value of the itemdesc property.
     * 
     * @return possible object is {@link String }
     */
    public String getItemdesc()
    {
        return itemdesc;
    }

    /**
     * Sets the value of the itemdesc property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setItemdesc(String value)
    {
        this.itemdesc = value;
    }

    /**
     * Gets the value of the lineNo property.
     * 
     * @return possible object is {@link String }
     */
    public String getLineNo()
    {
        return lineNo;
    }

    /**
     * Sets the value of the lineNo property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setLineNo(String value)
    {
        this.lineNo = value;
    }

    /**
     * Gets the value of the warehouseid property.
     * 
     * @return possible object is {@link String }
     */
    public String getWarehouseid()
    {
        return warehouseid;
    }

    /**
     * Sets the value of the warehouseid property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setWarehouseid(String value)
    {
        this.warehouseid = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return possible object is {@link String }
     */
    public String getQuantity()
    {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setQuantity(String value)
    {
        this.quantity = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return possible object is {@link String }
     */
    public String getUnit()
    {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setUnit(String value)
    {
        this.unit = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return possible object is {@link String }
     */
    public String getPrice()
    {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setPrice(String value)
    {
        this.price = value;
    }

    /**
     * Gets the value of the retailprice property.
     * 
     * @return possible object is {@link String }
     */
    public String getRetailprice()
    {
        return retailprice;
    }

    /**
     * Sets the value of the retailprice property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setRetailprice(String value)
    {
        this.retailprice = value;
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
     * Gets the value of the discsurchargememo property.
     * 
     * @return possible object is {@link String }
     */
    public String getDiscsurchargememo()
    {
        return discsurchargememo;
    }

    /**
     * Sets the value of the discsurchargememo property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setDiscsurchargememo(String value)
    {
        this.discsurchargememo = value;
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
     * Gets the value of the revrectemplate property.
     * 
     * @return possible object is {@link Revrectemplate }
     */
    public Revrectemplate getRevrectemplate()
    {
        return revrectemplate;
    }

    /**
     * Sets the value of the revrectemplate property.
     * 
     * @param value allowed object is {@link Revrectemplate }
     */
    public void setRevrectemplate(Revrectemplate value)
    {
        this.revrectemplate = value;
    }

    /**
     * Gets the value of the revrecstartdate property.
     * 
     * @return possible object is {@link Revrecstartdate }
     */
    public Revrecstartdate getRevrecstartdate()
    {
        return revrecstartdate;
    }

    /**
     * Sets the value of the revrecstartdate property.
     * 
     * @param value allowed object is {@link Revrecstartdate }
     */
    public void setRevrecstartdate(Revrecstartdate value)
    {
        this.revrecstartdate = value;
    }

    /**
     * Gets the value of the revrecenddate property.
     * 
     * @return possible object is {@link Revrecenddate }
     */
    public Revrecenddate getRevrecenddate()
    {
        return revrecenddate;
    }

    /**
     * Sets the value of the revrecenddate property.
     * 
     * @param value allowed object is {@link Revrecenddate }
     */
    public void setRevrecenddate(Revrecenddate value)
    {
        this.revrecenddate = value;
    }

    /**
     * Gets the value of the renewalmacro property.
     * 
     * @return possible object is {@link Renewalmacro }
     */
    public Renewalmacro getRenewalmacro()
    {
        return renewalmacro;
    }

    /**
     * Sets the value of the renewalmacro property.
     * 
     * @param value allowed object is {@link Renewalmacro }
     */
    public void setRenewalmacro(Renewalmacro value)
    {
        this.renewalmacro = value;
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
     * Gets the value of the exchratedate property.
     * 
     * @return possible object is {@link Exchratedate }
     */
    public Exchratedate getExchratedate()
    {
        return exchratedate;
    }

    /**
     * Sets the value of the exchratedate property.
     * 
     * @param value allowed object is {@link Exchratedate }
     */
    public void setExchratedate(Exchratedate value)
    {
        this.exchratedate = value;
    }

    /**
     * Gets the value of the exchratetype property.
     * 
     * @return possible object is {@link String }
     */
    public String getExchratetype()
    {
        return exchratetype;
    }

    /**
     * Sets the value of the exchratetype property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setExchratetype(String value)
    {
        this.exchratetype = value;
    }

    /**
     * Gets the value of the exchrate property.
     * 
     * @return possible object is {@link String }
     */
    public String getExchrate()
    {
        return exchrate;
    }

    /**
     * Sets the value of the exchrate property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setExchrate(String value)
    {
        this.exchrate = value;
    }

    /**
     * Gets the value of the trxPrice property.
     * 
     * @return possible object is {@link String }
     */
    public String getTrxPrice()
    {
        return trxPrice;
    }

    /**
     * Sets the value of the trxPrice property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setTrxPrice(String value)
    {
        this.trxPrice = value;
    }

    /**
     * Gets the value of the trxValue property.
     * 
     * @return possible object is {@link String }
     */
    public String getTrxValue()
    {
        return trxValue;
    }

    /**
     * Sets the value of the trxValue property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setTrxValue(String value)
    {
        this.trxValue = value;
    }

}
