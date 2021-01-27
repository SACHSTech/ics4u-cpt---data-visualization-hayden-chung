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


public class SportsList {

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

    public SportsList(int gameNumber, String dateNumber, String gameTime, String bestPlayer, String gameLocation, String gameOpponent, String gameResult, String gameLength, int raptorScore, int opponentScore, int totalWins, int totalLoses, String gameStreak) {
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

    public void setGameNumber(int gameNumber) {
        this.gameNumber = new SimpleIntegerProperty(gameNumber);
    }

    public void setDateNumber(String dateNumber) {
        this.dateNumber = new SimpleStringProperty(dateNumber);
    }

    public void setDateTime(String dateTime) {
        this.gameTime = new SimpleStringProperty(dateTime);
    }

    public void setBestPlayer(String bestPlayer) {
        this.bestPlayer = new SimpleStringProperty(bestPlayer);
    }

    public void setGameLocation(String gameLocation) {
        this.gameLocation = new SimpleStringProperty(gameLocation);
    }

    public void setGameOpponent(String gameOpponent) {
        this.gameOpponent = new SimpleStringProperty(gameOpponent);
    }

    p

    public static ArrayList<SportsList> csvToObject(String fileName) throws IOException {
        BufferedReader CSVFile = new BufferedReader(new FileReader(fileName));
        ArrayList<SportsList> SportsList = new ArrayList<>();

        while (CSVFile.readLine() != null) {

            String[] sportsCsv = CSVFile.readLine().split(",");
            
            SportsList sportsObj = new SportsList(0, "", "", "", "", "", "", "", 0, 0, 0, 0, "");

            sportsObj.setGameNumber(Integer.parseInt(sportsCsv[0]);
            sportsObj.setDateNumber(sportsCsv[1]);
            sportsObj.setDateTime(sportsCsv[2]);
            sportsObj.setBestPlayer(sportsCsv[3]);
            sportsObj.setGameLocation(sportsCsv[4]);
            sportsObj.setGameOpponent(sportsCsv[5]);
            sportsObj.setGameResult(sportsCsv[6]);
            sportsObj.setGameLength(sportsCsv[7]);
            sportsObj.setRaptorScore(sportsCsv[8]);
            sportsObj.setOpponentScore(sportsCsv[9]);
            sportsObj.setTotalWins(sportsCsv[10]);
            sportsObj.setTotalLosses(sportsCsv[11]);
            sportsObj.setGameStreak(sportsCsv[12]);

            SportsList.add(sportsObj);
        }
        CSVFile.close();
        return SportsList;
    }
}
