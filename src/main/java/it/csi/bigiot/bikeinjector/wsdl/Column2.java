
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
 *         &lt;element name="lColumn" type="{http://servicev2.tobike.it}Column" minOccurs="0"/>
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
    "lColumn"
})
@XmlRootElement(name = "Column")
public class Column2 {

    protected Column lColumn;

    /**
     * Gets the value of the lColumn property.
     * 
     * @return
     *     possible object is
     *     {@link Column }
     *     
     */
    public Column getLColumn() {
        return lColumn;
    }

    /**
     * Sets the value of the lColumn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Column }
     *     
     */
    public void setLColumn(Column value) {
        this.lColumn = value;
    }

}
