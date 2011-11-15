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
@XmlType(name = "", propOrder = {"bookkey", "glaccountno", "glaccounttitle", "glacctratetypes",
    "overriderate", "overrideexpirydate"})
@XmlRootElement(name = "glbookacctratetypes")
public class Glbookacctratetypes
{

    @XmlElement(required = true)
    protected String bookkey;
    @XmlElement(required = true)
    protected Glaccountno glaccountno;
    @XmlElement(required = true)
    protected String glaccounttitle;
    @XmlElement(required = true)
    protected String glacctratetypes;
    protected Overriderate overriderate;
    protected Overrideexpirydate overrideexpirydate;

    /**
     * Gets the value of the bookkey property.
     * 
     * @return possible object is {@link String }
     */
    public String getBookkey()
    {
        return bookkey;
    }

    /**
     * Sets the value of the bookkey property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setBookkey(String value)
    {
        this.bookkey = value;
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
     * Gets the value of the glaccounttitle property.
     * 
     * @return possible object is {@link String }
     */
    public String getGlaccounttitle()
    {
        return glaccounttitle;
    }

    /**
     * Sets the value of the glaccounttitle property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setGlaccounttitle(String value)
    {
        this.glaccounttitle = value;
    }

    /**
     * Gets the value of the glacctratetypes property.
     * 
     * @return possible object is {@link String }
     */
    public String getGlacctratetypes()
    {
        return glacctratetypes;
    }

    /**
     * Sets the value of the glacctratetypes property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setGlacctratetypes(String value)
    {
        this.glacctratetypes = value;
    }

    /**
     * Gets the value of the overriderate property.
     * 
     * @return possible object is {@link Overriderate }
     */
    public Overriderate getOverriderate()
    {
        return overriderate;
    }

    /**
     * Sets the value of the overriderate property.
     * 
     * @param value allowed object is {@link Overriderate }
     */
    public void setOverriderate(Overriderate value)
    {
        this.overriderate = value;
    }

    /**
     * Gets the value of the overrideexpirydate property.
     * 
     * @return possible object is {@link Overrideexpirydate }
     */
    public Overrideexpirydate getOverrideexpirydate()
    {
        return overrideexpirydate;
    }

    /**
     * Sets the value of the overrideexpirydate property.
     * 
     * @param value allowed object is {@link Overrideexpirydate }
     */
    public void setOverrideexpirydate(Overrideexpirydate value)
    {
        this.overrideexpirydate = value;
    }

}
