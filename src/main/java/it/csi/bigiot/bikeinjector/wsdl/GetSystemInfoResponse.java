
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
 *         &lt;element name="GetSystemInfoResult" type="{http://servicev2.tobike.it}SystemResponse" minOccurs="0"/>
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
    "getSystemInfoResult"
})
@XmlRootElement(name = "GetSystemInfoResponse")
public class GetSystemInfoResponse {

    @XmlElement(name = "GetSystemInfoResult")
    protected SystemResponse getSystemInfoResult;

    /**
     * Gets the value of the getSystemInfoResult property.
     * 
     * @return
     *     possible object is
     *     {@link SystemResponse }
     *     
     */
    public SystemResponse getGetSystemInfoResult() {
        return getSystemInfoResult;
    }

    /**
     * Sets the value of the getSystemInfoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemResponse }
     *     
     */
    public void setGetSystemInfoResult(SystemResponse value) {
        this.getSystemInfoResult = value;
    }

}
