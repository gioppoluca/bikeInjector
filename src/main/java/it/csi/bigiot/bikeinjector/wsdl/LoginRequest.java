
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
 *         &lt;element name="lReq" type="{http://servicev2.tobike.it}LoginRequest" minOccurs="0"/>
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
    "lReq"
})
@XmlRootElement(name = "LoginRequest")
public class LoginRequest {

    protected LoginRequest2 lReq;

    /**
     * Gets the value of the lReq property.
     * 
     * @return
     *     possible object is
     *     {@link LoginRequest2 }
     *     
     */
    public LoginRequest2 getLReq() {
        return lReq;
    }

    /**
     * Sets the value of the lReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoginRequest2 }
     *     
     */
    public void setLReq(LoginRequest2 value) {
        this.lReq = value;
    }

}
