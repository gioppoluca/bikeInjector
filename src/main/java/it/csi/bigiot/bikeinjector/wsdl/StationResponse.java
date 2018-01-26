
package it.csi.bigiot.bikeinjector.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StationResult" type="{http://servicev2.tobike.it}Station" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "stationResult"
})
@XmlRootElement(name = "StationResponse")
public class StationResponse {

    @XmlElement(name = "StationResult")
    protected Station stationResult;

    /**
     * Gets the value of the stationResult property.
     * 
     * @return
     *     possible object is
     *     {@link Station }
     *     
     */
    public Station getStationResult() {
        return stationResult;
    }

    /**
     * Sets the value of the stationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Station }
     *     
     */
    public void setStationResult(Station value) {
        this.stationResult = value;
    }

}
