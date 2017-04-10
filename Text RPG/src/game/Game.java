package game;

import window.Window;

/**
 * Created by mariu on 09/04/2017.
 */
public class Game {

    public static void play() {
        Window.appendText("Hello this is my Tex RPG which is still and will always be in development.");
        Window.appendText("If you have already played this game please enter the name of your previous main character.");
        Window.appendText("However if you have not played before do not enter anything and just press enter.");

        Window.setPromptText("Enter name of previous main character here:");

        Window.setOnResponseAction(event -> {
            if(!Window.isValidResponse("")) {
                if(load(Window.getResponse())) {
                    Window.setPromptText("");
                    Window.appendText("You will now start from wheer you last left off...");
                    Window.getDialogue().clear();
                    Window.setOnResponseAction(null);
                }
            }

            Window.setPromptText("");
            Window.appendText("\nWell then it seems that the story can begin now...");
            Window.setOnResponseAction(null);
        });
    }

    private static boolean load(String name) {
        //TODO loads the saved game

        return false;
    }

    private static void save(String name) {
        //TODO save game
    }
}
