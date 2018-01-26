
package it.csi.bigiot.bikeinjector.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Payment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Payment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Result" type="{http://servicev2.tobike.it}ePaymentResultEnum"/>
 *         &lt;element name="AggregationSubscriptionID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BadgeNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BadgeTagRFID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Cause" type="{http://servicev2.tobike.it}eCauseEnum"/>
 *         &lt;element name="InstantActivation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MunicipalitySubscriptionID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PaymentID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Recharge" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ResellerID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Total" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="PaymentModalityID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FreeRecharge" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="FreeSubscription" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="FreeBadgeCost" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="FreeInsurance" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="FreeBikeDeposit" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="FreeBadgeDeposit" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="FreeShipment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="FreeReplacement" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Shipment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Invoice" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Insurance" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Payment", propOrder = {
    "result",
    "aggregationSubscriptionID",
    "badgeNumber",
    "badgeTagRFID",
    "cause",
    "instantActivation",
    "message",
    "municipalitySubscriptionID",
    "paymentID",
    "recharge",
    "resellerID",
    "total",
    "paymentModalityID",
    "freeRecharge",
    "freeSubscription",
    "freeBadgeCost",
    "freeInsurance",
    "freeBikeDeposit",
    "freeBadgeDeposit",
    "freeShipment",
    "freeReplacement",
    "shipment",
    "invoice",
    "insurance"
})
public class Payment2 {

    @XmlElement(name = "Result", required = true)
    @XmlSchemaType(name = "string")
    protected EPaymentResultEnum result;
    @XmlElement(name = "AggregationSubscriptionID")
    protected int aggregationSubscriptionID;
    @XmlElement(name = "BadgeNumber", required = true, nillable = true)
    protected String badgeNumber;
    @XmlElement(name = "BadgeTagRFID", required = true, nillable = true)
    protected String badgeTagRFID;
    @XmlElement(name = "Cause", required = true)
    @XmlSchemaType(name = "string")
    protected ECauseEnum cause;
    @XmlElement(name = "InstantActivation")
    protected boolean instantActivation;
    @XmlElement(name = "Message", required = true, nillable = true)
    protected String message;
    @XmlElement(name = "MunicipalitySubscriptionID")
    protected int municipalitySubscriptionID;
    @XmlElement(name = "PaymentID")
    protected int paymentID;
    @XmlElement(name = "Recharge")
    protected double recharge;
    @XmlElement(name = "ResellerID")
    protected int resellerID;
    @XmlElement(name = "Total")
    protected double total;
    @XmlElement(name = "PaymentModalityID")
    protected int paymentModalityID;
    @XmlElement(name = "FreeRecharge")
    protected boolean freeRecharge;
    @XmlElement(name = "FreeSubscription")
    protected boolean freeSubscription;
    @XmlElement(name = "FreeBadgeCost")
    protected boolean freeBadgeCost;
    @XmlElement(name = "FreeInsurance")
    protected boolean freeInsurance;
    @XmlElement(name = "FreeBikeDeposit")
    protected boolean freeBikeDeposit;
    @XmlElement(name = "FreeBadgeDeposit")
    protected boolean freeBadgeDeposit;
    @XmlElement(name = "FreeShipment")
    protected boolean freeShipment;
    @XmlElement(name = "FreeReplacement")
    protected boolean freeReplacement;
    @XmlElement(name = "Shipment")
    protected boolean shipment;
    @XmlElement(name = "Invoice")
    protected boolean invoice;
    @XmlElement(name = "Insurance")
    protected boolean insurance;

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link EPaymentResultEnum }
     *     
     */
    public EPaymentResultEnum getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link EPaymentResultEnum }
     *     
     */
    public void setResult(EPaymentResultEnum value) {
        this.result = value;
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
     * Gets the value of the badgeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBadgeNumber() {
        return badgeNumber;
    }

    /**
     * Sets the value of the badgeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBadgeNumber(String value) {
        this.badgeNumber = value;
    }

    /**
     * Gets the value of the badgeTagRFID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBadgeTagRFID() {
        return badgeTagRFID;
    }

    /**
     * Sets the value of the badgeTagRFID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBadgeTagRFID(String value) {
        this.badgeTagRFID = value;
    }

    /**
     * Gets the value of the cause property.
     * 
     * @return
     *     possible object is
     *     {@link ECauseEnum }
     *     
     */
    public ECauseEnum getCause() {
        return cause;
    }

    /**
     * Sets the value of the cause property.
     * 
     * @param value
     *     allowed object is
     *     {@link ECauseEnum }
     *     
     */
    public void setCause(ECauseEnum value) {
        this.cause = value;
    }

    /**
     * Gets the value of the instantActivation property.
     * 
     */
    public boolean isInstantActivation() {
        return instantActivation;
    }

    /**
     * Sets the value of the instantActivation property.
     * 
     */
    public void setInstantActivation(boolean value) {
        this.instantActivation = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
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
     * Gets the value of the paymentID property.
     * 
     */
    public int getPaymentID() {
        return paymentID;
    }

    /**
     * Sets the value of the paymentID property.
     * 
     */
    public void setPaymentID(int value) {
        this.paymentID = value;
    }

    /**
     * Gets the value of the recharge property.
     * 
     */
    public double getRecharge() {
        return recharge;
    }

    /**
     * Sets the value of the recharge property.
     * 
     */
    public void setRecharge(double value) {
        this.recharge = value;
    }

    /**
     * Gets the value of the resellerID property.
     * 
     */
    public int getResellerID() {
        return resellerID;
    }

    /**
     * Sets the value of the resellerID property.
     * 
     */
    public void setResellerID(int value) {
        this.resellerID = value;
    }

    /**
     * Gets the value of the total property.
     * 
     */
    public double getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     */
    public void setTotal(double value) {
        this.total = value;
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
     * Gets the value of the freeRecharge property.
     * 
     */
    public boolean isFreeRecharge() {
        return freeRecharge;
    }

    /**
     * Sets the value of the freeRecharge property.
     * 
     */
    public void setFreeRecharge(boolean value) {
        this.freeRecharge = value;
    }

    /**
     * Gets the value of the freeSubscription property.
     * 
     */
    public boolean isFreeSubscription() {
        return freeSubscription;
    }

    /**
     * Sets the value of the freeSubscription property.
     * 
     */
    public void setFreeSubscription(boolean value) {
        this.freeSubscription = value;
    }

    /**
     * Gets the value of the freeBadgeCost property.
     * 
     */
    public boolean isFreeBadgeCost() {
        return freeBadgeCost;
    }

    /**
     * Sets the value of the freeBadgeCost property.
     * 
     */
    public void setFreeBadgeCost(boolean value) {
        this.freeBadgeCost = value;
    }

    /**
     * Gets the value of the freeInsurance property.
     * 
     */
    public boolean isFreeInsurance() {
        return freeInsurance;
    }

    /**
     * Sets the value of the freeInsurance property.
     * 
     */
    public void setFreeInsurance(boolean value) {
        this.freeInsurance = value;
    }

    /**
     * Gets the value of the freeBikeDeposit property.
     * 
     */
    public boolean isFreeBikeDeposit() {
        return freeBikeDeposit;
    }

    /**
     * Sets the value of the freeBikeDeposit property.
     * 
     */
    public void setFreeBikeDeposit(boolean value) {
        this.freeBikeDeposit = value;
    }

    /**
     * Gets the value of the freeBadgeDeposit property.
     * 
     */
    public boolean isFreeBadgeDeposit() {
        return freeBadgeDeposit;
    }

    /**
     * Sets the value of the freeBadgeDeposit property.
     * 
     */
    public void setFreeBadgeDeposit(boolean value) {
        this.freeBadgeDeposit = value;
    }

    /**
     * Gets the value of the freeShipment property.
     * 
     */
    public boolean isFreeShipment() {
        return freeShipment;
    }

    /**
     * Sets the value of the freeShipment property.
     * 
     */
    public void setFreeShipment(boolean value) {
        this.freeShipment = value;
    }

    /**
     * Gets the value of the freeReplacement property.
     * 
     */
    public boolean isFreeReplacement() {
        return freeReplacement;
    }

    /**
     * Sets the value of the freeReplacement property.
     * 
     */
    public void setFreeReplacement(boolean value) {
        this.freeReplacement = value;
    }

    /**
     * Gets the value of the shipment property.
     * 
     */
    public boolean isShipment() {
        return shipment;
    }

    /**
     * Sets the value of the shipment property.
     * 
     */
    public void setShipment(boolean value) {
        this.shipment = value;
    }

    /**
     * Gets the value of the invoice property.
     * 
     */
    public boolean isInvoice() {
        return invoice;
    }

    /**
     * Sets the value of the invoice property.
     * 
     */
    public void setInvoice(boolean value) {
        this.invoice = value;
    }

    /**
     * Gets the value of the insurance property.
     * 
     */
    public boolean isInsurance() {
        return insurance;
    }

    /**
     * Sets the value of the insurance property.
     * 
     */
    public void setInsurance(boolean value) {
        this.insurance = value;
    }

}
