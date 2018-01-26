
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
 *         &lt;element name="InfoRequestResult" type="{http://servicev2.tobike.it}InfoRequest" minOccurs="0"/>
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
    "infoRequestResult"
})
@XmlRootElement(name = "InfoRequestResponse")
public class InfoRequestResponse {

    @XmlElement(name = "InfoRequestResult")
    protected InfoRequest infoRequestResult;

    /**
     * Gets the value of the infoRequestResult property.
     * 
     * @return
     *     possible object is
     *     {@link InfoRequest }
     *     
     */
    public InfoRequest getInfoRequestResult() {
        return infoRequestResult;
    }

    /**
     * Sets the value of the infoRequestResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoRequest }
     *     
     */
    public void setInfoRequestResult(InfoRequest value) {
        this.infoRequestResult = value;
    }

}
