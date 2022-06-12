package com.example.vetpetapp;

public class Vet extends User {
    private Clinic clinic;

    public Vet(String userName, String password, boolean isVet, Clinic clinic) {
        super(userName, password, isVet);
        this.clinic = clinic;
    }

    public Clinic getClinic() {
        return clinic;
    }

    public void setClinic(Clinic clinic) {
        this.clinic = clinic;
    }
}
