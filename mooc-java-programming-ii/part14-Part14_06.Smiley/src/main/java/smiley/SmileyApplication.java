package smiley;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class SmileyApplication extends Application {


    public static void main(String[] args) {
        launch(SmileyApplication.class);
    }

    @Override
    public void start(Stage window) throws Exception {
        Canvas paintingCanvas = new Canvas(640, 480);
        GraphicsContext painter = paintingCanvas.getGraphicsContext2D();
        
        painter.setFill(Color.WHITE);
        
        ColorPicker colorPalette = new ColorPicker();

        BorderPane paintingLayout = new BorderPane();
        paintingLayout.setCenter(paintingCanvas);
        paintingLayout.setRight(colorPalette);

        paintingCanvas.setOnMouseDragged((event) -> {
            double xLocation = event.getX();
            double yLocation = event.getY();
            painter.setFill(Color.BLACK);
            painter.fillOval(xLocation, yLocation, 4, 4);
        });
        
        doDrawing(painter, 160, 120, 50, 50);
        doDrawing(painter, 480, 120, 50, 50);
        doDrawing(painter, 110, 300, 50, 50);
        doDrawing(painter, 530, 300, 50, 50);
        doDrawing(painter, 160, 350, 370, 50);
        
        Scene view = new Scene(paintingLayout);

        window.setScene(view);
        window.show();
    }
    
    private void doDrawing(GraphicsContext gc, double x, double y, double w, double h) {

        gc.setStroke(Color.BLACK);
        gc.setLineWidth(5);
        //gc.strokeRect(30, 30, 80, 80);
        gc.setFill(Color.BLACK);
        gc.fillRect(x, y, w, h);
    }
}
