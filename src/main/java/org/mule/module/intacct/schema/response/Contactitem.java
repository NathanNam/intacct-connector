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
@XmlType(name = "", propOrder = {"category", "contactname"})
@XmlRootElement(name = "contactitem")
public class Contactitem
{

    @XmlElement(required = true)
    protected Category category;
    @XmlElement(required = true)
    protected Contactname contactname;

    /**
     * Gets the value of the category property.
     * 
     * @return possible object is {@link Category }
     */
    public Category getCategory()
    {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value allowed object is {@link Category }
     */
    public void setCategory(Category value)
    {
        this.category = value;
    }

    /**
     * Gets the value of the contactname property.
     * 
     * @return possible object is {@link Contactname }
     */
    public Contactname getContactname()
    {
        return contactname;
    }

    /**
     * Sets the value of the contactname property.
     * 
     * @param value allowed object is {@link Contactname }
     */
    public void setContactname(Contactname value)
    {
        this.contactname = value;
    }

}
