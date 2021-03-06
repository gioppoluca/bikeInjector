
package it.csi.bigiot.bikeinjector.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMunicipality complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMunicipality">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Municipality" type="{http://servicev2.tobike.it}Municipality" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMunicipality", propOrder = {
    "municipality"
})
public class ArrayOfMunicipality {

    @XmlElement(name = "Municipality", nillable = true)
    protected List<Municipality> municipality;

    /**
     * Gets the value of the municipality property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the municipality property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMunicipality().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Municipality }
     * 
     * 
     */
    public List<Municipality> getMunicipality() {
        if (municipality == null) {
            municipality = new ArrayList<Municipality>();
        }
        return this.municipality;
    }

}
