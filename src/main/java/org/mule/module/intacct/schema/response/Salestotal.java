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
@XmlType(name = "", propOrder = {"customerid", "itemid", "productlineid", "quantity", "totalamount"})
@XmlRootElement(name = "salestotal")
public class Salestotal
{

    @XmlElement(required = true)
    protected String customerid;
    @XmlElement(required = true)
    protected String itemid;
    @XmlElement(required = true)
    protected String productlineid;
    @XmlElement(required = true)
    protected String quantity;
    @XmlElement(required = true)
    protected String totalamount;

    /**
     * Gets the value of the customerid property.
     * 
     * @return possible object is {@link String }
     */
    public String getCustomerid()
    {
        return customerid;
    }

    /**
     * Sets the value of the customerid property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setCustomerid(String value)
    {
        this.customerid = value;
    }

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
     * Gets the value of the productlineid property.
     * 
     * @return possible object is {@link String }
     */
    public String getProductlineid()
    {
        return productlineid;
    }

    /**
     * Sets the value of the productlineid property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setProductlineid(String value)
    {
        this.productlineid = value;
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

}
