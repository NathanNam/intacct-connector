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
@XmlType(name = "update_statglaccountType", propOrder = {"title", "requiredept", "requireloc", "requireproject", "requirecustomer",
    "requirevendor", "requireitem", "requireemployee", "requireclass", "customfields", "category", "status"})
@XmlRootElement(name = "update_statglaccount")
public class UpdateStatglaccount
{

    @XmlAttribute(name = "glaccountno", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String glaccountno;
    @XmlAttribute(name = "set_nulls")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String setNulls;
    @XmlAttribute(name = "externalkey")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String externalkey;
    protected String title;
    protected String requiredept;
    protected String requireloc;
    protected String requireproject;
    protected String requirecustomer;
    protected String requirevendor;
    protected String requireitem;
    protected String requireemployee;
    protected String requireclass;
    protected Customfields customfields;
    protected Category category;
    protected String status;

    /**
     * Gets the value of the glaccountno property.
     * 
     * @return possible object is {@link String }
     */
    public String getGlaccountno()
    {
        return glaccountno;
    }

    /**
     * Sets the value of the glaccountno property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setGlaccountno(String value)
    {
        this.glaccountno = value;
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
     * Gets the value of the requiredept property.
     * 
     * @return possible object is {@link String }
     */
    public String getRequiredept()
    {
        return requiredept;
    }

    /**
     * Sets the value of the requiredept property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setRequiredept(String value)
    {
        this.requiredept = value;
    }

    /**
     * Gets the value of the requireloc property.
     * 
     * @return possible object is {@link String }
     */
    public String getRequireloc()
    {
        return requireloc;
    }

    /**
     * Sets the value of the requireloc property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setRequireloc(String value)
    {
        this.requireloc = value;
    }

    /**
     * Gets the value of the requireproject property.
     * 
     * @return possible object is {@link String }
     */
    public String getRequireproject()
    {
        return requireproject;
    }

    /**
     * Sets the value of the requireproject property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setRequireproject(String value)
    {
        this.requireproject = value;
    }

    /**
     * Gets the value of the requirecustomer property.
     * 
     * @return possible object is {@link String }
     */
    public String getRequirecustomer()
    {
        return requirecustomer;
    }

    /**
     * Sets the value of the requirecustomer property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setRequirecustomer(String value)
    {
        this.requirecustomer = value;
    }

    /**
     * Gets the value of the requirevendor property.
     * 
     * @return possible object is {@link String }
     */
    public String getRequirevendor()
    {
        return requirevendor;
    }

    /**
     * Sets the value of the requirevendor property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setRequirevendor(String value)
    {
        this.requirevendor = value;
    }

    /**
     * Gets the value of the requireitem property.
     * 
     * @return possible object is {@link String }
     */
    public String getRequireitem()
    {
        return requireitem;
    }

    /**
     * Sets the value of the requireitem property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setRequireitem(String value)
    {
        this.requireitem = value;
    }

    /**
     * Gets the value of the requireemployee property.
     * 
     * @return possible object is {@link String }
     */
    public String getRequireemployee()
    {
        return requireemployee;
    }

    /**
     * Sets the value of the requireemployee property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setRequireemployee(String value)
    {
        this.requireemployee = value;
    }

    /**
     * Gets the value of the requireclass property.
     * 
     * @return possible object is {@link String }
     */
    public String getRequireclass()
    {
        return requireclass;
    }

    /**
     * Sets the value of the requireclass property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setRequireclass(String value)
    {
        this.requireclass = value;
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
     * Gets the value of the category property.
     * 
     * @return possible object is {@link Category }
     */
    public Category getCategory()
    {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value allowed object is {@link Category }
     */
    public void setCategory(Category value)
    {
        this.category = value;
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
