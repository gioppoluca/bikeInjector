
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
 *         &lt;element name="EnableBadgeResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "enableBadgeResult"
})
@XmlRootElement(name = "EnableBadgeResponse")
public class EnableBadgeResponse {

    @XmlElement(name = "EnableBadgeResult")
    protected boolean enableBadgeResult;

    /**
     * Gets the value of the enableBadgeResult property.
     * 
     */
    public boolean isEnableBadgeResult() {
        return enableBadgeResult;
    }

    /**
     * Sets the value of the enableBadgeResult property.
     * 
     */
    public void setEnableBadgeResult(boolean value) {
        this.enableBadgeResult = value;
    }

}
