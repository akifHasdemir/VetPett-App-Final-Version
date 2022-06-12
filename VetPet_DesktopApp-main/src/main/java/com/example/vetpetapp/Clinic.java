package com.example.vetpetapp;

public class Clinic {
    private String clinicNo;
    private String clinicName;
    private String clinicAddress;
    private String clinicCity;
    private String clinicDistrict;
    private String clinicBio;

    public Clinic(String clinicNo) {
        this.clinicNo=clinicNo;
    }

    public String getClinicNo() {
        return clinicNo;
    }

    public void setClinicNo(String clinicNo) {
        this.clinicNo = clinicNo;
    }

    public String getClinicName() {
        return clinicName;
    }

    public void setClinicName(String clinicName) {
        this.clinicName = clinicName;
    }

    public String getClinicAddress() {
        return clinicAddress;
    }

    public void setClinicAddress(String clinicAddress) {
        this.clinicAddress = clinicAddress;
    }

    public String getClinicCity() {
        return clinicCity;
    }

    public void setClinicCity(String clinicCity) {
        this.clinicCity = clinicCity;
    }

    public String getClinicDistrict() {
        return clinicDistrict;
    }

    public void setClinicDistrict(String clinicDistrict) {
        this.clinicDistrict = clinicDistrict;
    }

    public String getClinicBio() {
        return clinicBio;
    }

    public void setClinicBio(String clinicBio) {
        this.clinicBio = clinicBio;
    }
}
