
package it.csi.bigiot.bikeinjector.wsdl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eLoginResultEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="eLoginResultEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="Fail"/>
 *     &lt;enumeration value="UserNotEnabled"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "eLoginResultEnum")
@XmlEnum
public enum ELoginResultEnum {

    @XmlEnumValue("None")
    NONE("None"),
    OK("OK"),
    @XmlEnumValue("Fail")
    FAIL("Fail"),
    @XmlEnumValue("UserNotEnabled")
    USER_NOT_ENABLED("UserNotEnabled");
    private final String value;

    ELoginResultEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ELoginResultEnum fromValue(String v) {
        for (ELoginResultEnum c: ELoginResultEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
