
package it.csi.bigiot.bikeinjector.wsdl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eSubscriptionResultEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="eSubscriptionResultEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="Fail"/>
 *     &lt;enumeration value="DataMissing"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "eSubscriptionResultEnum")
@XmlEnum
public enum ESubscriptionResultEnum {

    OK("OK"),
    @XmlEnumValue("Fail")
    FAIL("Fail"),
    @XmlEnumValue("DataMissing")
    DATA_MISSING("DataMissing");
    private final String value;

    ESubscriptionResultEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ESubscriptionResultEnum fromValue(String v) {
        for (ESubscriptionResultEnum c: ESubscriptionResultEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
