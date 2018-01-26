
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
 *         &lt;element name="lInfoResponse" type="{http://servicev2.tobike.it}InfoResponse" minOccurs="0"/>
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
    "lInfoResponse"
})
@XmlRootElement(name = "InfoResponse")
public class InfoResponse2 {

    protected InfoResponse lInfoResponse;

    /**
     * Gets the value of the lInfoResponse property.
     * 
     * @return
     *     possible object is
     *     {@link InfoResponse }
     *     
     */
    public InfoResponse getLInfoResponse() {
        return lInfoResponse;
    }

    /**
     * Sets the value of the lInfoResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoResponse }
     *     
     */
    public void setLInfoResponse(InfoResponse value) {
        this.lInfoResponse = value;
    }

}
