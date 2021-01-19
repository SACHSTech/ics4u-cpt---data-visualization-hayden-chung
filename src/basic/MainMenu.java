package basic;

import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Button;
import javafx.application.Application;

public class MainMenu extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage mainStage)  {
        mainStage.setTitle("Toronto Raptors database");
        
        Button button1 =new Button("Raptors 2018-2019 Season");
        Scene scene = new Scene(button1, 200, 200);
        mainStage.setScene(scene);

        Button button2 =new Button("Raptors 2019-2020 Season");
        Scene scene1 = new Scene(button2, 100, 200);
        mainStage.setScene(scene1);
        mainStage.show();
    }
}
