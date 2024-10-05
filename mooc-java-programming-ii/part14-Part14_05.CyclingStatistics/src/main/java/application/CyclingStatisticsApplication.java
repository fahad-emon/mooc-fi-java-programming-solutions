package application;

import java.util.Map;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.event.EventHandler;
import javafx.scene.chart.BarChart;

public class CyclingStatisticsApplication extends Application {

    @Override
    public void start(Stage stage) {

        CyclingStatistics statistics = new CyclingStatistics("helsinki-cycling-statistics.csv");

        GridPane gridPane = new GridPane();
        gridPane.setVgap(10);
        gridPane.setHgap(10);
        gridPane.setPadding(new Insets(10, 10, 10, 10));

        gridPane.add(new Label("Choose the examined location"), 0, 0);

        ObservableList<String> data = FXCollections.observableArrayList();
        data.addAll(statistics.locations());

        ListView<String> list = new ListView<String>(data);
        gridPane.add(list, 0, 1);

        CategoryAxis xAxis = new CategoryAxis();
        NumberAxis yAxis = new NumberAxis();
        xAxis.setLabel("Year / Month");
        yAxis.setLabel("Cyclists");

        

        BarChart<String, Number> barChart = new BarChart<>(xAxis, yAxis);
        barChart.setLegendVisible(false);
        
        
        list.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                String chosen = list.getSelectionModel().getSelectedItem();
                Map<String, Integer> values = statistics.monthlyCyclists(chosen);
                barChart.getData().clear();
                XYChart.Series bchartData = new XYChart.Series();
                for(String s : values.keySet()){
                    bchartData.getData().add(new XYChart.Data(s, values.get(s)));
                }

                barChart.getData().add(bchartData);
            }
        });

        
        gridPane.add(barChart, 1, 0, 1, 2);

        Scene view = new Scene(gridPane);

        stage.setScene(view);
        stage.show();
    }

    public static void main(String[] args) {
        launch(CyclingStatisticsApplication.class);
    }

}