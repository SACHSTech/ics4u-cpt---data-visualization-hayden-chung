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
        yAxis = new NumberAxis("Total", 0.0, 80.0, 10.0);

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
}
