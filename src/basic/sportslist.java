package basic;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;


public class sportslist {

    private StringProperty gameNumber;
    private StringProperty dateNumber;
    private StringProperty mostScored;
    private StringProperty gameLocation;
    private StringProperty gameOpponent;
    private StringProperty gameResult;
    private StringProperty gameLength;
    private StringProperty raptorScore;
    private StringProperty opponentScore;
    private StringProperty totalWins;
    private StringProperty totalLoses;
    private StringProperty gameStreak;

    public sportslist(String gameNumber, String dateNumber, String mostScored, String gameLocation, String gameOpponent, String gameResult, String gameLength, String raptorScore, String opponentScore, String totalWins, String totalLoses, String gameStreak) {
        this.gameNumber = new SimpleStringProperty(gameNumber);
        this.dateNumber = new SimpleStringProperty(dateNumber);
        this.mostScored = new SimpleStringProperty(mostScored);
        this.gameLocation = new SimpleStringProperty(gameLocation);
        this.gameOpponent = new SimpleStringProperty(gameOpponent);
        this.gameResult = new SimpleStringProperty(gameResult);
        this.gameLength = new SimpleStringProperty(gameLength);
        this.raptorScore = new SimpleStringProperty(raptorScore);
        this.opponentScore = new SimpleStringProperty(opponentScore);
        this.totalWins = new SimpleStringProperty(totalWins);
        this.totalLoses = new SimpleStringProperty(totalLoses);
        this.gameStreak = new SimpleStringProperty(gameStreak);
    }
}
