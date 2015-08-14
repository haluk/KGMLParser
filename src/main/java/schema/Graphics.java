
package schema;

import javax.annotation.Generated;
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
@XmlType(name = "")
@XmlRootElement(name = "graphics")
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-08-14T04:28:21-05:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class Graphics {

    @XmlAttribute(name = "xmlns")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-08-14T04:28:21-05:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String xmlns;
    @XmlAttribute(name = "bgcolor", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-08-14T04:28:21-05:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String bgcolor;
    @XmlAttribute(name = "fgcolor", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-08-14T04:28:21-05:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String fgcolor;
    @XmlAttribute(name = "height", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-08-14T04:28:21-05:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String height;
    @XmlAttribute(name = "name", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-08-14T04:28:21-05:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String name;
    @XmlAttribute(name = "type", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-08-14T04:28:21-05:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String type;
    @XmlAttribute(name = "width", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-08-14T04:28:21-05:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String width;
    @XmlAttribute(name = "x", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-08-14T04:28:21-05:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String x;
    @XmlAttribute(name = "y", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-08-14T04:28:21-05:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String y;

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
     * Gets the value of the bgcolor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-08-14T04:28:21-05:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getBgcolor() {
        return bgcolor;
    }

    /**
     * Sets the value of the bgcolor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-08-14T04:28:21-05:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setBgcolor(String value) {
        this.bgcolor = value;
    }

    /**
     * Gets the value of the fgcolor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-08-14T04:28:21-05:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getFgcolor() {
        return fgcolor;
    }

    /**
     * Sets the value of the fgcolor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-08-14T04:28:21-05:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setFgcolor(String value) {
        this.fgcolor = value;
    }

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-08-14T04:28:21-05:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-08-14T04:28:21-05:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setHeight(String value) {
        this.height = value;
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
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-08-14T04:28:21-05:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-08-14T04:28:21-05:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setWidth(String value) {
        this.width = value;
    }

    /**
     * Gets the value of the x property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-08-14T04:28:21-05:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getX() {
        return x;
    }

    /**
     * Sets the value of the x property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-08-14T04:28:21-05:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setX(String value) {
        this.x = value;
    }

    /**
     * Gets the value of the y property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-08-14T04:28:21-05:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getY() {
        return y;
    }

    /**
     * Sets the value of the y property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-08-14T04:28:21-05:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setY(String value) {
        this.y = value;
    }

}
