package game;

import window.Window;

public class Game {

    public static void play() {
        Window.appendText("Hello this is my Text RPG which is still and will always be in development.");
        Window.appendText("If you have already played this game please enter the name of your previous main character.");
        Window.appendText("However if you have not played before do not enter anything and just press enter.");

        Window.setPromptText("Enter name of previous main character here:");

        final GameRunner[] gameRunner = new GameRunner[1];

        Window.setOnResponseAction(event -> {
            if (!Window.isValidResponse("")) {
                if ((gameRunner[0] = load(Window.getResponse())) != null) {
                    Window.setPromptText("");
                    Window.appendText("You will now start from where you last left off...");
                    Window.getDialogue().clear();
                    Window.setOnResponseAction(null);
                }
            }

            if (gameRunner[0] == null) {
                Window.setPromptText("");
                Window.setOnResponseAction(null);
                gameRunner[0] = new GameRunner();
                GameRunner.intro();
                GameRunner.classChoice();
            }

            GameRunner.play(gameRunner[0]);
        });
    }

    private static GameRunner load(String name) {
        //TODO loads the saved game

        return null;
    }

    private static void save(String name) {
        //TODO save game
    }
}
