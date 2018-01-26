
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
 *         &lt;element name="SystemRequestResult" type="{http://servicev2.tobike.it}SystemRequest" minOccurs="0"/>
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
    "systemRequestResult"
})
@XmlRootElement(name = "SystemRequestResponse")
public class SystemRequestResponse {

    @XmlElement(name = "SystemRequestResult")
    protected SystemRequest2 systemRequestResult;

    /**
     * Gets the value of the systemRequestResult property.
     * 
     * @return
     *     possible object is
     *     {@link SystemRequest2 }
     *     
     */
    public SystemRequest2 getSystemRequestResult() {
        return systemRequestResult;
    }

    /**
     * Sets the value of the systemRequestResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemRequest2 }
     *     
     */
    public void setSystemRequestResult(SystemRequest2 value) {
        this.systemRequestResult = value;
    }

}
