
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
 *         &lt;element name="PaymentResult" type="{http://servicev2.tobike.it}Payment" minOccurs="0"/>
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
    "paymentResult"
})
@XmlRootElement(name = "PaymentResponse")
public class PaymentResponse {

    @XmlElement(name = "PaymentResult")
    protected Payment2 paymentResult;

    /**
     * Gets the value of the paymentResult property.
     * 
     * @return
     *     possible object is
     *     {@link Payment2 }
     *     
     */
    public Payment2 getPaymentResult() {
        return paymentResult;
    }

    /**
     * Sets the value of the paymentResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Payment2 }
     *     
     */
    public void setPaymentResult(Payment2 value) {
        this.paymentResult = value;
    }

}
