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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "update_cctransactionType", propOrder = {"paymentdate", "referenceno", "payee", "description", "updateccpayitems"})
@XmlRootElement(name = "update_cctransaction")
public class UpdateCctransaction
{

    @XmlAttribute(name = "key", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String key;
    protected Paymentdate paymentdate;
    protected String referenceno;
    protected Payee payee;
    protected String description;
    protected Updateccpayitems updateccpayitems;

    /**
     * Gets the value of the key property.
     * 
     * @return possible object is {@link String }
     */
    public String getKey()
    {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setKey(String value)
    {
        this.key = value;
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
     * Gets the value of the referenceno property.
     * 
     * @return possible object is {@link String }
     */
    public String getReferenceno()
    {
        return referenceno;
    }

    /**
     * Sets the value of the referenceno property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setReferenceno(String value)
    {
        this.referenceno = value;
    }

    /**
     * Gets the value of the payee property.
     * 
     * @return possible object is {@link Payee }
     */
    public Payee getPayee()
    {
        return payee;
    }

    /**
     * Sets the value of the payee property.
     * 
     * @param value allowed object is {@link Payee }
     */
    public void setPayee(Payee value)
    {
        this.payee = value;
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
     * Gets the value of the updateccpayitems property.
     * 
     * @return possible object is {@link Updateccpayitems }
     */
    public Updateccpayitems getUpdateccpayitems()
    {
        return updateccpayitems;
    }

    /**
     * Sets the value of the updateccpayitems property.
     * 
     * @param value allowed object is {@link Updateccpayitems }
     */
    public void setUpdateccpayitems(Updateccpayitems value)
    {
        this.updateccpayitems = value;
    }

}
