
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
 *         &lt;element name="SetCustomerInfoResult" type="{http://servicev2.tobike.it}SetInfoResponse" minOccurs="0"/>
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
    "setCustomerInfoResult"
})
@XmlRootElement(name = "SetCustomerInfoResponse")
public class SetCustomerInfoResponse {

    @XmlElement(name = "SetCustomerInfoResult")
    protected SetInfoResponse2 setCustomerInfoResult;

    /**
     * Gets the value of the setCustomerInfoResult property.
     * 
     * @return
     *     possible object is
     *     {@link SetInfoResponse2 }
     *     
     */
    public SetInfoResponse2 getSetCustomerInfoResult() {
        return setCustomerInfoResult;
    }

    /**
     * Sets the value of the setCustomerInfoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetInfoResponse2 }
     *     
     */
    public void setSetCustomerInfoResult(SetInfoResponse2 value) {
        this.setCustomerInfoResult = value;
    }

}
