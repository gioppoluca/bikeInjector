
package it.csi.bigiot.bikeinjector.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Trip complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Trip">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BikeNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Cost" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="EndTrip" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="FromColumn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FromMunicipality" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FromMunicipalityID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FromStation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FromStationID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StartTrip" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ToColumn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ToMunicipality" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ToMunicipalityID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ToStation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ToStationID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Trip", propOrder = {
    "bikeNumber",
    "cost",
    "endTrip",
    "fromColumn",
    "fromMunicipality",
    "fromMunicipalityID",
    "fromStation",
    "fromStationID",
    "message",
    "startTrip",
    "toColumn",
    "toMunicipality",
    "toMunicipalityID",
    "toStation",
    "toStationID"
})
public class Trip2 {

    @XmlElement(name = "BikeNumber")
    protected int bikeNumber;
    @XmlElement(name = "Cost")
    protected double cost;
    @XmlElement(name = "EndTrip", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endTrip;
    @XmlElement(name = "FromColumn")
    protected int fromColumn;
    @XmlElement(name = "FromMunicipality", required = true, nillable = true)
    protected String fromMunicipality;
    @XmlElement(name = "FromMunicipalityID")
    protected int fromMunicipalityID;
    @XmlElement(name = "FromStation", required = true, nillable = true)
    protected String fromStation;
    @XmlElement(name = "FromStationID")
    protected int fromStationID;
    @XmlElement(name = "Message", required = true, nillable = true)
    protected String message;
    @XmlElement(name = "StartTrip", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTrip;
    @XmlElement(name = "ToColumn")
    protected int toColumn;
    @XmlElement(name = "ToMunicipality", required = true, nillable = true)
    protected String toMunicipality;
    @XmlElement(name = "ToMunicipalityID")
    protected int toMunicipalityID;
    @XmlElement(name = "ToStation", required = true, nillable = true)
    protected String toStation;
    @XmlElement(name = "ToStationID")
    protected int toStationID;

    /**
     * Gets the value of the bikeNumber property.
     * 
     */
    public int getBikeNumber() {
        return bikeNumber;
    }

    /**
     * Sets the value of the bikeNumber property.
     * 
     */
    public void setBikeNumber(int value) {
        this.bikeNumber = value;
    }

    /**
     * Gets the value of the cost property.
     * 
     */
    public double getCost() {
        return cost;
    }

    /**
     * Sets the value of the cost property.
     * 
     */
    public void setCost(double value) {
        this.cost = value;
    }

    /**
     * Gets the value of the endTrip property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndTrip() {
        return endTrip;
    }

    /**
     * Sets the value of the endTrip property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndTrip(XMLGregorianCalendar value) {
        this.endTrip = value;
    }

    /**
     * Gets the value of the fromColumn property.
     * 
     */
    public int getFromColumn() {
        return fromColumn;
    }

    /**
     * Sets the value of the fromColumn property.
     * 
     */
    public void setFromColumn(int value) {
        this.fromColumn = value;
    }

    /**
     * Gets the value of the fromMunicipality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromMunicipality() {
        return fromMunicipality;
    }

    /**
     * Sets the value of the fromMunicipality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromMunicipality(String value) {
        this.fromMunicipality = value;
    }

    /**
     * Gets the value of the fromMunicipalityID property.
     * 
     */
    public int getFromMunicipalityID() {
        return fromMunicipalityID;
    }

    /**
     * Sets the value of the fromMunicipalityID property.
     * 
     */
    public void setFromMunicipalityID(int value) {
        this.fromMunicipalityID = value;
    }

    /**
     * Gets the value of the fromStation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromStation() {
        return fromStation;
    }

    /**
     * Sets the value of the fromStation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromStation(String value) {
        this.fromStation = value;
    }

    /**
     * Gets the value of the fromStationID property.
     * 
     */
    public int getFromStationID() {
        return fromStationID;
    }

    /**
     * Sets the value of the fromStationID property.
     * 
     */
    public void setFromStationID(int value) {
        this.fromStationID = value;
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
     * Gets the value of the startTrip property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTrip() {
        return startTrip;
    }

    /**
     * Sets the value of the startTrip property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTrip(XMLGregorianCalendar value) {
        this.startTrip = value;
    }

    /**
     * Gets the value of the toColumn property.
     * 
     */
    public int getToColumn() {
        return toColumn;
    }

    /**
     * Sets the value of the toColumn property.
     * 
     */
    public void setToColumn(int value) {
        this.toColumn = value;
    }

    /**
     * Gets the value of the toMunicipality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToMunicipality() {
        return toMunicipality;
    }

    /**
     * Sets the value of the toMunicipality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToMunicipality(String value) {
        this.toMunicipality = value;
    }

    /**
     * Gets the value of the toMunicipalityID property.
     * 
     */
    public int getToMunicipalityID() {
        return toMunicipalityID;
    }

    /**
     * Sets the value of the toMunicipalityID property.
     * 
     */
    public void setToMunicipalityID(int value) {
        this.toMunicipalityID = value;
    }

    /**
     * Gets the value of the toStation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToStation() {
        return toStation;
    }

    /**
     * Sets the value of the toStation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToStation(String value) {
        this.toStation = value;
    }

    /**
     * Gets the value of the toStationID property.
     * 
     */
    public int getToStationID() {
        return toStationID;
    }

    /**
     * Sets the value of the toStationID property.
     * 
     */
    public void setToStationID(int value) {
        this.toStationID = value;
    }

}
