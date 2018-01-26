
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
 *         &lt;element name="lPaymentModality" type="{http://servicev2.tobike.it}PaymentModality" minOccurs="0"/>
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
    "lPaymentModality"
})
@XmlRootElement(name = "PaymentModality")
public class PaymentModality2 {

    protected PaymentModality lPaymentModality;

    /**
     * Gets the value of the lPaymentModality property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentModality }
     *     
     */
    public PaymentModality getLPaymentModality() {
        return lPaymentModality;
    }

    /**
     * Sets the value of the lPaymentModality property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentModality }
     *     
     */
    public void setLPaymentModality(PaymentModality value) {
        this.lPaymentModality = value;
    }

}
