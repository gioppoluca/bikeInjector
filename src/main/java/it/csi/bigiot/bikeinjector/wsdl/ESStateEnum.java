
package it.csi.bigiot.bikeinjector.wsdl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eSStateEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="eSStateEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Working"/>
 *     &lt;enumeration value="Maintenance"/>
 *     &lt;enumeration value="OutOfService"/>
 *     &lt;enumeration value="Installation"/>
 *     &lt;enumeration value="Definition"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "eSStateEnum")
@XmlEnum
public enum ESStateEnum {

    @XmlEnumValue("Working")
    WORKING("Working"),
    @XmlEnumValue("Maintenance")
    MAINTENANCE("Maintenance"),
    @XmlEnumValue("OutOfService")
    OUT_OF_SERVICE("OutOfService"),
    @XmlEnumValue("Installation")
    INSTALLATION("Installation"),
    @XmlEnumValue("Definition")
    DEFINITION("Definition");
    private final String value;

    ESStateEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ESStateEnum fromValue(String v) {
        for (ESStateEnum c: ESStateEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
