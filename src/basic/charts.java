package basic;

import java.util.Arrays;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class charts {
    
    // Variables for chart
    public static BarChart chart;
    public static CategoryAxis xAxis;
    public static NumberAxis yAxis;

    // Creating barchart
    public static Parent barChart(int intTotalWins2, int intTotalLosses2, int intTime1, int intTime2, int intTime3) {

        // Labels and axis
        String[] result = {"Wins", "Losses", "Regulation", "OT", "Double OT"};
        xAxis = new CategoryAxis();
        xAxis.setCategories(FXCollections.<String>observableArrayList(result));
        yAxis = new NumberAxis("Total Amount of Games", 0.0, 100.0, 10.0);

        // Adding data and creating barchart
        ObservableList<BarChart.Series> barChartData =
        FXCollections.observableArrayList(
            new BarChart.Series("Wins",  FXCollections.observableArrayList(new BarChart.Data(result[0], intTotalWins2))),
            new BarChart.Series("Losses",  FXCollections.observableArrayList(new BarChart.Data(result[1], intTotalLosses2))),
            new BarChart.Series("Regulation",  FXCollections.observableArrayList(new BarChart.Data(result[2], intTime1))),
            new BarChart.Series("OT",  FXCollections.observableArrayList(new BarChart.Data(result[3], intTime2))),
            new BarChart.Series("Double OT",  FXCollections.observableArrayList(new BarChart.Data(result[4], intTime3))));
        chart = new BarChart(xAxis, yAxis, barChartData, 0);
        chart.setBarGap(-20);
        chart.setCategoryGap(50);
        chart.setTitle("Total amount of wins, losses and when games finished");
        return chart;

    }

    // Variables for linechart
    private static final String[] gamePoints = {" 80 - 100", "101 - 120", "120+"};
    private static LineChart<String, Number> chart1;
    private static CategoryAxis xAxis1;
    private static NumberAxis yAxis1;


    public static Parent lineChart(int intTotal1, int intTotal2, int intTotal3, int intTotal4, int intTotal5, int intTotal6, int intTotal7, int intTotal8, int intTotal9) {
        // Create title and axis
        xAxis1 = new CategoryAxis();
        yAxis1 = new NumberAxis("Total Number of games", 0.0, 100.0, 5.0);
        chart1 = new LineChart<>(xAxis1, yAxis1);
        chart1.setTitle("Line Chart of the amount of times Raptors Score");
        xAxis1.setLabel("Range of points scored");
        yAxis1.setLabel("Total Number of games");

        // Data and posting Chart
        XYChart.Series<String, Number> series = new XYChart.Series<>();
        series.setName("Number of games scored within that Range");
        series.getData().add(new XYChart.Data<String, Number>(gamePoints[0], intTotal1));
        series.getData().add(new XYChart.Data<String, Number>(gamePoints[1], intTotal2));
        series.getData().add(new XYChart.Data<String, Number>(gamePoints[2], intTotal3));
        chart1.getData().add(series);

        XYChart.Series<String, Number> series1 = new XYChart.Series<>();
        series1.setName("Number of games scored within that Range in a Win");
        series1.getData().add(new XYChart.Data<String, Number>(gamePoints[0], intTotal4));
        series1.getData().add(new XYChart.Data<String, Number>(gamePoints[1], intTotal5));
        series1.getData().add(new XYChart.Data<String, Number>(gamePoints[2], intTotal6));
        chart1.getData().add(series1);

        XYChart.Series<String, Number> series2 = new XYChart.Series<>();
        series2.setName("Number of games scored within that Range in a Loss");
        series2.getData().add(new XYChart.Data<String, Number>(gamePoints[0], intTotal7));
        series2.getData().add(new XYChart.Data<String, Number>(gamePoints[1], intTotal8));
        series2.getData().add(new XYChart.Data<String, Number>(gamePoints[2], intTotal9));
        chart1.getData().add(series2);


        return chart1;
    }
}
