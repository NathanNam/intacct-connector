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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "create_vendorType", propOrder = {"vendorid", "name", "parentid", "termname", "glaccountno", "accountlabel",
    "vendtype", "taxid", "creditlimit", "billingtype", "vendoraccountno", "comments", "status", "currency",
    "onetime", "externalid", "primary", "returnto", "payto", "contactinfo", "contactlist", "name1099",
    "customfields", "achenabled", "wireenabled", "checkenabled", "achbankroutingnumber", "achaccountnumber",
    "achaccounttype", "achremittancetype", "wirebankname", "wirebankroutingnumber", "wireaccountnumber",
    "wireaccounttype", "pmplusremittancetype", "pmplusemail", "pmplusfax", "displaytermdiscount",
    "visibility"})
@XmlRootElement(name = "create_vendor")
public class CreateVendor
{

    @XmlAttribute(name = "ignoreduplicates")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String ignoreduplicates;
    @XmlElement(required = true)
    protected Vendorid vendorid;
    @XmlElement(required = true)
    protected String name;
    protected String parentid;
    protected Termname termname;
    protected Glaccountno glaccountno;
    protected Accountlabel accountlabel;
    protected String vendtype;
    protected String taxid;
    protected String creditlimit;
    protected String billingtype;
    protected String vendoraccountno;
    protected String comments;
    protected String status;
    protected String currency;
    protected String onetime;
    protected String externalid;
    protected Primary primary;
    protected Returnto returnto;
    protected Payto payto;
    protected Contactinfo contactinfo;
    protected Contactlist contactlist;
    protected String name1099;
    protected Customfields customfields;
    protected String achenabled;
    protected String wireenabled;
    protected String checkenabled;
    protected String achbankroutingnumber;
    protected String achaccountnumber;
    protected String achaccounttype;
    protected String achremittancetype;
    protected String wirebankname;
    protected String wirebankroutingnumber;
    protected String wireaccountnumber;
    protected String wireaccounttype;
    protected String pmplusremittancetype;
    protected String pmplusemail;
    protected String pmplusfax;
    protected String displaytermdiscount;
    protected Visibility visibility;

    /**
     * Gets the value of the ignoreduplicates property.
     * 
     * @return possible object is {@link String }
     */
    public String getIgnoreduplicates()
    {
        if (ignoreduplicates == null)
        {
            return "false";
        }
        else
        {
            return ignoreduplicates;
        }
    }

    /**
     * Sets the value of the ignoreduplicates property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setIgnoreduplicates(String value)
    {
        this.ignoreduplicates = value;
    }

    /**
     * Gets the value of the vendorid property.
     * 
     * @return possible object is {@link Vendorid }
     */
    public Vendorid getVendorid()
    {
        return vendorid;
    }

    /**
     * Sets the value of the vendorid property.
     * 
     * @param value allowed object is {@link Vendorid }
     */
    public void setVendorid(Vendorid value)
    {
        this.vendorid = value;
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
     * @return possible object is {@link Termname }
     */
    public Termname getTermname()
    {
        return termname;
    }

    /**
     * Sets the value of the termname property.
     * 
     * @param value allowed object is {@link Termname }
     */
    public void setTermname(Termname value)
    {
        this.termname = value;
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
     * Gets the value of the vendtype property.
     * 
     * @return possible object is {@link String }
     */
    public String getVendtype()
    {
        return vendtype;
    }

    /**
     * Sets the value of the vendtype property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setVendtype(String value)
    {
        this.vendtype = value;
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
     * Gets the value of the billingtype property.
     * 
     * @return possible object is {@link String }
     */
    public String getBillingtype()
    {
        return billingtype;
    }

    /**
     * Sets the value of the billingtype property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setBillingtype(String value)
    {
        this.billingtype = value;
    }

    /**
     * Gets the value of the vendoraccountno property.
     * 
     * @return possible object is {@link String }
     */
    public String getVendoraccountno()
    {
        return vendoraccountno;
    }

    /**
     * Sets the value of the vendoraccountno property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setVendoraccountno(String value)
    {
        this.vendoraccountno = value;
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
     * Gets the value of the onetime property.
     * 
     * @return possible object is {@link String }
     */
    public String getOnetime()
    {
        return onetime;
    }

    /**
     * Sets the value of the onetime property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setOnetime(String value)
    {
        this.onetime = value;
    }

    /**
     * Gets the value of the externalid property.
     * 
     * @return possible object is {@link String }
     */
    public String getExternalid()
    {
        return externalid;
    }

    /**
     * Sets the value of the externalid property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setExternalid(String value)
    {
        this.externalid = value;
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
     * Gets the value of the name1099 property.
     * 
     * @return possible object is {@link String }
     */
    public String getName1099()
    {
        return name1099;
    }

    /**
     * Sets the value of the name1099 property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setName1099(String value)
    {
        this.name1099 = value;
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
     * Gets the value of the achenabled property.
     * 
     * @return possible object is {@link String }
     */
    public String getAchenabled()
    {
        return achenabled;
    }

    /**
     * Sets the value of the achenabled property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setAchenabled(String value)
    {
        this.achenabled = value;
    }

    /**
     * Gets the value of the wireenabled property.
     * 
     * @return possible object is {@link String }
     */
    public String getWireenabled()
    {
        return wireenabled;
    }

    /**
     * Sets the value of the wireenabled property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setWireenabled(String value)
    {
        this.wireenabled = value;
    }

    /**
     * Gets the value of the checkenabled property.
     * 
     * @return possible object is {@link String }
     */
    public String getCheckenabled()
    {
        return checkenabled;
    }

    /**
     * Sets the value of the checkenabled property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setCheckenabled(String value)
    {
        this.checkenabled = value;
    }

    /**
     * Gets the value of the achbankroutingnumber property.
     * 
     * @return possible object is {@link String }
     */
    public String getAchbankroutingnumber()
    {
        return achbankroutingnumber;
    }

    /**
     * Sets the value of the achbankroutingnumber property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setAchbankroutingnumber(String value)
    {
        this.achbankroutingnumber = value;
    }

    /**
     * Gets the value of the achaccountnumber property.
     * 
     * @return possible object is {@link String }
     */
    public String getAchaccountnumber()
    {
        return achaccountnumber;
    }

    /**
     * Sets the value of the achaccountnumber property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setAchaccountnumber(String value)
    {
        this.achaccountnumber = value;
    }

    /**
     * Gets the value of the achaccounttype property.
     * 
     * @return possible object is {@link String }
     */
    public String getAchaccounttype()
    {
        return achaccounttype;
    }

    /**
     * Sets the value of the achaccounttype property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setAchaccounttype(String value)
    {
        this.achaccounttype = value;
    }

    /**
     * Gets the value of the achremittancetype property.
     * 
     * @return possible object is {@link String }
     */
    public String getAchremittancetype()
    {
        return achremittancetype;
    }

    /**
     * Sets the value of the achremittancetype property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setAchremittancetype(String value)
    {
        this.achremittancetype = value;
    }

    /**
     * Gets the value of the wirebankname property.
     * 
     * @return possible object is {@link String }
     */
    public String getWirebankname()
    {
        return wirebankname;
    }

    /**
     * Sets the value of the wirebankname property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setWirebankname(String value)
    {
        this.wirebankname = value;
    }

    /**
     * Gets the value of the wirebankroutingnumber property.
     * 
     * @return possible object is {@link String }
     */
    public String getWirebankroutingnumber()
    {
        return wirebankroutingnumber;
    }

    /**
     * Sets the value of the wirebankroutingnumber property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setWirebankroutingnumber(String value)
    {
        this.wirebankroutingnumber = value;
    }

    /**
     * Gets the value of the wireaccountnumber property.
     * 
     * @return possible object is {@link String }
     */
    public String getWireaccountnumber()
    {
        return wireaccountnumber;
    }

    /**
     * Sets the value of the wireaccountnumber property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setWireaccountnumber(String value)
    {
        this.wireaccountnumber = value;
    }

    /**
     * Gets the value of the wireaccounttype property.
     * 
     * @return possible object is {@link String }
     */
    public String getWireaccounttype()
    {
        return wireaccounttype;
    }

    /**
     * Sets the value of the wireaccounttype property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setWireaccounttype(String value)
    {
        this.wireaccounttype = value;
    }

    /**
     * Gets the value of the pmplusremittancetype property.
     * 
     * @return possible object is {@link String }
     */
    public String getPmplusremittancetype()
    {
        return pmplusremittancetype;
    }

    /**
     * Sets the value of the pmplusremittancetype property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setPmplusremittancetype(String value)
    {
        this.pmplusremittancetype = value;
    }

    /**
     * Gets the value of the pmplusemail property.
     * 
     * @return possible object is {@link String }
     */
    public String getPmplusemail()
    {
        return pmplusemail;
    }

    /**
     * Sets the value of the pmplusemail property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setPmplusemail(String value)
    {
        this.pmplusemail = value;
    }

    /**
     * Gets the value of the pmplusfax property.
     * 
     * @return possible object is {@link String }
     */
    public String getPmplusfax()
    {
        return pmplusfax;
    }

    /**
     * Sets the value of the pmplusfax property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setPmplusfax(String value)
    {
        this.pmplusfax = value;
    }

    /**
     * Gets the value of the displaytermdiscount property.
     * 
     * @return possible object is {@link String }
     */
    public String getDisplaytermdiscount()
    {
        return displaytermdiscount;
    }

    /**
     * Sets the value of the displaytermdiscount property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setDisplaytermdiscount(String value)
    {
        this.displaytermdiscount = value;
    }

    /**
     * Gets the value of the visibility property.
     * 
     * @return possible object is {@link Visibility }
     */
    public Visibility getVisibility()
    {
        return visibility;
    }

    /**
     * Sets the value of the visibility property.
     * 
     * @param value allowed object is {@link Visibility }
     */
    public void setVisibility(Visibility value)
    {
        this.visibility = value;
    }

}
