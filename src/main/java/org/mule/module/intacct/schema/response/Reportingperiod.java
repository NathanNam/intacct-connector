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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"name", "headingtitle", "headingtitle2", "startdate", "enddate",
    "budgetable", "status"})
@XmlRootElement(name = "reportingperiod")
public class Reportingperiod
{

    protected String name;
    protected String headingtitle;
    protected String headingtitle2;
    protected Startdate startdate;
    protected Enddate enddate;
    protected String budgetable;
    protected String status;

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
     * Gets the value of the headingtitle property.
     * 
     * @return possible object is {@link String }
     */
    public String getHeadingtitle()
    {
        return headingtitle;
    }

    /**
     * Sets the value of the headingtitle property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setHeadingtitle(String value)
    {
        this.headingtitle = value;
    }

    /**
     * Gets the value of the headingtitle2 property.
     * 
     * @return possible object is {@link String }
     */
    public String getHeadingtitle2()
    {
        return headingtitle2;
    }

    /**
     * Sets the value of the headingtitle2 property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setHeadingtitle2(String value)
    {
        this.headingtitle2 = value;
    }

    /**
     * Gets the value of the startdate property.
     * 
     * @return possible object is {@link Startdate }
     */
    public Startdate getStartdate()
    {
        return startdate;
    }

    /**
     * Sets the value of the startdate property.
     * 
     * @param value allowed object is {@link Startdate }
     */
    public void setStartdate(Startdate value)
    {
        this.startdate = value;
    }

    /**
     * Gets the value of the enddate property.
     * 
     * @return possible object is {@link Enddate }
     */
    public Enddate getEnddate()
    {
        return enddate;
    }

    /**
     * Sets the value of the enddate property.
     * 
     * @param value allowed object is {@link Enddate }
     */
    public void setEnddate(Enddate value)
    {
        this.enddate = value;
    }

    /**
     * Gets the value of the budgetable property.
     * 
     * @return possible object is {@link String }
     */
    public String getBudgetable()
    {
        return budgetable;
    }

    /**
     * Sets the value of the budgetable property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setBudgetable(String value)
    {
        this.budgetable = value;
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
