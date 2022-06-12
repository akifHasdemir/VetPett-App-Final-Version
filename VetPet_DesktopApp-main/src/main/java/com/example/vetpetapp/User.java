package com.example.vetpetapp;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String userName;
    private String password;
    public static boolean isVet;

    public User(String userName, String password,boolean isVet){
        this.userName=userName;
        this.password=password;
        this.isVet=isVet;
    }


    private void userRegister(User user){

    }

    protected void isVetControl(){

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
