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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "update_apadjustmentType", propOrder = {"vendorid", "datecreated", "adjustmentno", "billno", "description",
    "currency", "exchratedateOrExchratetypeOrExchrate", "updateapadjustmentitems"})
@XmlRootElement(name = "update_apadjustment")
public class UpdateApadjustment
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
    protected Vendorid vendorid;
    protected Datecreated datecreated;
    protected String adjustmentno;
    protected String billno;
    protected String description;
    protected String currency;
    @XmlElements({@XmlElement(name = "exchratedate", type = Exchratedate.class),
        @XmlElement(name = "exchratetype", type = Exchratetype.class),
        @XmlElement(name = "exchrate", type = Exchrate.class)})
    protected List<Object> exchratedateOrExchratetypeOrExchrate;
    protected Updateapadjustmentitems updateapadjustmentitems;

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
     * Gets the value of the vendorid property.
     * 
     * @return possible object is {@link Vendorid }
     */
    public Vendorid getVendorid()
    {
        return vendorid;
    }

    /**
     * Sets the value of the vendorid property.
     * 
     * @param value allowed object is {@link Vendorid }
     */
    public void setVendorid(Vendorid value)
    {
        this.vendorid = value;
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
     * Gets the value of the adjustmentno property.
     * 
     * @return possible object is {@link String }
     */
    public String getAdjustmentno()
    {
        return adjustmentno;
    }

    /**
     * Sets the value of the adjustmentno property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setAdjustmentno(String value)
    {
        this.adjustmentno = value;
    }

    /**
     * Gets the value of the billno property.
     * 
     * @return possible object is {@link String }
     */
    public String getBillno()
    {
        return billno;
    }

    /**
     * Sets the value of the billno property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setBillno(String value)
    {
        this.billno = value;
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
     * Gets the value of the exchratedateOrExchratetypeOrExchrate property.
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
     * the exchratedateOrExchratetypeOrExchrate property.
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getExchratedateOrExchratetypeOrExchrate().add(newItem);
     * </pre>
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Exchratedate }
     * {@link Exchratetype } {@link Exchrate }
     */
    public List<Object> getExchratedateOrExchratetypeOrExchrate()
    {
        if (exchratedateOrExchratetypeOrExchrate == null)
        {
            exchratedateOrExchratetypeOrExchrate = new ArrayList<Object>();
        }
        return this.exchratedateOrExchratetypeOrExchrate;
    }

    /**
     * Gets the value of the updateapadjustmentitems property.
     * 
     * @return possible object is {@link Updateapadjustmentitems }
     */
    public Updateapadjustmentitems getUpdateapadjustmentitems()
    {
        return updateapadjustmentitems;
    }

    /**
     * Sets the value of the updateapadjustmentitems property.
     * 
     * @param value allowed object is {@link Updateapadjustmentitems }
     */
    public void setUpdateapadjustmentitems(Updateapadjustmentitems value)
    {
        this.updateapadjustmentitems = value;
    }

}
