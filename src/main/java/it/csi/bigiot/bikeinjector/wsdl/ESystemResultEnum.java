
package it.csi.bigiot.bikeinjector.wsdl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eSystemResultEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="eSystemResultEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="Fail"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "eSystemResultEnum")
@XmlEnum
public enum ESystemResultEnum {

    @XmlEnumValue("None")
    NONE("None"),
    OK("OK"),
    @XmlEnumValue("Fail")
    FAIL("Fail");
    private final String value;

    ESystemResultEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ESystemResultEnum fromValue(String v) {
        for (ESystemResultEnum c: ESystemResultEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
