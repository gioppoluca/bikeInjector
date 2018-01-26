
package it.csi.bigiot.bikeinjector.wsdl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ePaymentResultEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ePaymentResultEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="Fail"/>
 *     &lt;enumeration value="DataMissing"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ePaymentResultEnum")
@XmlEnum
public enum EPaymentResultEnum {

    OK("OK"),
    @XmlEnumValue("Fail")
    FAIL("Fail"),
    @XmlEnumValue("DataMissing")
    DATA_MISSING("DataMissing");
    private final String value;

    EPaymentResultEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EPaymentResultEnum fromValue(String v) {
        for (EPaymentResultEnum c: EPaymentResultEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
