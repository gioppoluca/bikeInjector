
package it.csi.bigiot.bikeinjector.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="lTrip" type="{http://servicev2.tobike.it}Trip" minOccurs="0"/>
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
    "lTrip"
})
@XmlRootElement(name = "Trip")
public class Trip {

    protected Trip2 lTrip;

    /**
     * Gets the value of the lTrip property.
     * 
     * @return
     *     possible object is
     *     {@link Trip2 }
     *     
     */
    public Trip2 getLTrip() {
        return lTrip;
    }

    /**
     * Sets the value of the lTrip property.
     * 
     * @param value
     *     allowed object is
     *     {@link Trip2 }
     *     
     */
    public void setLTrip(Trip2 value) {
        this.lTrip = value;
    }

}
