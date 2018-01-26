
package it.csi.bigiot.bikeinjector.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Reseller complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Reseller">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MunicipalityID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PortalID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ResellerID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Reseller", propOrder = {
    "municipalityID",
    "name",
    "portalID",
    "resellerID"
})
public class Reseller2 {

    @XmlElement(name = "MunicipalityID")
    protected int municipalityID;
    @XmlElement(name = "Name", required = true, nillable = true)
    protected String name;
    @XmlElement(name = "PortalID")
    protected int portalID;
    @XmlElement(name = "ResellerID")
    protected int resellerID;

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

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the portalID property.
     * 
     */
    public int getPortalID() {
        return portalID;
    }

    /**
     * Sets the value of the portalID property.
     * 
     */
    public void setPortalID(int value) {
        this.portalID = value;
    }

    /**
     * Gets the value of the resellerID property.
     * 
     */
    public int getResellerID() {
        return resellerID;
    }

    /**
     * Sets the value of the resellerID property.
     * 
     */
    public void setResellerID(int value) {
        this.resellerID = value;
    }

}
