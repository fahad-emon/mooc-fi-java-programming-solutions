package ticTacToe;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class TicTacToeApplication extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        PlayGround play = new PlayGround();

        Scene view = new Scene(play.getView());
 
        stage.setScene(view);
        stage.show();
    }

    public static void main(String[] args) {
        launch(TicTacToeApplication.class);
    }

}
