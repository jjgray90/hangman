package me.jjgray.hangman;

import java.util.Scanner;

public class UserInteraction {


public String getInput(){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter letter");
    return scan.nextLine();
}



}
