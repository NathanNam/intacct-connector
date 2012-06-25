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
@XmlType(name = "", propOrder = {"application", "preference", "prefvalue"})
@XmlRootElement(name = "companypref")
public class Companypref
{

    @XmlElement(required = true)
    protected String application;
    @XmlElement(required = true)
    protected String preference;
    @XmlElement(required = true)
    protected String prefvalue;

    /**
     * Gets the value of the application property.
     * 
     * @return possible object is {@link String }
     */
    public String getApplication()
    {
        return application;
    }

    /**
     * Sets the value of the application property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setApplication(String value)
    {
        this.application = value;
    }

    /**
     * Gets the value of the preference property.
     * 
     * @return possible object is {@link String }
     */
    public String getPreference()
    {
        return preference;
    }

    /**
     * Sets the value of the preference property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setPreference(String value)
    {
        this.preference = value;
    }

    /**
     * Gets the value of the prefvalue property.
     * 
     * @return possible object is {@link String }
     */
    public String getPrefvalue()
    {
        return prefvalue;
    }

    /**
     * Sets the value of the prefvalue property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setPrefvalue(String value)
    {
        this.prefvalue = value;
    }

}
