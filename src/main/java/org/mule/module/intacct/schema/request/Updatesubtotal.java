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
@XmlType(name = "", propOrder = {"description", "total", "absval", "percentval", "locationid", "departmentid"})
@XmlRootElement(name = "updatesubtotal")
public class Updatesubtotal
{

    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    protected String total;
    protected String absval;
    protected String percentval;
    protected Locationid locationid;
    protected Departmentid departmentid;

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
     * Gets the value of the total property.
     * 
     * @return possible object is {@link String }
     */
    public String getTotal()
    {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setTotal(String value)
    {
        this.total = value;
    }

    /**
     * Gets the value of the absval property.
     * 
     * @return possible object is {@link String }
     */
    public String getAbsval()
    {
        return absval;
    }

    /**
     * Sets the value of the absval property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setAbsval(String value)
    {
        this.absval = value;
    }

    /**
     * Gets the value of the percentval property.
     * 
     * @return possible object is {@link String }
     */
    public String getPercentval()
    {
        return percentval;
    }

    /**
     * Sets the value of the percentval property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setPercentval(String value)
    {
        this.percentval = value;
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

}
