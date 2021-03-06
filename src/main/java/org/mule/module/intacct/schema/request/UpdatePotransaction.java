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
@XmlType(name = "update_potransactionType", propOrder = {"datecreated", "referenceno", "vendordocno", "termname", "datedue",
    "message", "shippingmethod", "returnto", "payto", "externalid", "basecurr", "currency",
    "exchratedateOrExchratetypeOrExchrate", "customfields", "updatepotransitems", "updatesubtotals"})
@XmlRootElement(name = "update_potransaction")
public class UpdatePotransaction
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
    protected Datecreated datecreated;
    protected String referenceno;
    protected String vendordocno;
    protected Termname termname;
    protected Datedue datedue;
    protected String message;
    protected String shippingmethod;
    protected Returnto returnto;
    protected Payto payto;
    protected String externalid;
    protected String basecurr;
    protected String currency;
    @XmlElements({@XmlElement(name = "exchratedate", type = Exchratedate.class),
        @XmlElement(name = "exchratetype", type = Exchratetype.class),
        @XmlElement(name = "exchrate", type = Exchrate.class)})
    protected List<Object> exchratedateOrExchratetypeOrExchrate;
    protected Customfields customfields;
    protected Updatepotransitems updatepotransitems;
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
     * Gets the value of the vendordocno property.
     * 
     * @return possible object is {@link String }
     */
    public String getVendordocno()
    {
        return vendordocno;
    }

    /**
     * Sets the value of the vendordocno property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setVendordocno(String value)
    {
        this.vendordocno = value;
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
     * Gets the value of the returnto property.
     * 
     * @return possible object is {@link Returnto }
     */
    public Returnto getReturnto()
    {
        return returnto;
    }

    /**
     * Sets the value of the returnto property.
     * 
     * @param value allowed object is {@link Returnto }
     */
    public void setReturnto(Returnto value)
    {
        this.returnto = value;
    }

    /**
     * Gets the value of the payto property.
     * 
     * @return possible object is {@link Payto }
     */
    public Payto getPayto()
    {
        return payto;
    }

    /**
     * Sets the value of the payto property.
     * 
     * @param value allowed object is {@link Payto }
     */
    public void setPayto(Payto value)
    {
        this.payto = value;
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
     * Gets the value of the updatepotransitems property.
     * 
     * @return possible object is {@link Updatepotransitems }
     */
    public Updatepotransitems getUpdatepotransitems()
    {
        return updatepotransitems;
    }

    /**
     * Sets the value of the updatepotransitems property.
     * 
     * @param value allowed object is {@link Updatepotransitems }
     */
    public void setUpdatepotransitems(Updatepotransitems value)
    {
        this.updatepotransitems = value;
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
