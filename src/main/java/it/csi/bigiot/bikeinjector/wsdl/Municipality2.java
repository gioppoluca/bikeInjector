
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
 *         &lt;element name="lMunicipality" type="{http://servicev2.tobike.it}Municipality" minOccurs="0"/>
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
    "lMunicipality"
})
@XmlRootElement(name = "Municipality")
public class Municipality2 {

    protected Municipality lMunicipality;

    /**
     * Gets the value of the lMunicipality property.
     * 
     * @return
     *     possible object is
     *     {@link Municipality }
     *     
     */
    public Municipality getLMunicipality() {
        return lMunicipality;
    }

    /**
     * Sets the value of the lMunicipality property.
     * 
     * @param value
     *     allowed object is
     *     {@link Municipality }
     *     
     */
    public void setLMunicipality(Municipality value) {
        this.lMunicipality = value;
    }

}
