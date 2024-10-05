package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.geometry.Insets;
import javafx.beans.value.ObservableValue;
import javafx.beans.value.ChangeListener;

public class SavingsCalculatorApplication extends Application {

    public static void main(String[] args) {
        launch(SavingsCalculatorApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane box = new BorderPane();

        VBox vbox = new VBox();
        vbox.setPadding(new Insets(20, 20, 20, 20));
        vbox.setSpacing(10);

        BorderPane saving = new BorderPane();
        saving.setLeft(new Label("Monthly savings"));
        Slider s1 = new Slider();
        s1.setMin(25);
        s1.setMax(250);
        s1.setShowTickLabels(true);
        s1.setShowTickMarks(true);
        s1.setMajorTickUnit(25);
        s1.setMinorTickCount(5);
        s1.setBlockIncrement(5);
        saving.setCenter(s1);
        Label s1L = new Label(Double.toString(s1.getValue()));
        saving.setRight(s1L);

        BorderPane interest = new BorderPane();
        interest.setLeft(new Label("Yearly interest rate"));
        Slider s2 = new Slider();
        s2.setMin(0);
        s2.setMax(10);
        s2.setShowTickLabels(true);
        interest.setCenter(s2);
        Label s2L = new Label(Double.toString(s2.getValue()));
        interest.setRight(s2L);

        vbox.getChildren().addAll(saving, interest);
        box.setTop(vbox);

        // create the x and y axes that the chart is going to use
        NumberAxis xAxis = new NumberAxis(0, 30, 1);
        NumberAxis yAxis = new NumberAxis();
        // set the titles for the axes
        xAxis.setLabel("Year");
        yAxis.setLabel("Acount savings");

        // create the line chart. The values of the chart are given as numbers
        // and it uses the axes we created earlier
        LineChart<Number, Number> lineChart = new LineChart<Number, Number>(xAxis, yAxis);
        lineChart.setTitle("Savings");

        XYChart.Series ss = new XYChart.Series();

        //enable to use the value of slide to change value of the chart
        s1.valueProperty().addListener(new ChangeListener<Number>() {

            @Override
            public void changed(ObservableValue<? extends Number> change,
                    Number oldValue, Number newValue) {
                s1L.setText(String.format("%.2f", newValue));
                lineChart.getData().clear();
                Double d = newValue.doubleValue();
                lineChart.getData().add(chart(d));
                lineChart.getData().add(inchart(d, s2.getValue()));
            }
        });
        s2.valueProperty().addListener(new ChangeListener<Number>() {

            @Override
            public void changed(ObservableValue<? extends Number> change,
                    Number oldValue, Number newValue) {
                s2L.setText(String.format("%.2f", newValue));
                lineChart.getData().clear();
                lineChart.getData().add(chart(s1.getValue()));
                lineChart.getData().add(inchart(s1.getValue(), newValue.doubleValue()));
            }
        });

        box.setCenter(lineChart);

        // display the line chart
        Scene view = new Scene(box, 320, 300);
        stage.setScene(view);
        stage.show();
    }

    private XYChart.Series chart(Double newValue) {
        XYChart.Series data = new XYChart.Series();
        data.getData().add(new XYChart.Data(0, 0));
        double sum = 0.0;
        for (int i = 1; i <= 30; i++) {
            sum += newValue * 12;
            data.getData().add(new XYChart.Data(i, sum));
        }
        return data;
    }

    private XYChart.Series inchart(Double newValue, Double in) {
        XYChart.Series data = new XYChart.Series();
        data.getData().add(new XYChart.Data(0, 0));
        double sum = 0.0;
        for (int i = 1; i <= 30; i++) {
            sum += newValue * 12;
            sum *= (100 + in) / 100;
            data.getData().add(new XYChart.Data(i, sum));
        }
        return data;
    }

}
