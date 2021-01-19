package basic;

import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Button;
import javafx.application.Application;
import javafx.scene.layout.VBox;

public class MainMenu extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage mainStage)  {
        mainStage.setTitle("Toronto Raptors database");
        mainStage.setHeight(500);
        mainStage.setWidth(500);
        
        Button button1 =new Button("Raptors 2018-2019 Season");
        button1.setMaxSize(100, 50);
        button1.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hi");
            }
        });
        
        Button button2 =new Button("Raptors 2019-2020 Season");
        button2.setMaxSize(100, 50);
        button2.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello");
            }
        });
        
        VBox VBoxMenu = new VBox(button1, button2);
        mainStage.setScene(new Scene(VBoxMenu));
        mainStage.show();
    }
}
