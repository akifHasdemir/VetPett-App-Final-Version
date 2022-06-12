package com.example.vetpetapp;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class PageNavigator {

    public void goToPage(String url) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        Scene scene = new Scene(loader.load(getClass().getResource(url)));
        Stage stage = Application.stage;
        stage.setScene(scene);
        stage.show();
    }
    public void goToPageNS(String url) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        Stage stage = new Stage();
        Scene scene = new Scene(loader.load(getClass().getResource(url)));
        stage.setTitle("VetPet");
        stage.setScene(scene);
        stage.show();
    }
    public void changePanel(AnchorPane pane,String url) throws IOException {
        AnchorPane petPane = FXMLLoader.load(getClass().getResource(url));
        pane.getChildren().setAll(petPane);
    }





}
