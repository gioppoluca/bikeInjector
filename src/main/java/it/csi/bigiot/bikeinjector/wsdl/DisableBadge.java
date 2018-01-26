
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
 *         &lt;element name="lRes" type="{http://servicev2.tobike.it}LoginResponse" minOccurs="0"/>
 *         &lt;element name="Badge" type="{http://servicev2.tobike.it}Badge" minOccurs="0"/>
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
    "lRes",
    "badge"
})
@XmlRootElement(name = "DisableBadge")
public class DisableBadge {

    protected LoginResponse lRes;
    @XmlElement(name = "Badge")
    protected Badge2 badge;

    /**
     * Gets the value of the lRes property.
     * 
     * @return
     *     possible object is
     *     {@link LoginResponse }
     *     
     */
    public LoginResponse getLRes() {
        return lRes;
    }

    /**
     * Sets the value of the lRes property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoginResponse }
     *     
     */
    public void setLRes(LoginResponse value) {
        this.lRes = value;
    }

    /**
     * Gets the value of the badge property.
     * 
     * @return
     *     possible object is
     *     {@link Badge2 }
     *     
     */
    public Badge2 getBadge() {
        return badge;
    }

    /**
     * Sets the value of the badge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Badge2 }
     *     
     */
    public void setBadge(Badge2 value) {
        this.badge = value;
    }

}
