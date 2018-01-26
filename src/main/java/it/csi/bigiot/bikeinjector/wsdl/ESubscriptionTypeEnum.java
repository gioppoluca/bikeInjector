
package it.csi.bigiot.bikeinjector.wsdl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eSubscriptionTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="eSubscriptionTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Municipal"/>
 *     &lt;enumeration value="Aggregation"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "eSubscriptionTypeEnum")
@XmlEnum
public enum ESubscriptionTypeEnum {

    @XmlEnumValue("Municipal")
    MUNICIPAL("Municipal"),
    @XmlEnumValue("Aggregation")
    AGGREGATION("Aggregation");
    private final String value;

    ESubscriptionTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ESubscriptionTypeEnum fromValue(String v) {
        for (ESubscriptionTypeEnum c: ESubscriptionTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
