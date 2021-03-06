
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
 *         &lt;element name="GetCustomerInfoResult" type="{http://servicev2.tobike.it}InfoResponse" minOccurs="0"/>
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
    "getCustomerInfoResult"
})
@XmlRootElement(name = "GetCustomerInfoResponse")
public class GetCustomerInfoResponse {

    @XmlElement(name = "GetCustomerInfoResult")
    protected InfoResponse getCustomerInfoResult;

    /**
     * Gets the value of the getCustomerInfoResult property.
     * 
     * @return
     *     possible object is
     *     {@link InfoResponse }
     *     
     */
    public InfoResponse getGetCustomerInfoResult() {
        return getCustomerInfoResult;
    }

    /**
     * Sets the value of the getCustomerInfoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoResponse }
     *     
     */
    public void setGetCustomerInfoResult(InfoResponse value) {
        this.getCustomerInfoResult = value;
    }

}
