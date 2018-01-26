
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
 *         &lt;element name="iReq" type="{http://servicev2.tobike.it}InfoRequest" minOccurs="0"/>
 *         &lt;element name="MunicipalityID" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "iReq",
    "municipalityID"
})
@XmlRootElement(name = "GetCustomerMunicipalityInfo")
public class GetCustomerMunicipalityInfo {

    protected InfoRequest iReq;
    @XmlElement(name = "MunicipalityID")
    protected int municipalityID;

    /**
     * Gets the value of the iReq property.
     * 
     * @return
     *     possible object is
     *     {@link InfoRequest }
     *     
     */
    public InfoRequest getIReq() {
        return iReq;
    }

    /**
     * Sets the value of the iReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoRequest }
     *     
     */
    public void setIReq(InfoRequest value) {
        this.iReq = value;
    }

    /**
     * Gets the value of the municipalityID property.
     * 
     */
    public int getMunicipalityID() {
        return municipalityID;
    }

    /**
     * Sets the value of the municipalityID property.
     * 
     */
    public void setMunicipalityID(int value) {
        this.municipalityID = value;
    }

}
