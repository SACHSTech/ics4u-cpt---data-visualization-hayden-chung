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
            System.out.println("If you want to view some charts, type in the word chart");
            System.out.println("If you want to exit the program, type exit");
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
                    }else {
                        sportsList = new SportsList(intGameNumber, strDateNumber, strGameTime, strGameLocation, strGameOpponent, strGameResult, strGameLength, intRaptorScore, intOpponentScore, intTotalWins, intTotalLosses, strGameStreak);
                        sportsArray[intCount] = sportsList;
                    }
                }
            SportsData.close();
            SportsData = new BufferedReader(new FileReader("src/basic/sports.csv"));
            if (strChoice.equalsIgnoreCase("Algorithms")) {
                System.out.println("Type out which algorithm you would like to use");
                System.out.println("Type in 1 if you want to search a certain game streak");
                System.out.println("Type in 2 if you want to search playoff games only");
                System.out.println("Type in 3 if you want to search regular season games only");
                System.out.println("Type in 4 if you want to sort the Raptors score by lowest amount");
                System.out.println("Type in 5 if you want to sort the opponents score by lowest amount");
                System.out.println("Type in 6 if you want to sort the games by wins or losses");
                System.out.println("Type in 7 if you want to sort the games by highest scored by a Raptor");
                System.out.println("Type in 8 if you want to sort the games by highest scored by a opponent");
                System.out.println("Type in 9 if you want to find games vs a certain opponent");
                System.out.println("Type in 10 if you want to sort games by home or away");
                System.out.println("Type in 11 if you want to see the average amount of points scored by the Raptors");
                System.out.println("Type in 12 if you want to see the average amount of points scored on the Raptors");
                System.out.println("Type in 13 if you want to see specific game");
                System.out.println("Type 14 to see the total amount of losses or wins and print out those games");
                intOption = Integer.parseInt(keyboard.readLine());
                if (intOption == 1){
                    System.out.println("Type a game streak for wins or losses and the amount next to it (From: L 1 - L 2 and W 1 - W 8 ");
                    strGameStreak = keyboard.readLine();
                    System.out.println(DataSorting.searchWinStreak(sportsArray, strGameStreak));
                }else if (intOption == 2) {
                    // Print out only playoff or regular season games
                    System.out.println(DataSorting.searchRegular(sportsArray));
                }else if (intOption == 3) {    
                    System.out.println(DataSorting.searchPlayoff(sportsArray));
                } else if (intOption == 4) {
                    // Sort Lowest Points
                    System.out.println(DataSorting.sortLowestPoints(sportsArray));
                } else if (intOption == 5){
                    System.out.println(DataSorting.sortLowestOpponentPoints(sportsArray));
                } else if (intOption == 6) {
                    // Sort by wins or losses
                    System.out.println("Type W or L to sort Raptors Wins and losses");
                    strWinsOrLoss = keyboard.readLine();
                    System.out.println(DataSorting.searchResults(sportsArray, strWinsOrLoss));
                } else if (intOption == 7) {
                    // Sorting points from raptor and opponents
                    System.out.println(DataSorting.sortHighestPoints(sportsArray));
                } else if (intOption == 8) {
                    System.out.println(DataSorting.sortHighestOpponentPoints(sportsArray));
                } else if (intOption == 9){
                    // Opponents
                    System.out.println("Type in opponent you want to search");
                    strOpponentChoice = keyboard.readLine();
                    System.out.println(DataSorting.searchOpponent(sportsArray, strOpponentChoice));
                } else if (intOption == 10) {
                    // Away or Home games
                    System.out.println("Type Away or Home");
                    strLocation = keyboard.readLine();
                    System.out.println(DataSorting.searchHome(sportsArray, strLocation));
                } else if (intOption == 11) {
                    // Average points scored for Raptors and Opponents
                    System.out.println(DataSorting.averagePoints(sportsArray));
                } else if (intOption == 12) {
                    System.out.println(DataSorting.averagePoints2(sportsArray));
                } else if (intOption == 13) {
                    // Search specific game number
                    System.out.println("Type a specific game number to print it out from 1-106");
                    intGameNumber1 = Integer.parseInt(keyboard.readLine());
                    System.out.println(DataSorting.gameNumber(sportsArray, intGameNumber1));
                } else if (intOption == 14) {
                    // Total losses or Wins
                    System.out.println("Type W or L to see the total amount of wins or losses and to view only wins or losses");
                    String strChoice1 = keyboard.readLine();
                    System.out.println(DataSorting.totalWins(sportsArray, strChoice1));
                }
            }else if(strChoice.equalsIgnoreCase("Chart")) {

                
            }else if(strChoice.equalsIgnoreCase("exit")){
                System.out.println("The program will now close");
                blnLoop = false;
            }
        }
    }
}
