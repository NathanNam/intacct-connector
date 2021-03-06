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
@XmlType(name = "", propOrder = {"customerid", "paymentamount", "paymentapplied", "paymentunapplied",
    "batchkey", "refid", "state", "datereceived", "key", "batchtitle", "paymentmethod", "undepglaccountno",
    "undepaccountlabel", "undeposited", "whenmodified", "arpaymentitems", "arpaymentitemdetails", "lineitems"})
@XmlRootElement(name = "arpayment")
public class Arpayment
{

    protected String customerid;
    protected String paymentamount;
    protected String paymentapplied;
    protected String paymentunapplied;
    protected String batchkey;
    protected String refid;
    protected String state;
    protected Datereceived datereceived;
    protected Key key;
    protected String batchtitle;
    protected String paymentmethod;
    protected String undepglaccountno;
    protected String undepaccountlabel;
    protected String undeposited;
    protected String whenmodified;
    protected Arpaymentitems arpaymentitems;
    protected Arpaymentitemdetails arpaymentitemdetails;
    protected Lineitems lineitems;

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
     * Gets the value of the paymentamount property.
     * 
     * @return possible object is {@link String }
     */
    public String getPaymentamount()
    {
        return paymentamount;
    }

    /**
     * Sets the value of the paymentamount property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setPaymentamount(String value)
    {
        this.paymentamount = value;
    }

    /**
     * Gets the value of the paymentapplied property.
     * 
     * @return possible object is {@link String }
     */
    public String getPaymentapplied()
    {
        return paymentapplied;
    }

    /**
     * Sets the value of the paymentapplied property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setPaymentapplied(String value)
    {
        this.paymentapplied = value;
    }

    /**
     * Gets the value of the paymentunapplied property.
     * 
     * @return possible object is {@link String }
     */
    public String getPaymentunapplied()
    {
        return paymentunapplied;
    }

    /**
     * Sets the value of the paymentunapplied property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setPaymentunapplied(String value)
    {
        this.paymentunapplied = value;
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
     * Gets the value of the refid property.
     * 
     * @return possible object is {@link String }
     */
    public String getRefid()
    {
        return refid;
    }

    /**
     * Sets the value of the refid property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setRefid(String value)
    {
        this.refid = value;
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
     * Gets the value of the datereceived property.
     * 
     * @return possible object is {@link Datereceived }
     */
    public Datereceived getDatereceived()
    {
        return datereceived;
    }

    /**
     * Sets the value of the datereceived property.
     * 
     * @param value allowed object is {@link Datereceived }
     */
    public void setDatereceived(Datereceived value)
    {
        this.datereceived = value;
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
     * Gets the value of the batchtitle property.
     * 
     * @return possible object is {@link String }
     */
    public String getBatchtitle()
    {
        return batchtitle;
    }

    /**
     * Sets the value of the batchtitle property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setBatchtitle(String value)
    {
        this.batchtitle = value;
    }

    /**
     * Gets the value of the paymentmethod property.
     * 
     * @return possible object is {@link String }
     */
    public String getPaymentmethod()
    {
        return paymentmethod;
    }

    /**
     * Sets the value of the paymentmethod property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setPaymentmethod(String value)
    {
        this.paymentmethod = value;
    }

    /**
     * Gets the value of the undepglaccountno property.
     * 
     * @return possible object is {@link String }
     */
    public String getUndepglaccountno()
    {
        return undepglaccountno;
    }

    /**
     * Sets the value of the undepglaccountno property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setUndepglaccountno(String value)
    {
        this.undepglaccountno = value;
    }

    /**
     * Gets the value of the undepaccountlabel property.
     * 
     * @return possible object is {@link String }
     */
    public String getUndepaccountlabel()
    {
        return undepaccountlabel;
    }

    /**
     * Sets the value of the undepaccountlabel property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setUndepaccountlabel(String value)
    {
        this.undepaccountlabel = value;
    }

    /**
     * Gets the value of the undeposited property.
     * 
     * @return possible object is {@link String }
     */
    public String getUndeposited()
    {
        return undeposited;
    }

    /**
     * Sets the value of the undeposited property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setUndeposited(String value)
    {
        this.undeposited = value;
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
     * Gets the value of the arpaymentitems property.
     * 
     * @return possible object is {@link Arpaymentitems }
     */
    public Arpaymentitems getArpaymentitems()
    {
        return arpaymentitems;
    }

    /**
     * Sets the value of the arpaymentitems property.
     * 
     * @param value allowed object is {@link Arpaymentitems }
     */
    public void setArpaymentitems(Arpaymentitems value)
    {
        this.arpaymentitems = value;
    }

    /**
     * Gets the value of the arpaymentitemdetails property.
     * 
     * @return possible object is {@link Arpaymentitemdetails }
     */
    public Arpaymentitemdetails getArpaymentitemdetails()
    {
        return arpaymentitemdetails;
    }

    /**
     * Sets the value of the arpaymentitemdetails property.
     * 
     * @param value allowed object is {@link Arpaymentitemdetails }
     */
    public void setArpaymentitemdetails(Arpaymentitemdetails value)
    {
        this.arpaymentitemdetails = value;
    }

    /**
     * Gets the value of the lineitems property.
     * 
     * @return possible object is {@link Lineitems }
     */
    public Lineitems getLineitems()
    {
        return lineitems;
    }

    /**
     * Sets the value of the lineitems property.
     * 
     * @param value allowed object is {@link Lineitems }
     */
    public void setLineitems(Lineitems value)
    {
        this.lineitems = value;
    }

}
