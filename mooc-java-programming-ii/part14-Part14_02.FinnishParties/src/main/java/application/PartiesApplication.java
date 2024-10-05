package application;

import java.nio.file.Paths;
import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class PartiesApplication extends Application{

    public static void main(String[] args) {
        launch(PartiesApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        // create the x and y axes that the chart is going to use
       NumberAxis xAxis = new NumberAxis(1968, 2008, 4);
       NumberAxis yAxis = new NumberAxis();
       // set the titles for the axes
       xAxis.setLabel("Year");
       yAxis.setLabel("Relative supports(%)");
 
       // create the line chart. The values of the chart are given as numbers
       // and it uses the axes we created earlier
       LineChart<Number, Number> lineChart = new LineChart<Number, Number>(xAxis, yAxis);
       lineChart.setTitle("Ralative support of the parties");
       
       
       try (Scanner scanner = new Scanner(Paths.get("partiesdata.tsv"))) {
           
           String firstrow = scanner.nextLine();
           String[] years = firstrow.split("\t");
           
            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                String[] pieces = row.split("\t");
                XYChart.Series pData = new XYChart.Series();
                pData.setName(pieces[0]);
                
                for(int i = 1; i < pieces.length; i++){
                    if(!pieces[i].equals("-")){
                        pData.getData().add(new XYChart.Data(Integer.valueOf(years[i]), Double.valueOf(pieces[i])));
                    }
                }
                
                lineChart.getData().add(pData);

            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
      
        
 
        // display the line chart
        Scene view = new Scene(lineChart, 640, 480);
        stage.setScene(view);
        stage.show();
    }

}
