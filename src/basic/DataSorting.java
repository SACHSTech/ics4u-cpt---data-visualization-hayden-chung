package basic;

public class DataSorting {
    /** 
     * Calculates average number of points scored by a raptor
     * @param sportsArray - sports list array
     * @return Average points score
     */
    public static double averagePoints(SportsList[] sportsArray) {
        double dblAverage = 0;

        for(int intCount = 0; intCount < sportsArray.length; intCount++) {
            dblAverage = dblAverage + sportsArray[intCount].getRaptorScore();
        }
        dblAverage = (dblAverage / 106);
        dblAverage = Math.round((dblAverage) * 1000);
        dblAverage = (dblAverage / 1000);
        return dblAverage;

    }
    /** 
     * Calculates average number of points scored by a opponent
     * @param sportsArray - sports list array
     * @return Average points scored
     */
    public static double averagePoints2(SportsList[] sportsArray) {
        double dblAverage = 0;

        for(int intCount = 0; intCount < sportsArray.length; intCount++) {
            dblAverage = dblAverage + sportsArray[intCount].getOpponentScore();
        }
        dblAverage = (dblAverage / 106);
        dblAverage = Math.round((dblAverage) * 1000);
        dblAverage = (dblAverage / 1000);
        return dblAverage;

    }
    /** 
     * Search for games by specific opponent
     * @param sportsArray - sports list array
     * @param strOpponent - the opponent
     * @return list of games by given opponent
     */
    public static String searchOpponent(SportsList[] sportsArray, String strOpponent) {
        String strOpponent1;
        //String strOpponent2;
        for (int intCount = 0; intCount < sportsArray.length; intCount++) {
            strOpponent1 = sportsArray[intCount].getGameOpponent();
            if(strOpponent1.equals(strOpponent)) {
                System.out.println(sportsArray[intCount].toString());
            }
        }
        return "End of Opponents searched";
    }

    /** 
     * Sort home or away games
     * @param sportsArray - sports list array
     * @param strHome - away or home
     * @return print out away or home games
     */
    public static String searchHome(SportsList[] sportsArray, String strHome) {
        String strHomeGames;
        //String strOpponent2;
        for (int intCount = 0; intCount < sportsArray.length; intCount++) {
            strHomeGames = sportsArray[intCount].getGameLocation();
            if(strHomeGames.equals(strHome)) {
                System.out.println(sportsArray[intCount].toString());
            }
        }
        return "End of home games list";
    }
    /** 
     * Search data for specific game
     * @param sportsArray - sports list array
     * @param intNumber - specific game number
     * @return specific game
     */
    public static String gameNumber(SportsList[] sportsArray, int intNumber) {
        int intGameNumber;
        for (int intCount = 0; intCount < sportsArray.length; intCount++) {
            intGameNumber = sportsArray[intCount].getGameNumber();
            if(intGameNumber == intNumber) {
                System.out.println(sportsArray[intCount].toString());
            }
        }
        if(intNumber <= 106) {
            return "Game was searched for";
        } else {
            return "Game was not found";
        }
    }
    
    /** 
     * Sort by Highest Points from raptors
     * @param sportsArray - sports list array
     * @return highest to lowest points
     */
    public static String sortHighestPoints(SportsList[] sportsArray) {

        int intCurrentPoints;

        for(int intCount = 0; intCount < sportsArray.length; intCount++) {
            intCurrentPoints = intCount;

            for(int intCount1 = intCount + 1; intCount1 < sportsArray.length; intCount1++) {
                if(sportsArray[intCount1].getRaptorScore() > sportsArray[intCurrentPoints].getRaptorScore()) {
                    intCurrentPoints = intCount1;
                }
            }
            if(intCount != intCurrentPoints) {
                SportsList points = sportsArray[intCurrentPoints];
                sportsArray[intCurrentPoints] = sportsArray[intCount];
                System.out.println(sportsArray[intCount] = points);
            }
        }
        return "Sorted by printing out Raptors Score from highest to lowest";
    }

    /** 
     * Sort by Lowest Points from raptors
     * @param sportsArray - sports list array
     * @return lowest to highest points
     */
    public static String sortLowestPoints(SportsList[] sportsArray) {

        int intCurrentPoints;

        for(int intCount = 0; intCount < sportsArray.length; intCount++) {
            intCurrentPoints = intCount;

            for(int intCount1 = intCount + 1; intCount1 < sportsArray.length; intCount1++) {
                if(sportsArray[intCount1].getRaptorScore() < sportsArray[intCurrentPoints].getRaptorScore()) {
                    intCurrentPoints = intCount1;
                }
            }
            if(intCount != intCurrentPoints) {
                SportsList points = sportsArray[intCurrentPoints];
                sportsArray[intCurrentPoints] = sportsArray[intCount];
                System.out.println(sportsArray[intCount] = points);
            }
        }
        return "Sorted by printing out Raptors Score from lowest to highest";
    }
    
    /** 
     * Sort by Highest Points from opponent
     * @param sportsArray - sports list array
     * @return highest to lowest points
     */
    public static String sortHighestOpponentPoints(SportsList[] sportsArray) {

        int intCurrentPoints;

        for(int intCount = 0; intCount < sportsArray.length; intCount++) {
            intCurrentPoints = intCount;

            for(int intCount1 = intCount + 1; intCount1 < sportsArray.length; intCount1++) {
                if(sportsArray[intCount1].getOpponentScore() > sportsArray[intCurrentPoints].getOpponentScore()) {
                    intCurrentPoints = intCount1;
                }
            }
            if(intCount != intCurrentPoints) {
                SportsList points = sportsArray[intCurrentPoints];
                sportsArray[intCurrentPoints] = sportsArray[intCount];
                System.out.println(sportsArray[intCount] = points);
            }
        }
        return "Sort games by Opponent Score from Highest to lowest";
    }

    /** 
     * Sort by lowest Points from opponent
     * @param sportsArray - sports list array
     * @return lowest to highest points
     */
    public static String sortLowestOpponentPoints(SportsList[] sportsArray) {

        int intCurrentPoints;

        for(int intCount = 0; intCount < sportsArray.length; intCount++) {
            intCurrentPoints = intCount;

            for(int intCount1 = intCount + 1; intCount1 < sportsArray.length; intCount1++) {
                if(sportsArray[intCount1].getOpponentScore() < sportsArray[intCurrentPoints].getOpponentScore()) {
                    intCurrentPoints = intCount1;
                }
            }
            if(intCount != intCurrentPoints) {
                SportsList points = sportsArray[intCurrentPoints];
                sportsArray[intCurrentPoints] = sportsArray[intCount];
                System.out.println(sportsArray[intCount] = points);
            }
        }
        return "Sort games by Opponent Score from Lowest to highest";
    }
    /** 
     * Print out only wins or lost
     * @param sportsArray - sports list array
     * @param strResults - W or L
     * @return Only wins or lost
     */
    public static String searchResults(SportsList[] sportsArray, String strResults) {
        String strResults1;
        for (int intCount = 0; intCount < sportsArray.length; intCount++) {
            strResults1 = sportsArray[intCount].getGameResult();
            if(strResults1.equals(strResults)) {
                System.out.println(sportsArray[intCount].toString());
            }
        }
        return "Sorted by wins or losses";
    }
    /** 
     * Print out only regular season games
     * @param sportsArray - sports list array
     * @return regular season games
     */
    public static String searchRegular(SportsList[] sportsArray) {
        for(int intCount = 0; intCount < 82; intCount++) {
            System.out.println(sportsArray[intCount].toString());
        }
        return "Regular season games only";
    }
    /** 
     * Print out only playoff games
     * @param sportsArray - sports list array
     * @return playoff games
     */
    public static String searchPlayoff(SportsList[] sportsArray) {
        for(int intCount = 0; intCount < sportsArray.length; intCount++) {
            if(intCount >= 82){
                System.out.println(sportsArray[intCount].toString());
            }
        }
        return "Playoff games only";
    }
    /** 
     * Print out certain win streaks
     * @param sportsArray - sports list array
     * @param strGame - winstreaks or lose streaks
     * @return winstreaks or lose streaks
     */
    public static String searchWinStreak(SportsList[] sportsArray, String strGame) {
        String strGameStreak;
        //String strOpponent2;
        for (int intCount = 0; intCount < sportsArray.length; intCount++) {
            strGameStreak = sportsArray[intCount].getGameStreak();
            if(strGameStreak.equals(strGame)) {
                System.out.println(sportsArray[intCount].toString());
            }
        }
        return "Game Streaks";
    }
    /** 
     * Print out total amount of wins or losses
     * @param sportsArray - sports list array
     * @param strResults - W or L
     * @return total amount of wins or losses
     */
    public static int totalWins(SportsList[] sportsArray, String strResults) {
        String strTotal;
        int intCount1 = 0;
        //String strOpponent2;
        for (int intCount = 0; intCount < sportsArray.length; intCount++) {
            strTotal = sportsArray[intCount].getGameResult();
            if(strTotal.equals(strResults)) {
                intCount1++;
                //System.out.println(sportsArray[intCount].toString());
            }
        }
        return intCount1;
    }

    /** 
     * Returning total number of points scored in range
     * @param sportsArray - sports list array
     * @return total number of games between 80-100
     */
    public static int sortingPoints(SportsList[] sportsArray) {
        double dblAverage = 0;
        int intCount1 = 0;

        for(int intCount = 0; intCount < sportsArray.length; intCount++) {
            dblAverage = sportsArray[intCount].getRaptorScore();
            if(dblAverage >= 80 && dblAverage <= 100){
                intCount1++;
            }
        }
        return intCount1;
    }

    /** 
     * Returning total number of points scored in range
     * @param sportsArray - sports list array
     * @return total number of games between 101-120
     */
    public static int sortingPoints1(SportsList[] sportsArray) {
        double dblAverage = 0;
        int intCount1 = 0;

        for(int intCount = 0; intCount < sportsArray.length; intCount++) {
            dblAverage = sportsArray[intCount].getRaptorScore();
            if(dblAverage >= 101 && dblAverage <= 120){
                intCount1++;
            }
        }
        return intCount1;
    }

    /** 
     * Returning total number of points scored in range
     * @param sportsArray - sports list array
     * @return total number of games between 120+
     */
    public static int sortingPoints2(SportsList[] sportsArray) {
        double dblAverage = 0;
        int intCount1 = 0;

        for(int intCount = 0; intCount < sportsArray.length; intCount++) {
            dblAverage = sportsArray[intCount].getRaptorScore();
            if(dblAverage >= 121){
                intCount1++;
            }
        }
        return intCount1;
    }
    /** 
     * Returning total number of points scored in range for win or loss
     * @param sportsArray - sports list array
     * @param strGameResult - W or L
     * @return total number of games between 80 - 100
     */
    public static int sortingPoints3(SportsList[] sportsArray, String strGameResult) {
        double dblAverage = 0;
        int intCount1 = 0;
        String strResults1;
        for(int intCount = 0; intCount < sportsArray.length; intCount++) {
            dblAverage = sportsArray[intCount].getRaptorScore();
            strResults1 = sportsArray[intCount].getGameResult();
            if(dblAverage >= 80 && dblAverage <= 100 && strGameResult.equalsIgnoreCase(strResults1)){
                intCount1++;
            }
        }
        return intCount1;
    }
    /** 
     * Returning total number of points scored in range for win or loss
     * @param sportsArray - sports list array
     * @param strGameResult - W or L
     * @return total number of games between 101 - 120
     */
    public static int sortingPoints4(SportsList[] sportsArray, String strGameResult) {
        double dblAverage = 0;
        int intCount1 = 0;
        String strResults1;
        for(int intCount = 0; intCount < sportsArray.length; intCount++) {
            dblAverage = sportsArray[intCount].getRaptorScore();
            strResults1 = sportsArray[intCount].getGameResult();
            if(dblAverage >= 101 && dblAverage <= 120 && strGameResult.equalsIgnoreCase(strResults1)){
                intCount1++;
            }
        }
        return intCount1;
    }
    /** 
     * Returning total number of points scored in range for win or loss
     * @param sportsArray - sports list array
     * @param strGameResult - W or L
     * @return total number of games for 121+
     */
    public static int sortingPoints5(SportsList[] sportsArray, String strGameResult) {
        double dblAverage = 0;
        int intCount1 = 0;
        String strResults1;
        for(int intCount = 0; intCount < sportsArray.length; intCount++) {
            dblAverage = sportsArray[intCount].getRaptorScore();
            strResults1 = sportsArray[intCount].getGameResult();
            if(dblAverage >= 121 && strGameResult.equalsIgnoreCase(strResults1)){
                intCount1++;
            }
        }
        return intCount1;
    }
    /** 
     * Returning games finished in selected time
     * @param sportsArray - sports list array
     * @param strTime - Regulation, OT, or 2OT
     * @return total number of games finished between a certain period of time
     */
    public static int timeFind(SportsList[] sportsArray, String strTime) {
        int intCount1 = 0;
        String strResult;
        for (int intCount = 0; intCount < sportsArray.length; intCount++) {
            strResult = sportsArray[intCount].getGameLength();
            if(strResult.equals(strTime)) {
                intCount1++;
            }
        }
        return intCount1;
    }
}
