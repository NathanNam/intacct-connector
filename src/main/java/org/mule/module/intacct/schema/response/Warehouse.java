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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"warehouseid", "name", "parentid", "managerid", "contactname", "shipto",
    "usedingl", "status"})
@XmlRootElement(name = "warehouse")
public class Warehouse
{

    protected String warehouseid;
    protected String name;
    protected String parentid;
    protected String managerid;
    protected Contactname contactname;
    protected Shipto shipto;
    protected String usedingl;
    protected String status;

    /**
     * Gets the value of the warehouseid property.
     * 
     * @return possible object is {@link String }
     */
    public String getWarehouseid()
    {
        return warehouseid;
    }

    /**
     * Sets the value of the warehouseid property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setWarehouseid(String value)
    {
        this.warehouseid = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return possible object is {@link String }
     */
    public String getName()
    {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setName(String value)
    {
        this.name = value;
    }

    /**
     * Gets the value of the parentid property.
     * 
     * @return possible object is {@link String }
     */
    public String getParentid()
    {
        return parentid;
    }

    /**
     * Sets the value of the parentid property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setParentid(String value)
    {
        this.parentid = value;
    }

    /**
     * Gets the value of the managerid property.
     * 
     * @return possible object is {@link String }
     */
    public String getManagerid()
    {
        return managerid;
    }

    /**
     * Sets the value of the managerid property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setManagerid(String value)
    {
        this.managerid = value;
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

    /**
     * Gets the value of the shipto property.
     * 
     * @return possible object is {@link Shipto }
     */
    public Shipto getShipto()
    {
        return shipto;
    }

    /**
     * Sets the value of the shipto property.
     * 
     * @param value allowed object is {@link Shipto }
     */
    public void setShipto(Shipto value)
    {
        this.shipto = value;
    }

    /**
     * Gets the value of the usedingl property.
     * 
     * @return possible object is {@link String }
     */
    public String getUsedingl()
    {
        return usedingl;
    }

    /**
     * Sets the value of the usedingl property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setUsedingl(String value)
    {
        this.usedingl = value;
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

}
