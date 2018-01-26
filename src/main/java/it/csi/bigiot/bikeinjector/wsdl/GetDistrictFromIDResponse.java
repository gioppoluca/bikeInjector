
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
 *         &lt;element name="GetDistrictFromIDResult" type="{http://servicev2.tobike.it}District" minOccurs="0"/>
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
    "getDistrictFromIDResult"
})
@XmlRootElement(name = "GetDistrictFromIDResponse")
public class GetDistrictFromIDResponse {

    @XmlElement(name = "GetDistrictFromIDResult")
    protected District getDistrictFromIDResult;

    /**
     * Gets the value of the getDistrictFromIDResult property.
     * 
     * @return
     *     possible object is
     *     {@link District }
     *     
     */
    public District getGetDistrictFromIDResult() {
        return getDistrictFromIDResult;
    }

    /**
     * Sets the value of the getDistrictFromIDResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link District }
     *     
     */
    public void setGetDistrictFromIDResult(District value) {
        this.getDistrictFromIDResult = value;
    }

}
