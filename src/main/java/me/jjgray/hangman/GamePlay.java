package me.jjgray.hangman;

import java.util.ArrayList;
import java.util.Arrays;

import static me.jjgray.hangman.GameUtils.*;
import static me.jjgray.hangman.DisplayResults.*;

public class GamePlay {

    private final UserInteraction userInteraction = new UserInteraction();
    private final String word = new WordGenerator().getWord();
    private final String[] charArr = word.split("");
    private final String[] userWord = new String[word.length()];
    private final ArrayList<String> usedChars = new ArrayList<>();
    private int lives = 8;

    public void decrementLives() {
        lives--;
        displayHangman(lives);
    }

    public boolean checkInput(String userInput) {

        if (usedChars.contains(userInput)) {
            System.out.println(ANSI_RED + "You've already used that character!" + ANSI_RESET);
            return true;
        } else {
            boolean letterFound = false;
            for (int i = 0; i < charArr.length; i++) {
                if (userInput.equals(charArr[i])) {
                    userWord[i] = charArr[i];
                    letterFound = true;
                }
            }
            usedChars.add(userInput);
            return letterFound;
        }
    }

    public void playGame() {

        Arrays.fill(userWord, "_");
        System.out.println("Welcome to hangman");

        while (true) {
            displayCurrentGame(userWord, usedChars);
            String userInput = userInteraction.getInput();

            if (!userInput.equals("") && !checkInput(userInput)) {
                decrementLives();
            }

            if (Arrays.equals(userWord, charArr)) {
                displayCurrentGame(userWord, usedChars);
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
