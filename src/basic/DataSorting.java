package basic;

public class DataSorting {
    
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

    public static String searchRegular(SportsList[] sportsArray) {
        for(int intCount = 0; intCount < 82; intCount++) {
            System.out.println(sportsArray[intCount].toString());
        }
        return "Regular season games only";
    }

    public static String searchPlayoff(SportsList[] sportsArray) {
        for(int intCount = 0; intCount < sportsArray.length; intCount++) {
            if(intCount >= 82){
                System.out.println(sportsArray[intCount].toString());
            }
        }
        return "Playoff games only";
    }

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

    public static int totalWins(SportsList[] sportsArray, String strResults) {
        String strTotal;
        int intCount1 = 0;
        //String strOpponent2;
        for (int intCount = 0; intCount < sportsArray.length; intCount++) {
            strTotal = sportsArray[intCount].getGameResult();
            if(strTotal.equals(strResults)) {
                intCount1++;
                System.out.println(sportsArray[intCount].toString());
            }
        }
        if(strResults.equalsIgnoreCase("W")){
            System.out.println("The total amount of wins is:");
        } else if(strResults.equalsIgnoreCase("L")){
            System.out.println("The total amount of losses is: ");
        }
        return intCount1;
    }
    
}
