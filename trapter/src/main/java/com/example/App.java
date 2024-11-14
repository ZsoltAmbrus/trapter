/*
* File: App.java
* Author: Ambrus Zsolt
* Copyright: 2024, Ambrus Zsolt
* Group: Szoft II/I/N
* Date: 2024-11-14
* Github: https://github.com/AmbrusZsolt/trapter
* Licenc: GNU GPL
*/
package com.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;



public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("FirstScene"), 640, 480);
        stage.setTitle("Dolgozat");
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}
