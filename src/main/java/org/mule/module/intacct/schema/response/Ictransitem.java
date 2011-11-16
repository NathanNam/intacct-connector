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
@XmlType(name = "", propOrder = {"itemid", "itemdesc", "warehouseid", "quantity", "unit", "cost",
    "totalamount", "locationid", "departmentid", "customfields"})
@XmlRootElement(name = "ictransitem")
public class Ictransitem
{

    protected String itemid;
    protected String itemdesc;
    protected String warehouseid;
    protected String quantity;
    protected String unit;
    protected String cost;
    protected String totalamount;
    protected Locationid locationid;
    protected Departmentid departmentid;
    protected Customfields customfields;

    /**
     * Gets the value of the itemid property.
     * 
     * @return possible object is {@link String }
     */
    public String getItemid()
    {
        return itemid;
    }

    /**
     * Sets the value of the itemid property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setItemid(String value)
    {
        this.itemid = value;
    }

    /**
     * Gets the value of the itemdesc property.
     * 
     * @return possible object is {@link String }
     */
    public String getItemdesc()
    {
        return itemdesc;
    }

    /**
     * Sets the value of the itemdesc property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setItemdesc(String value)
    {
        this.itemdesc = value;
    }

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
     * Gets the value of the quantity property.
     * 
     * @return possible object is {@link String }
     */
    public String getQuantity()
    {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setQuantity(String value)
    {
        this.quantity = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return possible object is {@link String }
     */
    public String getUnit()
    {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setUnit(String value)
    {
        this.unit = value;
    }

    /**
     * Gets the value of the cost property.
     * 
     * @return possible object is {@link String }
     */
    public String getCost()
    {
        return cost;
    }

    /**
     * Sets the value of the cost property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setCost(String value)
    {
        this.cost = value;
    }

    /**
     * Gets the value of the totalamount property.
     * 
     * @return possible object is {@link String }
     */
    public String getTotalamount()
    {
        return totalamount;
    }

    /**
     * Sets the value of the totalamount property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setTotalamount(String value)
    {
        this.totalamount = value;
    }

    /**
     * Gets the value of the locationid property.
     * 
     * @return possible object is {@link Locationid }
     */
    public Locationid getLocationid()
    {
        return locationid;
    }

    /**
     * Sets the value of the locationid property.
     * 
     * @param value allowed object is {@link Locationid }
     */
    public void setLocationid(Locationid value)
    {
        this.locationid = value;
    }

    /**
     * Gets the value of the departmentid property.
     * 
     * @return possible object is {@link Departmentid }
     */
    public Departmentid getDepartmentid()
    {
        return departmentid;
    }

    /**
     * Sets the value of the departmentid property.
     * 
     * @param value allowed object is {@link Departmentid }
     */
    public void setDepartmentid(Departmentid value)
    {
        this.departmentid = value;
    }

    /**
     * Gets the value of the customfields property.
     * 
     * @return possible object is {@link Customfields }
     */
    public Customfields getCustomfields()
    {
        return customfields;
    }

    /**
     * Sets the value of the customfields property.
     * 
     * @param value allowed object is {@link Customfields }
     */
    public void setCustomfields(Customfields value)
    {
        this.customfields = value;
    }

}