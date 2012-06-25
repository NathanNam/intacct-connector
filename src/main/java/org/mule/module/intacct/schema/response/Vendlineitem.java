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
@XmlType(name = "", propOrder = {"vendorid", "stockno", "leadtime", "econorderqty"})
@XmlRootElement(name = "vendlineitem")
public class Vendlineitem
{

    @XmlElement(required = true)
    protected String vendorid;
    protected String stockno;
    protected String leadtime;
    protected String econorderqty;

    /**
     * Gets the value of the vendorid property.
     * 
     * @return possible object is {@link String }
     */
    public String getVendorid()
    {
        return vendorid;
    }

    /**
     * Sets the value of the vendorid property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setVendorid(String value)
    {
        this.vendorid = value;
    }

    /**
     * Gets the value of the stockno property.
     * 
     * @return possible object is {@link String }
     */
    public String getStockno()
    {
        return stockno;
    }

    /**
     * Sets the value of the stockno property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setStockno(String value)
    {
        this.stockno = value;
    }

    /**
     * Gets the value of the leadtime property.
     * 
     * @return possible object is {@link String }
     */
    public String getLeadtime()
    {
        return leadtime;
    }

    /**
     * Sets the value of the leadtime property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setLeadtime(String value)
    {
        this.leadtime = value;
    }

    /**
     * Gets the value of the econorderqty property.
     * 
     * @return possible object is {@link String }
     */
    public String getEconorderqty()
    {
        return econorderqty;
    }

    /**
     * Sets the value of the econorderqty property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setEconorderqty(String value)
    {
        this.econorderqty = value;
    }

}
