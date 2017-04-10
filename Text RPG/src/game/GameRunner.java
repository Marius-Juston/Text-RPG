package game;

import window.Window;


class GameRunner {
    int round = 1;
    int nextArea = 0;

    public static void play(GameRunner gameRunner) {
        gameRunner.next();
    }

    public static void intro() {
        Window.appendText("\nThe whole world has been destroyed during the One-Man War.");
        Window.appendText("A War where a single mysterious being annihilated the inhabitants of your 10 billion strong planet with only a mere 3897 inhabitants remain strong.");
        Window.appendText("The War ended when the being disappeared one day and was never seen again... However the humans, the weakest and the most afraid decided to");
        Window.appendText("creat demons in order to find and destroy the being. After some time the humans succeeded and sent them to roam the world.");
        Window.appendText("The demons that the humans created were all bound by a spell by the most powerful of the remaining wizards and the demons were unable to escape");
        Window.appendText("Tragedy happened then after a demon managed to mysteriously break the spell and rose the now vengeful demons against the human race.");
        Window.appendText("The remaining human population in order to survive and to get ride of this evil mingled with the remaining ancient races.");
        Window.appendText("This mingling brought up new races such as the Elves, humanoid existences that surround themselves with nature and that task themselves with");
        Window.appendText("rebuilding the harmony that was once in the world of Chaos, Half-demons created by forcefully interbreeding demons and humans in order to gain power and the Pure Humans who did not want to \"taint\" their blood");
        Window.appendText("with the heritage of an inferior creature.");
        Window.appendText("\nWell then it seems that the story can now begin...");
        Window.separate("END OF INTRO");

        classChoice();
    }

    public static void classChoice() {
        Window.appendText("");

        Window.setOnResponseAction(event -> {
            Window.setPromptText("Enter the class you wish to be");
        });

        Window.separate("END OF CLASS CHOOSING");
    }

    private void next() {

    }
}
