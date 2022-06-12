package com.example.vetpetapp;

import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class UserList implements Initializable {
    private static List<User> userList = new ArrayList<>();


    public static List<User> getUserList(){
        return userList;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
