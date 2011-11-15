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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"description", "total", "absval", "percentval", "locationid", "departmentid"})
@XmlRootElement(name = "subtotal")
public class Subtotal
{

    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    protected String total;
    protected String absval;
    protected String percentval;
    protected Locationid locationid;
    protected Departmentid departmentid;

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
     * Gets the value of the total property.
     * 
     * @return possible object is {@link String }
     */
    public String getTotal()
    {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setTotal(String value)
    {
        this.total = value;
    }

    /**
     * Gets the value of the absval property.
     * 
     * @return possible object is {@link String }
     */
    public String getAbsval()
    {
        return absval;
    }

    /**
     * Sets the value of the absval property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setAbsval(String value)
    {
        this.absval = value;
    }

    /**
     * Gets the value of the percentval property.
     * 
     * @return possible object is {@link String }
     */
    public String getPercentval()
    {
        return percentval;
    }

    /**
     * Sets the value of the percentval property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setPercentval(String value)
    {
        this.percentval = value;
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
     * Gets the value of the departmentid property.
     * 
     * @return possible object is {@link Departmentid }
     */
    public Departmentid getDepartmentid()
    {
        return departmentid;
    }

    /**
     * Sets the value of the departmentid property.
     * 
     * @param value allowed object is {@link Departmentid }
     */
    public void setDepartmentid(Departmentid value)
    {
        this.departmentid = value;
    }

}
