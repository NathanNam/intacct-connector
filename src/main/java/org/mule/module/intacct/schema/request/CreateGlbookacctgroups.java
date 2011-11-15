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
@XmlType(name = "", propOrder = {"bookkey", "acctgroupkey"})
@XmlRootElement(name = "create_glbookacctgroups")
public class CreateGlbookacctgroups
{

    @XmlAttribute(name = "ignoreduplicates")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String ignoreduplicates;
    @XmlElement(required = true)
    protected String bookkey;
    @XmlElement(required = true)
    protected String acctgroupkey;

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
     * Gets the value of the acctgroupkey property.
     * 
     * @return possible object is {@link String }
     */
    public String getAcctgroupkey()
    {
        return acctgroupkey;
    }

    /**
     * Sets the value of the acctgroupkey property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setAcctgroupkey(String value)
    {
        this.acctgroupkey = value;
    }

}
