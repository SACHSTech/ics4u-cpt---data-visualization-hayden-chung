package basic;


public class SportsList {

    // Instance Variables
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

    /**  
     * Constructor - creates a new sport instance
     * @param gameNumber - the game number
     * @param dateNumber - the game 
     * @param gameTime - the game time
     * @param gameLocation - home or away
     * @param gameOpponent - the opponent
     * @param gameResult - win or loss
     * @param gameLength - legnth of game
     * @param raptorScore - raptor's score
     * @param opponentScore - opponent's score
     * @param totalWins - total number of wins
     * @param totalLosses - total number of losses
     * @param gameStreak - streaks of wins or losses
     */
    public SportsList (int gameNumber, String dateNumber, String gameTime, String gameLocation, String gameOpponent, String gameResult, String gameLength, int raptorScore, int opponentScore, int totalWins, int totalLosses, String gameStreak) {
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
    /** 
     * Getter method for game number
     * @return game number
     */
    public int getGameNumber() {
        return intGameNumber;
    }

    /** 
     * Getter method for date number
     * @return date number
     */
    public String getDateNumber() {
        return strDateNumber;
    }

    /** 
     * Getter method for game time
     * @return game time
     */
    public String getGameTime() {
        return strGameTime;
    }

    /** 
     * Getter method for game location
     * @return game location
     */
    public String getGameLocation() {
        return strGameLocation;
    }

    /** 
     * Getter method for game opponent
     * @return game opponent
     */
    public String getGameOpponent() {
        return strGameOpponent;
    }

    /** 
     * Getter method for game result
     * @return game result
     */
    public String getGameResult() {
        return strGameResult;
    }

    /** 
     * Getter method for game length
     * @return game length
     */
    public String getGameLength() {
        return strGameLength;
    }

    /** 
     * Getter method for raptor score
     * @return raptor score
     */
    public int getRaptorScore() {
        return intRaptorScore;
    }

    /** 
     * Getter method for opponent score
     * @return opponent score
     */
    public int getOpponentScore() {
        return intOpponentScore;
    }

    /** 
     * Getter method for total wins
     * @return total wins
     */
    public int getTotalWins() {
        return intTotalWins;
    }

    /** 
     * Getter method for total wins
     * @return total wins
     */
    public int getTotalLosses() {
        return intTotalLosses;
    }
    
    /** 
     * Getter method for game streak
     * @return game streak
     */
    public String getGameStreak() {
        return strGameStreak;
    }

    /** 
     * String for a game
     * @return all properties of game
     */
    public String toString() {
        return this.intGameNumber + "  |  " + this.strDateNumber + "  |  " + this.strGameTime + "  |  " + this.strGameLocation + "  |  " + this.strGameOpponent + "  |  " + this.strGameResult + "  |  " + this.strGameLength + "  |  " + this.intRaptorScore + "  |  " + this.intOpponentScore + "  |  " + this.intTotalWins + "  |  " + this.intTotalLosses + "  |  " + this.strGameStreak;
    }
}