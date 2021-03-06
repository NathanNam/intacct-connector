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
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"expensetypeOrGlaccountno", "amount", "currency", "trxAmount",
    "exchratedate", "exchratetype", "exchrate", "expensedate", "memo", "form1099", "paidfor", "locationid",
    "departmentid", "customfields", "projectid", "customerid", "vendorid", "employeeid", "itemid", "classid",
    "billable"})
@XmlRootElement(name = "updateexpense")
public class Updateexpense
{

    @XmlAttribute(name = "line_num", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String lineNum;
    @XmlElements({@XmlElement(name = "expensetype", type = Expensetype.class),
        @XmlElement(name = "glaccountno", type = Glaccountno.class)})
    protected List<Object> expensetypeOrGlaccountno;
    protected String amount;
    protected String currency;
    @XmlElement(name = "trx_amount")
    protected String trxAmount;
    protected Exchratedate exchratedate;
    protected Exchratetype exchratetype;
    protected Exchrate exchrate;
    protected Expensedate expensedate;
    protected String memo;
    protected String form1099;
    protected String paidfor;
    protected Locationid locationid;
    protected Departmentid departmentid;
    protected Customfields customfields;
    protected String projectid;
    protected Customerid customerid;
    protected Vendorid vendorid;
    protected Employeeid employeeid;
    protected Itemid itemid;
    protected String classid;
    protected String billable;

    /**
     * Gets the value of the lineNum property.
     * 
     * @return possible object is {@link String }
     */
    public String getLineNum()
    {
        return lineNum;
    }

    /**
     * Sets the value of the lineNum property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setLineNum(String value)
    {
        this.lineNum = value;
    }

    /**
     * Gets the value of the expensetypeOrGlaccountno property.
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
     * the expensetypeOrGlaccountno property.
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getExpensetypeOrGlaccountno().add(newItem);
     * </pre>
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Expensetype }
     * {@link Glaccountno }
     */
    public List<Object> getExpensetypeOrGlaccountno()
    {
        if (expensetypeOrGlaccountno == null)
        {
            expensetypeOrGlaccountno = new ArrayList<Object>();
        }
        return this.expensetypeOrGlaccountno;
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
     * Gets the value of the trxAmount property.
     * 
     * @return possible object is {@link String }
     */
    public String getTrxAmount()
    {
        return trxAmount;
    }

    /**
     * Sets the value of the trxAmount property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setTrxAmount(String value)
    {
        this.trxAmount = value;
    }

    /**
     * Gets the value of the exchratedate property.
     * 
     * @return possible object is {@link Exchratedate }
     */
    public Exchratedate getExchratedate()
    {
        return exchratedate;
    }

    /**
     * Sets the value of the exchratedate property.
     * 
     * @param value allowed object is {@link Exchratedate }
     */
    public void setExchratedate(Exchratedate value)
    {
        this.exchratedate = value;
    }

    /**
     * Gets the value of the exchratetype property.
     * 
     * @return possible object is {@link Exchratetype }
     */
    public Exchratetype getExchratetype()
    {
        return exchratetype;
    }

    /**
     * Sets the value of the exchratetype property.
     * 
     * @param value allowed object is {@link Exchratetype }
     */
    public void setExchratetype(Exchratetype value)
    {
        this.exchratetype = value;
    }

    /**
     * Gets the value of the exchrate property.
     * 
     * @return possible object is {@link Exchrate }
     */
    public Exchrate getExchrate()
    {
        return exchrate;
    }

    /**
     * Sets the value of the exchrate property.
     * 
     * @param value allowed object is {@link Exchrate }
     */
    public void setExchrate(Exchrate value)
    {
        this.exchrate = value;
    }

    /**
     * Gets the value of the expensedate property.
     * 
     * @return possible object is {@link Expensedate }
     */
    public Expensedate getExpensedate()
    {
        return expensedate;
    }

    /**
     * Sets the value of the expensedate property.
     * 
     * @param value allowed object is {@link Expensedate }
     */
    public void setExpensedate(Expensedate value)
    {
        this.expensedate = value;
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
     * Gets the value of the form1099 property.
     * 
     * @return possible object is {@link String }
     */
    public String getForm1099()
    {
        return form1099;
    }

    /**
     * Sets the value of the form1099 property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setForm1099(String value)
    {
        this.form1099 = value;
    }

    /**
     * Gets the value of the paidfor property.
     * 
     * @return possible object is {@link String }
     */
    public String getPaidfor()
    {
        return paidfor;
    }

    /**
     * Sets the value of the paidfor property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setPaidfor(String value)
    {
        this.paidfor = value;
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
     * Gets the value of the projectid property.
     * 
     * @return possible object is {@link String }
     */
    public String getProjectid()
    {
        return projectid;
    }

    /**
     * Sets the value of the projectid property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setProjectid(String value)
    {
        this.projectid = value;
    }

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
     * Gets the value of the employeeid property.
     * 
     * @return possible object is {@link Employeeid }
     */
    public Employeeid getEmployeeid()
    {
        return employeeid;
    }

    /**
     * Sets the value of the employeeid property.
     * 
     * @param value allowed object is {@link Employeeid }
     */
    public void setEmployeeid(Employeeid value)
    {
        this.employeeid = value;
    }

    /**
     * Gets the value of the itemid property.
     * 
     * @return possible object is {@link Itemid }
     */
    public Itemid getItemid()
    {
        return itemid;
    }

    /**
     * Sets the value of the itemid property.
     * 
     * @param value allowed object is {@link Itemid }
     */
    public void setItemid(Itemid value)
    {
        this.itemid = value;
    }

    /**
     * Gets the value of the classid property.
     * 
     * @return possible object is {@link String }
     */
    public String getClassid()
    {
        return classid;
    }

    /**
     * Sets the value of the classid property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setClassid(String value)
    {
        this.classid = value;
    }

    /**
     * Gets the value of the billable property.
     * 
     * @return possible object is {@link String }
     */
    public String getBillable()
    {
        return billable;
    }

    /**
     * Sets the value of the billable property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setBillable(String value)
    {
        this.billable = value;
    }

}
