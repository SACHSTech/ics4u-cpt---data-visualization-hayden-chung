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
        final ObservableList<SportsList> data = FXCollections.observableArrayList(Sports);
        /*
        TableColumn gameNumberColumn = new TableColumn();
        //gameNumberColumn.setMinWidth(500);
        gameNumberColumn.setText("Game Number");
        gameNumberColumn.setCellFactory(new PropertyValueFactory("gameNumber"));

        TableColumn dateNumberColumn = new TableColumn();
        dateNumberColumn.setText("Date");
        dateNumberColumn.setCellFactory(new PropertyValueFactory("dateNumber"));

        TableColumn gameTimeColumn = new TableColumn();
        gameTimeColumn.setText("Game Time");
        gameTimeColumn.setCellFactory(new PropertyValueFactory("gameTime"));

        TableColumn bestPlayerColumn = new TableColumn();
        bestPlayerColumn.setText("Best Player");
        bestPlayerColumn.setCellFactory(new PropertyValueFactory("bestPlayer"));

        TableColumn gameLocationColumn = new TableColumn();
        gameLocationColumn.setText("Game Location");
        gameLocationColumn.setCellFactory(new PropertyValueFactory("gameLocation"));

        TableColumn gameOpponentColumn = new TableColumn();
        gameOpponentColumn.setText("Game Opponent");
        gameOpponentColumn.setCellFactory(new PropertyValueFactory("gameOpponent"));

        TableColumn gameResultColumn = new TableColumn();
        gameResultColumn.setText("Game Result");
        gameResultColumn.setCellFactory(new PropertyValueFactory("gameResult"));

        TableColumn gameLengthColumn = new TableColumn();
        gameLengthColumn.setText("Game Length");
        gameLengthColumn.setCellFactory(new PropertyValueFactory("gameLength"));

        TableColumn raptorScoreColumn = new TableColumn();
        raptorScoreColumn.setText("Raptor Score");
        raptorScoreColumn.setCellFactory(new PropertyValueFactory("raptorScore"));

        TableColumn opponentScoreColumn = new TableColumn();
        opponentScoreColumn.setText("Opponent Score");
        opponentScoreColumn.setCellFactory(new PropertyValueFactory("opponentScore"));

        TableColumn totalWinsColumn = new TableColumn();
        totalWinsColumn.setText("Total Wins");
        totalWinsColumn.setCellFactory(new PropertyValueFactory("totalWins"));

        TableColumn totalLosesColumn = new TableColumn();
        totalLosesColumn.setText("Total Loses");
        totalLosesColumn.setCellFactory(new PropertyValueFactory("totalLoses"));
        */
        TableColumn gameStreakColumn = new TableColumn();
        gameStreakColumn.setText("Game Streak");
        gameStreakColumn.setCellFactory(new PropertyValueFactory("gameStreak"));

        final TableView tableView = new TableView();
        //tableView.getColumns().addAll(gameNumberColumn, dateNumberColumn, gameTimeColumn, bestPlayerColumn, gameLocationColumn, gameOpponentColumn, gameResultColumn, gameLengthColumn, raptorScoreColumn, opponentScoreColumn, totalWinsColumn, totalLosesColumn, gameStreakColumn);
        tableView.getColumns().addAll(gameStreakColumn);
        tableView.setItems(data);
        return tableView;
    }
    
    public static void DataBaseScreen (Stage primaryStage, ArrayList<SportsList> Sports) {

        GridPane grid = new GridPane();
        grid.setVgap(12);
        grid.setHgap(12);
        grid.setPadding(new Insets(25, 25, 25, 25));
        grid.setGridLinesVisible(false);

        grid.add(createContent(Sports), 0, 0);


        primaryStage.setScene(new Scene(createContent(Sports)));
        primaryStage.setScene(new Scene(grid));
        primaryStage.setWidth(1200);
        primaryStage.show();
    }
}
