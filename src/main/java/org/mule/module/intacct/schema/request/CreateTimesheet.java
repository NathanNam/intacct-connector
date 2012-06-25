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

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "create_timesheetType", propOrder = {"employeeid", "begindate", "timesheetdescription", "timesheetitems"})
@XmlRootElement(name = "create_timesheet")
public class CreateTimesheet
{

    @XmlElement(required = true)
    protected Employeeid employeeid;
    @XmlElement(required = true)
    protected Begindate begindate;
    protected String timesheetdescription;
    @XmlElement(required = true)
    protected List<Timesheetitems> timesheetitems;

    /**
     * Gets the value of the employeeid property.
     * 
     * @return possible object is {@link Employeeid }
     */
    public Employeeid getEmployeeid()
    {
        return employeeid;
    }

    /**
     * Sets the value of the employeeid property.
     * 
     * @param value allowed object is {@link Employeeid }
     */
    public void setEmployeeid(Employeeid value)
    {
        this.employeeid = value;
    }

    /**
     * Gets the value of the begindate property.
     * 
     * @return possible object is {@link Begindate }
     */
    public Begindate getBegindate()
    {
        return begindate;
    }

    /**
     * Sets the value of the begindate property.
     * 
     * @param value allowed object is {@link Begindate }
     */
    public void setBegindate(Begindate value)
    {
        this.begindate = value;
    }

    /**
     * Gets the value of the timesheetdescription property.
     * 
     * @return possible object is {@link String }
     */
    public String getTimesheetdescription()
    {
        return timesheetdescription;
    }

    /**
     * Sets the value of the timesheetdescription property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setTimesheetdescription(String value)
    {
        this.timesheetdescription = value;
    }

    /**
     * Gets the value of the timesheetitems property.
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
     * the timesheetitems property.
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getTimesheetitems().add(newItem);
     * </pre>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Timesheetitems }
     */
    public List<Timesheetitems> getTimesheetitems()
    {
        if (timesheetitems == null)
        {
            timesheetitems = new ArrayList<Timesheetitems>();
        }
        return this.timesheetitems;
    }

}
