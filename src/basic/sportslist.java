package basic;


public class SportsList {
    private int intGameNumber;
    private String strDateNumber;
    private String strGameTime;
    private String strGameLocation;
    private String strGameOpponent;
    private String strGameResult;
    private String strGameLength;
    private int intRaptorScore;
    private int intOpponentScore;
    private int intTotalWins;
    private int intTotalLosses;
    private String strGameStreak;

    public SportsList(int gameNumber, String dateNumber, String gameTime, String gameLocation, String gameOpponent, String gameResult, String gameLength, int raptorScore, int opponentScore, int totalWins, int totalLosses, String gameStreak) {
        this.intGameNumber = gameNumber;
        this.strDateNumber = dateNumber;
        this.strGameTime = gameTime;
        this.strGameLocation = gameLocation;
        this.strGameOpponent = gameOpponent;
        this.strGameResult = gameResult;
        this.strGameLength = gameLength;
        this.intRaptorScore = raptorScore;
        this.intOpponentScore = opponentScore;
        this.intTotalWins = totalWins;
        this.intTotalLosses = totalLosses;
        this.strGameStreak = gameStreak;
    }

    public int getGameNumber() {
        return intGameNumber;
    }

    public String getDateNumber() {
        return strDateNumber;
    }

    public String getGameTime() {
        return strGameTime;
    }

    public String getGameLocation() {
        return strGameLocation;
    }

    public String getGameOpponent() {
        return strGameOpponent;
    }

    public String getGameResult() {
        return strGameResult;
    }

    public String getGameLength() {
        return strGameLength;
    }

    public int getRaptorScore() {
        return intRaptorScore;
    }

    public int getOpponentScore() {
        return intOpponentScore;
    }

    public int getTotalWins() {
        return intTotalWins;
    }

    public int getTotalLosses() {
        return intTotalLosses;
    }

    public String getGameStreak() {
        return strGameStreak;
    }

    public String toString() {
        return this.intGameNumber + " | " + this.strDateNumber + " | " + this.strGameTime + " | " + this.strGameLocation + " | " + this.strGameOpponent + " | " + this.strGameResult + " | " + this.strGameLength + " | " + this.intRaptorScore + " | " + this.intOpponentScore + " | " + this.intTotalWins + " | " + this.intTotalLosses + " | " + this.strGameStreak;
    }
}