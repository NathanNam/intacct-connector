//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.3-hudson-jaxb-ri-2.2.3-3- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.01.20 at 12:04:16 PM ART 
//

package org.mule.module.intacct.schema.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"bundlenumber", "itemid", "itemdesc", "taxable", "warehouseid", "quantity",
    "unit", "price", "discsurchargememo", "locationid", "departmentid", "memo", "itemdetails",
    "customfields", "revrectemplate", "revrecstartdate", "revrecenddate", "renewalmacro", "projectid",
    "customerid", "vendorid", "employeeid", "classid"})
@XmlRootElement(name = "sotransitem")
public class Sotransitem
{

    protected String bundlenumber;
    @XmlElement(required = true)
    protected Itemid itemid;
    protected String itemdesc;
    protected String taxable;
    protected String warehouseid;
    @XmlElement(required = true)
    protected String quantity;
    protected String unit;
    protected String price;
    protected String discsurchargememo;
    protected Locationid locationid;
    protected Departmentid departmentid;
    protected String memo;
    protected Itemdetails itemdetails;
    protected Customfields customfields;
    protected String revrectemplate;
    protected Revrecstartdate revrecstartdate;
    protected Revrecenddate revrecenddate;
    protected String renewalmacro;
    protected String projectid;
    protected Customerid customerid;
    protected Vendorid vendorid;
    protected Employeeid employeeid;
    protected String classid;

    /**
     * Gets the value of the bundlenumber property.
     * 
     * @return possible object is {@link String }
     */
    public String getBundlenumber()
    {
        return bundlenumber;
    }

    /**
     * Sets the value of the bundlenumber property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setBundlenumber(String value)
    {
        this.bundlenumber = value;
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
     * Gets the value of the itemdesc property.
     * 
     * @return possible object is {@link String }
     */
    public String getItemdesc()
    {
        return itemdesc;
    }

    /**
     * Sets the value of the itemdesc property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setItemdesc(String value)
    {
        this.itemdesc = value;
    }

    /**
     * Gets the value of the taxable property.
     * 
     * @return possible object is {@link String }
     */
    public String getTaxable()
    {
        return taxable;
    }

    /**
     * Sets the value of the taxable property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setTaxable(String value)
    {
        this.taxable = value;
    }

    /**
     * Gets the value of the warehouseid property.
     * 
     * @return possible object is {@link String }
     */
    public String getWarehouseid()
    {
        return warehouseid;
    }

    /**
     * Sets the value of the warehouseid property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setWarehouseid(String value)
    {
        this.warehouseid = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return possible object is {@link String }
     */
    public String getQuantity()
    {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setQuantity(String value)
    {
        this.quantity = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return possible object is {@link String }
     */
    public String getUnit()
    {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setUnit(String value)
    {
        this.unit = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return possible object is {@link String }
     */
    public String getPrice()
    {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setPrice(String value)
    {
        this.price = value;
    }

    /**
     * Gets the value of the discsurchargememo property.
     * 
     * @return possible object is {@link String }
     */
    public String getDiscsurchargememo()
    {
        return discsurchargememo;
    }

    /**
     * Sets the value of the discsurchargememo property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setDiscsurchargememo(String value)
    {
        this.discsurchargememo = value;
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
     * Gets the value of the itemdetails property.
     * 
     * @return possible object is {@link Itemdetails }
     */
    public Itemdetails getItemdetails()
    {
        return itemdetails;
    }

    /**
     * Sets the value of the itemdetails property.
     * 
     * @param value allowed object is {@link Itemdetails }
     */
    public void setItemdetails(Itemdetails value)
    {
        this.itemdetails = value;
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
     * Gets the value of the revrectemplate property.
     * 
     * @return possible object is {@link String }
     */
    public String getRevrectemplate()
    {
        return revrectemplate;
    }

    /**
     * Sets the value of the revrectemplate property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setRevrectemplate(String value)
    {
        this.revrectemplate = value;
    }

    /**
     * Gets the value of the revrecstartdate property.
     * 
     * @return possible object is {@link Revrecstartdate }
     */
    public Revrecstartdate getRevrecstartdate()
    {
        return revrecstartdate;
    }

    /**
     * Sets the value of the revrecstartdate property.
     * 
     * @param value allowed object is {@link Revrecstartdate }
     */
    public void setRevrecstartdate(Revrecstartdate value)
    {
        this.revrecstartdate = value;
    }

    /**
     * Gets the value of the revrecenddate property.
     * 
     * @return possible object is {@link Revrecenddate }
     */
    public Revrecenddate getRevrecenddate()
    {
        return revrecenddate;
    }

    /**
     * Sets the value of the revrecenddate property.
     * 
     * @param value allowed object is {@link Revrecenddate }
     */
    public void setRevrecenddate(Revrecenddate value)
    {
        this.revrecenddate = value;
    }

    /**
     * Gets the value of the renewalmacro property.
     * 
     * @return possible object is {@link String }
     */
    public String getRenewalmacro()
    {
        return renewalmacro;
    }

    /**
     * Sets the value of the renewalmacro property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setRenewalmacro(String value)
    {
        this.renewalmacro = value;
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

}
