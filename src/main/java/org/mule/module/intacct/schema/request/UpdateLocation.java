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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "update_locationType", propOrder = {"name", "parentid", "supervisorid", "startdate", "enddate", "status",
    "primary", "shipto", "customfields", "custtitle"})
@XmlRootElement(name = "update_location")
public class UpdateLocation
{

    @XmlAttribute(name = "locationid", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String locationid;
    @XmlAttribute(name = "set_nulls")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String setNulls;
    @XmlAttribute(name = "externalkey")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String externalkey;
    protected String name;
    protected String parentid;
    protected String supervisorid;
    protected Startdate startdate;
    protected Enddate enddate;
    protected String status;
    protected Primary primary;
    protected Shipto shipto;
    protected Customfields customfields;
    protected String custtitle;

    /**
     * Gets the value of the locationid property.
     * 
     * @return possible object is {@link String }
     */
    public String getLocationid()
    {
        return locationid;
    }

    /**
     * Sets the value of the locationid property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setLocationid(String value)
    {
        this.locationid = value;
    }

    /**
     * Gets the value of the setNulls property.
     * 
     * @return possible object is {@link String }
     */
    public String getSetNulls()
    {
        if (setNulls == null)
        {
            return "false";
        }
        else
        {
            return setNulls;
        }
    }

    /**
     * Sets the value of the setNulls property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setSetNulls(String value)
    {
        this.setNulls = value;
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
     * Gets the value of the custtitle property.
     * 
     * @return possible object is {@link String }
     */
    public String getCusttitle()
    {
        return custtitle;
    }

    /**
     * Sets the value of the custtitle property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setCusttitle(String value)
    {
        this.custtitle = value;
    }

}
