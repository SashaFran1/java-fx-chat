package sample.client;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader fxmlLoader = new FXMLLoader(ChatClientApp.class.getResource("client-view.fxml"));
        primaryStage.setTitle("Chat (Client)");
        primaryStage.setScene(new Scene(fxmlLoader.load(), 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
