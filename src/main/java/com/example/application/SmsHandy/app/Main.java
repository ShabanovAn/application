package com.example.application.SmsHandy.app;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    private Stage mainStage;

    public void start(Stage stage) throws IOException {
        mainStage = stage;
        mainStage.setTitle("Мобильная сеть");
        mainStage.show();
        loadMainView();
    }

    private void loadMainView() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("com/example/application/SmsHandy/main_view.fxml"));
        BorderPane pane = loader.load();
        Scene scene = new Scene(pane);
        mainStage.setScene(scene);
        mainStage.show();

    }

    public static void main(String[] args) {
        launch(args);

    }
}

