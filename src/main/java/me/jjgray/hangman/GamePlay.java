package me.jjgray.hangman;

import java.util.ArrayList;
import java.util.Arrays;

import static me.jjgray.hangman.DisplayResults.*;

public class GamePlay {

    protected int lives = 8;

    public void decrementLives() {
        lives--;
    }

    public void playGame() {
        String word = new WordGenerator().getWord();
        String[] charArr = word.split("");
        String[] userWord = new String[word.length()];
        Arrays.fill(userWord, "_");
        ArrayList<String> usedChars = new ArrayList<>();
        String input = "";


        System.out.println(word);
        System.out.println("Welcome to hangman");

        while (true) {
            displayCurrentGame(userWord, usedChars, lives);
            input = new UserInteraction().getInput();

            if (!checkInput(charArr, input, userWord, usedChars)) {
                decrementLives();
                displayHangman(lives);
            }

            if (Arrays.equals(userWord, charArr)) {
                System.out.println("Congrats!");
                break;
            }

            if (lives == 0) {
                System.out.println("Game Over");
                break;
            }

        }
    }
}
