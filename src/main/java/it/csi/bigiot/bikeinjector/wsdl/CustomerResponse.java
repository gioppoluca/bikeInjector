
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
 *         &lt;element name="CustomerResult" type="{http://toBike/v1/toBike}Customer" minOccurs="0"/>
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
    "customerResult"
})
@XmlRootElement(name = "CustomerResponse")
public class CustomerResponse {

    @XmlElement(name = "CustomerResult")
    protected Customer2 customerResult;

    /**
     * Gets the value of the customerResult property.
     * 
     * @return
     *     possible object is
     *     {@link Customer2 }
     *     
     */
    public Customer2 getCustomerResult() {
        return customerResult;
    }

    /**
     * Sets the value of the customerResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Customer2 }
     *     
     */
    public void setCustomerResult(Customer2 value) {
        this.customerResult = value;
    }

}
