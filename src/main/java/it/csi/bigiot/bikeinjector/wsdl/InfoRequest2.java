
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
 *         &lt;element name="lInfoRequest" type="{http://servicev2.tobike.it}InfoRequest" minOccurs="0"/>
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
    "lInfoRequest"
})
@XmlRootElement(name = "InfoRequest")
public class InfoRequest2 {

    protected InfoRequest lInfoRequest;

    /**
     * Gets the value of the lInfoRequest property.
     * 
     * @return
     *     possible object is
     *     {@link InfoRequest }
     *     
     */
    public InfoRequest getLInfoRequest() {
        return lInfoRequest;
    }

    /**
     * Sets the value of the lInfoRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoRequest }
     *     
     */
    public void setLInfoRequest(InfoRequest value) {
        this.lInfoRequest = value;
    }

}
