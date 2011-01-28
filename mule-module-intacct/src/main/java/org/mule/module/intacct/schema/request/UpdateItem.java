//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.3-hudson-jaxb-ri-2.2.3-3- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.01.20 at 12:04:16 PM ART 
//

package org.mule.module.intacct.schema.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"name", "status", "enableBins", "extendedDescription", "productlineid",
    "substituteid", "shipWeight", "taxable", "standardCost", "basePrice", "standardUnit", "purchaseUnit",
    "purchaseUnitFactor", "salesUnit", "salesUnitFactor", "defaultWarehouse", "glgroup", "note",
    "inventoryPrecision", "purchasingPrecision", "salesPrecision", "upc", "hasstartenddates", "termPeriod",
    "defaultnoofperiods", "computepriceforshortterm", "itaxgroup", "revenuePosting", "vendlineitems",
    "whslineitems", "complineitems", "taxcode", "vsoecategory", "vsoedlvrstatus", "vsoerevdefstatus",
    "incomeaccount", "invaccount", "expenseaccount", "cogsaccount", "defrevaccount", "uomgrp", "customfields"})
@XmlRootElement(name = "update_item")
public class UpdateItem
{

    @XmlAttribute(name = "itemid", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String itemid;
    protected String name;
    protected String status;
    @XmlElement(name = "enable_bins")
    protected String enableBins;
    @XmlElement(name = "extended_description")
    protected String extendedDescription;
    protected Productlineid productlineid;
    protected String substituteid;
    @XmlElement(name = "ship_weight")
    protected String shipWeight;
    protected String taxable;
    @XmlElement(name = "standard_cost")
    protected String standardCost;
    @XmlElement(name = "base_price")
    protected String basePrice;
    @XmlElement(name = "standard_unit")
    protected String standardUnit;
    @XmlElement(name = "purchase_unit")
    protected String purchaseUnit;
    @XmlElement(name = "purchase_unit_factor")
    protected String purchaseUnitFactor;
    @XmlElement(name = "sales_unit")
    protected String salesUnit;
    @XmlElement(name = "sales_unit_factor")
    protected String salesUnitFactor;
    @XmlElement(name = "default_warehouse")
    protected String defaultWarehouse;
    protected String glgroup;
    protected String note;
    @XmlElement(name = "inventory_precision")
    protected String inventoryPrecision;
    @XmlElement(name = "purchasing_precision")
    protected String purchasingPrecision;
    @XmlElement(name = "sales_precision")
    protected String salesPrecision;
    protected String upc;
    protected String hasstartenddates;
    @XmlElement(name = "term_period")
    protected String termPeriod;
    protected String defaultnoofperiods;
    protected String computepriceforshortterm;
    protected Itaxgroup itaxgroup;
    @XmlElement(name = "revenue_posting")
    protected String revenuePosting;
    protected Vendlineitems vendlineitems;
    protected Whslineitems whslineitems;
    protected Complineitems complineitems;
    protected String taxcode;
    protected String vsoecategory;
    protected String vsoedlvrstatus;
    protected String vsoerevdefstatus;
    protected String incomeaccount;
    protected String invaccount;
    protected String expenseaccount;
    protected String cogsaccount;
    protected String defrevaccount;
    protected String uomgrp;
    protected Customfields customfields;

    /**
     * Gets the value of the itemid property.
     * 
     * @return possible object is {@link String }
     */
    public String getItemid()
    {
        return itemid;
    }

    /**
     * Sets the value of the itemid property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setItemid(String value)
    {
        this.itemid = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return possible object is {@link String }
     */
    public String getName()
    {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setName(String value)
    {
        this.name = value;
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
     * Gets the value of the enableBins property.
     * 
     * @return possible object is {@link String }
     */
    public String getEnableBins()
    {
        return enableBins;
    }

    /**
     * Sets the value of the enableBins property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setEnableBins(String value)
    {
        this.enableBins = value;
    }

    /**
     * Gets the value of the extendedDescription property.
     * 
     * @return possible object is {@link String }
     */
    public String getExtendedDescription()
    {
        return extendedDescription;
    }

    /**
     * Sets the value of the extendedDescription property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setExtendedDescription(String value)
    {
        this.extendedDescription = value;
    }

    /**
     * Gets the value of the productlineid property.
     * 
     * @return possible object is {@link Productlineid }
     */
    public Productlineid getProductlineid()
    {
        return productlineid;
    }

    /**
     * Sets the value of the productlineid property.
     * 
     * @param value allowed object is {@link Productlineid }
     */
    public void setProductlineid(Productlineid value)
    {
        this.productlineid = value;
    }

    /**
     * Gets the value of the substituteid property.
     * 
     * @return possible object is {@link String }
     */
    public String getSubstituteid()
    {
        return substituteid;
    }

    /**
     * Sets the value of the substituteid property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setSubstituteid(String value)
    {
        this.substituteid = value;
    }

    /**
     * Gets the value of the shipWeight property.
     * 
     * @return possible object is {@link String }
     */
    public String getShipWeight()
    {
        return shipWeight;
    }

    /**
     * Sets the value of the shipWeight property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setShipWeight(String value)
    {
        this.shipWeight = value;
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
     * Gets the value of the standardCost property.
     * 
     * @return possible object is {@link String }
     */
    public String getStandardCost()
    {
        return standardCost;
    }

    /**
     * Sets the value of the standardCost property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setStandardCost(String value)
    {
        this.standardCost = value;
    }

    /**
     * Gets the value of the basePrice property.
     * 
     * @return possible object is {@link String }
     */
    public String getBasePrice()
    {
        return basePrice;
    }

    /**
     * Sets the value of the basePrice property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setBasePrice(String value)
    {
        this.basePrice = value;
    }

    /**
     * Gets the value of the standardUnit property.
     * 
     * @return possible object is {@link String }
     */
    public String getStandardUnit()
    {
        return standardUnit;
    }

    /**
     * Sets the value of the standardUnit property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setStandardUnit(String value)
    {
        this.standardUnit = value;
    }

    /**
     * Gets the value of the purchaseUnit property.
     * 
     * @return possible object is {@link String }
     */
    public String getPurchaseUnit()
    {
        return purchaseUnit;
    }

    /**
     * Sets the value of the purchaseUnit property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setPurchaseUnit(String value)
    {
        this.purchaseUnit = value;
    }

    /**
     * Gets the value of the purchaseUnitFactor property.
     * 
     * @return possible object is {@link String }
     */
    public String getPurchaseUnitFactor()
    {
        return purchaseUnitFactor;
    }

    /**
     * Sets the value of the purchaseUnitFactor property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setPurchaseUnitFactor(String value)
    {
        this.purchaseUnitFactor = value;
    }

    /**
     * Gets the value of the salesUnit property.
     * 
     * @return possible object is {@link String }
     */
    public String getSalesUnit()
    {
        return salesUnit;
    }

    /**
     * Sets the value of the salesUnit property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setSalesUnit(String value)
    {
        this.salesUnit = value;
    }

    /**
     * Gets the value of the salesUnitFactor property.
     * 
     * @return possible object is {@link String }
     */
    public String getSalesUnitFactor()
    {
        return salesUnitFactor;
    }

    /**
     * Sets the value of the salesUnitFactor property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setSalesUnitFactor(String value)
    {
        this.salesUnitFactor = value;
    }

    /**
     * Gets the value of the defaultWarehouse property.
     * 
     * @return possible object is {@link String }
     */
    public String getDefaultWarehouse()
    {
        return defaultWarehouse;
    }

    /**
     * Sets the value of the defaultWarehouse property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setDefaultWarehouse(String value)
    {
        this.defaultWarehouse = value;
    }

    /**
     * Gets the value of the glgroup property.
     * 
     * @return possible object is {@link String }
     */
    public String getGlgroup()
    {
        return glgroup;
    }

    /**
     * Sets the value of the glgroup property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setGlgroup(String value)
    {
        this.glgroup = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return possible object is {@link String }
     */
    public String getNote()
    {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setNote(String value)
    {
        this.note = value;
    }

    /**
     * Gets the value of the inventoryPrecision property.
     * 
     * @return possible object is {@link String }
     */
    public String getInventoryPrecision()
    {
        return inventoryPrecision;
    }

    /**
     * Sets the value of the inventoryPrecision property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setInventoryPrecision(String value)
    {
        this.inventoryPrecision = value;
    }

    /**
     * Gets the value of the purchasingPrecision property.
     * 
     * @return possible object is {@link String }
     */
    public String getPurchasingPrecision()
    {
        return purchasingPrecision;
    }

    /**
     * Sets the value of the purchasingPrecision property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setPurchasingPrecision(String value)
    {
        this.purchasingPrecision = value;
    }

    /**
     * Gets the value of the salesPrecision property.
     * 
     * @return possible object is {@link String }
     */
    public String getSalesPrecision()
    {
        return salesPrecision;
    }

    /**
     * Sets the value of the salesPrecision property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setSalesPrecision(String value)
    {
        this.salesPrecision = value;
    }

    /**
     * Gets the value of the upc property.
     * 
     * @return possible object is {@link String }
     */
    public String getUpc()
    {
        return upc;
    }

    /**
     * Sets the value of the upc property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setUpc(String value)
    {
        this.upc = value;
    }

    /**
     * Gets the value of the hasstartenddates property.
     * 
     * @return possible object is {@link String }
     */
    public String getHasstartenddates()
    {
        return hasstartenddates;
    }

    /**
     * Sets the value of the hasstartenddates property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setHasstartenddates(String value)
    {
        this.hasstartenddates = value;
    }

    /**
     * Gets the value of the termPeriod property.
     * 
     * @return possible object is {@link String }
     */
    public String getTermPeriod()
    {
        return termPeriod;
    }

    /**
     * Sets the value of the termPeriod property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setTermPeriod(String value)
    {
        this.termPeriod = value;
    }

    /**
     * Gets the value of the defaultnoofperiods property.
     * 
     * @return possible object is {@link String }
     */
    public String getDefaultnoofperiods()
    {
        return defaultnoofperiods;
    }

    /**
     * Sets the value of the defaultnoofperiods property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setDefaultnoofperiods(String value)
    {
        this.defaultnoofperiods = value;
    }

    /**
     * Gets the value of the computepriceforshortterm property.
     * 
     * @return possible object is {@link String }
     */
    public String getComputepriceforshortterm()
    {
        return computepriceforshortterm;
    }

    /**
     * Sets the value of the computepriceforshortterm property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setComputepriceforshortterm(String value)
    {
        this.computepriceforshortterm = value;
    }

    /**
     * Gets the value of the itaxgroup property.
     * 
     * @return possible object is {@link Itaxgroup }
     */
    public Itaxgroup getItaxgroup()
    {
        return itaxgroup;
    }

    /**
     * Sets the value of the itaxgroup property.
     * 
     * @param value allowed object is {@link Itaxgroup }
     */
    public void setItaxgroup(Itaxgroup value)
    {
        this.itaxgroup = value;
    }

    /**
     * Gets the value of the revenuePosting property.
     * 
     * @return possible object is {@link String }
     */
    public String getRevenuePosting()
    {
        return revenuePosting;
    }

    /**
     * Sets the value of the revenuePosting property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setRevenuePosting(String value)
    {
        this.revenuePosting = value;
    }

    /**
     * Gets the value of the vendlineitems property.
     * 
     * @return possible object is {@link Vendlineitems }
     */
    public Vendlineitems getVendlineitems()
    {
        return vendlineitems;
    }

    /**
     * Sets the value of the vendlineitems property.
     * 
     * @param value allowed object is {@link Vendlineitems }
     */
    public void setVendlineitems(Vendlineitems value)
    {
        this.vendlineitems = value;
    }

    /**
     * Gets the value of the whslineitems property.
     * 
     * @return possible object is {@link Whslineitems }
     */
    public Whslineitems getWhslineitems()
    {
        return whslineitems;
    }

    /**
     * Sets the value of the whslineitems property.
     * 
     * @param value allowed object is {@link Whslineitems }
     */
    public void setWhslineitems(Whslineitems value)
    {
        this.whslineitems = value;
    }

    /**
     * Gets the value of the complineitems property.
     * 
     * @return possible object is {@link Complineitems }
     */
    public Complineitems getComplineitems()
    {
        return complineitems;
    }

    /**
     * Sets the value of the complineitems property.
     * 
     * @param value allowed object is {@link Complineitems }
     */
    public void setComplineitems(Complineitems value)
    {
        this.complineitems = value;
    }

    /**
     * Gets the value of the taxcode property.
     * 
     * @return possible object is {@link String }
     */
    public String getTaxcode()
    {
        return taxcode;
    }

    /**
     * Sets the value of the taxcode property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setTaxcode(String value)
    {
        this.taxcode = value;
    }

    /**
     * Gets the value of the vsoecategory property.
     * 
     * @return possible object is {@link String }
     */
    public String getVsoecategory()
    {
        return vsoecategory;
    }

    /**
     * Sets the value of the vsoecategory property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setVsoecategory(String value)
    {
        this.vsoecategory = value;
    }

    /**
     * Gets the value of the vsoedlvrstatus property.
     * 
     * @return possible object is {@link String }
     */
    public String getVsoedlvrstatus()
    {
        return vsoedlvrstatus;
    }

    /**
     * Sets the value of the vsoedlvrstatus property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setVsoedlvrstatus(String value)
    {
        this.vsoedlvrstatus = value;
    }

    /**
     * Gets the value of the vsoerevdefstatus property.
     * 
     * @return possible object is {@link String }
     */
    public String getVsoerevdefstatus()
    {
        return vsoerevdefstatus;
    }

    /**
     * Sets the value of the vsoerevdefstatus property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setVsoerevdefstatus(String value)
    {
        this.vsoerevdefstatus = value;
    }

    /**
     * Gets the value of the incomeaccount property.
     * 
     * @return possible object is {@link String }
     */
    public String getIncomeaccount()
    {
        return incomeaccount;
    }

    /**
     * Sets the value of the incomeaccount property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setIncomeaccount(String value)
    {
        this.incomeaccount = value;
    }

    /**
     * Gets the value of the invaccount property.
     * 
     * @return possible object is {@link String }
     */
    public String getInvaccount()
    {
        return invaccount;
    }

    /**
     * Sets the value of the invaccount property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setInvaccount(String value)
    {
        this.invaccount = value;
    }

    /**
     * Gets the value of the expenseaccount property.
     * 
     * @return possible object is {@link String }
     */
    public String getExpenseaccount()
    {
        return expenseaccount;
    }

    /**
     * Sets the value of the expenseaccount property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setExpenseaccount(String value)
    {
        this.expenseaccount = value;
    }

    /**
     * Gets the value of the cogsaccount property.
     * 
     * @return possible object is {@link String }
     */
    public String getCogsaccount()
    {
        return cogsaccount;
    }

    /**
     * Sets the value of the cogsaccount property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setCogsaccount(String value)
    {
        this.cogsaccount = value;
    }

    /**
     * Gets the value of the defrevaccount property.
     * 
     * @return possible object is {@link String }
     */
    public String getDefrevaccount()
    {
        return defrevaccount;
    }

    /**
     * Sets the value of the defrevaccount property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setDefrevaccount(String value)
    {
        this.defrevaccount = value;
    }

    /**
     * Gets the value of the uomgrp property.
     * 
     * @return possible object is {@link String }
     */
    public String getUomgrp()
    {
        return uomgrp;
    }

    /**
     * Sets the value of the uomgrp property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setUomgrp(String value)
    {
        this.uomgrp = value;
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

}
