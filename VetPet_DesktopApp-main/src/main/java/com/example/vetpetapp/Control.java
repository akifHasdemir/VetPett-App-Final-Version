package com.example.vetpetapp;

import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class Control {

    static UserList userList = new UserList();
    public static boolean isTaken = false;
    public static boolean isUserNameControlPassed = false;
    public static boolean isPasswordControlPassed = false;
    public static boolean isClinicNoControlPassed = false;
    public static boolean isLoginControlPassed = false;
    public static boolean isSignInControlPassed = false;

    public static boolean userNameControl(String userName){
        // İf an userName is already taken then userName cant taken again
        for (int i=0; i< userList.getUserList().size();i++){
            if(userName.equals(userList.getUserList().get(i).getUserName())){
                isTaken = true;
            }
        }
        if (isTaken){
            System.out.println("User Name is already taken");
            isUserNameControlPassed = false;
        }else{
            if (userName.length()>16){
                System.out.println("User Name must have maximum 16 charachter");
            }else if (userName.isEmpty()){
                System.out.println("User Name can't be null");
            }else {
                isUserNameControlPassed = true;
            }
        }
            //User Name must have maximum 16 charachter
        //User Name can't be null
        //User Name can't include special Charachters like ! ' ^ # $ % + & / { ( [ ) ] = }

        return isUserNameControlPassed;
    }

    public static boolean passwordControl(String password){
        //Password must have maximum 16 charachter
        //Password can't be null
        if (password.length()>16){
            System.out.println("password must have maximum 16 charachter");
        }else if (password.isEmpty()){
            System.out.println("password can't be null");
        }else{
            isPasswordControlPassed = true;
        }
        return isPasswordControlPassed;
    }

    public static boolean clinicNoControl(String clinicNo){
        for (int i=0; i< VetClinicNo.clinicNo.size();i++){
            if(clinicNo.equals(VetClinicNo.clinicNo.get(i))){
                isClinicNoControlPassed = true;
            }
        }
        return isClinicNoControlPassed;
    }

    public static boolean loginControl(String userName, String password){
        for (int i = 0 ; i< userList.getUserList().size(); i++){
            if (userName.equals(userList.getUserList().get(i).getUserName()) && password.equals(userList.getUserList().get(i).getPassword())){
                isLoginControlPassed =  true;
                System.out.println("login is succeed");
            }else{
                System.out.println("Wrong userName or Password");
            }
        }
        return isLoginControlPassed;
    }

    public static boolean signInControl(String userName,String password,String clinicNo){
        if (clinicNo.isEmpty() && userNameControl(userName) && passwordControl(password)){
            User.isVet = false;
            User user = new User(userName,password,false);
            userList.getUserList().add(user);
            System.out.println("1");
            isSignInControlPassed = true;
        }else if (!clinicNo.isEmpty() && userNameControl(userName) && passwordControl(password) && clinicNoControl(clinicNo)){
            User.isVet=true;
                Clinic clinic = new Clinic(clinicNo);
                User user = new Vet(userName,password,true,clinic);
                userList.getUserList().add(user);
            System.out.println("2");
            isSignInControlPassed = true;
        }else{
            System.out.println("wrong clinic no");
        }
        return isSignInControlPassed;
    }
}
