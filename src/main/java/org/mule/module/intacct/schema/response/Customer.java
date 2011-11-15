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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"customerid", "name", "parentid", "termname", "custrepid", "shippingmethod",
    "custtype", "taxid", "creditlimit", "totaldue", "territoryid", "resaleno", "deliveryoptions",
    "accountlabel", "glaccountno", "glgroup", "comments", "status", "currency", "primary", "billto",
    "shipto", "contactinfo", "vsoepricelist", "contactlist", "pricelist", "customfields"})
@XmlRootElement(name = "customer")
public class Customer
{

    protected String customerid;
    protected String name;
    protected String parentid;
    protected String termname;
    protected String custrepid;
    protected String shippingmethod;
    protected String custtype;
    protected String taxid;
    protected String creditlimit;
    protected String totaldue;
    protected String territoryid;
    protected String resaleno;
    protected Deliveryoptions deliveryoptions;
    protected Accountlabel accountlabel;
    protected Glaccountno glaccountno;
    protected String glgroup;
    protected String comments;
    protected String status;
    protected String currency;
    protected Primary primary;
    protected Billto billto;
    protected Shipto shipto;
    protected Contactinfo contactinfo;
    protected Vsoepricelist vsoepricelist;
    protected Contactlist contactlist;
    protected Pricelist pricelist;
    protected Customfields customfields;

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
     * Gets the value of the name property.
     * 
     * @return possible object is {@link String }
     */
    public String getName()
    {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setName(String value)
    {
        this.name = value;
    }

    /**
     * Gets the value of the parentid property.
     * 
     * @return possible object is {@link String }
     */
    public String getParentid()
    {
        return parentid;
    }

    /**
     * Sets the value of the parentid property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setParentid(String value)
    {
        this.parentid = value;
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
     * Gets the value of the custrepid property.
     * 
     * @return possible object is {@link String }
     */
    public String getCustrepid()
    {
        return custrepid;
    }

    /**
     * Sets the value of the custrepid property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setCustrepid(String value)
    {
        this.custrepid = value;
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
     * Gets the value of the custtype property.
     * 
     * @return possible object is {@link String }
     */
    public String getCusttype()
    {
        return custtype;
    }

    /**
     * Sets the value of the custtype property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setCusttype(String value)
    {
        this.custtype = value;
    }

    /**
     * Gets the value of the taxid property.
     * 
     * @return possible object is {@link String }
     */
    public String getTaxid()
    {
        return taxid;
    }

    /**
     * Sets the value of the taxid property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setTaxid(String value)
    {
        this.taxid = value;
    }

    /**
     * Gets the value of the creditlimit property.
     * 
     * @return possible object is {@link String }
     */
    public String getCreditlimit()
    {
        return creditlimit;
    }

    /**
     * Sets the value of the creditlimit property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setCreditlimit(String value)
    {
        this.creditlimit = value;
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
     * Gets the value of the territoryid property.
     * 
     * @return possible object is {@link String }
     */
    public String getTerritoryid()
    {
        return territoryid;
    }

    /**
     * Sets the value of the territoryid property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setTerritoryid(String value)
    {
        this.territoryid = value;
    }

    /**
     * Gets the value of the resaleno property.
     * 
     * @return possible object is {@link String }
     */
    public String getResaleno()
    {
        return resaleno;
    }

    /**
     * Sets the value of the resaleno property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setResaleno(String value)
    {
        this.resaleno = value;
    }

    /**
     * Gets the value of the deliveryoptions property.
     * 
     * @return possible object is {@link Deliveryoptions }
     */
    public Deliveryoptions getDeliveryoptions()
    {
        return deliveryoptions;
    }

    /**
     * Sets the value of the deliveryoptions property.
     * 
     * @param value allowed object is {@link Deliveryoptions }
     */
    public void setDeliveryoptions(Deliveryoptions value)
    {
        this.deliveryoptions = value;
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
     * Gets the value of the glgroup property.
     * 
     * @return possible object is {@link String }
     */
    public String getGlgroup()
    {
        return glgroup;
    }

    /**
     * Sets the value of the glgroup property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setGlgroup(String value)
    {
        this.glgroup = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return possible object is {@link String }
     */
    public String getComments()
    {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setComments(String value)
    {
        this.comments = value;
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
     * Gets the value of the primary property.
     * 
     * @return possible object is {@link Primary }
     */
    public Primary getPrimary()
    {
        return primary;
    }

    /**
     * Sets the value of the primary property.
     * 
     * @param value allowed object is {@link Primary }
     */
    public void setPrimary(Primary value)
    {
        this.primary = value;
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
     * Gets the value of the contactinfo property.
     * 
     * @return possible object is {@link Contactinfo }
     */
    public Contactinfo getContactinfo()
    {
        return contactinfo;
    }

    /**
     * Sets the value of the contactinfo property.
     * 
     * @param value allowed object is {@link Contactinfo }
     */
    public void setContactinfo(Contactinfo value)
    {
        this.contactinfo = value;
    }

    /**
     * Gets the value of the vsoepricelist property.
     * 
     * @return possible object is {@link Vsoepricelist }
     */
    public Vsoepricelist getVsoepricelist()
    {
        return vsoepricelist;
    }

    /**
     * Sets the value of the vsoepricelist property.
     * 
     * @param value allowed object is {@link Vsoepricelist }
     */
    public void setVsoepricelist(Vsoepricelist value)
    {
        this.vsoepricelist = value;
    }

    /**
     * Gets the value of the contactlist property.
     * 
     * @return possible object is {@link Contactlist }
     */
    public Contactlist getContactlist()
    {
        return contactlist;
    }

    /**
     * Sets the value of the contactlist property.
     * 
     * @param value allowed object is {@link Contactlist }
     */
    public void setContactlist(Contactlist value)
    {
        this.contactlist = value;
    }

    /**
     * Gets the value of the pricelist property.
     * 
     * @return possible object is {@link Pricelist }
     */
    public Pricelist getPricelist()
    {
        return pricelist;
    }

    /**
     * Sets the value of the pricelist property.
     * 
     * @param value allowed object is {@link Pricelist }
     */
    public void setPricelist(Pricelist value)
    {
        this.pricelist = value;
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

}
