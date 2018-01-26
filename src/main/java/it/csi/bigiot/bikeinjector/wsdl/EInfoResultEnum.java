
package it.csi.bigiot.bikeinjector.wsdl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eInfoResultEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="eInfoResultEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="Fail"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "eInfoResultEnum")
@XmlEnum
public enum EInfoResultEnum {

    @XmlEnumValue("None")
    NONE("None"),
    OK("OK"),
    @XmlEnumValue("Fail")
    FAIL("Fail");
    private final String value;

    EInfoResultEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EInfoResultEnum fromValue(String v) {
        for (EInfoResultEnum c: EInfoResultEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
