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
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "update_customerchargecardType", propOrder = {"expMonth", "expYear", "description", "status", "mailaddress", "defaultcard"})
@XmlRootElement(name = "update_customerchargecard")
public class UpdateCustomerchargecard
{

    @XmlAttribute(name = "recordno", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String recordno;
    @XmlAttribute(name = "externalkey")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String externalkey;
    @XmlElement(name = "exp_month")
    protected String expMonth;
    @XmlElement(name = "exp_year")
    protected String expYear;
    protected String description;
    protected String status;
    protected Mailaddress mailaddress;
    protected String defaultcard;

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
     * Gets the value of the externalkey property.
     * 
     * @return possible object is {@link String }
     */
    public String getExternalkey()
    {
        if (externalkey == null)
        {
            return "false";
        }
        else
        {
            return externalkey;
        }
    }

    /**
     * Sets the value of the externalkey property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setExternalkey(String value)
    {
        this.externalkey = value;
    }

    /**
     * Gets the value of the expMonth property.
     * 
     * @return possible object is {@link String }
     */
    public String getExpMonth()
    {
        return expMonth;
    }

    /**
     * Sets the value of the expMonth property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setExpMonth(String value)
    {
        this.expMonth = value;
    }

    /**
     * Gets the value of the expYear property.
     * 
     * @return possible object is {@link String }
     */
    public String getExpYear()
    {
        return expYear;
    }

    /**
     * Sets the value of the expYear property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setExpYear(String value)
    {
        this.expYear = value;
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
     * Gets the value of the mailaddress property.
     * 
     * @return possible object is {@link Mailaddress }
     */
    public Mailaddress getMailaddress()
    {
        return mailaddress;
    }

    /**
     * Sets the value of the mailaddress property.
     * 
     * @param value allowed object is {@link Mailaddress }
     */
    public void setMailaddress(Mailaddress value)
    {
        this.mailaddress = value;
    }

    /**
     * Gets the value of the defaultcard property.
     * 
     * @return possible object is {@link String }
     */
    public String getDefaultcard()
    {
        return defaultcard;
    }

    /**
     * Sets the value of the defaultcard property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setDefaultcard(String value)
    {
        this.defaultcard = value;
    }

}
