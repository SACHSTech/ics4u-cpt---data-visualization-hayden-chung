package basic;

import java.io.*;
import java.util.*;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;


public class sportslist {

    private IntegerProperty gameNumber;
    private StringProperty dateNumber;
    private StringProperty gameTime;
    private StringProperty bestPlayer;
    private StringProperty gameLocation;
    private StringProperty gameOpponent;
    private StringProperty gameResult;
    private StringProperty gameLength;
    private IntegerProperty raptorScore;
    private IntegerProperty opponentScore;
    private IntegerProperty totalWins;
    private IntegerProperty totalLoses;
    private StringProperty gameStreak;

    public sportslist(int gameNumber, String dateNumber, String gameTime, String bestPlayer, String gameLocation, String gameOpponent, String gameResult, String gameLength, int raptorScore, int opponentScore, int totalWins, int totalLoses, String gameStreak) {
        this.gameNumber = new SimpleIntegerProperty(gameNumber);
        this.dateNumber = new SimpleStringProperty(dateNumber);
        this.gameTime = new SimpleStringProperty(gameTime);
        this.bestPlayer = new SimpleStringProperty(bestPlayer);
        this.gameLocation = new SimpleStringProperty(gameLocation);
        this.gameOpponent = new SimpleStringProperty(gameOpponent);
        this.gameResult = new SimpleStringProperty(gameResult);
        this.gameLength = new SimpleStringProperty(gameLength);
        this.raptorScore = new SimpleIntegerProperty(raptorScore);
        this.opponentScore = new SimpleIntegerProperty(opponentScore);
        this.totalWins = new SimpleIntegerProperty(totalWins);
        this.totalLoses = new SimpleIntegerProperty(totalLoses);
        this.gameStreak = new SimpleStringProperty(gameStreak);
    }

    public IntegerProperty gameNumberProperty() {
        return gameNumber;
    }

    public StringProperty dateNumberProperty() {
        return dateNumber;
    }

    public StringProperty gameTimeProperty() {
        return gameTime; 
    }

    public StringProperty bestPlayerProperty() {
        return bestPlayer;
    }

    public StringProperty gameLocationProperty() {
        return gameLocation;
    }

    public StringProperty gameOpponentProperty() {
        return gameOpponent;
    }

    public StringProperty gameResultProperty() {
        return gameResult;
    }

    public StringProperty gameLengthProperty() {
        return gameLength;
    }

    public IntegerProperty raptorScoreProperty() {
        return raptorScore;
    }

    public IntegerProperty opponentScoreProperty() {
        return opponentScore;
    }

    public IntegerProperty totalWinsProperty() {
        return totalWins;
    }

    public IntegerProperty totalLossesProperty() {
        return totalLoses;
    }

    public StringProperty gameStreakProperty() {
        return gameStreak;
    }

    public static ArrayList<sportslist> csvToObject(String fileName) throws IOException {
        BufferedReader CSVFile = new BufferedReader(new FileReader(fileName));
        ArrayList<sportslist> SportsList = new ArrayList<>();
        
        while (CSVFile.readLine() != null) {

            String[] sportsCsv = CSVFile.readLine().split(",");


        }
        

        

    }
}
