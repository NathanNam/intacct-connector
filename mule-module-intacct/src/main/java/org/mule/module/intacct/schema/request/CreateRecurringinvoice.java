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
@XmlType(name = "", propOrder = {"customerid", "datecreated", "recordid", "docnumber", "description",
    "contractid", "contractdesc", "termname", "currency", "exchratedateOrExchratetypeOrExchrate", "status",
    "supdocid", "billtocontactname", "shiptocontactname", "startdate", "ending", "modenew", "interval",
    "eom", "recurinvoiceitems", "paymethod", "payinfull", "paymentamount", "customercreditcardkey",
    "customerbankaccountkey", "creditcardtype", "expirednotify", "expirednotifyemail", "accounttype",
    "bankaccountidOrGlaccountkey"})
@XmlRootElement(name = "create_recurringinvoice")
public class CreateRecurringinvoice
{

    @XmlElement(required = true)
    protected Customerid customerid;
    @XmlElement(required = true)
    protected Datecreated datecreated;
    protected String recordid;
    protected String docnumber;
    protected String description;
    protected String contractid;
    protected String contractdesc;
    @XmlElement(required = true)
    protected Termname termname;
    protected String currency;
    @XmlElements({@XmlElement(name = "exchratedate", type = Exchratedate.class),
        @XmlElement(name = "exchratetype", type = Exchratetype.class),
        @XmlElement(name = "exchrate", type = Exchrate.class)})
    protected List<Object> exchratedateOrExchratetypeOrExchrate;
    protected String status;
    protected String supdocid;
    protected String billtocontactname;
    protected String shiptocontactname;
    @XmlElement(required = true)
    protected Startdate startdate;
    protected Ending ending;
    protected String modenew;
    protected String interval;
    protected String eom;
    @XmlElement(required = true)
    protected Recurinvoiceitems recurinvoiceitems;
    protected String paymethod;
    protected String payinfull;
    protected Paymentamount paymentamount;
    protected String customercreditcardkey;
    protected String customerbankaccountkey;
    protected String creditcardtype;
    protected String expirednotify;
    protected String expirednotifyemail;
    protected String accounttype;
    @XmlElements({@XmlElement(name = "bankaccountid", type = Bankaccountid.class),
        @XmlElement(name = "glaccountkey", type = Glaccountkey.class)})
    protected List<Object> bankaccountidOrGlaccountkey;

    /**
     * Gets the value of the customerid property.
     * 
     * @return possible object is {@link Customerid }
     */
    public Customerid getCustomerid()
    {
        return customerid;
    }

    /**
     * Sets the value of the customerid property.
     * 
     * @param value allowed object is {@link Customerid }
     */
    public void setCustomerid(Customerid value)
    {
        this.customerid = value;
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
     * Gets the value of the recordid property.
     * 
     * @return possible object is {@link String }
     */
    public String getRecordid()
    {
        return recordid;
    }

    /**
     * Sets the value of the recordid property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setRecordid(String value)
    {
        this.recordid = value;
    }

    /**
     * Gets the value of the docnumber property.
     * 
     * @return possible object is {@link String }
     */
    public String getDocnumber()
    {
        return docnumber;
    }

    /**
     * Sets the value of the docnumber property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setDocnumber(String value)
    {
        this.docnumber = value;
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
     * Gets the value of the contractid property.
     * 
     * @return possible object is {@link String }
     */
    public String getContractid()
    {
        return contractid;
    }

    /**
     * Sets the value of the contractid property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setContractid(String value)
    {
        this.contractid = value;
    }

    /**
     * Gets the value of the contractdesc property.
     * 
     * @return possible object is {@link String }
     */
    public String getContractdesc()
    {
        return contractdesc;
    }

    /**
     * Sets the value of the contractdesc property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setContractdesc(String value)
    {
        this.contractdesc = value;
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
     * Gets the value of the supdocid property.
     * 
     * @return possible object is {@link String }
     */
    public String getSupdocid()
    {
        return supdocid;
    }

    /**
     * Sets the value of the supdocid property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setSupdocid(String value)
    {
        this.supdocid = value;
    }

    /**
     * Gets the value of the billtocontactname property.
     * 
     * @return possible object is {@link String }
     */
    public String getBilltocontactname()
    {
        return billtocontactname;
    }

    /**
     * Sets the value of the billtocontactname property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setBilltocontactname(String value)
    {
        this.billtocontactname = value;
    }

    /**
     * Gets the value of the shiptocontactname property.
     * 
     * @return possible object is {@link String }
     */
    public String getShiptocontactname()
    {
        return shiptocontactname;
    }

    /**
     * Sets the value of the shiptocontactname property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setShiptocontactname(String value)
    {
        this.shiptocontactname = value;
    }

    /**
     * Gets the value of the startdate property.
     * 
     * @return possible object is {@link Startdate }
     */
    public Startdate getStartdate()
    {
        return startdate;
    }

    /**
     * Sets the value of the startdate property.
     * 
     * @param value allowed object is {@link Startdate }
     */
    public void setStartdate(Startdate value)
    {
        this.startdate = value;
    }

    /**
     * Gets the value of the ending property.
     * 
     * @return possible object is {@link Ending }
     */
    public Ending getEnding()
    {
        return ending;
    }

    /**
     * Sets the value of the ending property.
     * 
     * @param value allowed object is {@link Ending }
     */
    public void setEnding(Ending value)
    {
        this.ending = value;
    }

    /**
     * Gets the value of the modenew property.
     * 
     * @return possible object is {@link String }
     */
    public String getModenew()
    {
        return modenew;
    }

    /**
     * Sets the value of the modenew property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setModenew(String value)
    {
        this.modenew = value;
    }

    /**
     * Gets the value of the interval property.
     * 
     * @return possible object is {@link String }
     */
    public String getInterval()
    {
        return interval;
    }

    /**
     * Sets the value of the interval property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setInterval(String value)
    {
        this.interval = value;
    }

    /**
     * Gets the value of the eom property.
     * 
     * @return possible object is {@link String }
     */
    public String getEom()
    {
        return eom;
    }

    /**
     * Sets the value of the eom property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setEom(String value)
    {
        this.eom = value;
    }

    /**
     * Gets the value of the recurinvoiceitems property.
     * 
     * @return possible object is {@link Recurinvoiceitems }
     */
    public Recurinvoiceitems getRecurinvoiceitems()
    {
        return recurinvoiceitems;
    }

    /**
     * Sets the value of the recurinvoiceitems property.
     * 
     * @param value allowed object is {@link Recurinvoiceitems }
     */
    public void setRecurinvoiceitems(Recurinvoiceitems value)
    {
        this.recurinvoiceitems = value;
    }

    /**
     * Gets the value of the paymethod property.
     * 
     * @return possible object is {@link String }
     */
    public String getPaymethod()
    {
        return paymethod;
    }

    /**
     * Sets the value of the paymethod property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setPaymethod(String value)
    {
        this.paymethod = value;
    }

    /**
     * Gets the value of the payinfull property.
     * 
     * @return possible object is {@link String }
     */
    public String getPayinfull()
    {
        return payinfull;
    }

    /**
     * Sets the value of the payinfull property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setPayinfull(String value)
    {
        this.payinfull = value;
    }

    /**
     * Gets the value of the paymentamount property.
     * 
     * @return possible object is {@link Paymentamount }
     */
    public Paymentamount getPaymentamount()
    {
        return paymentamount;
    }

    /**
     * Sets the value of the paymentamount property.
     * 
     * @param value allowed object is {@link Paymentamount }
     */
    public void setPaymentamount(Paymentamount value)
    {
        this.paymentamount = value;
    }

    /**
     * Gets the value of the customercreditcardkey property.
     * 
     * @return possible object is {@link String }
     */
    public String getCustomercreditcardkey()
    {
        return customercreditcardkey;
    }

    /**
     * Sets the value of the customercreditcardkey property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setCustomercreditcardkey(String value)
    {
        this.customercreditcardkey = value;
    }

    /**
     * Gets the value of the customerbankaccountkey property.
     * 
     * @return possible object is {@link String }
     */
    public String getCustomerbankaccountkey()
    {
        return customerbankaccountkey;
    }

    /**
     * Sets the value of the customerbankaccountkey property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setCustomerbankaccountkey(String value)
    {
        this.customerbankaccountkey = value;
    }

    /**
     * Gets the value of the creditcardtype property.
     * 
     * @return possible object is {@link String }
     */
    public String getCreditcardtype()
    {
        return creditcardtype;
    }

    /**
     * Sets the value of the creditcardtype property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setCreditcardtype(String value)
    {
        this.creditcardtype = value;
    }

    /**
     * Gets the value of the expirednotify property.
     * 
     * @return possible object is {@link String }
     */
    public String getExpirednotify()
    {
        return expirednotify;
    }

    /**
     * Sets the value of the expirednotify property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setExpirednotify(String value)
    {
        this.expirednotify = value;
    }

    /**
     * Gets the value of the expirednotifyemail property.
     * 
     * @return possible object is {@link String }
     */
    public String getExpirednotifyemail()
    {
        return expirednotifyemail;
    }

    /**
     * Sets the value of the expirednotifyemail property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setExpirednotifyemail(String value)
    {
        this.expirednotifyemail = value;
    }

    /**
     * Gets the value of the accounttype property.
     * 
     * @return possible object is {@link String }
     */
    public String getAccounttype()
    {
        return accounttype;
    }

    /**
     * Sets the value of the accounttype property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setAccounttype(String value)
    {
        this.accounttype = value;
    }

    /**
     * Gets the value of the bankaccountidOrGlaccountkey property.
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
     * the bankaccountidOrGlaccountkey property.
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getBankaccountidOrGlaccountkey().add(newItem);
     * </pre>
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Bankaccountid }
     * {@link Glaccountkey }
     */
    public List<Object> getBankaccountidOrGlaccountkey()
    {
        if (bankaccountidOrGlaccountkey == null)
        {
            bankaccountidOrGlaccountkey = new ArrayList<Object>();
        }
        return this.bankaccountidOrGlaccountkey;
    }

}
