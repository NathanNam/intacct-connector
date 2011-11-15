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
@XmlType(name = "create_allocationType", propOrder = {"allocationid", "description", "status", "allocateby", "allocateto",
    "docnumber", "supdocid", "allocationentry"})
@XmlRootElement(name = "create_allocation")
public class CreateAllocation
{

    @XmlElement(required = true)
    protected String allocationid;
    protected String description;
    protected String status;
    protected String allocateby;
    protected String allocateto;
    protected String docnumber;
    protected String supdocid;
    @XmlElement(required = true)
    protected Allocationentry allocationentry;

    /**
     * Gets the value of the allocationid property.
     * 
     * @return possible object is {@link String }
     */
    public String getAllocationid()
    {
        return allocationid;
    }

    /**
     * Sets the value of the allocationid property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setAllocationid(String value)
    {
        this.allocationid = value;
    }

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
     * Gets the value of the allocateby property.
     * 
     * @return possible object is {@link String }
     */
    public String getAllocateby()
    {
        return allocateby;
    }

    /**
     * Sets the value of the allocateby property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setAllocateby(String value)
    {
        this.allocateby = value;
    }

    /**
     * Gets the value of the allocateto property.
     * 
     * @return possible object is {@link String }
     */
    public String getAllocateto()
    {
        return allocateto;
    }

    /**
     * Sets the value of the allocateto property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setAllocateto(String value)
    {
        this.allocateto = value;
    }

    /**
     * Gets the value of the docnumber property.
     * 
     * @return possible object is {@link String }
     */
    public String getDocnumber()
    {
        return docnumber;
    }

    /**
     * Sets the value of the docnumber property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setDocnumber(String value)
    {
        this.docnumber = value;
    }

    /**
     * Gets the value of the supdocid property.
     * 
     * @return possible object is {@link String }
     */
    public String getSupdocid()
    {
        return supdocid;
    }

    /**
     * Sets the value of the supdocid property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setSupdocid(String value)
    {
        this.supdocid = value;
    }

    /**
     * Gets the value of the allocationentry property.
     * 
     * @return possible object is {@link Allocationentry }
     */
    public Allocationentry getAllocationentry()
    {
        return allocationentry;
    }

    /**
     * Sets the value of the allocationentry property.
     * 
     * @param value allowed object is {@link Allocationentry }
     */
    public void setAllocationentry(Allocationentry value)
    {
        this.allocationentry = value;
    }

}
