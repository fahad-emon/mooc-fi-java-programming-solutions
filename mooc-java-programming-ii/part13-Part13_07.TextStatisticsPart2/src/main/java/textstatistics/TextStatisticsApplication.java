package textstatistics;

import java.lang.System.Logger.Level;
import java.util.Arrays;
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

public class TextStatisticsApplication extends Application {

    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

    @Override
    public void start(Stage window) throws Exception {
        BorderPane layout = new BorderPane();

        HBox level = new HBox();

        Label letter = new Label("Letters: 0");
        Label word = new Label("Words: 0");
        Label longestWord = new Label("The longest word is: ");
        level.setSpacing(10);
        level.getChildren().add(letter);
        level.getChildren().add(word);
        level.getChildren().add(longestWord);
        layout.setBottom(level);

        TextArea area = new TextArea("");
        layout.setCenter(area);

        area.textProperty().addListener((change, oldValue, newValue) -> {
            int characters = newValue.length();
            String[] parts = newValue.split(" ");
            int words = parts.length;
            String longest = Arrays.stream(parts)
                    .sorted((s1, s2) -> s2.length() - s1.length())
                    .findFirst()
                    .get();

            letter.setText("Letters: " + characters);
            word.setText("Words: " + words);
            longestWord.setText("The longest word is: " + longest);
        });
        Scene view = new Scene(layout);

        window.setScene(view);
        window.show();
    }

}
