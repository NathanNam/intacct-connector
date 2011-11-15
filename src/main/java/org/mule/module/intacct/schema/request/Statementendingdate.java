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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"year", "month", "day"})
@XmlRootElement(name = "statementendingdate")
public class Statementendingdate
{

    @XmlElement(required = true)
    protected String year;
    @XmlElement(required = true)
    protected String month;
    @XmlElement(required = true)
    protected String day;

    /**
     * Gets the value of the year property.
     * 
     * @return possible object is {@link String }
     */
    public String getYear()
    {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setYear(String value)
    {
        this.year = value;
    }

    /**
     * Gets the value of the month property.
     * 
     * @return possible object is {@link String }
     */
    public String getMonth()
    {
        return month;
    }

    /**
     * Sets the value of the month property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setMonth(String value)
    {
        this.month = value;
    }

    /**
     * Gets the value of the day property.
     * 
     * @return possible object is {@link String }
     */
    public String getDay()
    {
        return day;
    }

    /**
     * Sets the value of the day property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setDay(String value)
    {
        this.day = value;
    }

}
