
package it.csi.bigiot.bikeinjector.wsdl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eSetInfoResultEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="eSetInfoResultEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="Fail"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "eSetInfoResultEnum")
@XmlEnum
public enum ESetInfoResultEnum {

    OK("OK"),
    @XmlEnumValue("Fail")
    FAIL("Fail");
    private final String value;

    ESetInfoResultEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ESetInfoResultEnum fromValue(String v) {
        for (ESetInfoResultEnum c: ESetInfoResultEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
