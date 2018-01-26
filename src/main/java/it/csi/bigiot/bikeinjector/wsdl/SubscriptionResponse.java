
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
 *         &lt;element name="SubscriptionResult" type="{http://servicev2.tobike.it}Subscription" minOccurs="0"/>
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
    "subscriptionResult"
})
@XmlRootElement(name = "SubscriptionResponse")
public class SubscriptionResponse {

    @XmlElement(name = "SubscriptionResult")
    protected Subscription subscriptionResult;

    /**
     * Gets the value of the subscriptionResult property.
     * 
     * @return
     *     possible object is
     *     {@link Subscription }
     *     
     */
    public Subscription getSubscriptionResult() {
        return subscriptionResult;
    }

    /**
     * Sets the value of the subscriptionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Subscription }
     *     
     */
    public void setSubscriptionResult(Subscription value) {
        this.subscriptionResult = value;
    }

}
