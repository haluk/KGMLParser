
package schema;

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
    "graphics"
})
@XmlRootElement(name = "entry")
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-08-14T04:28:21-05:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class Entry {

    @XmlAttribute(name = "xmlns")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-08-14T04:28:21-05:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String xmlns;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-08-14T04:28:21-05:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String id;
    @XmlAttribute(name = "link", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-08-14T04:28:21-05:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String link;
    @XmlAttribute(name = "name", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-08-14T04:28:21-05:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String name;
    @XmlAttribute(name = "type", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-08-14T04:28:21-05:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String type;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-08-14T04:28:21-05:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Graphics graphics;

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
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-08-14T04:28:21-05:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-08-14T04:28:21-05:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the link property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-08-14T04:28:21-05:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getLink() {
        return link;
    }

    /**
     * Sets the value of the link property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-08-14T04:28:21-05:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setLink(String value) {
        this.link = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-08-14T04:28:21-05:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-08-14T04:28:21-05:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setName(String value) {
        this.name = value;
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
     * Gets the value of the graphics property.
     * 
     * @return
     *     possible object is
     *     {@link Graphics }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-08-14T04:28:21-05:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Graphics getGraphics() {
        return graphics;
    }

    /**
     * Sets the value of the graphics property.
     * 
     * @param value
     *     allowed object is
     *     {@link Graphics }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-08-14T04:28:21-05:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setGraphics(Graphics value) {
        this.graphics = value;
    }

}
