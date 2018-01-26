
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
 *         &lt;element name="iRes" type="{http://servicev2.tobike.it}InfoResponse" minOccurs="0"/>
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
    "iRes"
})
@XmlRootElement(name = "SetCustomerInfo")
public class SetCustomerInfo {

    protected InfoResponse iRes;

    /**
     * Gets the value of the iRes property.
     * 
     * @return
     *     possible object is
     *     {@link InfoResponse }
     *     
     */
    public InfoResponse getIRes() {
        return iRes;
    }

    /**
     * Sets the value of the iRes property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoResponse }
     *     
     */
    public void setIRes(InfoResponse value) {
        this.iRes = value;
    }

}
