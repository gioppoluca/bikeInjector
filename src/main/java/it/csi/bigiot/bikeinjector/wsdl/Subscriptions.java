
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
 *         &lt;element name="lSubscriptions" type="{http://servicev2.tobike.it}Subscriptions" minOccurs="0"/>
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
    "lSubscriptions"
})
@XmlRootElement(name = "Subscriptions")
public class Subscriptions {

    protected Subscriptions2 lSubscriptions;

    /**
     * Gets the value of the lSubscriptions property.
     * 
     * @return
     *     possible object is
     *     {@link Subscriptions2 }
     *     
     */
    public Subscriptions2 getLSubscriptions() {
        return lSubscriptions;
    }

    /**
     * Sets the value of the lSubscriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Subscriptions2 }
     *     
     */
    public void setLSubscriptions(Subscriptions2 value) {
        this.lSubscriptions = value;
    }

}
