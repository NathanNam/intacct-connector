//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.3-hudson-jaxb-ri-2.2.3-3- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.01.20 at 12:04:27 PM ART 
//

package org.mule.module.intacct.schema.response;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"key", "batchtitle", "datecreated", "open", "status", "totalamount",
    "apadjustment"})
@XmlRootElement(name = "apadjustmentbatch")
public class Apadjustmentbatch
{

    protected Key key;
    protected String batchtitle;
    protected Datecreated datecreated;
    protected String open;
    protected String status;
    protected String totalamount;
    protected List<Apadjustment> apadjustment;

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
     * Gets the value of the batchtitle property.
     * 
     * @return possible object is {@link String }
     */
    public String getBatchtitle()
    {
        return batchtitle;
    }

    /**
     * Sets the value of the batchtitle property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setBatchtitle(String value)
    {
        this.batchtitle = value;
    }

    /**
     * Gets the value of the datecreated property.
     * 
     * @return possible object is {@link Datecreated }
     */
    public Datecreated getDatecreated()
    {
        return datecreated;
    }

    /**
     * Sets the value of the datecreated property.
     * 
     * @param value allowed object is {@link Datecreated }
     */
    public void setDatecreated(Datecreated value)
    {
        this.datecreated = value;
    }

    /**
     * Gets the value of the open property.
     * 
     * @return possible object is {@link String }
     */
    public String getOpen()
    {
        return open;
    }

    /**
     * Sets the value of the open property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setOpen(String value)
    {
        this.open = value;
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
     * Gets the value of the totalamount property.
     * 
     * @return possible object is {@link String }
     */
    public String getTotalamount()
    {
        return totalamount;
    }

    /**
     * Sets the value of the totalamount property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setTotalamount(String value)
    {
        this.totalamount = value;
    }

    /**
     * Gets the value of the apadjustment property.
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
     * the apadjustment property.
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getApadjustment().add(newItem);
     * </pre>
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Apadjustment }
     */
    public List<Apadjustment> getApadjustment()
    {
        if (apadjustment == null)
        {
            apadjustment = new ArrayList<Apadjustment>();
        }
        return this.apadjustment;
    }

}
