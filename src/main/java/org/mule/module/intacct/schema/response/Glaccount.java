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
@XmlType(name = "", propOrder = {"glaccountno", "title", "normalbalance", "accounttype", "closingtype",
    "closingaccountno", "whenmodified", "status", "requiredept", "requireloc", "requireproject",
    "requirecustomer", "requirevendor", "requireitem", "requireemployee", "requireclass", "taxable",
    "taxcode", "mrccode", "customfields"})
@XmlRootElement(name = "glaccount")
public class Glaccount
{

    protected Glaccountno glaccountno;
    protected String title;
    protected String normalbalance;
    protected String accounttype;
    protected String closingtype;
    protected String closingaccountno;
    protected String whenmodified;
    protected String status;
    protected String requiredept;
    protected String requireloc;
    protected String requireproject;
    protected String requirecustomer;
    protected String requirevendor;
    protected String requireitem;
    protected String requireemployee;
    protected String requireclass;
    protected String taxable;
    protected String taxcode;
    protected String mrccode;
    protected Customfields customfields;

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
     * Gets the value of the title property.
     * 
     * @return possible object is {@link String }
     */
    public String getTitle()
    {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setTitle(String value)
    {
        this.title = value;
    }

    /**
     * Gets the value of the normalbalance property.
     * 
     * @return possible object is {@link String }
     */
    public String getNormalbalance()
    {
        return normalbalance;
    }

    /**
     * Sets the value of the normalbalance property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setNormalbalance(String value)
    {
        this.normalbalance = value;
    }

    /**
     * Gets the value of the accounttype property.
     * 
     * @return possible object is {@link String }
     */
    public String getAccounttype()
    {
        return accounttype;
    }

    /**
     * Sets the value of the accounttype property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setAccounttype(String value)
    {
        this.accounttype = value;
    }

    /**
     * Gets the value of the closingtype property.
     * 
     * @return possible object is {@link String }
     */
    public String getClosingtype()
    {
        return closingtype;
    }

    /**
     * Sets the value of the closingtype property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setClosingtype(String value)
    {
        this.closingtype = value;
    }

    /**
     * Gets the value of the closingaccountno property.
     * 
     * @return possible object is {@link String }
     */
    public String getClosingaccountno()
    {
        return closingaccountno;
    }

    /**
     * Sets the value of the closingaccountno property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setClosingaccountno(String value)
    {
        this.closingaccountno = value;
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
     * Gets the value of the requiredept property.
     * 
     * @return possible object is {@link String }
     */
    public String getRequiredept()
    {
        return requiredept;
    }

    /**
     * Sets the value of the requiredept property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setRequiredept(String value)
    {
        this.requiredept = value;
    }

    /**
     * Gets the value of the requireloc property.
     * 
     * @return possible object is {@link String }
     */
    public String getRequireloc()
    {
        return requireloc;
    }

    /**
     * Sets the value of the requireloc property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setRequireloc(String value)
    {
        this.requireloc = value;
    }

    /**
     * Gets the value of the requireproject property.
     * 
     * @return possible object is {@link String }
     */
    public String getRequireproject()
    {
        return requireproject;
    }

    /**
     * Sets the value of the requireproject property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setRequireproject(String value)
    {
        this.requireproject = value;
    }

    /**
     * Gets the value of the requirecustomer property.
     * 
     * @return possible object is {@link String }
     */
    public String getRequirecustomer()
    {
        return requirecustomer;
    }

    /**
     * Sets the value of the requirecustomer property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setRequirecustomer(String value)
    {
        this.requirecustomer = value;
    }

    /**
     * Gets the value of the requirevendor property.
     * 
     * @return possible object is {@link String }
     */
    public String getRequirevendor()
    {
        return requirevendor;
    }

    /**
     * Sets the value of the requirevendor property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setRequirevendor(String value)
    {
        this.requirevendor = value;
    }

    /**
     * Gets the value of the requireitem property.
     * 
     * @return possible object is {@link String }
     */
    public String getRequireitem()
    {
        return requireitem;
    }

    /**
     * Sets the value of the requireitem property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setRequireitem(String value)
    {
        this.requireitem = value;
    }

    /**
     * Gets the value of the requireemployee property.
     * 
     * @return possible object is {@link String }
     */
    public String getRequireemployee()
    {
        return requireemployee;
    }

    /**
     * Sets the value of the requireemployee property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setRequireemployee(String value)
    {
        this.requireemployee = value;
    }

    /**
     * Gets the value of the requireclass property.
     * 
     * @return possible object is {@link String }
     */
    public String getRequireclass()
    {
        return requireclass;
    }

    /**
     * Sets the value of the requireclass property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setRequireclass(String value)
    {
        this.requireclass = value;
    }

    /**
     * Gets the value of the taxable property.
     * 
     * @return possible object is {@link String }
     */
    public String getTaxable()
    {
        return taxable;
    }

    /**
     * Sets the value of the taxable property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setTaxable(String value)
    {
        this.taxable = value;
    }

    /**
     * Gets the value of the taxcode property.
     * 
     * @return possible object is {@link String }
     */
    public String getTaxcode()
    {
        return taxcode;
    }

    /**
     * Sets the value of the taxcode property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setTaxcode(String value)
    {
        this.taxcode = value;
    }

    /**
     * Gets the value of the mrccode property.
     * 
     * @return possible object is {@link String }
     */
    public String getMrccode()
    {
        return mrccode;
    }

    /**
     * Sets the value of the mrccode property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setMrccode(String value)
    {
        this.mrccode = value;
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
