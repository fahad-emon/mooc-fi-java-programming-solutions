package notifier;

import java.lang.System.Logger.Level;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class NotifierApplication extends Application {

    public static void main(String[] args) {
        launch(NotifierApplication.class);
    }

    @Override
    public void start(Stage window) {
 
        TextField topText = new TextField();
        Label bottomText = new Label();
        Button button = new Button("Update");
        
        button.setOnAction((event) -> {
            bottomText.setText(topText.getText());
        });
        
        VBox notiFier = new VBox();
        notiFier.setSpacing(20);
        notiFier.getChildren().addAll(topText, button, bottomText);

        Scene view = new Scene(notiFier);

        window.setScene(view);
        window.show();
    }

//    @Override
//    public void start(Stage window) {
//        TextField leftText = new TextField();
//        TextField rightText = new TextField();
//        Button button = new Button("Copy");
//
//        button.setOnAction((event) -> {
//            rightText.setText(leftText.getText());
//        });
//
//        HBox componentGroup = new HBox();
//        componentGroup.setSpacing(20);
//        componentGroup.getChildren().addAll(leftText, button, rightText);
//
//        Scene scene = new Scene(componentGroup);
//
//        window.setScene(scene);
//        window.show();
//    }
}
