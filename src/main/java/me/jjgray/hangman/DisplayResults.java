package me.jjgray.hangman;


import java.util.ArrayList;


public class DisplayResults {
    public static void displayCurrentGame(String[] userWord, ArrayList<String> usedChars, int lives){
        System.out.println(String.join(" ", userWord));
        System.out.println("Used characters: " + usedChars);
        System.out.println(lives + " lives left");
    }

    public static boolean checkInput(String[] charArr, String input, String[] userWord, ArrayList<String> usedChars) {

        if (usedChars.contains(input)) {
            System.out.println("You've already used that character!");
            return true;
        } else {
            boolean letterFound = false;
            for (int i = 0; i < charArr.length; i++) {
                if (input.equals(charArr[i])) {
                    userWord[i] = charArr[i];
                    letterFound = true;
                }
            }
            usedChars.add(input);
            return letterFound;
        }
    }
}
