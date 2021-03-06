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
@XmlType(name = "", propOrder = {"key", "transactiontype", "transactionid", "datecreated", "createdfrom",
    "vendorid", "referenceno", "vendordocno", "termname", "datedue", "message", "shippingmethod", "returnto",
    "payto", "transactionstate", "whenmodified", "basecurr", "currency", "exchratedate", "exchratetype",
    "exchratetypeid", "exchrate", "potransitems", "subtotals"})
@XmlRootElement(name = "potransaction")
public class Potransaction
{

    protected Key key;
    protected String transactiontype;
    protected String transactionid;
    protected Datecreated datecreated;
    protected String createdfrom;
    protected String vendorid;
    protected String referenceno;
    protected String vendordocno;
    protected String termname;
    protected Datedue datedue;
    protected String message;
    protected String shippingmethod;
    protected Returnto returnto;
    protected Payto payto;
    protected String transactionstate;
    protected String whenmodified;
    protected String basecurr;
    protected String currency;
    protected Exchratedate exchratedate;
    protected String exchratetype;
    protected String exchratetypeid;
    protected String exchrate;
    protected Potransitems potransitems;
    protected Subtotals subtotals;

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
     * Gets the value of the transactiontype property.
     * 
     * @return possible object is {@link String }
     */
    public String getTransactiontype()
    {
        return transactiontype;
    }

    /**
     * Sets the value of the transactiontype property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setTransactiontype(String value)
    {
        this.transactiontype = value;
    }

    /**
     * Gets the value of the transactionid property.
     * 
     * @return possible object is {@link String }
     */
    public String getTransactionid()
    {
        return transactionid;
    }

    /**
     * Sets the value of the transactionid property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setTransactionid(String value)
    {
        this.transactionid = value;
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
     * Gets the value of the createdfrom property.
     * 
     * @return possible object is {@link String }
     */
    public String getCreatedfrom()
    {
        return createdfrom;
    }

    /**
     * Sets the value of the createdfrom property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setCreatedfrom(String value)
    {
        this.createdfrom = value;
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
     * Gets the value of the vendordocno property.
     * 
     * @return possible object is {@link String }
     */
    public String getVendordocno()
    {
        return vendordocno;
    }

    /**
     * Sets the value of the vendordocno property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setVendordocno(String value)
    {
        this.vendordocno = value;
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
     * Gets the value of the message property.
     * 
     * @return possible object is {@link String }
     */
    public String getMessage()
    {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setMessage(String value)
    {
        this.message = value;
    }

    /**
     * Gets the value of the shippingmethod property.
     * 
     * @return possible object is {@link String }
     */
    public String getShippingmethod()
    {
        return shippingmethod;
    }

    /**
     * Sets the value of the shippingmethod property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setShippingmethod(String value)
    {
        this.shippingmethod = value;
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
     * Gets the value of the transactionstate property.
     * 
     * @return possible object is {@link String }
     */
    public String getTransactionstate()
    {
        return transactionstate;
    }

    /**
     * Sets the value of the transactionstate property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setTransactionstate(String value)
    {
        this.transactionstate = value;
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
     * Gets the value of the exchratetypeid property.
     * 
     * @return possible object is {@link String }
     */
    public String getExchratetypeid()
    {
        return exchratetypeid;
    }

    /**
     * Sets the value of the exchratetypeid property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setExchratetypeid(String value)
    {
        this.exchratetypeid = value;
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
     * Gets the value of the potransitems property.
     * 
     * @return possible object is {@link Potransitems }
     */
    public Potransitems getPotransitems()
    {
        return potransitems;
    }

    /**
     * Sets the value of the potransitems property.
     * 
     * @param value allowed object is {@link Potransitems }
     */
    public void setPotransitems(Potransitems value)
    {
        this.potransitems = value;
    }

    /**
     * Gets the value of the subtotals property.
     * 
     * @return possible object is {@link Subtotals }
     */
    public Subtotals getSubtotals()
    {
        return subtotals;
    }

    /**
     * Sets the value of the subtotals property.
     * 
     * @param value allowed object is {@link Subtotals }
     */
    public void setSubtotals(Subtotals value)
    {
        this.subtotals = value;
    }

}
