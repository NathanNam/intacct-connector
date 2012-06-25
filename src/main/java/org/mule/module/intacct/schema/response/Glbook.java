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
@XmlType(name = "", propOrder = {"bookid", "description", "currency", "bookcontact", "ctanetassetacct",
    "ctanetincomeacct", "bookstatjournal", "budgetheader", "department", "exchratetype", "bstransmethod",
    "istransmethod", "eename", "autoelimination"})
@XmlRootElement(name = "glbook")
public class Glbook
{

    @XmlElement(required = true)
    protected String bookid;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    protected String currency;
    protected Bookcontact bookcontact;
    @XmlElement(required = true)
    protected Ctanetassetacct ctanetassetacct;
    @XmlElement(required = true)
    protected Ctanetincomeacct ctanetincomeacct;
    protected Bookstatjournal bookstatjournal;
    @XmlElement(required = true)
    protected Budgetheader budgetheader;
    @XmlElement(required = true)
    protected Department department;
    @XmlElement(required = true)
    protected String exchratetype;
    @XmlElement(required = true)
    protected Bstransmethod bstransmethod;
    @XmlElement(required = true)
    protected Istransmethod istransmethod;
    @XmlElement(required = true)
    protected String eename;
    @XmlElement(required = true)
    protected String autoelimination;

    /**
     * Gets the value of the bookid property.
     * 
     * @return possible object is {@link String }
     */
    public String getBookid()
    {
        return bookid;
    }

    /**
     * Sets the value of the bookid property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setBookid(String value)
    {
        this.bookid = value;
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
     * Gets the value of the bookcontact property.
     * 
     * @return possible object is {@link Bookcontact }
     */
    public Bookcontact getBookcontact()
    {
        return bookcontact;
    }

    /**
     * Sets the value of the bookcontact property.
     * 
     * @param value allowed object is {@link Bookcontact }
     */
    public void setBookcontact(Bookcontact value)
    {
        this.bookcontact = value;
    }

    /**
     * Gets the value of the ctanetassetacct property.
     * 
     * @return possible object is {@link Ctanetassetacct }
     */
    public Ctanetassetacct getCtanetassetacct()
    {
        return ctanetassetacct;
    }

    /**
     * Sets the value of the ctanetassetacct property.
     * 
     * @param value allowed object is {@link Ctanetassetacct }
     */
    public void setCtanetassetacct(Ctanetassetacct value)
    {
        this.ctanetassetacct = value;
    }

    /**
     * Gets the value of the ctanetincomeacct property.
     * 
     * @return possible object is {@link Ctanetincomeacct }
     */
    public Ctanetincomeacct getCtanetincomeacct()
    {
        return ctanetincomeacct;
    }

    /**
     * Sets the value of the ctanetincomeacct property.
     * 
     * @param value allowed object is {@link Ctanetincomeacct }
     */
    public void setCtanetincomeacct(Ctanetincomeacct value)
    {
        this.ctanetincomeacct = value;
    }

    /**
     * Gets the value of the bookstatjournal property.
     * 
     * @return possible object is {@link Bookstatjournal }
     */
    public Bookstatjournal getBookstatjournal()
    {
        return bookstatjournal;
    }

    /**
     * Sets the value of the bookstatjournal property.
     * 
     * @param value allowed object is {@link Bookstatjournal }
     */
    public void setBookstatjournal(Bookstatjournal value)
    {
        this.bookstatjournal = value;
    }

    /**
     * Gets the value of the budgetheader property.
     * 
     * @return possible object is {@link Budgetheader }
     */
    public Budgetheader getBudgetheader()
    {
        return budgetheader;
    }

    /**
     * Sets the value of the budgetheader property.
     * 
     * @param value allowed object is {@link Budgetheader }
     */
    public void setBudgetheader(Budgetheader value)
    {
        this.budgetheader = value;
    }

    /**
     * Gets the value of the department property.
     * 
     * @return possible object is {@link Department }
     */
    public Department getDepartment()
    {
        return department;
    }

    /**
     * Sets the value of the department property.
     * 
     * @param value allowed object is {@link Department }
     */
    public void setDepartment(Department value)
    {
        this.department = value;
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
     * Gets the value of the bstransmethod property.
     * 
     * @return possible object is {@link Bstransmethod }
     */
    public Bstransmethod getBstransmethod()
    {
        return bstransmethod;
    }

    /**
     * Sets the value of the bstransmethod property.
     * 
     * @param value allowed object is {@link Bstransmethod }
     */
    public void setBstransmethod(Bstransmethod value)
    {
        this.bstransmethod = value;
    }

    /**
     * Gets the value of the istransmethod property.
     * 
     * @return possible object is {@link Istransmethod }
     */
    public Istransmethod getIstransmethod()
    {
        return istransmethod;
    }

    /**
     * Sets the value of the istransmethod property.
     * 
     * @param value allowed object is {@link Istransmethod }
     */
    public void setIstransmethod(Istransmethod value)
    {
        this.istransmethod = value;
    }

    /**
     * Gets the value of the eename property.
     * 
     * @return possible object is {@link String }
     */
    public String getEename()
    {
        return eename;
    }

    /**
     * Sets the value of the eename property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setEename(String value)
    {
        this.eename = value;
    }

    /**
     * Gets the value of the autoelimination property.
     * 
     * @return possible object is {@link String }
     */
    public String getAutoelimination()
    {
        return autoelimination;
    }

    /**
     * Sets the value of the autoelimination property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setAutoelimination(String value)
    {
        this.autoelimination = value;
    }

}
