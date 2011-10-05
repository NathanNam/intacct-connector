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
@XmlType(name = "apply_arpaymentType", propOrder = {"arpaymentkey", "paymentdate", "batchkey", "memo", "overpaylocid",
    "overpaydeptid", "arpaymentitemsOrArpaymentitemdetails"})
@XmlRootElement(name = "apply_arpayment")
public class ApplyArpayment
{

    @XmlElement(required = true)
    protected String arpaymentkey;
    @XmlElement(required = true)
    protected Paymentdate paymentdate;
    protected Batchkey batchkey;
    protected String memo;
    protected String overpaylocid;
    protected String overpaydeptid;
    @XmlElements({@XmlElement(name = "arpaymentitems", type = Arpaymentitems.class),
        @XmlElement(name = "arpaymentitemdetails", type = Arpaymentitemdetails.class)})
    protected List<Object> arpaymentitemsOrArpaymentitemdetails;

    /**
     * Gets the value of the arpaymentkey property.
     * 
     * @return possible object is {@link String }
     */
    public String getArpaymentkey()
    {
        return arpaymentkey;
    }

    /**
     * Sets the value of the arpaymentkey property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setArpaymentkey(String value)
    {
        this.arpaymentkey = value;
    }

    /**
     * Gets the value of the paymentdate property.
     * 
     * @return possible object is {@link Paymentdate }
     */
    public Paymentdate getPaymentdate()
    {
        return paymentdate;
    }

    /**
     * Sets the value of the paymentdate property.
     * 
     * @param value allowed object is {@link Paymentdate }
     */
    public void setPaymentdate(Paymentdate value)
    {
        this.paymentdate = value;
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
     * Gets the value of the overpaylocid property.
     * 
     * @return possible object is {@link String }
     */
    public String getOverpaylocid()
    {
        return overpaylocid;
    }

    /**
     * Sets the value of the overpaylocid property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setOverpaylocid(String value)
    {
        this.overpaylocid = value;
    }

    /**
     * Gets the value of the overpaydeptid property.
     * 
     * @return possible object is {@link String }
     */
    public String getOverpaydeptid()
    {
        return overpaydeptid;
    }

    /**
     * Sets the value of the overpaydeptid property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setOverpaydeptid(String value)
    {
        this.overpaydeptid = value;
    }

    /**
     * Gets the value of the arpaymentitemsOrArpaymentitemdetails property.
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
     * the arpaymentitemsOrArpaymentitemdetails property.
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getArpaymentitemsOrArpaymentitemdetails().add(newItem);
     * </pre>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Arpaymentitems } {@link Arpaymentitemdetails }
     */
    public List<Object> getArpaymentitemsOrArpaymentitemdetails()
    {
        if (arpaymentitemsOrArpaymentitemdetails == null)
        {
            arpaymentitemsOrArpaymentitemdetails = new ArrayList<Object>();
        }
        return this.arpaymentitemsOrArpaymentitemdetails;
    }

}
