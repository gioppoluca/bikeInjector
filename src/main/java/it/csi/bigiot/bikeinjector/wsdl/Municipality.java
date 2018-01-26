
package it.csi.bigiot.bikeinjector.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Municipality complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Municipality">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MunicipalityID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PaymentModalities" type="{http://servicev2.tobike.it}ArrayOfPaymentModality"/>
 *         &lt;element name="PortalID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Stations" type="{http://servicev2.tobike.it}ArrayOfStation"/>
 *         &lt;element name="Subscriptions" type="{http://servicev2.tobike.it}ArrayOfSubscriptions"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Municipality", propOrder = {
    "municipalityID",
    "name",
    "paymentModalities",
    "portalID",
    "stations",
    "subscriptions"
})
public class Municipality {

    @XmlElement(name = "MunicipalityID")
    protected int municipalityID;
    @XmlElement(name = "Name", required = true, nillable = true)
    protected String name;
    @XmlElement(name = "PaymentModalities", required = true, nillable = true)
    protected ArrayOfPaymentModality paymentModalities;
    @XmlElement(name = "PortalID")
    protected int portalID;
    @XmlElement(name = "Stations", required = true, nillable = true)
    protected ArrayOfStation stations;
    @XmlElement(name = "Subscriptions", required = true, nillable = true)
    protected ArrayOfSubscriptions subscriptions;

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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
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
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the paymentModalities property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPaymentModality }
     *     
     */
    public ArrayOfPaymentModality getPaymentModalities() {
        return paymentModalities;
    }

    /**
     * Sets the value of the paymentModalities property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPaymentModality }
     *     
     */
    public void setPaymentModalities(ArrayOfPaymentModality value) {
        this.paymentModalities = value;
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
     * Gets the value of the stations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStation }
     *     
     */
    public ArrayOfStation getStations() {
        return stations;
    }

    /**
     * Sets the value of the stations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStation }
     *     
     */
    public void setStations(ArrayOfStation value) {
        this.stations = value;
    }

    /**
     * Gets the value of the subscriptions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSubscriptions }
     *     
     */
    public ArrayOfSubscriptions getSubscriptions() {
        return subscriptions;
    }

    /**
     * Sets the value of the subscriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSubscriptions }
     *     
     */
    public void setSubscriptions(ArrayOfSubscriptions value) {
        this.subscriptions = value;
    }

}
