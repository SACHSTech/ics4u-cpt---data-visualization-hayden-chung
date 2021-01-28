package basic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainMenu {

    public static void main(String[] args) throws IOException {
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        
        String strLine = " ";
        int intGameNumber;
        String strDateNumber;
        String strGameTime;
        String strGameLocation;
        String strGameOpponent;
        String strGameResult;
        String strGameLength;
        int intRaptorScore;
        int intOpponentScore;
        int intTotalWins;
        int intTotalLosses;
        String strGameStreak;
        SportsList sportsList;

        SportsList[] Sports = new SportsList[106];

        BufferedReader SportsData = new BufferedReader(new FileReader("src/basic/sports.csv"));

        for(int intCount = 0 ;intCount < 106; intCount++) {
            strLine = SportsData.readLine();
            String[] sportsCsv = strLine.split(",");
            
            intGameNumber = Integer.parseInt(sportsCsv[0]);
            strDateNumber = sportsCsv[1];
            strGameTime = sportsCsv[2];
            strGameLocation = sportsCsv[3];
            strGameOpponent = sportsCsv[4];
            strGameResult = sportsCsv[5];
            strGameLength = sportsCsv[6];
            intRaptorScore = Integer.parseInt(sportsCsv[7]);
            intOpponentScore = Integer.parseInt(sportsCsv[8]);
            intTotalWins = Integer.parseInt(sportsCsv[9]);
            intTotalLosses = Integer.parseInt(sportsCsv[10]);
            strGameStreak = sportsCsv[11];
            
            sportsList = new SportsList(intGameNumber, strDateNumber, strGameTime, strGameLocation, strGameOpponent, strGameResult, strGameLength, intRaptorScore, intOpponentScore, intTotalWins, intTotalLosses, strGameStreak);
            Sports[intCount] = sportsList;
        }

        SportsData.close();

        System.out.println(DataSorting.averagePoints(Sports));
    }

}
