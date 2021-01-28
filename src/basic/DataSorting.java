package basic;

public class DataSorting {
    
    public static double averagePoints(SportsList[] sportsArray) {
        double dblAverage = 0;

        for(int intCount = 0; intCount < sportsArray.length; intCount++) {
            dblAverage = dblAverage + sportsArray[intCount].getRaptorScore();
        }
        dblAverage = dblAverage / 106;
        return dblAverage;

    }
}
