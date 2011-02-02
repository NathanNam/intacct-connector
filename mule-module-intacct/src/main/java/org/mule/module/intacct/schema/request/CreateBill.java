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
@XmlType(name = "create_billType", propOrder = {"vendorid", "datecreated", "dateposted", "datedueOrTermname", "batchkey",
    "billno", "ponumber", "onhold", "description", "externalid", "payto", "returnto", "basecurr", "currency",
    "exchratedateOrExchratetypeOrExchrate", "nogl", "customfields", "billitems"})
@XmlRootElement(name = "create_bill")
public class CreateBill
{

    @XmlElement(required = true)
    protected Vendorid vendorid;
    @XmlElement(required = true)
    protected Datecreated datecreated;
    protected Dateposted dateposted;
    @XmlElements({@XmlElement(name = "datedue", required = true, type = Datedue.class),
        @XmlElement(name = "termname", required = true, type = Termname.class)})
    protected List<Object> datedueOrTermname;
    protected Batchkey batchkey;
    protected String billno;
    protected String ponumber;
    protected String onhold;
    protected String description;
    protected String externalid;
    protected Payto payto;
    protected Returnto returnto;
    protected String basecurr;
    protected String currency;
    @XmlElements({@XmlElement(name = "exchratedate", type = Exchratedate.class),
        @XmlElement(name = "exchratetype", type = Exchratetype.class),
        @XmlElement(name = "exchrate", type = Exchrate.class)})
    protected List<Object> exchratedateOrExchratetypeOrExchrate;
    protected String nogl;
    protected Customfields customfields;
    @XmlElement(required = true)
    protected Billitems billitems;

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
     * Gets the value of the dateposted property.
     * 
     * @return possible object is {@link Dateposted }
     */
    public Dateposted getDateposted()
    {
        return dateposted;
    }

    /**
     * Sets the value of the dateposted property.
     * 
     * @param value allowed object is {@link Dateposted }
     */
    public void setDateposted(Dateposted value)
    {
        this.dateposted = value;
    }

    /**
     * Gets the value of the datedueOrTermname property.
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
     * the datedueOrTermname property.
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getDatedueOrTermname().add(newItem);
     * </pre>
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Datedue }
     * {@link Termname }
     */
    public List<Object> getDatedueOrTermname()
    {
        if (datedueOrTermname == null)
        {
            datedueOrTermname = new ArrayList<Object>();
        }
        return this.datedueOrTermname;
    }

    /**
     * Gets the value of the batchkey property.
     * 
     * @return possible object is {@link Batchkey }
     */
    public Batchkey getBatchkey()
    {
        return batchkey;
    }

    /**
     * Sets the value of the batchkey property.
     * 
     * @param value allowed object is {@link Batchkey }
     */
    public void setBatchkey(Batchkey value)
    {
        this.batchkey = value;
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
     * Gets the value of the onhold property.
     * 
     * @return possible object is {@link String }
     */
    public String getOnhold()
    {
        return onhold;
    }

    /**
     * Sets the value of the onhold property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setOnhold(String value)
    {
        this.onhold = value;
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
     * Gets the value of the nogl property.
     * 
     * @return possible object is {@link String }
     */
    public String getNogl()
    {
        return nogl;
    }

    /**
     * Sets the value of the nogl property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setNogl(String value)
    {
        this.nogl = value;
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
     * Gets the value of the billitems property.
     * 
     * @return possible object is {@link Billitems }
     */
    public Billitems getBillitems()
    {
        return billitems;
    }

    /**
     * Sets the value of the billitems property.
     * 
     * @param value allowed object is {@link Billitems }
     */
    public void setBillitems(Billitems value)
    {
        this.billitems = value;
    }

}
