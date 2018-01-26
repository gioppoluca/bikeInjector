
package it.csi.bigiot.bikeinjector.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Customer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Customer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ActivationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Badge" type="{http://servicev2.tobike.it}Badge"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CityOfBirth" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CustomerID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RoleID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DateOfBirth" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DeactivationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DistrictID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DistrictIDOfBirth" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MunicipalityID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PortalID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EMail" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="EndValidityDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Fax" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Gender" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IBAN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Insurance" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="LastLogin" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="LockNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LoginAttempts" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LoginNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Mobile" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Note" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Payment" type="{http://servicev2.tobike.it}Payment"/>
 *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StartValidityDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Surname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TaxCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Telephone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Username" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Valid" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Customer", namespace = "http://toBike/v1/toBike", propOrder = {
    "activationDate",
    "address",
    "badge",
    "city",
    "cityOfBirth",
    "customerID",
    "roleID",
    "dateOfBirth",
    "deactivationDate",
    "districtID",
    "districtIDOfBirth",
    "municipalityID",
    "portalID",
    "eMail",
    "enabled",
    "endValidityDate",
    "fax",
    "gender",
    "iban",
    "insurance",
    "lastLogin",
    "lockNumber",
    "loginAttempts",
    "loginNumber",
    "mobile",
    "name",
    "note",
    "password",
    "payment",
    "postalCode",
    "startValidityDate",
    "surname",
    "taxCode",
    "telephone",
    "username",
    "valid"
})
public class Customer2 {

    @XmlElement(name = "ActivationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar activationDate;
    @XmlElement(name = "Address", required = true, nillable = true)
    protected String address;
    @XmlElement(name = "Badge", required = true, nillable = true)
    protected Badge2 badge;
    @XmlElement(name = "City", required = true, nillable = true)
    protected String city;
    @XmlElement(name = "CityOfBirth", required = true, nillable = true)
    protected String cityOfBirth;
    @XmlElement(name = "CustomerID")
    protected int customerID;
    @XmlElement(name = "RoleID")
    protected int roleID;
    @XmlElement(name = "DateOfBirth", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateOfBirth;
    @XmlElement(name = "DeactivationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deactivationDate;
    @XmlElement(name = "DistrictID")
    protected int districtID;
    @XmlElement(name = "DistrictIDOfBirth")
    protected int districtIDOfBirth;
    @XmlElement(name = "MunicipalityID")
    protected int municipalityID;
    @XmlElement(name = "PortalID")
    protected int portalID;
    @XmlElement(name = "EMail", required = true, nillable = true)
    protected String eMail;
    @XmlElement(name = "Enabled")
    protected boolean enabled;
    @XmlElement(name = "EndValidityDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endValidityDate;
    @XmlElement(name = "Fax", required = true, nillable = true)
    protected String fax;
    @XmlElement(name = "Gender", required = true, nillable = true)
    protected String gender;
    @XmlElement(name = "IBAN", required = true, nillable = true)
    protected String iban;
    @XmlElement(name = "Insurance")
    protected boolean insurance;
    @XmlElement(name = "LastLogin", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastLogin;
    @XmlElement(name = "LockNumber", required = true, nillable = true)
    protected String lockNumber;
    @XmlElement(name = "LoginAttempts")
    protected int loginAttempts;
    @XmlElement(name = "LoginNumber")
    protected int loginNumber;
    @XmlElement(name = "Mobile", required = true, nillable = true)
    protected String mobile;
    @XmlElement(name = "Name", required = true, nillable = true)
    protected String name;
    @XmlElement(name = "Note", required = true, nillable = true)
    protected String note;
    @XmlElement(name = "Password", required = true, nillable = true)
    protected String password;
    @XmlElement(name = "Payment", required = true, nillable = true)
    protected Payment2 payment;
    @XmlElement(name = "PostalCode", required = true, nillable = true)
    protected String postalCode;
    @XmlElement(name = "StartValidityDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startValidityDate;
    @XmlElement(name = "Surname", required = true, nillable = true)
    protected String surname;
    @XmlElement(name = "TaxCode", required = true, nillable = true)
    protected String taxCode;
    @XmlElement(name = "Telephone", required = true, nillable = true)
    protected String telephone;
    @XmlElement(name = "Username", required = true, nillable = true)
    protected String username;
    @XmlElement(name = "Valid")
    protected boolean valid;

    /**
     * Gets the value of the activationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActivationDate() {
        return activationDate;
    }

    /**
     * Sets the value of the activationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActivationDate(XMLGregorianCalendar value) {
        this.activationDate = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the badge property.
     * 
     * @return
     *     possible object is
     *     {@link Badge2 }
     *     
     */
    public Badge2 getBadge() {
        return badge;
    }

    /**
     * Sets the value of the badge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Badge2 }
     *     
     */
    public void setBadge(Badge2 value) {
        this.badge = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the cityOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityOfBirth() {
        return cityOfBirth;
    }

    /**
     * Sets the value of the cityOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityOfBirth(String value) {
        this.cityOfBirth = value;
    }

    /**
     * Gets the value of the customerID property.
     * 
     */
    public int getCustomerID() {
        return customerID;
    }

    /**
     * Sets the value of the customerID property.
     * 
     */
    public void setCustomerID(int value) {
        this.customerID = value;
    }

    /**
     * Gets the value of the roleID property.
     * 
     */
    public int getRoleID() {
        return roleID;
    }

    /**
     * Sets the value of the roleID property.
     * 
     */
    public void setRoleID(int value) {
        this.roleID = value;
    }

    /**
     * Gets the value of the dateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the value of the dateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfBirth(XMLGregorianCalendar value) {
        this.dateOfBirth = value;
    }

    /**
     * Gets the value of the deactivationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeactivationDate() {
        return deactivationDate;
    }

    /**
     * Sets the value of the deactivationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeactivationDate(XMLGregorianCalendar value) {
        this.deactivationDate = value;
    }

    /**
     * Gets the value of the districtID property.
     * 
     */
    public int getDistrictID() {
        return districtID;
    }

    /**
     * Sets the value of the districtID property.
     * 
     */
    public void setDistrictID(int value) {
        this.districtID = value;
    }

    /**
     * Gets the value of the districtIDOfBirth property.
     * 
     */
    public int getDistrictIDOfBirth() {
        return districtIDOfBirth;
    }

    /**
     * Sets the value of the districtIDOfBirth property.
     * 
     */
    public void setDistrictIDOfBirth(int value) {
        this.districtIDOfBirth = value;
    }

    /**
     * Gets the value of the municipalityID property.
     * 
     */
    public int getMunicipalityID() {
        return municipalityID;
    }

    /**
     * Sets the value of the municipalityID property.
     * 
     */
    public void setMunicipalityID(int value) {
        this.municipalityID = value;
    }

    /**
     * Gets the value of the portalID property.
     * 
     */
    public int getPortalID() {
        return portalID;
    }

    /**
     * Sets the value of the portalID property.
     * 
     */
    public void setPortalID(int value) {
        this.portalID = value;
    }

    /**
     * Gets the value of the eMail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMail() {
        return eMail;
    }

    /**
     * Sets the value of the eMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMail(String value) {
        this.eMail = value;
    }

    /**
     * Gets the value of the enabled property.
     * 
     */
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     */
    public void setEnabled(boolean value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the endValidityDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndValidityDate() {
        return endValidityDate;
    }

    /**
     * Sets the value of the endValidityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndValidityDate(XMLGregorianCalendar value) {
        this.endValidityDate = value;
    }

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Gets the value of the iban property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIBAN() {
        return iban;
    }

    /**
     * Sets the value of the iban property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIBAN(String value) {
        this.iban = value;
    }

    /**
     * Gets the value of the insurance property.
     * 
     */
    public boolean isInsurance() {
        return insurance;
    }

    /**
     * Sets the value of the insurance property.
     * 
     */
    public void setInsurance(boolean value) {
        this.insurance = value;
    }

    /**
     * Gets the value of the lastLogin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastLogin() {
        return lastLogin;
    }

    /**
     * Sets the value of the lastLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastLogin(XMLGregorianCalendar value) {
        this.lastLogin = value;
    }

    /**
     * Gets the value of the lockNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLockNumber() {
        return lockNumber;
    }

    /**
     * Sets the value of the lockNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLockNumber(String value) {
        this.lockNumber = value;
    }

    /**
     * Gets the value of the loginAttempts property.
     * 
     */
    public int getLoginAttempts() {
        return loginAttempts;
    }

    /**
     * Sets the value of the loginAttempts property.
     * 
     */
    public void setLoginAttempts(int value) {
        this.loginAttempts = value;
    }

    /**
     * Gets the value of the loginNumber property.
     * 
     */
    public int getLoginNumber() {
        return loginNumber;
    }

    /**
     * Sets the value of the loginNumber property.
     * 
     */
    public void setLoginNumber(int value) {
        this.loginNumber = value;
    }

    /**
     * Gets the value of the mobile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * Sets the value of the mobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobile(String value) {
        this.mobile = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the payment property.
     * 
     * @return
     *     possible object is
     *     {@link Payment2 }
     *     
     */
    public Payment2 getPayment() {
        return payment;
    }

    /**
     * Sets the value of the payment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Payment2 }
     *     
     */
    public void setPayment(Payment2 value) {
        this.payment = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the startValidityDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartValidityDate() {
        return startValidityDate;
    }

    /**
     * Sets the value of the startValidityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartValidityDate(XMLGregorianCalendar value) {
        this.startValidityDate = value;
    }

    /**
     * Gets the value of the surname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Sets the value of the surname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurname(String value) {
        this.surname = value;
    }

    /**
     * Gets the value of the taxCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxCode() {
        return taxCode;
    }

    /**
     * Sets the value of the taxCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxCode(String value) {
        this.taxCode = value;
    }

    /**
     * Gets the value of the telephone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * Sets the value of the telephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephone(String value) {
        this.telephone = value;
    }

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the valid property.
     * 
     */
    public boolean isValid() {
        return valid;
    }

    /**
     * Sets the value of the valid property.
     * 
     */
    public void setValid(boolean value) {
        this.valid = value;
    }

}
