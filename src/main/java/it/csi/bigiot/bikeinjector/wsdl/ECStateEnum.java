
package it.csi.bigiot.bikeinjector.wsdl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eCStateEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="eCStateEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Empty"/>
 *     &lt;enumeration value="ErrorH"/>
 *     &lt;enumeration value="ErrorL"/>
 *     &lt;enumeration value="Full"/>
 *     &lt;enumeration value="NotActive"/>
 *     &lt;enumeration value="NotExists"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "eCStateEnum")
@XmlEnum
public enum ECStateEnum {

    @XmlEnumValue("Empty")
    EMPTY("Empty"),
    @XmlEnumValue("ErrorH")
    ERROR_H("ErrorH"),
    @XmlEnumValue("ErrorL")
    ERROR_L("ErrorL"),
    @XmlEnumValue("Full")
    FULL("Full"),
    @XmlEnumValue("NotActive")
    NOT_ACTIVE("NotActive"),
    @XmlEnumValue("NotExists")
    NOT_EXISTS("NotExists");
    private final String value;

    ECStateEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ECStateEnum fromValue(String v) {
        for (ECStateEnum c: ECStateEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
