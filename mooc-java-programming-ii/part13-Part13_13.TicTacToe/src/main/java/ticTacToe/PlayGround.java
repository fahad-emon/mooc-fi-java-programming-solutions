package ticTacToe;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.BorderPane;

public class PlayGround {

    private String symbol;
    private Label title;

    public PlayGround() {
        symbol = "X";
    }

    public Parent getView() {
        BorderPane box = new BorderPane();
        title = new Label("Turn: X");
        box.setTop(title);

        GridPane layout = new GridPane();
        layout.setAlignment(Pos.CENTER);
        layout.setPadding(new Insets(10, 10, 10, 10));
        layout.setVgap(10);
        layout.setHgap(10);
        Tic t = new Tic(title, layout);

        box.setCenter(layout);
        return box;
    }
}
