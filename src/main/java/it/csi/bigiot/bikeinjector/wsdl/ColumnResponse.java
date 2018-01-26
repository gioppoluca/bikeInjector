
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
 *         &lt;element name="ColumnResult" type="{http://servicev2.tobike.it}Column" minOccurs="0"/>
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
    "columnResult"
})
@XmlRootElement(name = "ColumnResponse")
public class ColumnResponse {

    @XmlElement(name = "ColumnResult")
    protected Column columnResult;

    /**
     * Gets the value of the columnResult property.
     * 
     * @return
     *     possible object is
     *     {@link Column }
     *     
     */
    public Column getColumnResult() {
        return columnResult;
    }

    /**
     * Sets the value of the columnResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Column }
     *     
     */
    public void setColumnResult(Column value) {
        this.columnResult = value;
    }

}
