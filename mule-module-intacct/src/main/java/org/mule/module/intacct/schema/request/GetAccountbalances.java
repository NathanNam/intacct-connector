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
@XmlType(name = "", propOrder = {"reportingperiodnameOrStartdateOrEnddate",
    "glaccountnoOrAccountgroupnameOrStartaccountnoOrEndaccountno", "locationid", "departmentid",
    "showzerobalances"})
@XmlRootElement(name = "get_accountbalances")
public class GetAccountbalances
{

    @XmlElements({
        @XmlElement(name = "reportingperiodname", required = true, type = Reportingperiodname.class),
        @XmlElement(name = "startdate", required = true, type = Startdate.class),
        @XmlElement(name = "enddate", required = true, type = Enddate.class)})
    protected List<Object> reportingperiodnameOrStartdateOrEnddate;
    @XmlElements({@XmlElement(name = "glaccountno", type = Glaccountno.class),
        @XmlElement(name = "accountgroupname", type = Accountgroupname.class),
        @XmlElement(name = "startaccountno", type = Startaccountno.class),
        @XmlElement(name = "endaccountno", type = Endaccountno.class)})
    protected List<Object> glaccountnoOrAccountgroupnameOrStartaccountnoOrEndaccountno;
    protected Locationid locationid;
    protected Departmentid departmentid;
    protected String showzerobalances;

    /**
     * Gets the value of the reportingperiodnameOrStartdateOrEnddate property.
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
     * the reportingperiodnameOrStartdateOrEnddate property.
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getReportingperiodnameOrStartdateOrEnddate().add(newItem);
     * </pre>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reportingperiodname } {@link Startdate } {@link Enddate }
     */
    public List<Object> getReportingperiodnameOrStartdateOrEnddate()
    {
        if (reportingperiodnameOrStartdateOrEnddate == null)
        {
            reportingperiodnameOrStartdateOrEnddate = new ArrayList<Object>();
        }
        return this.reportingperiodnameOrStartdateOrEnddate;
    }

    /**
     * Gets the value of the
     * glaccountnoOrAccountgroupnameOrStartaccountnoOrEndaccountno property.
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
     * the glaccountnoOrAccountgroupnameOrStartaccountnoOrEndaccountno property.
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getGlaccountnoOrAccountgroupnameOrStartaccountnoOrEndaccountno().add(newItem);
     * </pre>
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Glaccountno }
     * {@link Accountgroupname } {@link Startaccountno } {@link Endaccountno }
     */
    public List<Object> getGlaccountnoOrAccountgroupnameOrStartaccountnoOrEndaccountno()
    {
        if (glaccountnoOrAccountgroupnameOrStartaccountnoOrEndaccountno == null)
        {
            glaccountnoOrAccountgroupnameOrStartaccountnoOrEndaccountno = new ArrayList<Object>();
        }
        return this.glaccountnoOrAccountgroupnameOrStartaccountnoOrEndaccountno;
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
     * Gets the value of the showzerobalances property.
     * 
     * @return possible object is {@link String }
     */
    public String getShowzerobalances()
    {
        return showzerobalances;
    }

    /**
     * Sets the value of the showzerobalances property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setShowzerobalances(String value)
    {
        this.showzerobalances = value;
    }

}
