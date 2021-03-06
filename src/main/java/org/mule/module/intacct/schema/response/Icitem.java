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
// Generated on: 2011.01.20 at 12:04:27 PM ART 
//

package org.mule.module.intacct.schema.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"itemid", "itemname", "extdescription", "productlineid", "glgroupname",
    "substituteid", "shipweight", "standardunit", "purchasingunit", "purchasingunitfactor", "salesunit",
    "salesunitfactor", "costmethod", "standardcost", "averagecost", "whenlastsold", "whenlastreceived",
    "taxable", "taxgroup", "defaultwhse", "note", "itemtype", "status", "upc", "hasstartenddates",
    "termperiod", "totalperiods", "computeforshortterm", "customfields", "taxcode", "revenuePosting",
    "vsoecategory", "vsoedlvrstatus", "vsoerevdefstatus", "enableBins", "inventoryPrecision",
    "purchasingPrecision", "salesPrecision", "whslineitems", "vendlineitems", "complineitems"})
@XmlRootElement(name = "icitem")
public class Icitem
{

    protected String itemid;
    protected String itemname;
    protected String extdescription;
    protected String productlineid;
    protected String glgroupname;
    protected String substituteid;
    protected String shipweight;
    protected String standardunit;
    protected String purchasingunit;
    protected String purchasingunitfactor;
    protected String salesunit;
    protected String salesunitfactor;
    protected String costmethod;
    protected String standardcost;
    protected String averagecost;
    protected Whenlastsold whenlastsold;
    protected Whenlastreceived whenlastreceived;
    protected String taxable;
    protected String taxgroup;
    protected String defaultwhse;
    protected String note;
    protected String itemtype;
    protected String status;
    protected String upc;
    protected String hasstartenddates;
    protected Termperiod termperiod;
    protected Totalperiods totalperiods;
    protected Computeforshortterm computeforshortterm;
    protected Customfields customfields;
    protected String taxcode;
    @XmlElement(name = "revenue_posting")
    protected String revenuePosting;
    protected String vsoecategory;
    protected String vsoedlvrstatus;
    protected String vsoerevdefstatus;
    @XmlElement(name = "enable_bins")
    protected String enableBins;
    @XmlElement(name = "inventory_precision")
    protected String inventoryPrecision;
    @XmlElement(name = "purchasing_precision")
    protected String purchasingPrecision;
    @XmlElement(name = "sales_precision")
    protected String salesPrecision;
    protected Whslineitems whslineitems;
    protected Vendlineitems vendlineitems;
    protected Complineitems complineitems;

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
     * Gets the value of the itemname property.
     * 
     * @return possible object is {@link String }
     */
    public String getItemname()
    {
        return itemname;
    }

    /**
     * Sets the value of the itemname property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setItemname(String value)
    {
        this.itemname = value;
    }

    /**
     * Gets the value of the extdescription property.
     * 
     * @return possible object is {@link String }
     */
    public String getExtdescription()
    {
        return extdescription;
    }

    /**
     * Sets the value of the extdescription property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setExtdescription(String value)
    {
        this.extdescription = value;
    }

    /**
     * Gets the value of the productlineid property.
     * 
     * @return possible object is {@link String }
     */
    public String getProductlineid()
    {
        return productlineid;
    }

    /**
     * Sets the value of the productlineid property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setProductlineid(String value)
    {
        this.productlineid = value;
    }

    /**
     * Gets the value of the glgroupname property.
     * 
     * @return possible object is {@link String }
     */
    public String getGlgroupname()
    {
        return glgroupname;
    }

    /**
     * Sets the value of the glgroupname property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setGlgroupname(String value)
    {
        this.glgroupname = value;
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
     * Gets the value of the shipweight property.
     * 
     * @return possible object is {@link String }
     */
    public String getShipweight()
    {
        return shipweight;
    }

    /**
     * Sets the value of the shipweight property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setShipweight(String value)
    {
        this.shipweight = value;
    }

    /**
     * Gets the value of the standardunit property.
     * 
     * @return possible object is {@link String }
     */
    public String getStandardunit()
    {
        return standardunit;
    }

    /**
     * Sets the value of the standardunit property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setStandardunit(String value)
    {
        this.standardunit = value;
    }

    /**
     * Gets the value of the purchasingunit property.
     * 
     * @return possible object is {@link String }
     */
    public String getPurchasingunit()
    {
        return purchasingunit;
    }

    /**
     * Sets the value of the purchasingunit property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setPurchasingunit(String value)
    {
        this.purchasingunit = value;
    }

    /**
     * Gets the value of the purchasingunitfactor property.
     * 
     * @return possible object is {@link String }
     */
    public String getPurchasingunitfactor()
    {
        return purchasingunitfactor;
    }

    /**
     * Sets the value of the purchasingunitfactor property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setPurchasingunitfactor(String value)
    {
        this.purchasingunitfactor = value;
    }

    /**
     * Gets the value of the salesunit property.
     * 
     * @return possible object is {@link String }
     */
    public String getSalesunit()
    {
        return salesunit;
    }

    /**
     * Sets the value of the salesunit property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setSalesunit(String value)
    {
        this.salesunit = value;
    }

    /**
     * Gets the value of the salesunitfactor property.
     * 
     * @return possible object is {@link String }
     */
    public String getSalesunitfactor()
    {
        return salesunitfactor;
    }

    /**
     * Sets the value of the salesunitfactor property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setSalesunitfactor(String value)
    {
        this.salesunitfactor = value;
    }

    /**
     * Gets the value of the costmethod property.
     * 
     * @return possible object is {@link String }
     */
    public String getCostmethod()
    {
        return costmethod;
    }

    /**
     * Sets the value of the costmethod property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setCostmethod(String value)
    {
        this.costmethod = value;
    }

    /**
     * Gets the value of the standardcost property.
     * 
     * @return possible object is {@link String }
     */
    public String getStandardcost()
    {
        return standardcost;
    }

    /**
     * Sets the value of the standardcost property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setStandardcost(String value)
    {
        this.standardcost = value;
    }

    /**
     * Gets the value of the averagecost property.
     * 
     * @return possible object is {@link String }
     */
    public String getAveragecost()
    {
        return averagecost;
    }

    /**
     * Sets the value of the averagecost property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setAveragecost(String value)
    {
        this.averagecost = value;
    }

    /**
     * Gets the value of the whenlastsold property.
     * 
     * @return possible object is {@link Whenlastsold }
     */
    public Whenlastsold getWhenlastsold()
    {
        return whenlastsold;
    }

    /**
     * Sets the value of the whenlastsold property.
     * 
     * @param value allowed object is {@link Whenlastsold }
     */
    public void setWhenlastsold(Whenlastsold value)
    {
        this.whenlastsold = value;
    }

    /**
     * Gets the value of the whenlastreceived property.
     * 
     * @return possible object is {@link Whenlastreceived }
     */
    public Whenlastreceived getWhenlastreceived()
    {
        return whenlastreceived;
    }

    /**
     * Sets the value of the whenlastreceived property.
     * 
     * @param value allowed object is {@link Whenlastreceived }
     */
    public void setWhenlastreceived(Whenlastreceived value)
    {
        this.whenlastreceived = value;
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
     * Gets the value of the taxgroup property.
     * 
     * @return possible object is {@link String }
     */
    public String getTaxgroup()
    {
        return taxgroup;
    }

    /**
     * Sets the value of the taxgroup property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setTaxgroup(String value)
    {
        this.taxgroup = value;
    }

    /**
     * Gets the value of the defaultwhse property.
     * 
     * @return possible object is {@link String }
     */
    public String getDefaultwhse()
    {
        return defaultwhse;
    }

    /**
     * Sets the value of the defaultwhse property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setDefaultwhse(String value)
    {
        this.defaultwhse = value;
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
     * Gets the value of the itemtype property.
     * 
     * @return possible object is {@link String }
     */
    public String getItemtype()
    {
        return itemtype;
    }

    /**
     * Sets the value of the itemtype property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setItemtype(String value)
    {
        this.itemtype = value;
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
     * Gets the value of the termperiod property.
     * 
     * @return possible object is {@link Termperiod }
     */
    public Termperiod getTermperiod()
    {
        return termperiod;
    }

    /**
     * Sets the value of the termperiod property.
     * 
     * @param value allowed object is {@link Termperiod }
     */
    public void setTermperiod(Termperiod value)
    {
        this.termperiod = value;
    }

    /**
     * Gets the value of the totalperiods property.
     * 
     * @return possible object is {@link Totalperiods }
     */
    public Totalperiods getTotalperiods()
    {
        return totalperiods;
    }

    /**
     * Sets the value of the totalperiods property.
     * 
     * @param value allowed object is {@link Totalperiods }
     */
    public void setTotalperiods(Totalperiods value)
    {
        this.totalperiods = value;
    }

    /**
     * Gets the value of the computeforshortterm property.
     * 
     * @return possible object is {@link Computeforshortterm }
     */
    public Computeforshortterm getComputeforshortterm()
    {
        return computeforshortterm;
    }

    /**
     * Sets the value of the computeforshortterm property.
     * 
     * @param value allowed object is {@link Computeforshortterm }
     */
    public void setComputeforshortterm(Computeforshortterm value)
    {
        this.computeforshortterm = value;
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

}
