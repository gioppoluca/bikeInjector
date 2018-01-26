
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
 *         &lt;element name="iReq" type="{http://servicev2.tobike.it}SystemRequest" minOccurs="0"/>
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
    "iReq"
})
@XmlRootElement(name = "GetSystemInfo")
public class GetSystemInfo {

    protected SystemRequest2 iReq;

    /**
     * Gets the value of the iReq property.
     * 
     * @return
     *     possible object is
     *     {@link SystemRequest2 }
     *     
     */
    public SystemRequest2 getIReq() {
        return iReq;
    }

    /**
     * Sets the value of the iReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemRequest2 }
     *     
     */
    public void setIReq(SystemRequest2 value) {
        this.iReq = value;
    }

}
