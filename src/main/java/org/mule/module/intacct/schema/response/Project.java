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
@XmlType(name = "", propOrder = {"key", "name", "description", "parentid", "projectcategory", "projecttype",
    "projectstatus", "customerid", "managerid", "salescontactid", "begindate", "enddate", "departmentid",
    "locationid", "currency", "sonumber", "ponumber", "poamount", "pqnumber", "status", "projectresources"})
@XmlRootElement(name = "project")
public class Project
{

    protected Key key;
    protected String name;
    protected String description;
    protected String parentid;
    protected String projectcategory;
    protected Projecttype projecttype;
    protected Projectstatus projectstatus;
    protected String customerid;
    protected String managerid;
    protected String salescontactid;
    protected Begindate begindate;
    protected Enddate enddate;
    protected Departmentid departmentid;
    protected Locationid locationid;
    protected String currency;
    protected String sonumber;
    protected String ponumber;
    protected String poamount;
    protected String pqnumber;
    protected String status;
    protected Projectresources projectresources;

    /**
     * Gets the value of the key property.
     * 
     * @return possible object is {@link Key }
     */
    public Key getKey()
    {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value allowed object is {@link Key }
     */
    public void setKey(Key value)
    {
        this.key = value;
    }

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
     * Gets the value of the projectcategory property.
     * 
     * @return possible object is {@link String }
     */
    public String getProjectcategory()
    {
        return projectcategory;
    }

    /**
     * Sets the value of the projectcategory property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setProjectcategory(String value)
    {
        this.projectcategory = value;
    }

    /**
     * Gets the value of the projecttype property.
     * 
     * @return possible object is {@link Projecttype }
     */
    public Projecttype getProjecttype()
    {
        return projecttype;
    }

    /**
     * Sets the value of the projecttype property.
     * 
     * @param value allowed object is {@link Projecttype }
     */
    public void setProjecttype(Projecttype value)
    {
        this.projecttype = value;
    }

    /**
     * Gets the value of the projectstatus property.
     * 
     * @return possible object is {@link Projectstatus }
     */
    public Projectstatus getProjectstatus()
    {
        return projectstatus;
    }

    /**
     * Sets the value of the projectstatus property.
     * 
     * @param value allowed object is {@link Projectstatus }
     */
    public void setProjectstatus(Projectstatus value)
    {
        this.projectstatus = value;
    }

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
     * Gets the value of the managerid property.
     * 
     * @return possible object is {@link String }
     */
    public String getManagerid()
    {
        return managerid;
    }

    /**
     * Sets the value of the managerid property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setManagerid(String value)
    {
        this.managerid = value;
    }

    /**
     * Gets the value of the salescontactid property.
     * 
     * @return possible object is {@link String }
     */
    public String getSalescontactid()
    {
        return salescontactid;
    }

    /**
     * Sets the value of the salescontactid property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setSalescontactid(String value)
    {
        this.salescontactid = value;
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
     * Gets the value of the sonumber property.
     * 
     * @return possible object is {@link String }
     */
    public String getSonumber()
    {
        return sonumber;
    }

    /**
     * Sets the value of the sonumber property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setSonumber(String value)
    {
        this.sonumber = value;
    }

    /**
     * Gets the value of the ponumber property.
     * 
     * @return possible object is {@link String }
     */
    public String getPonumber()
    {
        return ponumber;
    }

    /**
     * Sets the value of the ponumber property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setPonumber(String value)
    {
        this.ponumber = value;
    }

    /**
     * Gets the value of the poamount property.
     * 
     * @return possible object is {@link String }
     */
    public String getPoamount()
    {
        return poamount;
    }

    /**
     * Sets the value of the poamount property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setPoamount(String value)
    {
        this.poamount = value;
    }

    /**
     * Gets the value of the pqnumber property.
     * 
     * @return possible object is {@link String }
     */
    public String getPqnumber()
    {
        return pqnumber;
    }

    /**
     * Sets the value of the pqnumber property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setPqnumber(String value)
    {
        this.pqnumber = value;
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
     * Gets the value of the projectresources property.
     * 
     * @return possible object is {@link Projectresources }
     */
    public Projectresources getProjectresources()
    {
        return projectresources;
    }

    /**
     * Sets the value of the projectresources property.
     * 
     * @param value allowed object is {@link Projectresources }
     */
    public void setProjectresources(Projectresources value)
    {
        this.projectresources = value;
    }

}
