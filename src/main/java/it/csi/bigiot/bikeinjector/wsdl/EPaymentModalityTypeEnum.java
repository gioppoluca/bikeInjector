
package it.csi.bigiot.bikeinjector.wsdl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ePaymentModalityTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ePaymentModalityTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Municipal"/>
 *     &lt;enumeration value="Aggregation"/>
 *     &lt;enumeration value="MunicipalConvention"/>
 *     &lt;enumeration value="AggregationConvention"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ePaymentModalityTypeEnum")
@XmlEnum
public enum EPaymentModalityTypeEnum {

    @XmlEnumValue("Municipal")
    MUNICIPAL("Municipal"),
    @XmlEnumValue("Aggregation")
    AGGREGATION("Aggregation"),
    @XmlEnumValue("MunicipalConvention")
    MUNICIPAL_CONVENTION("MunicipalConvention"),
    @XmlEnumValue("AggregationConvention")
    AGGREGATION_CONVENTION("AggregationConvention");
    private final String value;

    EPaymentModalityTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EPaymentModalityTypeEnum fromValue(String v) {
        for (EPaymentModalityTypeEnum c: EPaymentModalityTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
