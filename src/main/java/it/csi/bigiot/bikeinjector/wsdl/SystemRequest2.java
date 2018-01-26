
package it.csi.bigiot.bikeinjector.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SystemRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SystemRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Municipalities" type="{http://servicev2.tobike.it}ArrayOfMunicipality"/>
 *         &lt;element name="MunicipalityID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="lRes" type="{http://servicev2.tobike.it}LoginResponse"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemRequest", propOrder = {
    "message",
    "municipalities",
    "municipalityID",
    "lRes"
})
public class SystemRequest2 {

    @XmlElement(name = "Message", required = true, nillable = true)
    protected String message;
    @XmlElement(name = "Municipalities", required = true, nillable = true)
    protected ArrayOfMunicipality municipalities;
    @XmlElement(name = "MunicipalityID")
    protected int municipalityID;
    @XmlElement(required = true, nillable = true)
    protected LoginResponse lRes;

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the municipalities property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMunicipality }
     *     
     */
    public ArrayOfMunicipality getMunicipalities() {
        return municipalities;
    }

    /**
     * Sets the value of the municipalities property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMunicipality }
     *     
     */
    public void setMunicipalities(ArrayOfMunicipality value) {
        this.municipalities = value;
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

    /**
     * Gets the value of the lRes property.
     * 
     * @return
     *     possible object is
     *     {@link LoginResponse }
     *     
     */
    public LoginResponse getLRes() {
        return lRes;
    }

    /**
     * Sets the value of the lRes property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoginResponse }
     *     
     */
    public void setLRes(LoginResponse value) {
        this.lRes = value;
    }

}
