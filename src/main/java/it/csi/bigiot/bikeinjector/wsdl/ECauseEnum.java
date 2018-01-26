
package it.csi.bigiot.bikeinjector.wsdl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eCauseEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="eCauseEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="Recharge"/>
 *     &lt;enumeration value="NewBadge"/>
 *     &lt;enumeration value="Renewal"/>
 *     &lt;enumeration value="Substitution"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "eCauseEnum")
@XmlEnum
public enum ECauseEnum {

    @XmlEnumValue("NotSet")
    NOT_SET("NotSet"),
    @XmlEnumValue("Recharge")
    RECHARGE("Recharge"),
    @XmlEnumValue("NewBadge")
    NEW_BADGE("NewBadge"),
    @XmlEnumValue("Renewal")
    RENEWAL("Renewal"),
    @XmlEnumValue("Substitution")
    SUBSTITUTION("Substitution");
    private final String value;

    ECauseEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ECauseEnum fromValue(String v) {
        for (ECauseEnum c: ECauseEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
