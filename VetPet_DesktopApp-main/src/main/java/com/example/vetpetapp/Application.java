package com.example.vetpetapp;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {
    public static Stage stage;
    @Override
    public void start( Stage primaryStage) throws IOException {
        stage=primaryStage;
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("vetApplication/vetHomePage.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        primaryStage.setTitle("VetPet");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch();

    }
}