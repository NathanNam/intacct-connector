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
@XmlType(name = "", propOrder = {"documenttype", "itemtaxgroupOrAccountgroup", "taxgroup", "scheduleid",
    "module"})
@XmlRootElement(name = "create_taxschedulemap")
public class CreateTaxschedulemap
{

    protected String documenttype;
    @XmlElements({@XmlElement(name = "itemtaxgroup", required = true, type = Itemtaxgroup.class),
        @XmlElement(name = "accountgroup", required = true, type = Accountgroup.class)})
    protected List<Object> itemtaxgroupOrAccountgroup;
    @XmlElement(required = true)
    protected String taxgroup;
    @XmlElement(required = true)
    protected String scheduleid;
    protected String module;

    /**
     * Gets the value of the documenttype property.
     * 
     * @return possible object is {@link String }
     */
    public String getDocumenttype()
    {
        return documenttype;
    }

    /**
     * Sets the value of the documenttype property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setDocumenttype(String value)
    {
        this.documenttype = value;
    }

    /**
     * Gets the value of the itemtaxgroupOrAccountgroup property.
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
     * the itemtaxgroupOrAccountgroup property.
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getItemtaxgroupOrAccountgroup().add(newItem);
     * </pre>
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Itemtaxgroup }
     * {@link Accountgroup }
     */
    public List<Object> getItemtaxgroupOrAccountgroup()
    {
        if (itemtaxgroupOrAccountgroup == null)
        {
            itemtaxgroupOrAccountgroup = new ArrayList<Object>();
        }
        return this.itemtaxgroupOrAccountgroup;
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
     * Gets the value of the scheduleid property.
     * 
     * @return possible object is {@link String }
     */
    public String getScheduleid()
    {
        return scheduleid;
    }

    /**
     * Sets the value of the scheduleid property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setScheduleid(String value)
    {
        this.scheduleid = value;
    }

    /**
     * Gets the value of the module property.
     * 
     * @return possible object is {@link String }
     */
    public String getModule()
    {
        return module;
    }

    /**
     * Sets the value of the module property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setModule(String value)
    {
        this.module = value;
    }

}
