
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
 *         &lt;element name="MunicipalityResult" type="{http://servicev2.tobike.it}Municipality" minOccurs="0"/>
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
    "municipalityResult"
})
@XmlRootElement(name = "MunicipalityResponse")
public class MunicipalityResponse {

    @XmlElement(name = "MunicipalityResult")
    protected Municipality municipalityResult;

    /**
     * Gets the value of the municipalityResult property.
     * 
     * @return
     *     possible object is
     *     {@link Municipality }
     *     
     */
    public Municipality getMunicipalityResult() {
        return municipalityResult;
    }

    /**
     * Sets the value of the municipalityResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Municipality }
     *     
     */
    public void setMunicipalityResult(Municipality value) {
        this.municipalityResult = value;
    }

}
