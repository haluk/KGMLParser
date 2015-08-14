
package schema;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
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
@XmlType(name = "", propOrder = {
    "subtype"
})
@XmlRootElement(name = "relation")
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-08-14T04:28:21-05:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class Relation {

    @XmlAttribute(name = "xmlns")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-08-14T04:28:21-05:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String xmlns;
    @XmlAttribute(name = "entry1", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-08-14T04:28:21-05:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String entry1;
    @XmlAttribute(name = "entry2", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-08-14T04:28:21-05:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String entry2;
    @XmlAttribute(name = "type", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-08-14T04:28:21-05:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String type;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-08-14T04:28:21-05:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected List<Subtype> subtype;

    /**
     * Gets the value of the xmlns property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-08-14T04:28:21-05:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getXmlns() {
        if (xmlns == null) {
            return "";
        } else {
            return xmlns;
        }
    }

    /**
     * Sets the value of the xmlns property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-08-14T04:28:21-05:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setXmlns(String value) {
        this.xmlns = value;
    }

    /**
     * Gets the value of the entry1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-08-14T04:28:21-05:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getEntry1() {
        return entry1;
    }

    /**
     * Sets the value of the entry1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-08-14T04:28:21-05:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setEntry1(String value) {
        this.entry1 = value;
    }

    /**
     * Gets the value of the entry2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-08-14T04:28:21-05:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getEntry2() {
        return entry2;
    }

    /**
     * Sets the value of the entry2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-08-14T04:28:21-05:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setEntry2(String value) {
        this.entry2 = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-08-14T04:28:21-05:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-08-14T04:28:21-05:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the subtype property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subtype property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubtype().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Subtype }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-08-14T04:28:21-05:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public List<Subtype> getSubtype() {
        if (subtype == null) {
            subtype = new ArrayList<Subtype>();
        }
        return this.subtype;
    }

}
