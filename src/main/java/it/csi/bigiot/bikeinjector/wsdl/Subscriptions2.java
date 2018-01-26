
package it.csi.bigiot.bikeinjector.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Subscriptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Subscriptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Aggregation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BadgeType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Convention" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NameENG" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NameITA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SubscriptionID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SubscriptionType" type="{http://servicev2.tobike.it}eSubscriptionsTypeEnum"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Subscriptions", propOrder = {
    "aggregation",
    "badgeType",
    "convention",
    "nameENG",
    "nameITA",
    "subscriptionID",
    "subscriptionType"
})
public class Subscriptions2 {

    @XmlElement(name = "Aggregation", required = true, nillable = true)
    protected String aggregation;
    @XmlElement(name = "BadgeType", required = true, nillable = true)
    protected String badgeType;
    @XmlElement(name = "Convention", required = true, nillable = true)
    protected String convention;
    @XmlElement(name = "NameENG", required = true, nillable = true)
    protected String nameENG;
    @XmlElement(name = "NameITA", required = true, nillable = true)
    protected String nameITA;
    @XmlElement(name = "SubscriptionID")
    protected int subscriptionID;
    @XmlElement(name = "SubscriptionType", required = true)
    @XmlSchemaType(name = "string")
    protected ESubscriptionsTypeEnum subscriptionType;

    /**
     * Gets the value of the aggregation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAggregation() {
        return aggregation;
    }

    /**
     * Sets the value of the aggregation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAggregation(String value) {
        this.aggregation = value;
    }

    /**
     * Gets the value of the badgeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBadgeType() {
        return badgeType;
    }

    /**
     * Sets the value of the badgeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBadgeType(String value) {
        this.badgeType = value;
    }

    /**
     * Gets the value of the convention property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConvention() {
        return convention;
    }

    /**
     * Sets the value of the convention property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConvention(String value) {
        this.convention = value;
    }

    /**
     * Gets the value of the nameENG property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameENG() {
        return nameENG;
    }

    /**
     * Sets the value of the nameENG property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameENG(String value) {
        this.nameENG = value;
    }

    /**
     * Gets the value of the nameITA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameITA() {
        return nameITA;
    }

    /**
     * Sets the value of the nameITA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameITA(String value) {
        this.nameITA = value;
    }

    /**
     * Gets the value of the subscriptionID property.
     * 
     */
    public int getSubscriptionID() {
        return subscriptionID;
    }

    /**
     * Sets the value of the subscriptionID property.
     * 
     */
    public void setSubscriptionID(int value) {
        this.subscriptionID = value;
    }

    /**
     * Gets the value of the subscriptionType property.
     * 
     * @return
     *     possible object is
     *     {@link ESubscriptionsTypeEnum }
     *     
     */
    public ESubscriptionsTypeEnum getSubscriptionType() {
        return subscriptionType;
    }

    /**
     * Sets the value of the subscriptionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ESubscriptionsTypeEnum }
     *     
     */
    public void setSubscriptionType(ESubscriptionsTypeEnum value) {
        this.subscriptionType = value;
    }

}
