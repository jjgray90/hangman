package me.jjgray.hangman;

import java.util.ArrayList;
import java.util.Arrays;

import static me.jjgray.hangman.GameUtils.*;
import static me.jjgray.hangman.DisplayResults.*;

public class GamePlay {

    private int lives = 8;

    public void decrementLives() {
        lives--;
        displayHangman(lives);
    }

    public void playGame() {
        String word = new WordGenerator().getWord();
        String[] charArr = word.split("");
        String[] userWord = new String[word.length()];
        Arrays.fill(userWord, "_");
        ArrayList<String> usedChars = new ArrayList<>();


        System.out.println(word);
        System.out.println("Welcome to hangman");

        while (true) {
            displayCurrentGame(userWord, usedChars, lives);
            String input = new UserInteraction().getInput();

            if (!input.equals("") && !checkInput(charArr, input, userWord, usedChars)) {
                decrementLives();
            }

            if (Arrays.equals(userWord, charArr)) {
                System.out.println(ANSI_WHITE + ANSI_GREEN_BG + " Congrats! We live to fight another day " + ANSI_RESET);
                break;
            }

            if (lives == 0) {
                System.out.println(ANSI_WHITE + ANSI_RED_BG + " Game Over " + ANSI_RESET);
                break;
            }
        }
    }
}
