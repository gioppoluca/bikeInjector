
package it.csi.bigiot.bikeinjector.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Station complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Station">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Columns" type="{http://servicev2.tobike.it}ArrayOfColumn"/>
 *         &lt;element name="Latitude" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Longitude" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="State" type="{http://servicev2.tobike.it}eSStateEnum"/>
 *         &lt;element name="StationID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Station", propOrder = {
    "address",
    "columns",
    "latitude",
    "longitude",
    "name",
    "state",
    "stationID"
})
public class Station {

    @XmlElement(name = "Address", required = true, nillable = true)
    protected String address;
    @XmlElement(name = "Columns", required = true, nillable = true)
    protected ArrayOfColumn columns;
    @XmlElement(name = "Latitude", required = true, nillable = true)
    protected String latitude;
    @XmlElement(name = "Longitude", required = true, nillable = true)
    protected String longitude;
    @XmlElement(name = "Name", required = true, nillable = true)
    protected String name;
    @XmlElement(name = "State", required = true)
    @XmlSchemaType(name = "string")
    protected ESStateEnum state;
    @XmlElement(name = "StationID")
    protected int stationID;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the columns property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfColumn }
     *     
     */
    public ArrayOfColumn getColumns() {
        return columns;
    }

    /**
     * Sets the value of the columns property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfColumn }
     *     
     */
    public void setColumns(ArrayOfColumn value) {
        this.columns = value;
    }

    /**
     * Gets the value of the latitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatitude(String value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongitude(String value) {
        this.longitude = value;
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
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link ESStateEnum }
     *     
     */
    public ESStateEnum getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link ESStateEnum }
     *     
     */
    public void setState(ESStateEnum value) {
        this.state = value;
    }

    /**
     * Gets the value of the stationID property.
     * 
     */
    public int getStationID() {
        return stationID;
    }

    /**
     * Sets the value of the stationID property.
     * 
     */
    public void setStationID(int value) {
        this.stationID = value;
    }

}
