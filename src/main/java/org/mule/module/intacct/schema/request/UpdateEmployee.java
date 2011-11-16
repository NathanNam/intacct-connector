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
// Generated on: 2011.01.20 at 12:04:16 PM ART 
//

package org.mule.module.intacct.schema.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "update_employeeType", propOrder = {"ssn", "title", "locationid", "departmentid", "supervisorid", "birthdate",
    "startdate", "enddate", "terminationtype", "employeetype", "gender", "status", "currency", "name1099",
    "form1099Type", "form1099Box", "personalinfo", "contactlist"})
@XmlRootElement(name = "update_employee")
public class UpdateEmployee
{

    @XmlAttribute(name = "employeeid", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String employeeid;
    @XmlAttribute(name = "set_nulls")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String setNulls;
    @XmlAttribute(name = "externalkey")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String externalkey;
    protected String ssn;
    protected String title;
    protected Locationid locationid;
    protected Departmentid departmentid;
    protected String supervisorid;
    protected Birthdate birthdate;
    protected Startdate startdate;
    protected Enddate enddate;
    protected String terminationtype;
    protected String employeetype;
    protected String gender;
    protected String status;
    protected String currency;
    protected String name1099;
    @XmlElement(name = "form1099type")
    protected String form1099Type;
    @XmlElement(name = "form1099box")
    protected String form1099Box;
    @XmlElement(required = true)
    protected Personalinfo personalinfo;
    protected Contactlist contactlist;

    /**
     * Gets the value of the employeeid property.
     * 
     * @return possible object is {@link String }
     */
    public String getEmployeeid()
    {
        return employeeid;
    }

    /**
     * Sets the value of the employeeid property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setEmployeeid(String value)
    {
        this.employeeid = value;
    }

    /**
     * Gets the value of the setNulls property.
     * 
     * @return possible object is {@link String }
     */
    public String getSetNulls()
    {
        if (setNulls == null)
        {
            return "false";
        }
        else
        {
            return setNulls;
        }
    }

    /**
     * Sets the value of the setNulls property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setSetNulls(String value)
    {
        this.setNulls = value;
    }

    /**
     * Gets the value of the externalkey property.
     * 
     * @return possible object is {@link String }
     */
    public String getExternalkey()
    {
        if (externalkey == null)
        {
            return "false";
        }
        else
        {
            return externalkey;
        }
    }

    /**
     * Sets the value of the externalkey property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setExternalkey(String value)
    {
        this.externalkey = value;
    }

    /**
     * Gets the value of the ssn property.
     * 
     * @return possible object is {@link String }
     */
    public String getSsn()
    {
        return ssn;
    }

    /**
     * Sets the value of the ssn property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setSsn(String value)
    {
        this.ssn = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return possible object is {@link String }
     */
    public String getTitle()
    {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setTitle(String value)
    {
        this.title = value;
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
     * Gets the value of the supervisorid property.
     * 
     * @return possible object is {@link String }
     */
    public String getSupervisorid()
    {
        return supervisorid;
    }

    /**
     * Sets the value of the supervisorid property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setSupervisorid(String value)
    {
        this.supervisorid = value;
    }

    /**
     * Gets the value of the birthdate property.
     * 
     * @return possible object is {@link Birthdate }
     */
    public Birthdate getBirthdate()
    {
        return birthdate;
    }

    /**
     * Sets the value of the birthdate property.
     * 
     * @param value allowed object is {@link Birthdate }
     */
    public void setBirthdate(Birthdate value)
    {
        this.birthdate = value;
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
     * Gets the value of the terminationtype property.
     * 
     * @return possible object is {@link String }
     */
    public String getTerminationtype()
    {
        return terminationtype;
    }

    /**
     * Sets the value of the terminationtype property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setTerminationtype(String value)
    {
        this.terminationtype = value;
    }

    /**
     * Gets the value of the employeetype property.
     * 
     * @return possible object is {@link String }
     */
    public String getEmployeetype()
    {
        return employeetype;
    }

    /**
     * Sets the value of the employeetype property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setEmployeetype(String value)
    {
        this.employeetype = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return possible object is {@link String }
     */
    public String getGender()
    {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setGender(String value)
    {
        this.gender = value;
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
     * Gets the value of the currency property.
     * 
     * @return possible object is {@link String }
     */
    public String getCurrency()
    {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setCurrency(String value)
    {
        this.currency = value;
    }

    /**
     * Gets the value of the name1099 property.
     * 
     * @return possible object is {@link String }
     */
    public String getName1099()
    {
        return name1099;
    }

    /**
     * Sets the value of the name1099 property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setName1099(String value)
    {
        this.name1099 = value;
    }

    /**
     * Gets the value of the form1099Type property.
     * 
     * @return possible object is {@link String }
     */
    public String getForm1099Type()
    {
        return form1099Type;
    }

    /**
     * Sets the value of the form1099Type property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setForm1099Type(String value)
    {
        this.form1099Type = value;
    }

    /**
     * Gets the value of the form1099Box property.
     * 
     * @return possible object is {@link String }
     */
    public String getForm1099Box()
    {
        return form1099Box;
    }

    /**
     * Sets the value of the form1099Box property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setForm1099Box(String value)
    {
        this.form1099Box = value;
    }

    /**
     * Gets the value of the personalinfo property.
     * 
     * @return possible object is {@link Personalinfo }
     */
    public Personalinfo getPersonalinfo()
    {
        return personalinfo;
    }

    /**
     * Sets the value of the personalinfo property.
     * 
     * @param value allowed object is {@link Personalinfo }
     */
    public void setPersonalinfo(Personalinfo value)
    {
        this.personalinfo = value;
    }

    /**
     * Gets the value of the contactlist property.
     * 
     * @return possible object is {@link Contactlist }
     */
    public Contactlist getContactlist()
    {
        return contactlist;
    }

    /**
     * Sets the value of the contactlist property.
     * 
     * @param value allowed object is {@link Contactlist }
     */
    public void setContactlist(Contactlist value)
    {
        this.contactlist = value;
    }

}