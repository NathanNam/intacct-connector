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
@XmlType(name = "", propOrder = {"locationid", "name", "parentid", "supervisorid", "startdate", "enddate",
    "whenmodified", "status", "primary", "shipto", "contactinfo", "customfields"})
@XmlRootElement(name = "location")
public class Location
{

    protected Locationid locationid;
    protected String name;
    protected String parentid;
    protected String supervisorid;
    protected Startdate startdate;
    protected Enddate enddate;
    protected String whenmodified;
    protected String status;
    protected Primary primary;
    protected Shipto shipto;
    protected Contactinfo contactinfo;
    protected Customfields customfields;

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
     * Gets the value of the supervisorid property.
     * 
     * @return possible object is {@link String }
     */
    public String getSupervisorid()
    {
        return supervisorid;
    }

    /**
     * Sets the value of the supervisorid property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setSupervisorid(String value)
    {
        this.supervisorid = value;
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
