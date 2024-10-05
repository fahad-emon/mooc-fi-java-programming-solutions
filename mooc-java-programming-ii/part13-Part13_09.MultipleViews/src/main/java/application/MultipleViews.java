package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;

public class MultipleViews extends Application {

    public static void main(String[] args) {
        Application.launch(MultipleViews.class);
    }

    @Override
    public void start(Stage window) throws Exception {

        Button toSecond = new Button("To the second view!");
        Button toThird = new Button("To the third view!");
        Button toFirst = new Button("To the first view!");

        BorderPane box1 = new BorderPane();
        VBox box2 = new VBox();
        GridPane box3 = new GridPane();

        Label text1 = new Label("First view!");
        Label text2 = new Label("Second view!");
        Label text3 = new Label("Third view!");

        //set items in scences
        box1.setTop(text1);
        box1.setCenter(toSecond);

        box2.getChildren().addAll(toThird, text2);

        box3.add(text3, 0, 0);
        box3.add(toFirst, 1, 1);

        Scene first = new Scene(box1);
        Scene second = new Scene(box2);
        Scene third = new Scene(box3);

        EventHandler<ActionEvent> event1 = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                window.setScene(second);
            }
        };
        EventHandler<ActionEvent> event2 = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                window.setScene(third);
            }
        };
        EventHandler<ActionEvent> event3 = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                window.setScene(first);
            }
        };

        toSecond.setOnAction(event1);
        toThird.setOnAction(event2);
        toFirst.setOnAction(event3);

        window.setScene(first);
        window.show();
    }

}
