package basic;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javafx.geometry.Insets;
import javafx.scene.layout.GridPane;

public class Database  { 

    public static Parent createContent(ArrayList<SportsList> Sports) {
        System.out.println(Sports.get(1).gameNumberProperty());
        ObservableList<SportsList> data = FXCollections.observableArrayList(Sports);

        TableColumn gameNumberColumn = new TableColumn();
        //gameNumberColumn.setMinWidth(500);
        gameNumberColumn.setText("Game Number");
        gameNumberColumn.setCellValueFactory(new PropertyValueFactory("gameNumber"));

        TableColumn dateNumberColumn = new TableColumn();
        dateNumberColumn.setText("Date");
        dateNumberColumn.setCellValueFactory(new PropertyValueFactory("dateNumber"));

        TableColumn gameTimeColumn = new TableColumn();
        gameTimeColumn.setText("Game Time");
        gameTimeColumn.setCellValueFactory(new PropertyValueFactory("gameTime"));

        TableColumn bestPlayerColumn = new TableColumn();
        bestPlayerColumn.setText("Best Player");
        bestPlayerColumn.setCellValueFactory(new PropertyValueFactory("bestPlayer"));

        TableColumn gameLocationColumn = new TableColumn();
        gameLocationColumn.setText("Game Location");
        gameLocationColumn.setCellValueFactory(new PropertyValueFactory("gameLocation"));

        TableColumn gameOpponentColumn = new TableColumn();
        gameOpponentColumn.setText("Game Opponent");
        gameOpponentColumn.setCellValueFactory(new PropertyValueFactory("gameOpponent"));

        TableColumn gameResultColumn = new TableColumn();
        gameResultColumn.setText("Game Result");
        gameResultColumn.setCellValueFactory(new PropertyValueFactory("gameResult"));

        TableColumn gameLengthColumn = new TableColumn();
        gameLengthColumn.setText("Game Length");
        gameLengthColumn.setCellValueFactory(new PropertyValueFactory("gameLength"));

        TableColumn raptorScoreColumn = new TableColumn();
        raptorScoreColumn.setText("Raptor Score");
        raptorScoreColumn.setCellValueFactory(new PropertyValueFactory("raptorScore"));

        TableColumn opponentScoreColumn = new TableColumn();
        opponentScoreColumn.setText("Opponent Score");
        opponentScoreColumn.setCellValueFactory(new PropertyValueFactory("opponentScore"));

        TableColumn totalWinsColumn = new TableColumn();
        totalWinsColumn.setText("Total Wins");
        totalWinsColumn.setCellValueFactory(new PropertyValueFactory("totalWins"));

        TableColumn totalLosesColumn = new TableColumn();
        totalLosesColumn.setText("Total Loses");
        totalLosesColumn.setCellValueFactory(new PropertyValueFactory("totalLoses"));
        
        TableColumn gameStreakColumn = new TableColumn();
        gameStreakColumn.setText("Game Streak");
        gameStreakColumn.setCellValueFactory(new PropertyValueFactory("gameStreak"));

        TableView tableView = new TableView();
        tableView.getColumns().addAll(gameNumberColumn, dateNumberColumn, gameTimeColumn, bestPlayerColumn, gameLocationColumn, gameOpponentColumn, gameResultColumn, gameLengthColumn, raptorScoreColumn, opponentScoreColumn, totalWinsColumn, totalLosesColumn, gameStreakColumn);
        tableView.setItems(data);
        return tableView;
    }
    
    public static void DataBaseScreen (Stage primaryStage, ArrayList<SportsList> Sports) {

        GridPane grid = new GridPane();
        grid.setVgap(100);
        grid.setHgap(100);
        //grid.setPadding(new Insets(25, 25, 25, 25));
        grid.setGridLinesVisible(false);

        grid.add(createContent(Sports), 0, 0);


        //primaryStage.setScene(new Scene(createContent(Sports)));
        primaryStage.setScene(new Scene(grid));
        primaryStage.setWidth(1200);
        primaryStage.show();
    }
}
