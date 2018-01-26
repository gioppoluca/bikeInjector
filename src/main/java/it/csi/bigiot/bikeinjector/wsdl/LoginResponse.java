
package it.csi.bigiot.bikeinjector.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoginResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoginResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Municipalities" type="{http://servicev2.tobike.it}ArrayOfMunicipality"/>
 *         &lt;element name="Result" type="{http://servicev2.tobike.it}eLoginResultEnum"/>
 *         &lt;element name="Token" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoginResponse", propOrder = {
    "message",
    "municipalities",
    "result",
    "token"
})
public class LoginResponse {

    @XmlElement(name = "Message", required = true, nillable = true)
    protected String message;
    @XmlElement(name = "Municipalities", required = true, nillable = true)
    protected ArrayOfMunicipality municipalities;
    @XmlElement(name = "Result", required = true)
    @XmlSchemaType(name = "string")
    protected ELoginResultEnum result;
    @XmlElement(name = "Token", required = true, nillable = true)
    protected String token;

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
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link ELoginResultEnum }
     *     
     */
    public ELoginResultEnum getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ELoginResultEnum }
     *     
     */
    public void setResult(ELoginResultEnum value) {
        this.result = value;
    }

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

}
