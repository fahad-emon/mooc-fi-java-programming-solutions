package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GreeterApplication extends Application {

    public static void main(String[] args) {
        Application.launch(GreeterApplication.class);
    }

    @Override
    public void start(Stage window) throws Exception {

        Label instructionText = new Label("Enter your name and start.");
        TextField testField = new TextField();
        Button button = new Button("Start");
        Label errorMessage = new Label("");

        GridPane layout = new GridPane();

        layout.add(instructionText, 0, 0);
        layout.add(testField, 0, 1);
        layout.add(button, 0, 2);
        layout.add(errorMessage, 0, 3);

        layout.setPrefSize(300, 180);
        layout.setAlignment(Pos.CENTER);
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setPadding(new Insets(20, 20, 20, 20));

        Scene firstView = new Scene(layout);

        Label welcomeText = new Label("Welcome");

        StackPane welcomeLayout = new StackPane();
        welcomeLayout.setPrefSize(300, 180);
        welcomeLayout.getChildren().add(welcomeText);
        welcomeLayout.setAlignment(Pos.CENTER);

        Scene welcomeView = new Scene(welcomeLayout);

        button.setOnAction((event) -> {
            if (testField.getText().trim().equals("")) {
                errorMessage.setText("Please enter your name.");
                return;
            }

            welcomeText.setText("Welcome " + testField.getText().trim() + "!");
            window.setScene(welcomeView);
        });

        window.setScene(firstView);
        window.show();
    }

}
