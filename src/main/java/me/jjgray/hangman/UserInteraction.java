package me.jjgray.hangman;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.Scanner;

public class UserInteraction {

    public String getInput() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter letter");
        String input = scan.nextLine().toLowerCase();
        Pattern p = Pattern.compile("[a-z]");
        Matcher m = p.matcher(input);
        boolean matchFound = m.find();


        if (input.length() >= 2 || !matchFound) {
            System.out.println("\u001B[41m"+ "Invalid entry, please enter one letter" + "\u001B[0m");
            input = "";
        }
        return input;
    }
}
