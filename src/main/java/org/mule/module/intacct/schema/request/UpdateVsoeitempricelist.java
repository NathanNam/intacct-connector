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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "update_vsoeitempricelistType", propOrder = {"percentbase", "percentof", "status", "priceentries"})
@XmlRootElement(name = "update_vsoeitempricelist")
public class UpdateVsoeitempricelist
{

    @XmlAttribute(name = "key", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String key;
    protected Percentbase percentbase;
    protected String percentof;
    protected String status;
    @XmlElement(required = true)
    protected Priceentries priceentries;

    /**
     * Gets the value of the key property.
     * 
     * @return possible object is {@link String }
     */
    public String getKey()
    {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setKey(String value)
    {
        this.key = value;
    }

    /**
     * Gets the value of the percentbase property.
     * 
     * @return possible object is {@link Percentbase }
     */
    public Percentbase getPercentbase()
    {
        return percentbase;
    }

    /**
     * Sets the value of the percentbase property.
     * 
     * @param value allowed object is {@link Percentbase }
     */
    public void setPercentbase(Percentbase value)
    {
        this.percentbase = value;
    }

    /**
     * Gets the value of the percentof property.
     * 
     * @return possible object is {@link String }
     */
    public String getPercentof()
    {
        return percentof;
    }

    /**
     * Sets the value of the percentof property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setPercentof(String value)
    {
        this.percentof = value;
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
     * Gets the value of the priceentries property.
     * 
     * @return possible object is {@link Priceentries }
     */
    public Priceentries getPriceentries()
    {
        return priceentries;
    }

    /**
     * Sets the value of the priceentries property.
     * 
     * @param value allowed object is {@link Priceentries }
     */
    public void setPriceentries(Priceentries value)
    {
        this.priceentries = value;
    }

}
