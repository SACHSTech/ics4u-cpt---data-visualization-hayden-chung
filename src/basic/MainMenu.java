package basic;

import java.io.IOException;
import java.util.ArrayList;
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
    public void start(Stage primaryStage) throws IOException {
        primaryStage.setTitle("Toronto Raptors database");
        primaryStage.setHeight(700);
        primaryStage.setWidth(700);
        String fileName = "src/basic/sports.csv";
        ArrayList<SportsList> SportsList = basic.SportsList.csvToObject(fileName);
        
        Button button1 =new Button("Raptors 2018-2019 Season");
        button1.setMaxSize(200, 100);
        button1.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                Database.DataBaseScreen(primaryStage, SportsList);
            }
        });
        
        
        VBox VBoxMenu = new VBox(button1);
        VBoxMenu.setSpacing(15);
        primaryStage.setScene(new Scene(VBoxMenu));
        primaryStage.show();
    }
}
