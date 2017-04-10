package window;

import game.Game;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Window extends Application {

    private static final TextArea dialogue = new TextArea();
    private static final TextField response = new TextField();

    public static void main(String[] args) {
        launch(args);
    }

    public static void appendText(String text) {
        appendText(text, 2);
    }


    private static void appendText(String text, int seconds){
        //TODO Add delay when appending message to textArea

        dialogue.appendText(text + '\n');
    }

    public static void setPromptText(String prompt) {
        response.setPromptText(prompt);
    }

    public static void clearResponse() {
        response.clear();
    }

    public static boolean isValidResponse(String regex) {
        return response.getText().matches(regex);
    }

    public static void setOnResponseAction(EventHandler<ActionEvent> e)
    {
        response.setOnAction(e);
    }

    public static String getResponse() {
        return response.getText();
    }

    public static TextArea getDialogue() {
        return dialogue;
    }

    @Override
    public void start(Stage window) {


        VBox vBox = new VBox(10, dialogue, response);
        vBox.setPadding(new Insets(5, 5, 5, 5));
        vBox.setSpacing(5);
        vBox.setAlignment(Pos.CENTER);

        vBox.setPrefHeight(319);
        vBox.setPrefWidth(573);

        vBox.setMinHeight(59);

        dialogue.setEditable(false);
        dialogue.setMinHeight(22);

        dialogue.setPrefHeight(271);
        dialogue.setPrefWidth(563);

        response.setMinHeight(VBox.USE_PREF_SIZE);

        VBox.setVgrow(dialogue, Priority.ALWAYS);
        VBox.setVgrow(response, Priority.ALWAYS);

        window.setScene(new Scene(vBox));
        window.setMinHeight(104);
        window.setTitle("Text RPG");

        window.show();

        Game.play();

    }
}
