
package it.csi.bigiot.bikeinjector.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentModality complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentModality">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Aggregation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Convention" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="InstantConfirmation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="NameENG" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NameITA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PaymentModalityID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Type" type="{http://servicev2.tobike.it}ePaymentModalityTypeEnum"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentModality", propOrder = {
    "aggregation",
    "convention",
    "instantConfirmation",
    "nameENG",
    "nameITA",
    "paymentModalityID",
    "type"
})
public class PaymentModality {

    @XmlElement(name = "Aggregation", required = true, nillable = true)
    protected String aggregation;
    @XmlElement(name = "Convention", required = true, nillable = true)
    protected String convention;
    @XmlElement(name = "InstantConfirmation")
    protected boolean instantConfirmation;
    @XmlElement(name = "NameENG", required = true, nillable = true)
    protected String nameENG;
    @XmlElement(name = "NameITA", required = true, nillable = true)
    protected String nameITA;
    @XmlElement(name = "PaymentModalityID")
    protected int paymentModalityID;
    @XmlElement(name = "Type", required = true)
    @XmlSchemaType(name = "string")
    protected EPaymentModalityTypeEnum type;

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
     * Gets the value of the instantConfirmation property.
     * 
     */
    public boolean isInstantConfirmation() {
        return instantConfirmation;
    }

    /**
     * Sets the value of the instantConfirmation property.
     * 
     */
    public void setInstantConfirmation(boolean value) {
        this.instantConfirmation = value;
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
     * Gets the value of the paymentModalityID property.
     * 
     */
    public int getPaymentModalityID() {
        return paymentModalityID;
    }

    /**
     * Sets the value of the paymentModalityID property.
     * 
     */
    public void setPaymentModalityID(int value) {
        this.paymentModalityID = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link EPaymentModalityTypeEnum }
     *     
     */
    public EPaymentModalityTypeEnum getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link EPaymentModalityTypeEnum }
     *     
     */
    public void setType(EPaymentModalityTypeEnum value) {
        this.type = value;
    }

}
