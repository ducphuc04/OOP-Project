package App;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ManagerApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("loginGUI.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);

        stage.setTitle("Group 5 Grocery Store");
        stage.setMinHeight(450);
        stage.setMaxHeight(650);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}