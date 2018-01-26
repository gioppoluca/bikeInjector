
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
 *         &lt;element name="lReseller" type="{http://servicev2.tobike.it}Reseller" minOccurs="0"/>
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
    "lReseller"
})
@XmlRootElement(name = "Reseller")
public class Reseller {

    protected Reseller2 lReseller;

    /**
     * Gets the value of the lReseller property.
     * 
     * @return
     *     possible object is
     *     {@link Reseller2 }
     *     
     */
    public Reseller2 getLReseller() {
        return lReseller;
    }

    /**
     * Sets the value of the lReseller property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reseller2 }
     *     
     */
    public void setLReseller(Reseller2 value) {
        this.lReseller = value;
    }

}
