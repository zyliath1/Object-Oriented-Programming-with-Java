package com.example.teema6t3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        // Ladataan FXML-tiedosto
        Parent root = FXMLLoader.load(getClass().getResource("main_layout.fxml"));

        // Asetetaan otsikko sovellusikkunalle ja näytetään se käyttäjälle
        primaryStage.setTitle("Savonian Verkkokauppa");

        // Asetetaan näkymä (Scene) ja näytetään se sovellusikkunassa
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public static void main(String[] args) {
        // Käynnistetään sovellus
        launch(args);
    }
}