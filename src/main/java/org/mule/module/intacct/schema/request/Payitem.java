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
@XmlType(name = "", propOrder = {"glaccountnoOrAccountlabel", "paymentamount", "item1099", "departmentid",
    "locationid"})
@XmlRootElement(name = "payitem")
public class Payitem
{

    @XmlElements({@XmlElement(name = "glaccountno", required = true, type = Glaccountno.class),
        @XmlElement(name = "accountlabel", required = true, type = Accountlabel.class)})
    protected List<Object> glaccountnoOrAccountlabel;
    @XmlElement(required = true)
    protected Paymentamount paymentamount;
    protected String item1099;
    protected Departmentid departmentid;
    protected Locationid locationid;

    /**
     * Gets the value of the glaccountnoOrAccountlabel property.
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
     * the glaccountnoOrAccountlabel property.
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getGlaccountnoOrAccountlabel().add(newItem);
     * </pre>
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Glaccountno }
     * {@link Accountlabel }
     */
    public List<Object> getGlaccountnoOrAccountlabel()
    {
        if (glaccountnoOrAccountlabel == null)
        {
            glaccountnoOrAccountlabel = new ArrayList<Object>();
        }
        return this.glaccountnoOrAccountlabel;
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
     * Gets the value of the item1099 property.
     * 
     * @return possible object is {@link String }
     */
    public String getItem1099()
    {
        return item1099;
    }

    /**
     * Sets the value of the item1099 property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setItem1099(String value)
    {
        this.item1099 = value;
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

}
