package basic;


import static basic.SportsList.csvToObject;

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

import javafx.geometry.Insets;
import javafx.scene.layout.GridPane;

public class MainMenu extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    public void start(Stage primaryStage) throws IOException {
        primaryStage.setTitle("Toronto Raptors database");
        primaryStage.setHeight(700);
        primaryStage.setWidth(700);
        String fileName = "src/basic/sports.csv";
        ArrayList<SportsList> Sports = basic.SportsList.csvToObject(fileName);
        main(primaryStage, Sports);
    }
    
    public static void main(Stage primaryStage, ArrayList<SportsList> Sports) {
        GridPane grid = new GridPane();
        grid.setVgap(13);
        grid.setHgap(13);
        grid.setPadding(new Insets(25, 25, 25, 25));
        grid.setGridLinesVisible(false);
        primaryStage.setWidth(1200);
        
        Button button1 =new Button("Raptors 2018-2019 Season");
        grid.add(button1, 0, 0);
        button1.setMaxSize(200, 100);
        button1.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                Database.DataBaseScreen(primaryStage, Sports);

            }
        });
        
        primaryStage.setScene(new Scene(grid));
        primaryStage.show();
        
    }
}
