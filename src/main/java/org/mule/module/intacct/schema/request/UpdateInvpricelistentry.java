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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "update_invpricelistentryType", propOrder = {"itemidOrProductlineid", "datefrom", "dateto", "minimumQuantity",
    "maximumQuantity", "value", "valuetype", "fixed", "status"})
@XmlRootElement(name = "update_invpricelistentry")
public class UpdateInvpricelistentry
{

    @XmlAttribute(name = "recordno", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String recordno;
    @XmlElements({@XmlElement(name = "itemid", type = Itemid.class),
        @XmlElement(name = "productlineid", type = Productlineid.class)})
    protected List<Object> itemidOrProductlineid;
    protected Datefrom datefrom;
    protected Dateto dateto;
    @XmlElement(name = "minimum_quantity")
    protected String minimumQuantity;
    @XmlElement(name = "maximum_quantity")
    protected String maximumQuantity;
    protected Value value;
    protected String valuetype;
    protected String fixed;
    protected String status;

    /**
     * Gets the value of the recordno property.
     * 
     * @return possible object is {@link String }
     */
    public String getRecordno()
    {
        return recordno;
    }

    /**
     * Sets the value of the recordno property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setRecordno(String value)
    {
        this.recordno = value;
    }

    /**
     * Gets the value of the itemidOrProductlineid property.
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
     * the itemidOrProductlineid property.
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getItemidOrProductlineid().add(newItem);
     * </pre>
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Itemid }
     * {@link Productlineid }
     */
    public List<Object> getItemidOrProductlineid()
    {
        if (itemidOrProductlineid == null)
        {
            itemidOrProductlineid = new ArrayList<Object>();
        }
        return this.itemidOrProductlineid;
    }

    /**
     * Gets the value of the datefrom property.
     * 
     * @return possible object is {@link Datefrom }
     */
    public Datefrom getDatefrom()
    {
        return datefrom;
    }

    /**
     * Sets the value of the datefrom property.
     * 
     * @param value allowed object is {@link Datefrom }
     */
    public void setDatefrom(Datefrom value)
    {
        this.datefrom = value;
    }

    /**
     * Gets the value of the dateto property.
     * 
     * @return possible object is {@link Dateto }
     */
    public Dateto getDateto()
    {
        return dateto;
    }

    /**
     * Sets the value of the dateto property.
     * 
     * @param value allowed object is {@link Dateto }
     */
    public void setDateto(Dateto value)
    {
        this.dateto = value;
    }

    /**
     * Gets the value of the minimumQuantity property.
     * 
     * @return possible object is {@link String }
     */
    public String getMinimumQuantity()
    {
        return minimumQuantity;
    }

    /**
     * Sets the value of the minimumQuantity property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setMinimumQuantity(String value)
    {
        this.minimumQuantity = value;
    }

    /**
     * Gets the value of the maximumQuantity property.
     * 
     * @return possible object is {@link String }
     */
    public String getMaximumQuantity()
    {
        return maximumQuantity;
    }

    /**
     * Sets the value of the maximumQuantity property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setMaximumQuantity(String value)
    {
        this.maximumQuantity = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return possible object is {@link Value }
     */
    public Value getValue()
    {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value allowed object is {@link Value }
     */
    public void setValue(Value value)
    {
        this.value = value;
    }

    /**
     * Gets the value of the valuetype property.
     * 
     * @return possible object is {@link String }
     */
    public String getValuetype()
    {
        return valuetype;
    }

    /**
     * Sets the value of the valuetype property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setValuetype(String value)
    {
        this.valuetype = value;
    }

    /**
     * Gets the value of the fixed property.
     * 
     * @return possible object is {@link String }
     */
    public String getFixed()
    {
        return fixed;
    }

    /**
     * Sets the value of the fixed property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setFixed(String value)
    {
        this.fixed = value;
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