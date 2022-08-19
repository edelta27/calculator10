package org.example.calculator10;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainCalculator10 extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {
        BorderPane borderPane = FXMLLoader.load(getClass().getResource("/fxml/calculator10Fxml.fxml"));
        Scene scene = new Scene(borderPane);
        stage.setScene(scene);
        stage.setTitle("Calculator");
        stage.show();
    }
}
