package org.iamniaina34.mate;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.iamniaina34.mate.entities.pieces.King;

import java.io.IOException;

public class MateApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(MateApplication.class.getResource("hello-view.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
//        stage.setTitle("Hello!");
//        stage.setScene(scene);
//        stage.show();
        King king = new King();
        king.move(1, 1);
    }

    public static void main(String[] args) {
        launch();
    }
}