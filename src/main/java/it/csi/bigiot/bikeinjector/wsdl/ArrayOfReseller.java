
package it.csi.bigiot.bikeinjector.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfReseller complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfReseller">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Reseller" type="{http://servicev2.tobike.it}Reseller" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfReseller", propOrder = {
    "reseller"
})
public class ArrayOfReseller {

    @XmlElement(name = "Reseller", nillable = true)
    protected List<Reseller2> reseller;

    /**
     * Gets the value of the reseller property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reseller property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReseller().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reseller2 }
     * 
     * 
     */
    public List<Reseller2> getReseller() {
        if (reseller == null) {
            reseller = new ArrayList<Reseller2>();
        }
        return this.reseller;
    }

}
