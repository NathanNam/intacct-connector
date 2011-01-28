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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"trtype", "amount", "glaccountno", "document", "datecreated", "memo",
    "locationid", "departmentid", "customfields", "reconDate", "currency",
    "exchratedateOrExchratetypeOrExchrate"})
@XmlRootElement(name = "glentry")
public class Glentry
{

    @XmlElement(required = true)
    protected String trtype;
    @XmlElement(required = true)
    protected String amount;
    @XmlElement(required = true)
    protected Glaccountno glaccountno;
    protected String document;
    protected Datecreated datecreated;
    protected String memo;
    protected Locationid locationid;
    protected Departmentid departmentid;
    protected Customfields customfields;
    @XmlElement(name = "recon_date")
    protected ReconDate reconDate;
    protected String currency;
    @XmlElements({@XmlElement(name = "exchratedate", type = Exchratedate.class),
        @XmlElement(name = "exchratetype", type = Exchratetype.class),
        @XmlElement(name = "exchrate", type = Exchrate.class)})
    protected List<Object> exchratedateOrExchratetypeOrExchrate;

    /**
     * Gets the value of the trtype property.
     * 
     * @return possible object is {@link String }
     */
    public String getTrtype()
    {
        return trtype;
    }

    /**
     * Sets the value of the trtype property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setTrtype(String value)
    {
        this.trtype = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return possible object is {@link String }
     */
    public String getAmount()
    {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setAmount(String value)
    {
        this.amount = value;
    }

    /**
     * Gets the value of the glaccountno property.
     * 
     * @return possible object is {@link Glaccountno }
     */
    public Glaccountno getGlaccountno()
    {
        return glaccountno;
    }

    /**
     * Sets the value of the glaccountno property.
     * 
     * @param value allowed object is {@link Glaccountno }
     */
    public void setGlaccountno(Glaccountno value)
    {
        this.glaccountno = value;
    }

    /**
     * Gets the value of the document property.
     * 
     * @return possible object is {@link String }
     */
    public String getDocument()
    {
        return document;
    }

    /**
     * Sets the value of the document property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setDocument(String value)
    {
        this.document = value;
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
     * Gets the value of the memo property.
     * 
     * @return possible object is {@link String }
     */
    public String getMemo()
    {
        return memo;
    }

    /**
     * Sets the value of the memo property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setMemo(String value)
    {
        this.memo = value;
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
     * Gets the value of the reconDate property.
     * 
     * @return possible object is {@link ReconDate }
     */
    public ReconDate getReconDate()
    {
        return reconDate;
    }

    /**
     * Sets the value of the reconDate property.
     * 
     * @param value allowed object is {@link ReconDate }
     */
    public void setReconDate(ReconDate value)
    {
        this.reconDate = value;
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

}
