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
@XmlType(name = "", propOrder = {"employeeid", "itemid", "resourcedescription", "billingrate"})
@XmlRootElement(name = "projectresource")
public class Projectresource
{

    @XmlElement(required = true)
    protected Employeeid employeeid;
    protected Itemid itemid;
    protected String resourcedescription;
    protected String billingrate;

    /**
     * Gets the value of the employeeid property.
     * 
     * @return possible object is {@link Employeeid }
     */
    public Employeeid getEmployeeid()
    {
        return employeeid;
    }

    /**
     * Sets the value of the employeeid property.
     * 
     * @param value allowed object is {@link Employeeid }
     */
    public void setEmployeeid(Employeeid value)
    {
        this.employeeid = value;
    }

    /**
     * Gets the value of the itemid property.
     * 
     * @return possible object is {@link Itemid }
     */
    public Itemid getItemid()
    {
        return itemid;
    }

    /**
     * Sets the value of the itemid property.
     * 
     * @param value allowed object is {@link Itemid }
     */
    public void setItemid(Itemid value)
    {
        this.itemid = value;
    }

    /**
     * Gets the value of the resourcedescription property.
     * 
     * @return possible object is {@link String }
     */
    public String getResourcedescription()
    {
        return resourcedescription;
    }

    /**
     * Sets the value of the resourcedescription property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setResourcedescription(String value)
    {
        this.resourcedescription = value;
    }

    /**
     * Gets the value of the billingrate property.
     * 
     * @return possible object is {@link String }
     */
    public String getBillingrate()
    {
        return billingrate;
    }

    /**
     * Sets the value of the billingrate property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setBillingrate(String value)
    {
        this.billingrate = value;
    }

}
