
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
 *         &lt;element name="GetDistrictFromInitialsResult" type="{http://servicev2.tobike.it}District" minOccurs="0"/>
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
    "getDistrictFromInitialsResult"
})
@XmlRootElement(name = "GetDistrictFromInitialsResponse")
public class GetDistrictFromInitialsResponse {

    @XmlElement(name = "GetDistrictFromInitialsResult")
    protected District getDistrictFromInitialsResult;

    /**
     * Gets the value of the getDistrictFromInitialsResult property.
     * 
     * @return
     *     possible object is
     *     {@link District }
     *     
     */
    public District getGetDistrictFromInitialsResult() {
        return getDistrictFromInitialsResult;
    }

    /**
     * Sets the value of the getDistrictFromInitialsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link District }
     *     
     */
    public void setGetDistrictFromInitialsResult(District value) {
        this.getDistrictFromInitialsResult = value;
    }

}
