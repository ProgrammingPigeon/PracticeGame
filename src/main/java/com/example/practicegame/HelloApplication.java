package com.example.practicegame;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        BorderPane window = new BorderPane();

        Text title = new Text();
        title.setText("This is a Game");

        window.setTop(title);

        Scene scene = new Scene(window, 320, 240);
        scene.getStylesheets().add("styles.css");
        System.out.println("Stylesheet loaded: " + scene.getStylesheets());
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}
