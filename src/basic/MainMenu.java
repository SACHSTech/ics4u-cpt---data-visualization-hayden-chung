package basic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.Arrays;

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

        String strChoice;
        int intOption;

        String strOpponentChoice;
        String strLocation;
        int intGameNumber1;
        String strWinsOrLoss;
        String strGameStreak1;

        boolean blnLoop = true;
        boolean blnLoop2 = true;
        

        SportsList[] sportsArray = new SportsList[106];

        BufferedReader SportsData = new BufferedReader(new FileReader("src/basic/sports.csv"));
        while(blnLoop == true){
            System.out.println("Hi! \nWelcome to the 2018-2019 Toronto Raptors NBA Season!");
            System.out.println("If you want to print out the database, type in the word Database");
            System.out.println("If you want to use the sorting algorithms, type in the word Algorithms");
            strChoice = keyboard.readLine();
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
                    if(strChoice.equalsIgnoreCase("Database")){
                        System.out.println( sportsList = new SportsList(intGameNumber, strDateNumber, strGameTime, strGameLocation, strGameOpponent, strGameResult, strGameLength, intRaptorScore, intOpponentScore, intTotalWins, intTotalLosses, strGameStreak));
                        sportsArray[intCount] = sportsList;
                        blnLoop = true;
                    }else {
                        sportsList = new SportsList(intGameNumber, strDateNumber, strGameTime, strGameLocation, strGameOpponent, strGameResult, strGameLength, intRaptorScore, intOpponentScore, intTotalWins, intTotalLosses, strGameStreak);
                        sportsArray[intCount] = sportsList;
                    }
                }
            SportsData.close();
            if (strChoice.equalsIgnoreCase("Algorithms")) {
                System.out.println("Type out which algorithm you would like to use");
                System.out.println("Type in 1 if you want to search a certain game streak");
                System.out.println("Type in 2 if you want to search playoff games only");
                System.out.println("Type in 3 if you want to search regular season games only");
                System.out.println("Type in 4 if you want to sort the Raptors score by lowest amount");
                System.out.println("")
                intOption = Integer.parseInt(keyboard.readLine());
                System.out.println("Type a game streak for wins or losses and the amount next to it (From: L 1 - L 2 and W 1 - W 8 ");
                strGameStreak = keyboard.readLine();
                System.out.println(DataSorting.searchWinStreak(sportsArray, strGameStreak));
                // Print out only playoff or regular season games
                System.out.println(DataSorting.searchRegular(sportsArray));
                System.out.println(DataSorting.searchPlayoff(sportsArray));
                
                // Sort Lowest Points
                System.out.println(DataSorting.sortLowestPoints(sportsArray));
                System.out.println(DataSorting.sortLowestOpponentPoints(sportsArray));
                // Sort by wins or losses
                System.out.println("Type W or L to sort Raptors Wins and losses");
                strWinsOrLoss = keyboard.readLine();
                System.out.println(DataSorting.searchResults(sportsArray, strWinsOrLoss));
                // Sorting points from raptor and opponents
                System.out.println(DataSorting.sortHighestPoints(sportsArray));
                System.out.println(DataSorting.sortHighestOpponentPoints(sportsArray));
                // Opponents
                System.out.println("Type in opponent you want to search");
                strOpponentChoice = keyboard.readLine();
                System.out.println(DataSorting.searchOpponent(sportsArray, strOpponentChoice));
        
                // Away or Home games
                System.out.println("Type Away or Home");
                strLocation = keyboard.readLine();
                System.out.println(DataSorting.searchHome(sportsArray, strLocation));

                // Average points scored for Raptors and Opponents
                System.out.println(DataSorting.averagePoints(sportsArray));
                System.out.println(DataSorting.averagePoints2(sportsArray));
            
                // Search specific game number
                System.out.println("Type a specific game number to print it out from 1-106");
                intGameNumber1 = Integer.parseInt(keyboard.readLine());
                System.out.println(DataSorting.gameNumber(sportsArray, intGameNumber1));
            }
        }
    }
}
