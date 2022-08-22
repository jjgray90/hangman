package me.jjgray.hangman;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.Scanner;

import static me.jjgray.hangman.GameUtils.*;


public class UserInteraction {
    final Pattern p = Pattern.compile("[a-z]");
    Scanner scan = new Scanner(System.in);

    public String getInput() {
        System.out.println("Enter letter");
        String input;

        while (true) {
            input = scan.nextLine().toLowerCase();
            Matcher m = p.matcher(input);
            boolean matchFound = m.find();

            if (input.length() >= 2 || !matchFound) {
                System.out.println(ANSI_RED + "Invalid entry, please enter a single letter" + ANSI_RESET);
            } else break;
        }
        return input;
    }
}
