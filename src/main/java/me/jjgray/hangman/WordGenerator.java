package me.jjgray.hangman;

import java.util.Random;

public class WordGenerator {
    Random r = new Random();

    private String[] words = {"flower", "triangle", "sunglasses", "elephant", "grass", "chicken"};


    public  String getWord() {
        int randomInt= r.nextInt(words.length);
        return words[randomInt];
    }
}
