package com.example.finalproject.model;

public class Company extends User {
    protected String CompanyName;
    protected String WorkField;
    protected String Address;
    protected String Phone;
    protected String Email;
    protected String Desc;

    public Company(String username, String password, int status, String companyName, String workField, String address, String phone, String email, String desc) {
        super(username, password, status);
        CompanyName = companyName;
        WorkField = workField;
        Address = address;
        Phone = phone;
        Email = email;
        Desc = desc;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public String getWorkField() {
        return WorkField;
    }

    public void setWorkField(String workField) {
        WorkField = workField;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getDesc() {
        return Desc;
    }

    public void setDesc(String desc) {
        Desc = desc;
    }
}
