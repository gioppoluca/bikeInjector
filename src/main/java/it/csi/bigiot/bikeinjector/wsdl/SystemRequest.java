
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
 *         &lt;element name="lSystemRequest" type="{http://servicev2.tobike.it}SystemRequest" minOccurs="0"/>
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
    "lSystemRequest"
})
@XmlRootElement(name = "SystemRequest")
public class SystemRequest {

    protected SystemRequest2 lSystemRequest;

    /**
     * Gets the value of the lSystemRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SystemRequest2 }
     *     
     */
    public SystemRequest2 getLSystemRequest() {
        return lSystemRequest;
    }

    /**
     * Sets the value of the lSystemRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemRequest2 }
     *     
     */
    public void setLSystemRequest(SystemRequest2 value) {
        this.lSystemRequest = value;
    }

}
