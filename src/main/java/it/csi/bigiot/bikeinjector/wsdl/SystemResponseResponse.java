
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
 *         &lt;element name="SystemResponseResult" type="{http://servicev2.tobike.it}SystemResponse" minOccurs="0"/>
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
    "systemResponseResult"
})
@XmlRootElement(name = "SystemResponseResponse")
public class SystemResponseResponse {

    @XmlElement(name = "SystemResponseResult")
    protected SystemResponse systemResponseResult;

    /**
     * Gets the value of the systemResponseResult property.
     * 
     * @return
     *     possible object is
     *     {@link SystemResponse }
     *     
     */
    public SystemResponse getSystemResponseResult() {
        return systemResponseResult;
    }

    /**
     * Sets the value of the systemResponseResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemResponse }
     *     
     */
    public void setSystemResponseResult(SystemResponse value) {
        this.systemResponseResult = value;
    }

}
