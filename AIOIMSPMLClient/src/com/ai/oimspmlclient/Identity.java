
package com.ai.oimspmlclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A type that represents an Identity entity (typically backed by
 *                 an LDAP object that includes the inetOrgPerson objectclass).
 * 
 * <p>Java class for identity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="identity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="attributes" type="{http://xmlns.oracle.com/idm/identity/PSO}unboundedAttributes" minOccurs="0"/>
 *         &lt;element name="activeEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="activeStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="commonName" type="{http://xmlns.oracle.com/idm/identity/PSO}localizedMultiValuedString"/>
 *         &lt;element name="countryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="departmentNumber" type="{http://xmlns.oracle.com/idm/identity/PSO}multiValuedString" minOccurs="0"/>
 *         &lt;element name="description" type="{http://xmlns.oracle.com/idm/identity/PSO}localizedMultiValuedString" minOccurs="0"/>
 *         &lt;element name="displayName" type="{http://xmlns.oracle.com/idm/identity/PSO}localizedSingleValuedString" minOccurs="0"/>
 *         &lt;element name="employeeNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="employeeType" type="{http://xmlns.oracle.com/idm/identity/PSO}localizedMultiValuedString" minOccurs="0"/>
 *         &lt;element name="facsimileTelephoneNumber" type="{http://xmlns.oracle.com/idm/identity/PSO}telephoneNumbers" minOccurs="0"/>
 *         &lt;element name="generationQualifier" type="{http://xmlns.oracle.com/idm/identity/PSO}multiValuedString" minOccurs="0"/>
 *         &lt;element name="givenName" type="{http://xmlns.oracle.com/idm/identity/PSO}multiValuedString" minOccurs="0"/>
 *         &lt;element name="hireDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="homePhone" type="{http://xmlns.oracle.com/idm/identity/PSO}telephoneNumbers" minOccurs="0"/>
 *         &lt;element name="homePostalAddress" type="{http://xmlns.oracle.com/idm/identity/PSO}multiValuedString" minOccurs="0"/>
 *         &lt;element name="initials" type="{http://xmlns.oracle.com/idm/identity/PSO}multiValuedString" minOccurs="0"/>
 *         &lt;element name="localityName" type="{http://xmlns.oracle.com/idm/identity/PSO}multiValuedString" minOccurs="0"/>
 *         &lt;element name="manager" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mail" type="{http://xmlns.oracle.com/idm/identity/PSO}multiValuedString" minOccurs="0"/>
 *         &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mobile" type="{http://xmlns.oracle.com/idm/identity/PSO}telephoneNumbers" minOccurs="0"/>
 *         &lt;element name="organization" type="{http://xmlns.oracle.com/idm/identity/PSO}localizedMultiValuedString" minOccurs="0"/>
 *         &lt;element name="organizationUnit" type="{http://xmlns.oracle.com/idm/identity/PSO}localizedMultiValuedString" minOccurs="0"/>
 *         &lt;element name="pager" type="{http://xmlns.oracle.com/idm/identity/PSO}telephoneNumbers" minOccurs="0"/>
 *         &lt;element name="password" type="{http://xmlns.oracle.com/idm/identity/PSO}multiValuedBinary" minOccurs="0"/>
 *         &lt;element name="postalAddress" type="{http://xmlns.oracle.com/idm/identity/PSO}multiValuedString" minOccurs="0"/>
 *         &lt;element name="postalCode" type="{http://xmlns.oracle.com/idm/identity/PSO}multiValuedString" minOccurs="0"/>
 *         &lt;element name="postOfficeBox" type="{http://xmlns.oracle.com/idm/identity/PSO}multiValuedString" minOccurs="0"/>
 *         &lt;element name="preferredLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="state" type="{http://xmlns.oracle.com/idm/identity/PSO}multiValuedString" minOccurs="0"/>
 *         &lt;element name="street" type="{http://xmlns.oracle.com/idm/identity/PSO}multiValuedString" minOccurs="0"/>
 *         &lt;element name="surname" type="{http://xmlns.oracle.com/idm/identity/PSO}localizedMultiValuedString" minOccurs="0"/>
 *         &lt;element name="telephoneNumber" type="{http://xmlns.oracle.com/idm/identity/PSO}telephoneNumbers" minOccurs="0"/>
 *         &lt;element name="title" type="{http://xmlns.oracle.com/idm/identity/PSO}localizedMultiValuedString" minOccurs="0"/>
 *         &lt;element name="userId" type="{http://xmlns.oracle.com/idm/identity/PSO}multiValuedString" minOccurs="0"/>
 *         &lt;element name="username" type="{http://xmlns.oracle.com/idm/identity/PSO}multiValuedString" minOccurs="0"/>
 *         &lt;element name="userType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "identity", namespace = "http://xmlns.oracle.com/idm/identity/PSO", propOrder = {
    "attributes",
    "activeEndDate",
    "activeStartDate",
    "commonName",
    "countryName",
    "departmentNumber",
    "description",
    "displayName",
    "employeeNumber",
    "employeeType",
    "facsimileTelephoneNumber",
    "generationQualifier",
    "givenName",
    "hireDate",
    "homePhone",
    "homePostalAddress",
    "initials",
    "localityName",
    "manager",
    "mail",
    "middleName",
    "mobile",
    "organization",
    "organizationUnit",
    "pager",
    "password",
    "postalAddress",
    "postalCode",
    "postOfficeBox",
    "preferredLanguage",
    "state",
    "street",
    "surname",
    "telephoneNumber",
    "title",
    "userId",
    "username",
    "userType"
})
public class Identity {

    protected UnboundedAttributes attributes;
    @XmlElement(defaultValue = "1970-01-01T00:00:00.0-00:00")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar activeEndDate;
    @XmlElement(defaultValue = "1970-01-01T00:00:00.0-00:00")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar activeStartDate;
    @XmlElement(required = true)
    protected LocalizedMultiValuedString commonName;
    protected String countryName;
    protected MultiValuedString departmentNumber;
    protected LocalizedMultiValuedString description;
    protected LocalizedSingleValuedString displayName;
    protected String employeeNumber;
    protected LocalizedMultiValuedString employeeType;
    protected TelephoneNumbers facsimileTelephoneNumber;
    protected MultiValuedString generationQualifier;
    protected MultiValuedString givenName;
    @XmlElement(defaultValue = "1970-01-01T00:00:00.0-00:00")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar hireDate;
    protected TelephoneNumbers homePhone;
    protected MultiValuedString homePostalAddress;
    protected MultiValuedString initials;
    protected MultiValuedString localityName;
    protected String manager;
    protected MultiValuedString mail;
    protected String middleName;
    protected TelephoneNumbers mobile;
    protected LocalizedMultiValuedString organization;
    protected LocalizedMultiValuedString organizationUnit;
    protected TelephoneNumbers pager;
    protected MultiValuedBinary password;
    protected MultiValuedString postalAddress;
    protected MultiValuedString postalCode;
    protected MultiValuedString postOfficeBox;
    protected String preferredLanguage;
    protected MultiValuedString state;
    protected MultiValuedString street;
    protected LocalizedMultiValuedString surname;
    protected TelephoneNumbers telephoneNumber;
    protected LocalizedMultiValuedString title;
    protected MultiValuedString userId;
    protected MultiValuedString username;
    protected String userType;

    /**
     * Gets the value of the attributes property.
     * 
     * @return
     *     possible object is
     *     {@link UnboundedAttributes }
     *     
     */
    public UnboundedAttributes getAttributes() {
        return attributes;
    }

    /**
     * Sets the value of the attributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnboundedAttributes }
     *     
     */
    public void setAttributes(UnboundedAttributes value) {
        this.attributes = value;
    }

    /**
     * Gets the value of the activeEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActiveEndDate() {
        return activeEndDate;
    }

    /**
     * Sets the value of the activeEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActiveEndDate(XMLGregorianCalendar value) {
        this.activeEndDate = value;
    }

    /**
     * Gets the value of the activeStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActiveStartDate() {
        return activeStartDate;
    }

    /**
     * Sets the value of the activeStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActiveStartDate(XMLGregorianCalendar value) {
        this.activeStartDate = value;
    }

    /**
     * Gets the value of the commonName property.
     * 
     * @return
     *     possible object is
     *     {@link LocalizedMultiValuedString }
     *     
     */
    public LocalizedMultiValuedString getCommonName() {
        return commonName;
    }

    /**
     * Sets the value of the commonName property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalizedMultiValuedString }
     *     
     */
    public void setCommonName(LocalizedMultiValuedString value) {
        this.commonName = value;
    }

    /**
     * Gets the value of the countryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * Sets the value of the countryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryName(String value) {
        this.countryName = value;
    }

    /**
     * Gets the value of the departmentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link MultiValuedString }
     *     
     */
    public MultiValuedString getDepartmentNumber() {
        return departmentNumber;
    }

    /**
     * Sets the value of the departmentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiValuedString }
     *     
     */
    public void setDepartmentNumber(MultiValuedString value) {
        this.departmentNumber = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link LocalizedMultiValuedString }
     *     
     */
    public LocalizedMultiValuedString getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalizedMultiValuedString }
     *     
     */
    public void setDescription(LocalizedMultiValuedString value) {
        this.description = value;
    }

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link LocalizedSingleValuedString }
     *     
     */
    public LocalizedSingleValuedString getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalizedSingleValuedString }
     *     
     */
    public void setDisplayName(LocalizedSingleValuedString value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the employeeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeNumber() {
        return employeeNumber;
    }

    /**
     * Sets the value of the employeeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeNumber(String value) {
        this.employeeNumber = value;
    }

    /**
     * Gets the value of the employeeType property.
     * 
     * @return
     *     possible object is
     *     {@link LocalizedMultiValuedString }
     *     
     */
    public LocalizedMultiValuedString getEmployeeType() {
        return employeeType;
    }

    /**
     * Sets the value of the employeeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalizedMultiValuedString }
     *     
     */
    public void setEmployeeType(LocalizedMultiValuedString value) {
        this.employeeType = value;
    }

    /**
     * Gets the value of the facsimileTelephoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link TelephoneNumbers }
     *     
     */
    public TelephoneNumbers getFacsimileTelephoneNumber() {
        return facsimileTelephoneNumber;
    }

    /**
     * Sets the value of the facsimileTelephoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelephoneNumbers }
     *     
     */
    public void setFacsimileTelephoneNumber(TelephoneNumbers value) {
        this.facsimileTelephoneNumber = value;
    }

    /**
     * Gets the value of the generationQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link MultiValuedString }
     *     
     */
    public MultiValuedString getGenerationQualifier() {
        return generationQualifier;
    }

    /**
     * Sets the value of the generationQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiValuedString }
     *     
     */
    public void setGenerationQualifier(MultiValuedString value) {
        this.generationQualifier = value;
    }

    /**
     * Gets the value of the givenName property.
     * 
     * @return
     *     possible object is
     *     {@link MultiValuedString }
     *     
     */
    public MultiValuedString getGivenName() {
        return givenName;
    }

    /**
     * Sets the value of the givenName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiValuedString }
     *     
     */
    public void setGivenName(MultiValuedString value) {
        this.givenName = value;
    }

    /**
     * Gets the value of the hireDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHireDate() {
        return hireDate;
    }

    /**
     * Sets the value of the hireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHireDate(XMLGregorianCalendar value) {
        this.hireDate = value;
    }

    /**
     * Gets the value of the homePhone property.
     * 
     * @return
     *     possible object is
     *     {@link TelephoneNumbers }
     *     
     */
    public TelephoneNumbers getHomePhone() {
        return homePhone;
    }

    /**
     * Sets the value of the homePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelephoneNumbers }
     *     
     */
    public void setHomePhone(TelephoneNumbers value) {
        this.homePhone = value;
    }

    /**
     * Gets the value of the homePostalAddress property.
     * 
     * @return
     *     possible object is
     *     {@link MultiValuedString }
     *     
     */
    public MultiValuedString getHomePostalAddress() {
        return homePostalAddress;
    }

    /**
     * Sets the value of the homePostalAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiValuedString }
     *     
     */
    public void setHomePostalAddress(MultiValuedString value) {
        this.homePostalAddress = value;
    }

    /**
     * Gets the value of the initials property.
     * 
     * @return
     *     possible object is
     *     {@link MultiValuedString }
     *     
     */
    public MultiValuedString getInitials() {
        return initials;
    }

    /**
     * Sets the value of the initials property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiValuedString }
     *     
     */
    public void setInitials(MultiValuedString value) {
        this.initials = value;
    }

    /**
     * Gets the value of the localityName property.
     * 
     * @return
     *     possible object is
     *     {@link MultiValuedString }
     *     
     */
    public MultiValuedString getLocalityName() {
        return localityName;
    }

    /**
     * Sets the value of the localityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiValuedString }
     *     
     */
    public void setLocalityName(MultiValuedString value) {
        this.localityName = value;
    }

    /**
     * Gets the value of the manager property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManager() {
        return manager;
    }

    /**
     * Sets the value of the manager property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManager(String value) {
        this.manager = value;
    }

    /**
     * Gets the value of the mail property.
     * 
     * @return
     *     possible object is
     *     {@link MultiValuedString }
     *     
     */
    public MultiValuedString getMail() {
        return mail;
    }

    /**
     * Sets the value of the mail property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiValuedString }
     *     
     */
    public void setMail(MultiValuedString value) {
        this.mail = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * Gets the value of the mobile property.
     * 
     * @return
     *     possible object is
     *     {@link TelephoneNumbers }
     *     
     */
    public TelephoneNumbers getMobile() {
        return mobile;
    }

    /**
     * Sets the value of the mobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelephoneNumbers }
     *     
     */
    public void setMobile(TelephoneNumbers value) {
        this.mobile = value;
    }

    /**
     * Gets the value of the organization property.
     * 
     * @return
     *     possible object is
     *     {@link LocalizedMultiValuedString }
     *     
     */
    public LocalizedMultiValuedString getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalizedMultiValuedString }
     *     
     */
    public void setOrganization(LocalizedMultiValuedString value) {
        this.organization = value;
    }

    /**
     * Gets the value of the organizationUnit property.
     * 
     * @return
     *     possible object is
     *     {@link LocalizedMultiValuedString }
     *     
     */
    public LocalizedMultiValuedString getOrganizationUnit() {
        return organizationUnit;
    }

    /**
     * Sets the value of the organizationUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalizedMultiValuedString }
     *     
     */
    public void setOrganizationUnit(LocalizedMultiValuedString value) {
        this.organizationUnit = value;
    }

    /**
     * Gets the value of the pager property.
     * 
     * @return
     *     possible object is
     *     {@link TelephoneNumbers }
     *     
     */
    public TelephoneNumbers getPager() {
        return pager;
    }

    /**
     * Sets the value of the pager property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelephoneNumbers }
     *     
     */
    public void setPager(TelephoneNumbers value) {
        this.pager = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link MultiValuedBinary }
     *     
     */
    public MultiValuedBinary getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiValuedBinary }
     *     
     */
    public void setPassword(MultiValuedBinary value) {
        this.password = value;
    }

    /**
     * Gets the value of the postalAddress property.
     * 
     * @return
     *     possible object is
     *     {@link MultiValuedString }
     *     
     */
    public MultiValuedString getPostalAddress() {
        return postalAddress;
    }

    /**
     * Sets the value of the postalAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiValuedString }
     *     
     */
    public void setPostalAddress(MultiValuedString value) {
        this.postalAddress = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link MultiValuedString }
     *     
     */
    public MultiValuedString getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiValuedString }
     *     
     */
    public void setPostalCode(MultiValuedString value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the postOfficeBox property.
     * 
     * @return
     *     possible object is
     *     {@link MultiValuedString }
     *     
     */
    public MultiValuedString getPostOfficeBox() {
        return postOfficeBox;
    }

    /**
     * Sets the value of the postOfficeBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiValuedString }
     *     
     */
    public void setPostOfficeBox(MultiValuedString value) {
        this.postOfficeBox = value;
    }

    /**
     * Gets the value of the preferredLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferredLanguage() {
        return preferredLanguage;
    }

    /**
     * Sets the value of the preferredLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferredLanguage(String value) {
        this.preferredLanguage = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link MultiValuedString }
     *     
     */
    public MultiValuedString getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiValuedString }
     *     
     */
    public void setState(MultiValuedString value) {
        this.state = value;
    }

    /**
     * Gets the value of the street property.
     * 
     * @return
     *     possible object is
     *     {@link MultiValuedString }
     *     
     */
    public MultiValuedString getStreet() {
        return street;
    }

    /**
     * Sets the value of the street property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiValuedString }
     *     
     */
    public void setStreet(MultiValuedString value) {
        this.street = value;
    }

    /**
     * Gets the value of the surname property.
     * 
     * @return
     *     possible object is
     *     {@link LocalizedMultiValuedString }
     *     
     */
    public LocalizedMultiValuedString getSurname() {
        return surname;
    }

    /**
     * Sets the value of the surname property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalizedMultiValuedString }
     *     
     */
    public void setSurname(LocalizedMultiValuedString value) {
        this.surname = value;
    }

    /**
     * Gets the value of the telephoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link TelephoneNumbers }
     *     
     */
    public TelephoneNumbers getTelephoneNumber() {
        return telephoneNumber;
    }

    /**
     * Sets the value of the telephoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelephoneNumbers }
     *     
     */
    public void setTelephoneNumber(TelephoneNumbers value) {
        this.telephoneNumber = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link LocalizedMultiValuedString }
     *     
     */
    public LocalizedMultiValuedString getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalizedMultiValuedString }
     *     
     */
    public void setTitle(LocalizedMultiValuedString value) {
        this.title = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link MultiValuedString }
     *     
     */
    public MultiValuedString getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiValuedString }
     *     
     */
    public void setUserId(MultiValuedString value) {
        this.userId = value;
    }

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link MultiValuedString }
     *     
     */
    public MultiValuedString getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiValuedString }
     *     
     */
    public void setUsername(MultiValuedString value) {
        this.username = value;
    }

    /**
     * Gets the value of the userType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserType() {
        return userType;
    }

    /**
     * Sets the value of the userType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserType(String value) {
        this.userType = value;
    }

}
