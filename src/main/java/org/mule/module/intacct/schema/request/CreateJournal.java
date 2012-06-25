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
@XmlType(name = "create_journalType", propOrder = {"symbol", "title", "status", "externalid", "bookkey"})
@XmlRootElement(name = "create_journal")
public class CreateJournal
{

    @XmlAttribute(name = "ignoreduplicates")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String ignoreduplicates;
    @XmlElement(required = true)
    protected String symbol;
    @XmlElement(required = true)
    protected String title;
    protected String status;
    protected String externalid;
    protected String bookkey;

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
     * Gets the value of the symbol property.
     * 
     * @return possible object is {@link String }
     */
    public String getSymbol()
    {
        return symbol;
    }

    /**
     * Sets the value of the symbol property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setSymbol(String value)
    {
        this.symbol = value;
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
     * Gets the value of the externalid property.
     * 
     * @return possible object is {@link String }
     */
    public String getExternalid()
    {
        return externalid;
    }

    /**
     * Sets the value of the externalid property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setExternalid(String value)
    {
        this.externalid = value;
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

}
