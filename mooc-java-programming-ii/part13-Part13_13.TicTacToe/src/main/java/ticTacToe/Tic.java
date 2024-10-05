package ticTacToe;

import javafx.scene.control.Button;
import javafx.scene.text.Font;
import javafx.scene.control.Label;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.layout.GridPane;

public class Tic {

    private Button[][] room;
    private String symbol;
    private Label title;
    private GridPane p;
    private boolean end;

    public Tic(Label l, GridPane pane) {
        end = false;
        room = new Button[3][3];
        symbol = "X";
        title = l;
        p = pane;
        start();
        addToPane();
    }

    private void addToPane() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                p.add(room[i][j], i, j);
            }
        }
    }

    private void start() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Button b = new Button(" ");
                b.setFont(Font.font("Monospaced", 40));
                b.setOnAction(events(b));
                room[i][j] = b;
            }
        }
    }

    private EventHandler<ActionEvent> events(Button b) {
        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (b.getText().equals(" ") && !end) {
                    b.setText(symbol);
                    if (symbol.equals("X")) {
                        symbol = "O";
                    } else {
                        symbol = "X";
                    }
                    if (check()) {
                        title.setText("The end!");
                        end = !end;
                    } else {
                        title.setText("Turn: " + symbol);
                    }
                }

            }
        };
        return event;
    }

    private boolean check() {
        if (all()) {
            return true;
        }
        for (int i = 0; i < 3; i++) {
            String s1 = room[i][0].getText();
            String s2 = room[i][1].getText();
            String s3 = room[i][2].getText();
            if (!s1.equals(" ") && s1.equals(s2) && s2.equals(s3)) {
                return true;
            }
            s1 = room[0][i].getText();
            s2 = room[1][i].getText();
            s3 = room[2][i].getText();
            if (!s1.equals(" ") && s1.equals(s2) && s2.equals(s3)) {
                return true;
            }
        }
        String s1 = room[0][0].getText();
        String s2 = room[2][0].getText();
        String s3 = room[1][1].getText();
        String s4 = room[1][0].getText();
        String s5 = room[2][2].getText();
        if (!s1.equals(" ") && s1.equals(s3) && s3.equals(s5)) {
            return true;
        }
        if (!s2.equals(" ") && s2.equals(s3) && s3.equals(s4)) {
            return true;
        }

        return false;
    }

    private boolean all() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (room[i][j].getText().equals(" ")) {
                    return false;
                }
            }
        }
        return true;
    }

}
