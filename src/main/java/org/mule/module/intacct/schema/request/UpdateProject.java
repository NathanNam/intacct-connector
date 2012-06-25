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
@XmlType(name = "update_projectType", propOrder = {"projectid", "name", "description", "parentid", "projectcategory",
    "projecttype", "projectstatus", "customerid", "managerid", "salescontactid", "begindate", "enddate",
    "departmentid", "locationid", "currency", "billingtype", "termname", "billto", "shipto", "contactinfo",
    "sonumber", "ponumber", "poamount", "pqnumber", "status", "projectresources", "customfields"})
@XmlRootElement(name = "update_project")
public class UpdateProject
{

    @XmlAttribute(name = "key", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String key;
    @XmlAttribute(name = "set_nulls")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String setNulls;
    @XmlAttribute(name = "externalkey")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String externalkey;
    @XmlElement(required = true)
    protected String projectid;
    @XmlElement(required = true)
    protected String name;
    protected String description;
    protected String parentid;
    @XmlElement(required = true)
    protected String projectcategory;
    protected String projecttype;
    protected String projectstatus;
    protected Customerid customerid;
    protected String managerid;
    protected String salescontactid;
    protected Begindate begindate;
    protected Enddate enddate;
    protected Departmentid departmentid;
    protected Locationid locationid;
    protected String currency;
    protected String billingtype;
    protected Termname termname;
    protected Billto billto;
    protected Shipto shipto;
    protected Contactinfo contactinfo;
    protected String sonumber;
    protected String ponumber;
    protected String poamount;
    protected String pqnumber;
    protected String status;
    protected List<Projectresources> projectresources;
    protected Customfields customfields;

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
     * Gets the value of the projectid property.
     * 
     * @return possible object is {@link String }
     */
    public String getProjectid()
    {
        return projectid;
    }

    /**
     * Sets the value of the projectid property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setProjectid(String value)
    {
        this.projectid = value;
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
     * @return possible object is {@link String }
     */
    public String getProjecttype()
    {
        return projecttype;
    }

    /**
     * Sets the value of the projecttype property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setProjecttype(String value)
    {
        this.projecttype = value;
    }

    /**
     * Gets the value of the projectstatus property.
     * 
     * @return possible object is {@link String }
     */
    public String getProjectstatus()
    {
        return projectstatus;
    }

    /**
     * Sets the value of the projectstatus property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setProjectstatus(String value)
    {
        this.projectstatus = value;
    }

    /**
     * Gets the value of the customerid property.
     * 
     * @return possible object is {@link Customerid }
     */
    public Customerid getCustomerid()
    {
        return customerid;
    }

    /**
     * Sets the value of the customerid property.
     * 
     * @param value allowed object is {@link Customerid }
     */
    public void setCustomerid(Customerid value)
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
     * Gets the value of the billingtype property.
     * 
     * @return possible object is {@link String }
     */
    public String getBillingtype()
    {
        return billingtype;
    }

    /**
     * Sets the value of the billingtype property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setBillingtype(String value)
    {
        this.billingtype = value;
    }

    /**
     * Gets the value of the termname property.
     * 
     * @return possible object is {@link Termname }
     */
    public Termname getTermname()
    {
        return termname;
    }

    /**
     * Sets the value of the termname property.
     * 
     * @param value allowed object is {@link Termname }
     */
    public void setTermname(Termname value)
    {
        this.termname = value;
    }

    /**
     * Gets the value of the billto property.
     * 
     * @return possible object is {@link Billto }
     */
    public Billto getBillto()
    {
        return billto;
    }

    /**
     * Sets the value of the billto property.
     * 
     * @param value allowed object is {@link Billto }
     */
    public void setBillto(Billto value)
    {
        this.billto = value;
    }

    /**
     * Gets the value of the shipto property.
     * 
     * @return possible object is {@link Shipto }
     */
    public Shipto getShipto()
    {
        return shipto;
    }

    /**
     * Sets the value of the shipto property.
     * 
     * @param value allowed object is {@link Shipto }
     */
    public void setShipto(Shipto value)
    {
        this.shipto = value;
    }

    /**
     * Gets the value of the contactinfo property.
     * 
     * @return possible object is {@link Contactinfo }
     */
    public Contactinfo getContactinfo()
    {
        return contactinfo;
    }

    /**
     * Sets the value of the contactinfo property.
     * 
     * @param value allowed object is {@link Contactinfo }
     */
    public void setContactinfo(Contactinfo value)
    {
        this.contactinfo = value;
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
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
     * the projectresources property.
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getProjectresources().add(newItem);
     * </pre>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Projectresources }
     */
    public List<Projectresources> getProjectresources()
    {
        if (projectresources == null)
        {
            projectresources = new ArrayList<Projectresources>();
        }
        return this.projectresources;
    }

    /**
     * Gets the value of the customfields property.
     * 
     * @return possible object is {@link Customfields }
     */
    public Customfields getCustomfields()
    {
        return customfields;
    }

    /**
     * Sets the value of the customfields property.
     * 
     * @param value allowed object is {@link Customfields }
     */
    public void setCustomfields(Customfields value)
    {
        this.customfields = value;
    }

}
