package me.jjgray.hangman;


import java.util.ArrayList;

import static me.jjgray.hangman.GameUtils.*;


public class DisplayResults {

    public static void displayCurrentGame(String[] userWord, ArrayList<String> usedChars) {
        System.out.println(String.join(" ", userWord));
        System.out.println("Used characters: " + usedChars);
    }

    public static void displayHangman(int lives) {
        switch (lives) {
            case 7:
                System.out.println(state_1);
                break;
            case 6:
                System.out.println(state_2);
                break;
            case 5:
                System.out.println(state_3);
                break;
            case 4:
                System.out.println(state_4);
                break;
            case 3:
                System.out.println(state_5);
                break;
            case 2:
                System.out.println(state_6);
                break;
            case 1:
                System.out.println(state_7);
                break;
            case 0:
                System.out.println(state_8);
                break;
        }

    }
}
