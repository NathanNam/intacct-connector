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
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"locationid", "startdate", "enddate", "bookid", "bsrate", "warate"})
@XmlRootElement(name = "create_consolidation")
public class CreateConsolidation
{

    @XmlAttribute(name = "ignoreduplicates")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String ignoreduplicates;
    @XmlElement(required = true)
    protected Locationid locationid;
    @XmlElement(required = true)
    protected Startdate startdate;
    @XmlElement(required = true)
    protected Enddate enddate;
    @XmlElement(required = true)
    protected String bookid;
    @XmlElement(required = true)
    protected String bsrate;
    @XmlElement(required = true)
    protected String warate;

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
     * Gets the value of the startdate property.
     * 
     * @return possible object is {@link Startdate }
     */
    public Startdate getStartdate()
    {
        return startdate;
    }

    /**
     * Sets the value of the startdate property.
     * 
     * @param value allowed object is {@link Startdate }
     */
    public void setStartdate(Startdate value)
    {
        this.startdate = value;
    }

    /**
     * Gets the value of the enddate property.
     * 
     * @return possible object is {@link Enddate }
     */
    public Enddate getEnddate()
    {
        return enddate;
    }

    /**
     * Sets the value of the enddate property.
     * 
     * @param value allowed object is {@link Enddate }
     */
    public void setEnddate(Enddate value)
    {
        this.enddate = value;
    }

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
     * Gets the value of the bsrate property.
     * 
     * @return possible object is {@link String }
     */
    public String getBsrate()
    {
        return bsrate;
    }

    /**
     * Sets the value of the bsrate property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setBsrate(String value)
    {
        this.bsrate = value;
    }

    /**
     * Gets the value of the warate property.
     * 
     * @return possible object is {@link String }
     */
    public String getWarate()
    {
        return warate;
    }

    /**
     * Sets the value of the warate property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setWarate(String value)
    {
        this.warate = value;
    }

}
