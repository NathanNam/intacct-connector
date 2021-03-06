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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"value"})
@XmlRootElement(name = "listtype")
public class Listtype
{

    @XmlAttribute(name = "start")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String start;
    @XmlAttribute(name = "end")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String end;
    @XmlAttribute(name = "total")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String total;
    @XmlValue
    protected String value;

    /**
     * Gets the value of the start property.
     * 
     * @return possible object is {@link String }
     */
    public String getStart()
    {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setStart(String value)
    {
        this.start = value;
    }

    /**
     * Gets the value of the end property.
     * 
     * @return possible object is {@link String }
     */
    public String getEnd()
    {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setEnd(String value)
    {
        this.end = value;
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
     * Gets the value of the value property.
     * 
     * @return possible object is {@link String }
     */
    public String getValue()
    {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setValue(String value)
    {
        this.value = value;
    }

}
