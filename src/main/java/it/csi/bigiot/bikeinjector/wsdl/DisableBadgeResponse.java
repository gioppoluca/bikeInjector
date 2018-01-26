
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
 *         &lt;element name="DisableBadgeResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "disableBadgeResult"
})
@XmlRootElement(name = "DisableBadgeResponse")
public class DisableBadgeResponse {

    @XmlElement(name = "DisableBadgeResult")
    protected boolean disableBadgeResult;

    /**
     * Gets the value of the disableBadgeResult property.
     * 
     */
    public boolean isDisableBadgeResult() {
        return disableBadgeResult;
    }

    /**
     * Sets the value of the disableBadgeResult property.
     * 
     */
    public void setDisableBadgeResult(boolean value) {
        this.disableBadgeResult = value;
    }

}
