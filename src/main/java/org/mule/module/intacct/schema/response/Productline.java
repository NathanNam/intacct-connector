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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"productlineid", "parentid", "productlinedesc", "status"})
@XmlRootElement(name = "productline")
public class Productline
{

    protected String productlineid;
    @XmlElement(required = true)
    protected String parentid;
    protected String productlinedesc;
    protected String status;

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
     * Gets the value of the productlinedesc property.
     * 
     * @return possible object is {@link String }
     */
    public String getProductlinedesc()
    {
        return productlinedesc;
    }

    /**
     * Sets the value of the productlinedesc property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setProductlinedesc(String value)
    {
        this.productlinedesc = value;
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
