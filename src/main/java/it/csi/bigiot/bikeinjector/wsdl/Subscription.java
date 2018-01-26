
package it.csi.bigiot.bikeinjector.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Subscription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Subscription">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AutomaticActivation" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="BadgeCost" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="BadgeDeposit" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="BikeDeposit" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ConventionID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PortalID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RenewInsuranceIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="DescriptionENG" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DescriptionITA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="H24" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="InstantActivation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Insurance" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="InsuranceCost" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InsuranceIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="InsuranceMandatory" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="MaxRecharge" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MinRecharge" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="MunicipalityID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RechargeIncluded" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="RenewBadgeDeposit" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="RenewBikeDeposit" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="RenewCost" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="RenewInsuranceCost" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="RenewInsuranceMandatory" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="RenewMaxRecharge" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="RenewMinRecharge" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="RenewRechargeIncluded" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ReplacementCost" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Result" type="{http://servicev2.tobike.it}eSubscriptionResultEnum"/>
 *         &lt;element name="ShipmentCost" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="SubscriptionCost" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="SubscriptionID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SubscriptionType" type="{http://servicev2.tobike.it}eSubscriptionTypeEnum"/>
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
@XmlType(name = "Subscription", propOrder = {
    "automaticActivation",
    "badgeCost",
    "badgeDeposit",
    "bikeDeposit",
    "conventionID",
    "portalID",
    "renewInsuranceIncluded",
    "descriptionENG",
    "descriptionITA",
    "h24",
    "instantActivation",
    "insurance",
    "insuranceCost",
    "insuranceIncluded",
    "insuranceMandatory",
    "maxRecharge",
    "message",
    "minRecharge",
    "municipalityID",
    "rechargeIncluded",
    "renewBadgeDeposit",
    "renewBikeDeposit",
    "renewCost",
    "renewInsuranceCost",
    "renewInsuranceMandatory",
    "renewMaxRecharge",
    "renewMinRecharge",
    "renewRechargeIncluded",
    "replacementCost",
    "result",
    "shipmentCost",
    "subscriptionCost",
    "subscriptionID",
    "subscriptionType",
    "type"
})
public class Subscription {

    @XmlElement(name = "AutomaticActivation")
    protected double automaticActivation;
    @XmlElement(name = "BadgeCost")
    protected double badgeCost;
    @XmlElement(name = "BadgeDeposit")
    protected double badgeDeposit;
    @XmlElement(name = "BikeDeposit")
    protected double bikeDeposit;
    @XmlElement(name = "ConventionID")
    protected int conventionID;
    @XmlElement(name = "PortalID")
    protected int portalID;
    @XmlElement(name = "RenewInsuranceIncluded")
    protected boolean renewInsuranceIncluded;
    @XmlElement(name = "DescriptionENG", required = true, nillable = true)
    protected String descriptionENG;
    @XmlElement(name = "DescriptionITA", required = true, nillable = true)
    protected String descriptionITA;
    @XmlElement(name = "H24")
    protected boolean h24;
    @XmlElement(name = "InstantActivation")
    protected boolean instantActivation;
    @XmlElement(name = "Insurance")
    protected boolean insurance;
    @XmlElement(name = "InsuranceCost")
    protected double insuranceCost;
    @XmlElement(name = "InsuranceIncluded")
    protected boolean insuranceIncluded;
    @XmlElement(name = "InsuranceMandatory")
    protected boolean insuranceMandatory;
    @XmlElement(name = "MaxRecharge")
    protected double maxRecharge;
    @XmlElement(name = "Message", required = true, nillable = true)
    protected String message;
    @XmlElement(name = "MinRecharge")
    protected double minRecharge;
    @XmlElement(name = "MunicipalityID")
    protected int municipalityID;
    @XmlElement(name = "RechargeIncluded")
    protected double rechargeIncluded;
    @XmlElement(name = "RenewBadgeDeposit")
    protected double renewBadgeDeposit;
    @XmlElement(name = "RenewBikeDeposit")
    protected double renewBikeDeposit;
    @XmlElement(name = "RenewCost")
    protected double renewCost;
    @XmlElement(name = "RenewInsuranceCost")
    protected double renewInsuranceCost;
    @XmlElement(name = "RenewInsuranceMandatory")
    protected boolean renewInsuranceMandatory;
    @XmlElement(name = "RenewMaxRecharge")
    protected double renewMaxRecharge;
    @XmlElement(name = "RenewMinRecharge")
    protected double renewMinRecharge;
    @XmlElement(name = "RenewRechargeIncluded")
    protected double renewRechargeIncluded;
    @XmlElement(name = "ReplacementCost")
    protected double replacementCost;
    @XmlElement(name = "Result", required = true)
    @XmlSchemaType(name = "string")
    protected ESubscriptionResultEnum result;
    @XmlElement(name = "ShipmentCost")
    protected double shipmentCost;
    @XmlElement(name = "SubscriptionCost")
    protected double subscriptionCost;
    @XmlElement(name = "SubscriptionID")
    protected int subscriptionID;
    @XmlElement(name = "SubscriptionType", required = true)
    @XmlSchemaType(name = "string")
    protected ESubscriptionTypeEnum subscriptionType;
    @XmlElement(name = "Type")
    protected int type;

    /**
     * Gets the value of the automaticActivation property.
     * 
     */
    public double getAutomaticActivation() {
        return automaticActivation;
    }

    /**
     * Sets the value of the automaticActivation property.
     * 
     */
    public void setAutomaticActivation(double value) {
        this.automaticActivation = value;
    }

    /**
     * Gets the value of the badgeCost property.
     * 
     */
    public double getBadgeCost() {
        return badgeCost;
    }

    /**
     * Sets the value of the badgeCost property.
     * 
     */
    public void setBadgeCost(double value) {
        this.badgeCost = value;
    }

    /**
     * Gets the value of the badgeDeposit property.
     * 
     */
    public double getBadgeDeposit() {
        return badgeDeposit;
    }

    /**
     * Sets the value of the badgeDeposit property.
     * 
     */
    public void setBadgeDeposit(double value) {
        this.badgeDeposit = value;
    }

    /**
     * Gets the value of the bikeDeposit property.
     * 
     */
    public double getBikeDeposit() {
        return bikeDeposit;
    }

    /**
     * Sets the value of the bikeDeposit property.
     * 
     */
    public void setBikeDeposit(double value) {
        this.bikeDeposit = value;
    }

    /**
     * Gets the value of the conventionID property.
     * 
     */
    public int getConventionID() {
        return conventionID;
    }

    /**
     * Sets the value of the conventionID property.
     * 
     */
    public void setConventionID(int value) {
        this.conventionID = value;
    }

    /**
     * Gets the value of the portalID property.
     * 
     */
    public int getPortalID() {
        return portalID;
    }

    /**
     * Sets the value of the portalID property.
     * 
     */
    public void setPortalID(int value) {
        this.portalID = value;
    }

    /**
     * Gets the value of the renewInsuranceIncluded property.
     * 
     */
    public boolean isRenewInsuranceIncluded() {
        return renewInsuranceIncluded;
    }

    /**
     * Sets the value of the renewInsuranceIncluded property.
     * 
     */
    public void setRenewInsuranceIncluded(boolean value) {
        this.renewInsuranceIncluded = value;
    }

    /**
     * Gets the value of the descriptionENG property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionENG() {
        return descriptionENG;
    }

    /**
     * Sets the value of the descriptionENG property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionENG(String value) {
        this.descriptionENG = value;
    }

    /**
     * Gets the value of the descriptionITA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionITA() {
        return descriptionITA;
    }

    /**
     * Sets the value of the descriptionITA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionITA(String value) {
        this.descriptionITA = value;
    }

    /**
     * Gets the value of the h24 property.
     * 
     */
    public boolean isH24() {
        return h24;
    }

    /**
     * Sets the value of the h24 property.
     * 
     */
    public void setH24(boolean value) {
        this.h24 = value;
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

    /**
     * Gets the value of the insuranceCost property.
     * 
     */
    public double getInsuranceCost() {
        return insuranceCost;
    }

    /**
     * Sets the value of the insuranceCost property.
     * 
     */
    public void setInsuranceCost(double value) {
        this.insuranceCost = value;
    }

    /**
     * Gets the value of the insuranceIncluded property.
     * 
     */
    public boolean isInsuranceIncluded() {
        return insuranceIncluded;
    }

    /**
     * Sets the value of the insuranceIncluded property.
     * 
     */
    public void setInsuranceIncluded(boolean value) {
        this.insuranceIncluded = value;
    }

    /**
     * Gets the value of the insuranceMandatory property.
     * 
     */
    public boolean isInsuranceMandatory() {
        return insuranceMandatory;
    }

    /**
     * Sets the value of the insuranceMandatory property.
     * 
     */
    public void setInsuranceMandatory(boolean value) {
        this.insuranceMandatory = value;
    }

    /**
     * Gets the value of the maxRecharge property.
     * 
     */
    public double getMaxRecharge() {
        return maxRecharge;
    }

    /**
     * Sets the value of the maxRecharge property.
     * 
     */
    public void setMaxRecharge(double value) {
        this.maxRecharge = value;
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
     * Gets the value of the minRecharge property.
     * 
     */
    public double getMinRecharge() {
        return minRecharge;
    }

    /**
     * Sets the value of the minRecharge property.
     * 
     */
    public void setMinRecharge(double value) {
        this.minRecharge = value;
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
     * Gets the value of the rechargeIncluded property.
     * 
     */
    public double getRechargeIncluded() {
        return rechargeIncluded;
    }

    /**
     * Sets the value of the rechargeIncluded property.
     * 
     */
    public void setRechargeIncluded(double value) {
        this.rechargeIncluded = value;
    }

    /**
     * Gets the value of the renewBadgeDeposit property.
     * 
     */
    public double getRenewBadgeDeposit() {
        return renewBadgeDeposit;
    }

    /**
     * Sets the value of the renewBadgeDeposit property.
     * 
     */
    public void setRenewBadgeDeposit(double value) {
        this.renewBadgeDeposit = value;
    }

    /**
     * Gets the value of the renewBikeDeposit property.
     * 
     */
    public double getRenewBikeDeposit() {
        return renewBikeDeposit;
    }

    /**
     * Sets the value of the renewBikeDeposit property.
     * 
     */
    public void setRenewBikeDeposit(double value) {
        this.renewBikeDeposit = value;
    }

    /**
     * Gets the value of the renewCost property.
     * 
     */
    public double getRenewCost() {
        return renewCost;
    }

    /**
     * Sets the value of the renewCost property.
     * 
     */
    public void setRenewCost(double value) {
        this.renewCost = value;
    }

    /**
     * Gets the value of the renewInsuranceCost property.
     * 
     */
    public double getRenewInsuranceCost() {
        return renewInsuranceCost;
    }

    /**
     * Sets the value of the renewInsuranceCost property.
     * 
     */
    public void setRenewInsuranceCost(double value) {
        this.renewInsuranceCost = value;
    }

    /**
     * Gets the value of the renewInsuranceMandatory property.
     * 
     */
    public boolean isRenewInsuranceMandatory() {
        return renewInsuranceMandatory;
    }

    /**
     * Sets the value of the renewInsuranceMandatory property.
     * 
     */
    public void setRenewInsuranceMandatory(boolean value) {
        this.renewInsuranceMandatory = value;
    }

    /**
     * Gets the value of the renewMaxRecharge property.
     * 
     */
    public double getRenewMaxRecharge() {
        return renewMaxRecharge;
    }

    /**
     * Sets the value of the renewMaxRecharge property.
     * 
     */
    public void setRenewMaxRecharge(double value) {
        this.renewMaxRecharge = value;
    }

    /**
     * Gets the value of the renewMinRecharge property.
     * 
     */
    public double getRenewMinRecharge() {
        return renewMinRecharge;
    }

    /**
     * Sets the value of the renewMinRecharge property.
     * 
     */
    public void setRenewMinRecharge(double value) {
        this.renewMinRecharge = value;
    }

    /**
     * Gets the value of the renewRechargeIncluded property.
     * 
     */
    public double getRenewRechargeIncluded() {
        return renewRechargeIncluded;
    }

    /**
     * Sets the value of the renewRechargeIncluded property.
     * 
     */
    public void setRenewRechargeIncluded(double value) {
        this.renewRechargeIncluded = value;
    }

    /**
     * Gets the value of the replacementCost property.
     * 
     */
    public double getReplacementCost() {
        return replacementCost;
    }

    /**
     * Sets the value of the replacementCost property.
     * 
     */
    public void setReplacementCost(double value) {
        this.replacementCost = value;
    }

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link ESubscriptionResultEnum }
     *     
     */
    public ESubscriptionResultEnum getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ESubscriptionResultEnum }
     *     
     */
    public void setResult(ESubscriptionResultEnum value) {
        this.result = value;
    }

    /**
     * Gets the value of the shipmentCost property.
     * 
     */
    public double getShipmentCost() {
        return shipmentCost;
    }

    /**
     * Sets the value of the shipmentCost property.
     * 
     */
    public void setShipmentCost(double value) {
        this.shipmentCost = value;
    }

    /**
     * Gets the value of the subscriptionCost property.
     * 
     */
    public double getSubscriptionCost() {
        return subscriptionCost;
    }

    /**
     * Sets the value of the subscriptionCost property.
     * 
     */
    public void setSubscriptionCost(double value) {
        this.subscriptionCost = value;
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
     *     {@link ESubscriptionTypeEnum }
     *     
     */
    public ESubscriptionTypeEnum getSubscriptionType() {
        return subscriptionType;
    }

    /**
     * Sets the value of the subscriptionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ESubscriptionTypeEnum }
     *     
     */
    public void setSubscriptionType(ESubscriptionTypeEnum value) {
        this.subscriptionType = value;
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
