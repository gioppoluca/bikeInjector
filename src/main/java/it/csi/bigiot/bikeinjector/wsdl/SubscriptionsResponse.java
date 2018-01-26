
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
 *         &lt;element name="SubscriptionsResult" type="{http://servicev2.tobike.it}Subscriptions" minOccurs="0"/>
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
    "subscriptionsResult"
})
@XmlRootElement(name = "SubscriptionsResponse")
public class SubscriptionsResponse {

    @XmlElement(name = "SubscriptionsResult")
    protected Subscriptions2 subscriptionsResult;

    /**
     * Gets the value of the subscriptionsResult property.
     * 
     * @return
     *     possible object is
     *     {@link Subscriptions2 }
     *     
     */
    public Subscriptions2 getSubscriptionsResult() {
        return subscriptionsResult;
    }

    /**
     * Sets the value of the subscriptionsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Subscriptions2 }
     *     
     */
    public void setSubscriptionsResult(Subscriptions2 value) {
        this.subscriptionsResult = value;
    }

}
