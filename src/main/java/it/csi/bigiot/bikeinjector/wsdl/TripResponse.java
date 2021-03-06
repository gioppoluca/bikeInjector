
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
 *         &lt;element name="TripResult" type="{http://servicev2.tobike.it}Trip" minOccurs="0"/>
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
    "tripResult"
})
@XmlRootElement(name = "TripResponse")
public class TripResponse {

    @XmlElement(name = "TripResult")
    protected Trip2 tripResult;

    /**
     * Gets the value of the tripResult property.
     * 
     * @return
     *     possible object is
     *     {@link Trip2 }
     *     
     */
    public Trip2 getTripResult() {
        return tripResult;
    }

    /**
     * Sets the value of the tripResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Trip2 }
     *     
     */
    public void setTripResult(Trip2 value) {
        this.tripResult = value;
    }

}
