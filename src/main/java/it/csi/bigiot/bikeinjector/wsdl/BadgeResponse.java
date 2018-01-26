
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
 *         &lt;element name="BadgeResult" type="{http://servicev2.tobike.it}Badge" minOccurs="0"/>
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
    "badgeResult"
})
@XmlRootElement(name = "BadgeResponse")
public class BadgeResponse {

    @XmlElement(name = "BadgeResult")
    protected Badge2 badgeResult;

    /**
     * Gets the value of the badgeResult property.
     * 
     * @return
     *     possible object is
     *     {@link Badge2 }
     *     
     */
    public Badge2 getBadgeResult() {
        return badgeResult;
    }

    /**
     * Sets the value of the badgeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Badge2 }
     *     
     */
    public void setBadgeResult(Badge2 value) {
        this.badgeResult = value;
    }

}
