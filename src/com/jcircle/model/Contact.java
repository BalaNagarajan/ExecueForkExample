package com.jcircle.model;

import java.util.Objects;

public class Contact {

    private String contactId;
    private String contactName;
    private Integer homePhoneNumber;
    private Integer mobile;
    private String primaryEmail;



    private String secondaryEmail;
    private String address;

    public String getContactId() {
        return contactId;
    }

    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public Integer getHomePhoneNumber() {
        return homePhoneNumber;
    }

    public void setHomePhoneNumber(Integer homePhoneNumber) {
        this.homePhoneNumber = homePhoneNumber;
    }

    public Integer getMobile() {
        return mobile;
    }

    public void setMobile(Integer mobile) {
        this.mobile = mobile;
    }

    public String getPrimaryEmail() {
        return primaryEmail;
    }

    public void setPrimaryEmail(String primaryEmail) {
        this.primaryEmail = primaryEmail;
    }

    public String getSecondaryEmail() {
        return secondaryEmail;
    }

    public void setSecondaryEmail(String secondaryEmail) {
        this.secondaryEmail = secondaryEmail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(contactId, contact.contactId) &&
                Objects.equals(contactName, contact.contactName) &&
                Objects.equals(homePhoneNumber, contact.homePhoneNumber) &&
                Objects.equals(mobile, contact.mobile) &&
                Objects.equals(primaryEmail, contact.primaryEmail) &&
                Objects.equals(secondaryEmail, contact.secondaryEmail) &&
                Objects.equals(address, contact.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contactId, contactName, homePhoneNumber, mobile, primaryEmail, secondaryEmail, address);
    }



}
