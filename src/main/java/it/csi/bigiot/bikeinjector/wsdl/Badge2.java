
package it.csi.bigiot.bikeinjector.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Badge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Badge">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ActivationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="AggregationSubscriptionID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BadgeID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BikesInUse" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CreationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Credit" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="DeactivationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="MunicipalityID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MunicipalitySubscriptionID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TagRFID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Badge", propOrder = {
    "activationDate",
    "aggregationSubscriptionID",
    "badgeID",
    "bikesInUse",
    "creationDate",
    "credit",
    "deactivationDate",
    "municipalityID",
    "municipalitySubscriptionID",
    "number",
    "tagRFID",
    "type"
})
public class Badge2 {

    @XmlElement(name = "ActivationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar activationDate;
    @XmlElement(name = "AggregationSubscriptionID")
    protected int aggregationSubscriptionID;
    @XmlElement(name = "BadgeID")
    protected int badgeID;
    @XmlElement(name = "BikesInUse")
    protected int bikesInUse;
    @XmlElement(name = "CreationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDate;
    @XmlElement(name = "Credit")
    protected double credit;
    @XmlElement(name = "DeactivationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deactivationDate;
    @XmlElement(name = "MunicipalityID")
    protected int municipalityID;
    @XmlElement(name = "MunicipalitySubscriptionID")
    protected int municipalitySubscriptionID;
    @XmlElement(name = "Number", required = true, nillable = true)
    protected String number;
    @XmlElement(name = "TagRFID", required = true, nillable = true)
    protected String tagRFID;
    @XmlElement(name = "Type")
    protected int type;

    /**
     * Gets the value of the activationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActivationDate() {
        return activationDate;
    }

    /**
     * Sets the value of the activationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActivationDate(XMLGregorianCalendar value) {
        this.activationDate = value;
    }

    /**
     * Gets the value of the aggregationSubscriptionID property.
     * 
     */
    public int getAggregationSubscriptionID() {
        return aggregationSubscriptionID;
    }

    /**
     * Sets the value of the aggregationSubscriptionID property.
     * 
     */
    public void setAggregationSubscriptionID(int value) {
        this.aggregationSubscriptionID = value;
    }

    /**
     * Gets the value of the badgeID property.
     * 
     */
    public int getBadgeID() {
        return badgeID;
    }

    /**
     * Sets the value of the badgeID property.
     * 
     */
    public void setBadgeID(int value) {
        this.badgeID = value;
    }

    /**
     * Gets the value of the bikesInUse property.
     * 
     */
    public int getBikesInUse() {
        return bikesInUse;
    }

    /**
     * Sets the value of the bikesInUse property.
     * 
     */
    public void setBikesInUse(int value) {
        this.bikesInUse = value;
    }

    /**
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
    }

    /**
     * Gets the value of the credit property.
     * 
     */
    public double getCredit() {
        return credit;
    }

    /**
     * Sets the value of the credit property.
     * 
     */
    public void setCredit(double value) {
        this.credit = value;
    }

    /**
     * Gets the value of the deactivationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeactivationDate() {
        return deactivationDate;
    }

    /**
     * Sets the value of the deactivationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeactivationDate(XMLGregorianCalendar value) {
        this.deactivationDate = value;
    }

    /**
     * Gets the value of the municipalityID property.
     * 
     */
    public int getMunicipalityID() {
        return municipalityID;
    }

    /**
     * Sets the value of the municipalityID property.
     * 
     */
    public void setMunicipalityID(int value) {
        this.municipalityID = value;
    }

    /**
     * Gets the value of the municipalitySubscriptionID property.
     * 
     */
    public int getMunicipalitySubscriptionID() {
        return municipalitySubscriptionID;
    }

    /**
     * Sets the value of the municipalitySubscriptionID property.
     * 
     */
    public void setMunicipalitySubscriptionID(int value) {
        this.municipalitySubscriptionID = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the tagRFID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTagRFID() {
        return tagRFID;
    }

    /**
     * Sets the value of the tagRFID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTagRFID(String value) {
        this.tagRFID = value;
    }

    /**
     * Gets the value of the type property.
     * 
     */
    public int getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     */
    public void setType(int value) {
        this.type = value;
    }

}
