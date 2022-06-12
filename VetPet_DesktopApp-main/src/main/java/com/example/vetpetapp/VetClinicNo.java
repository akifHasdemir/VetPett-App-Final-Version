package com.example.vetpetapp;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import loginPage.CreateAccountPageController;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class VetClinicNo implements Initializable{

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
    public static List<String> clinicNo = new ArrayList<>(clinicNos());

    private static List<String> clinicNos(){
        List<String> ls = new ArrayList<>();

        ls.add("a");
        ls.add("b");
        ls.add("c");
        ls.add("d");
        ls.add("e");

        return ls;
    }


//    public static boolean isVetCompare(String str){
//        for (int i = 0; i< clinicNo().size();i++){
//            if (str == clinicNo().get(i)){
//                User.isVet = true;
//            }else{
//                User.isVet = false;
//            }
//        }
//        return User.isVet;
//    }

}
