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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "record_wucctransactionsType", propOrder = {"wucctransactions"})
@XmlRootElement(name = "record_wucctransactions")
public class RecordWucctransactions
{

    @XmlElement(required = true)
    protected Wucctransactions wucctransactions;

    /**
     * Gets the value of the wucctransactions property.
     * 
     * @return possible object is {@link Wucctransactions }
     */
    public Wucctransactions getWucctransactions()
    {
        return wucctransactions;
    }

    /**
     * Sets the value of the wucctransactions property.
     * 
     * @param value allowed object is {@link Wucctransactions }
     */
    public void setWucctransactions(Wucctransactions value)
    {
        this.wucctransactions = value;
    }

}
