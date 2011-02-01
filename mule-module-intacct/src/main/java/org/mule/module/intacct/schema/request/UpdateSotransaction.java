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
@XmlType(name = "", propOrder = {"datecreated", "referenceno", "termname", "datedue", "message",
    "shippingmethod", "shipto", "billto", "externalid", "basecurr", "currency",
    "exchratedateOrExchratetypeOrExchrate", "vsoepricelist", "customfields", "updatesotransitems",
    "updatesubtotals"})
@XmlRootElement(name = "update_sotransaction")
public class UpdateSotransaction
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
    @XmlAttribute(name = "disablevalidation")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String disablevalidation;
    protected Datecreated datecreated;
    protected String referenceno;
    protected Termname termname;
    protected Datedue datedue;
    protected String message;
    protected String shippingmethod;
    protected Shipto shipto;
    protected Billto billto;
    protected String externalid;
    protected String basecurr;
    protected String currency;
    @XmlElements({@XmlElement(name = "exchratedate", type = Exchratedate.class),
        @XmlElement(name = "exchratetype", type = Exchratetype.class),
        @XmlElement(name = "exchrate", type = Exchrate.class)})
    protected List<Object> exchratedateOrExchratetypeOrExchrate;
    protected String vsoepricelist;
    protected Customfields customfields;
    protected Updatesotransitems updatesotransitems;
    protected Updatesubtotals updatesubtotals;

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
     * Gets the value of the disablevalidation property.
     * 
     * @return possible object is {@link String }
     */
    public String getDisablevalidation()
    {
        if (disablevalidation == null)
        {
            return "false";
        }
        else
        {
            return disablevalidation;
        }
    }

    /**
     * Sets the value of the disablevalidation property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setDisablevalidation(String value)
    {
        this.disablevalidation = value;
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
     * Gets the value of the referenceno property.
     * 
     * @return possible object is {@link String }
     */
    public String getReferenceno()
    {
        return referenceno;
    }

    /**
     * Sets the value of the referenceno property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setReferenceno(String value)
    {
        this.referenceno = value;
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
     * Gets the value of the datedue property.
     * 
     * @return possible object is {@link Datedue }
     */
    public Datedue getDatedue()
    {
        return datedue;
    }

    /**
     * Sets the value of the datedue property.
     * 
     * @param value allowed object is {@link Datedue }
     */
    public void setDatedue(Datedue value)
    {
        this.datedue = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return possible object is {@link String }
     */
    public String getMessage()
    {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setMessage(String value)
    {
        this.message = value;
    }

    /**
     * Gets the value of the shippingmethod property.
     * 
     * @return possible object is {@link String }
     */
    public String getShippingmethod()
    {
        return shippingmethod;
    }

    /**
     * Sets the value of the shippingmethod property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setShippingmethod(String value)
    {
        this.shippingmethod = value;
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
     * Gets the value of the externalid property.
     * 
     * @return possible object is {@link String }
     */
    public String getExternalid()
    {
        return externalid;
    }

    /**
     * Sets the value of the externalid property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setExternalid(String value)
    {
        this.externalid = value;
    }

    /**
     * Gets the value of the basecurr property.
     * 
     * @return possible object is {@link String }
     */
    public String getBasecurr()
    {
        return basecurr;
    }

    /**
     * Sets the value of the basecurr property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setBasecurr(String value)
    {
        this.basecurr = value;
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
     * Gets the value of the vsoepricelist property.
     * 
     * @return possible object is {@link String }
     */
    public String getVsoepricelist()
    {
        return vsoepricelist;
    }

    /**
     * Sets the value of the vsoepricelist property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setVsoepricelist(String value)
    {
        this.vsoepricelist = value;
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
     * Gets the value of the updatesotransitems property.
     * 
     * @return possible object is {@link Updatesotransitems }
     */
    public Updatesotransitems getUpdatesotransitems()
    {
        return updatesotransitems;
    }

    /**
     * Sets the value of the updatesotransitems property.
     * 
     * @param value allowed object is {@link Updatesotransitems }
     */
    public void setUpdatesotransitems(Updatesotransitems value)
    {
        this.updatesotransitems = value;
    }

    /**
     * Gets the value of the updatesubtotals property.
     * 
     * @return possible object is {@link Updatesubtotals }
     */
    public Updatesubtotals getUpdatesubtotals()
    {
        return updatesubtotals;
    }

    /**
     * Sets the value of the updatesubtotals property.
     * 
     * @param value allowed object is {@link Updatesubtotals }
     */
    public void setUpdatesubtotals(Updatesubtotals value)
    {
        this.updatesubtotals = value;
    }

}