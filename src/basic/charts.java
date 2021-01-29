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
    
    public static BarChart chart;
    public static CategoryAxis xAxis;
    public static NumberAxis yAxis;

    public static Parent barChart(int intTotalWins2, int intTotalLosses2) {

        String[] result = {"Wins", "Losses"};
        xAxis = new CategoryAxis();
        xAxis.setCategories(FXCollections.<String>observableArrayList(result));
        yAxis = new NumberAxis("Total Amount of Games", 0.0, 80.0, 10.0);

        ObservableList<BarChart.Series> barChartData =
        FXCollections.observableArrayList(
            new BarChart.Series("Wins",  FXCollections.observableArrayList(new BarChart.Data(result[0], intTotalWins2))),
            new BarChart.Series("Losses",  FXCollections.observableArrayList(new BarChart.Data(result[1], intTotalLosses2))));
        chart = new BarChart(xAxis, yAxis, barChartData, 0);
        chart.setBarGap(-20);
        chart.setCategoryGap(150);
        chart.setTitle("Total Wins vs Total Losses");
        return chart;

    }

    private static final String[] gamePoints = {" 80 - 100", "101 - 120", "120+"};
    private static LineChart<String, Number> chart1;
    private static CategoryAxis xAxis1;
    private static NumberAxis yAxis1;


    public static Parent lineChart(int intTotal1, int intTotal2, int intTotal3) {
        xAxis1 = new CategoryAxis();
        yAxis1 = new NumberAxis("Total Number of games", 0.0, 60.0, 5.0);
        chart1 = new LineChart<>(xAxis1, yAxis1);
        chart1.setTitle("Line Chart of the amount of times Raptors Score");
        xAxis1.setLabel("Range of points scored");
        yAxis1.setLabel("Total Number of games");
        XYChart.Series<String, Number> series = new XYChart.Series<>();
        series.setName("Number of games scored within that Range");
        series.getData().add(new XYChart.Data<String, Number>(gamePoints[0], intTotal1));
        series.getData().add(new XYChart.Data<String, Number>(gamePoints[1], intTotal2));
        series.getData().add(new XYChart.Data<String, Number>(gamePoints[2], intTotal3));
        chart1.getData().add(series);
        return chart1;
    }
}
