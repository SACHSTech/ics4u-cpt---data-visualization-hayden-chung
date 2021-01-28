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

    public 

    
}
