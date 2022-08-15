package me.jjgray.hangman;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.Scanner;

import static me.jjgray.hangman.GameUtils.*;


public class UserInteraction {

    public String getInput() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter letter");
        String input = scan.nextLine().toLowerCase();
        Pattern p = Pattern.compile("[a-z]");
        Matcher m = p.matcher(input);
        boolean matchFound = m.find();


        if (input.length() >= 2 || !matchFound) {
            System.out.println(ANSI_RED + "Invalid entry, please enter a single letter" + ANSI_RESET);
            input = "";
        }
        return input;
    }
}
