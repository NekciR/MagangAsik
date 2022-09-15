package com.example.finalproject.model;

public class Intern extends User {
    protected String FullName;
    protected String Email;
    protected String Gender;
    protected String Phone;
    protected String Address;
    protected String HighEdu;
    protected String PreferedJob;
    protected String Desc;

    public Intern(String username, String password, int status, String fullName, String email, String gender, String phone, String address, String highEdu, String preferedJob, String desc) {
        super(username, password, status);
        FullName = fullName;
        Email = email;
        Gender = gender;
        Phone = phone;
        Address = address;
        HighEdu = highEdu;
        PreferedJob = preferedJob;
        Desc = desc;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getHighEdu() {
        return HighEdu;
    }

    public void setHighEdu(String highEdu) {
        HighEdu = highEdu;
    }

    public String getPreferedJob() {
        return PreferedJob;
    }

    public void setPreferedJob(String preferedJob) {
        PreferedJob = preferedJob;
    }

    public String getDesc() {
        return Desc;
    }

    public void setDesc(String desc) {
        Desc = desc;
    }
}
