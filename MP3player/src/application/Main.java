package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;



public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        final String appName = "Mp3Player v0.4";
        try {
            Parent parent = (Parent) FXMLLoader.load(getClass().getResource(
                    "/pl/awolny/mp3/view/MainPane.fxml"));
            Scene scene = new Scene(parent);
            primaryStage.setTitle(appName);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}