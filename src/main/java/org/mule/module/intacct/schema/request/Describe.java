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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "describeType", propOrder = {"doctypes"})
@XmlRootElement(name = "describe")
public class Describe
{

    @XmlAttribute(name = "object", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String object;
    @XmlAttribute(name = "externalkey")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String externalkey;
    protected Doctypes doctypes;

    /**
     * Gets the value of the object property.
     * 
     * @return possible object is {@link String }
     */
    public String getObject()
    {
        return object;
    }

    /**
     * Sets the value of the object property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setObject(String value)
    {
        this.object = value;
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
     * Gets the value of the doctypes property.
     * 
     * @return possible object is {@link Doctypes }
     */
    public Doctypes getDoctypes()
    {
        return doctypes;
    }

    /**
     * Sets the value of the doctypes property.
     * 
     * @param value allowed object is {@link Doctypes }
     */
    public void setDoctypes(Doctypes value)
    {
        this.doctypes = value;
    }

}
