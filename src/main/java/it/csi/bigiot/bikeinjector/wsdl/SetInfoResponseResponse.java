
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
 *         &lt;element name="SetInfoResponseResult" type="{http://servicev2.tobike.it}SetInfoResponse" minOccurs="0"/>
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
    "setInfoResponseResult"
})
@XmlRootElement(name = "SetInfoResponseResponse")
public class SetInfoResponseResponse {

    @XmlElement(name = "SetInfoResponseResult")
    protected SetInfoResponse2 setInfoResponseResult;

    /**
     * Gets the value of the setInfoResponseResult property.
     * 
     * @return
     *     possible object is
     *     {@link SetInfoResponse2 }
     *     
     */
    public SetInfoResponse2 getSetInfoResponseResult() {
        return setInfoResponseResult;
    }

    /**
     * Sets the value of the setInfoResponseResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetInfoResponse2 }
     *     
     */
    public void setSetInfoResponseResult(SetInfoResponse2 value) {
        this.setInfoResponseResult = value;
    }

}
