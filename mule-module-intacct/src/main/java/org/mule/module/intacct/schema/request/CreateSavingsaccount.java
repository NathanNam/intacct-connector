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
@XmlType(name = "", propOrder = {"bankaccountid", "bankaccountno", "locationid", "bankname", "routingno",
    "branchid", "phone", "currency", "mailaddress", "status", "disableiet", "financialdata", "glaccountno",
    "servicechargeglaccountOrServicechargeaccountlabel",
    "interestearnedglaccountOrInterestearnedaccountlabel", "departmentid"})
@XmlRootElement(name = "create_savingsaccount")
public class CreateSavingsaccount
{

    @XmlElement(required = true)
    protected Bankaccountid bankaccountid;
    protected String bankaccountno;
    @XmlElement(required = true)
    protected Locationid locationid;
    @XmlElement(required = true)
    protected String bankname;
    protected String routingno;
    protected String branchid;
    protected String phone;
    protected String currency;
    protected Mailaddress mailaddress;
    protected String status;
    protected String disableiet;
    protected Financialdata financialdata;
    protected Glaccountno glaccountno;
    @XmlElements({@XmlElement(name = "servicechargeglaccount", type = Servicechargeglaccount.class),
        @XmlElement(name = "servicechargeaccountlabel", type = Servicechargeaccountlabel.class)})
    protected List<Object> servicechargeglaccountOrServicechargeaccountlabel;
    @XmlElements({@XmlElement(name = "interestearnedglaccount", type = Interestearnedglaccount.class),
        @XmlElement(name = "interestearnedaccountlabel", type = Interestearnedaccountlabel.class)})
    protected List<Object> interestearnedglaccountOrInterestearnedaccountlabel;
    protected Departmentid departmentid;

    /**
     * Gets the value of the bankaccountid property.
     * 
     * @return possible object is {@link Bankaccountid }
     */
    public Bankaccountid getBankaccountid()
    {
        return bankaccountid;
    }

    /**
     * Sets the value of the bankaccountid property.
     * 
     * @param value allowed object is {@link Bankaccountid }
     */
    public void setBankaccountid(Bankaccountid value)
    {
        this.bankaccountid = value;
    }

    /**
     * Gets the value of the bankaccountno property.
     * 
     * @return possible object is {@link String }
     */
    public String getBankaccountno()
    {
        return bankaccountno;
    }

    /**
     * Sets the value of the bankaccountno property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setBankaccountno(String value)
    {
        this.bankaccountno = value;
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
     * Gets the value of the bankname property.
     * 
     * @return possible object is {@link String }
     */
    public String getBankname()
    {
        return bankname;
    }

    /**
     * Sets the value of the bankname property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setBankname(String value)
    {
        this.bankname = value;
    }

    /**
     * Gets the value of the routingno property.
     * 
     * @return possible object is {@link String }
     */
    public String getRoutingno()
    {
        return routingno;
    }

    /**
     * Sets the value of the routingno property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setRoutingno(String value)
    {
        this.routingno = value;
    }

    /**
     * Gets the value of the branchid property.
     * 
     * @return possible object is {@link String }
     */
    public String getBranchid()
    {
        return branchid;
    }

    /**
     * Sets the value of the branchid property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setBranchid(String value)
    {
        this.branchid = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return possible object is {@link String }
     */
    public String getPhone()
    {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setPhone(String value)
    {
        this.phone = value;
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
     * Gets the value of the mailaddress property.
     * 
     * @return possible object is {@link Mailaddress }
     */
    public Mailaddress getMailaddress()
    {
        return mailaddress;
    }

    /**
     * Sets the value of the mailaddress property.
     * 
     * @param value allowed object is {@link Mailaddress }
     */
    public void setMailaddress(Mailaddress value)
    {
        this.mailaddress = value;
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
     * Gets the value of the disableiet property.
     * 
     * @return possible object is {@link String }
     */
    public String getDisableiet()
    {
        return disableiet;
    }

    /**
     * Sets the value of the disableiet property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setDisableiet(String value)
    {
        this.disableiet = value;
    }

    /**
     * Gets the value of the financialdata property.
     * 
     * @return possible object is {@link Financialdata }
     */
    public Financialdata getFinancialdata()
    {
        return financialdata;
    }

    /**
     * Sets the value of the financialdata property.
     * 
     * @param value allowed object is {@link Financialdata }
     */
    public void setFinancialdata(Financialdata value)
    {
        this.financialdata = value;
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
     * Gets the value of the servicechargeglaccountOrServicechargeaccountlabel
     * property.
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
     * the servicechargeglaccountOrServicechargeaccountlabel property.
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getServicechargeglaccountOrServicechargeaccountlabel().add(newItem);
     * </pre>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Servicechargeglaccount } {@link Servicechargeaccountlabel }
     */
    public List<Object> getServicechargeglaccountOrServicechargeaccountlabel()
    {
        if (servicechargeglaccountOrServicechargeaccountlabel == null)
        {
            servicechargeglaccountOrServicechargeaccountlabel = new ArrayList<Object>();
        }
        return this.servicechargeglaccountOrServicechargeaccountlabel;
    }

    /**
     * Gets the value of the interestearnedglaccountOrInterestearnedaccountlabel
     * property.
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
     * the interestearnedglaccountOrInterestearnedaccountlabel property.
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getInterestearnedglaccountOrInterestearnedaccountlabel().add(newItem);
     * </pre>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Interestearnedglaccount } {@link Interestearnedaccountlabel }
     */
    public List<Object> getInterestearnedglaccountOrInterestearnedaccountlabel()
    {
        if (interestearnedglaccountOrInterestearnedaccountlabel == null)
        {
            interestearnedglaccountOrInterestearnedaccountlabel = new ArrayList<Object>();
        }
        return this.interestearnedglaccountOrInterestearnedaccountlabel;
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

}
