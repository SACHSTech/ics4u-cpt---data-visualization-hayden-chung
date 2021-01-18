package basic;

import javafx.stage.Stage;
import javafx.application.Application;

public class MainMenu extends Application {

    @Override
    public void start(Stage mainStage) throws Exception {
        mainStage.setTitle("Toronto Raptors database");

        mainStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
    
}
