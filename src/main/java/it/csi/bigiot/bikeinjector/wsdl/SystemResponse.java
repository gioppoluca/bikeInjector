
package it.csi.bigiot.bikeinjector.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SystemResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SystemResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Municipality" type="{http://servicev2.tobike.it}Municipality"/>
 *         &lt;element name="Resellers" type="{http://servicev2.tobike.it}ArrayOfReseller"/>
 *         &lt;element name="Result" type="{http://servicev2.tobike.it}eSystemResultEnum"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemResponse", propOrder = {
    "message",
    "municipality",
    "resellers",
    "result"
})
public class SystemResponse {

    @XmlElement(name = "Message", required = true, nillable = true)
    protected String message;
    @XmlElement(name = "Municipality", required = true, nillable = true)
    protected Municipality municipality;
    @XmlElement(name = "Resellers", required = true, nillable = true)
    protected ArrayOfReseller resellers;
    @XmlElement(name = "Result", required = true)
    @XmlSchemaType(name = "string")
    protected ESystemResultEnum result;

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
     * Gets the value of the municipality property.
     * 
     * @return
     *     possible object is
     *     {@link Municipality }
     *     
     */
    public Municipality getMunicipality() {
        return municipality;
    }

    /**
     * Sets the value of the municipality property.
     * 
     * @param value
     *     allowed object is
     *     {@link Municipality }
     *     
     */
    public void setMunicipality(Municipality value) {
        this.municipality = value;
    }

    /**
     * Gets the value of the resellers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfReseller }
     *     
     */
    public ArrayOfReseller getResellers() {
        return resellers;
    }

    /**
     * Sets the value of the resellers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfReseller }
     *     
     */
    public void setResellers(ArrayOfReseller value) {
        this.resellers = value;
    }

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link ESystemResultEnum }
     *     
     */
    public ESystemResultEnum getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ESystemResultEnum }
     *     
     */
    public void setResult(ESystemResultEnum value) {
        this.result = value;
    }

}
