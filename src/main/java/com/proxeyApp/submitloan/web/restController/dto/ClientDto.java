package com.proxeyApp.submitloan.web.restController.dto;

import java.io.Serializable;
import java.util.Objects;

public class ClientDto implements Serializable {


    private Long officeId ;

//    private Long staffId ;

    private Long legalFormId ;

//    private boolean isStaff ;

    private boolean active ;

    private String  mobileNo ;

    private String emailAddress ;

    private String dateOfBirth ;

    private String submittedOnDate ;

    private String firstname ;

    private String middlename ;

    private String lastname ;

    private String activationDate ;

    private String dateFormat ;

    private String locale ;


    public Long getOfficeId() {
        return officeId;
    }

    public void setOfficeId(Long officeId) {
        this.officeId = officeId;
    }

//    public Long getStaffId() {
//        return staffId;
//    }

//    public void setStaffId(Long staffId) {
//        this.staffId = staffId;
//    }

    public Long getLegalFormId() {
        return legalFormId;
    }

    public void setLegalFormId(Long legalFormId) {
        this.legalFormId = legalFormId;
    }

//    public boolean isStaff() {
//        return isStaff;
//    }
//
//    public void setStaff(boolean staff) {
//        isStaff = staff;
//    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSubmittedOnDate() {
        return submittedOnDate;
    }

    public void setSubmittedOnDate(String submittedOnDate) {
        this.submittedOnDate = submittedOnDate;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getActivationDate() {
        return activationDate;
    }

    public void setActivationDate(String activationDate) {
        this.activationDate = activationDate;
    }

    public String getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClientDto clientDto = (ClientDto) o;
        return  active == clientDto.active && Objects.equals(officeId, clientDto.officeId) && Objects.equals(legalFormId, clientDto.legalFormId) && Objects.equals(mobileNo, clientDto.mobileNo) && Objects.equals(emailAddress, clientDto.emailAddress) && Objects.equals(dateOfBirth, clientDto.dateOfBirth) && Objects.equals(submittedOnDate, clientDto.submittedOnDate) && Objects.equals(firstname, clientDto.firstname) && Objects.equals(middlename, clientDto.middlename) && Objects.equals(lastname, clientDto.lastname) && Objects.equals(activationDate, clientDto.activationDate) && Objects.equals(dateFormat, clientDto.dateFormat) && Objects.equals(locale, clientDto.locale);
    }

    @Override
    public int hashCode() {
        return Objects.hash(officeId, legalFormId, active, mobileNo, emailAddress, dateOfBirth, submittedOnDate, firstname, middlename, lastname, activationDate, dateFormat, locale);
    }

    @Override
    public String toString() {
        return "ClientDto{" +
                "officeId=" + officeId +
//                ", staffId=" + staffId +
                ", legalFormId=" + legalFormId +
//                ", isStaff=" + isStaff +
                ", active=" + active +
                ", mobileNo='" + mobileNo + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", submittedOnDate='" + submittedOnDate + '\'' +
                ", firstname='" + firstname + '\'' +
                ", middlename='" + middlename + '\'' +
                ", lastname='" + lastname + '\'' +
                ", activationDate='" + activationDate + '\'' +
                ", dateFormat='" + dateFormat + '\'' +
                ", locale='" + locale + '\'' +
                '}';
    }
}
