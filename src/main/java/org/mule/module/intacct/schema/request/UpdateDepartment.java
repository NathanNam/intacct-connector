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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "update_departmentType", propOrder = {"title", "parentid", "supervisorid", "status", "customfields", "custtitle"})
@XmlRootElement(name = "update_department")
public class UpdateDepartment
{

    @XmlAttribute(name = "departmentid", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String departmentid;
    @XmlAttribute(name = "set_nulls")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String setNulls;
    @XmlAttribute(name = "externalkey")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String externalkey;
    protected String title;
    protected String parentid;
    protected String supervisorid;
    protected String status;
    protected Customfields customfields;
    protected String custtitle;

    /**
     * Gets the value of the departmentid property.
     * 
     * @return possible object is {@link String }
     */
    public String getDepartmentid()
    {
        return departmentid;
    }

    /**
     * Sets the value of the departmentid property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setDepartmentid(String value)
    {
        this.departmentid = value;
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

    /**
     * Gets the value of the custtitle property.
     * 
     * @return possible object is {@link String }
     */
    public String getCusttitle()
    {
        return custtitle;
    }

    /**
     * Sets the value of the custtitle property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setCusttitle(String value)
    {
        this.custtitle = value;
    }

}
