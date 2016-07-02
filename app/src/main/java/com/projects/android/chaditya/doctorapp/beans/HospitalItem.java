package com.projects.android.chaditya.doctorapp.beans;

/**
 * Created by ch.aditya on 01-07-2016.
 */
public class HospitalItem {
    private String hospitalName;
    private String hospitalTelephone;
    private String hospitalCategory;
    private String hospitalAddress;
    private String hospitalEmail;
    private String hospitalWebsite;

    private String State;
    private String District;
    private String SubDistrict;
    private String Pincode;
    private String SystemsOfMedicine;
    private String Specialities;
    private String Facilities;

    private String latitude;
    private String longitude;

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getHospitalTelephone() {
        return hospitalTelephone;
    }

    public void setHospitalTelephone(String hospitalTelephone) {
        this.hospitalTelephone = hospitalTelephone;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getDistrict() {
        return District;
    }

    public void setDistrict(String district) {
        District = district;
    }

    public String getSubDistrict() {
        return SubDistrict;
    }

    public void setSubDistrict(String subDistrict) {
        SubDistrict = subDistrict;
    }

    public String getPincode() {
        return Pincode;
    }

    public void setPincode(String pincode) {
        Pincode = pincode;
    }

    public String getSystemsOfMedicine() {
        return SystemsOfMedicine;
    }

    public void setSystemsOfMedicine(String systemsOfMedicine) {
        SystemsOfMedicine = systemsOfMedicine;
    }

    public String getSpecialities() {
        return Specialities;
    }

    public void setSpecialities(String specialities) {
        Specialities = specialities;
    }

    public String getFacilities() {
        return Facilities;
    }

    public void setFacilities(String facilities) {
        Facilities = facilities;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getHospitalCategory() {
        return hospitalCategory;
    }

    public void setHospitalCategory(String hospitalCategory) {
        this.hospitalCategory = hospitalCategory;
    }

    public String getHospitalAddress() {
        return hospitalAddress;
    }

    public void setHospitalAddress(String hospitalAddress) {
        this.hospitalAddress = hospitalAddress;
    }

    public String getHospitalEmail() {
        return hospitalEmail;
    }

    public void setHospitalEmail(String hospitalEmail) {
        this.hospitalEmail = hospitalEmail;
    }

    public String getHospitalWebsite() {
        return hospitalWebsite;
    }

    public void setHospitalWebsite(String hospitalWebsite) {
        this.hospitalWebsite = hospitalWebsite;
    }
}
