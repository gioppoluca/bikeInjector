
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
 *         &lt;element name="lDistrict" type="{http://servicev2.tobike.it}District" minOccurs="0"/>
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
    "lDistrict"
})
@XmlRootElement(name = "District")
public class District2 {

    protected District lDistrict;

    /**
     * Gets the value of the lDistrict property.
     * 
     * @return
     *     possible object is
     *     {@link District }
     *     
     */
    public District getLDistrict() {
        return lDistrict;
    }

    /**
     * Sets the value of the lDistrict property.
     * 
     * @param value
     *     allowed object is
     *     {@link District }
     *     
     */
    public void setLDistrict(District value) {
        this.lDistrict = value;
    }

}
