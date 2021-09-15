package com.joelallison;

import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner userInput = new Scanner(System.in);
        int userGuess = 0;
        int randomInt = random.nextInt(100) + 1;
        int guessCount = 0;

        while (userGuess != randomInt) {
            System.out.println("Guess a random number between 1 and 100!");
            try {
                userGuess = userInput.nextInt();
            }catch(Exception e) {
                System.out.println("That's not a number! You're guessing numbers here, c'mon.");
            }

            guessCount++;

            //identify how close the guess was to the number
            if (userGuess != randomInt) {
                if (3 >= Math.abs(userGuess - randomInt)) {
                    System.out.println("That's a pretty good guess!");
                } else if (10 >= Math.abs(userGuess - randomInt)) {
                    System.out.println("Getting pretty close...");
                } else if (25 >= Math.abs(userGuess - randomInt)) {
                    System.out.println("Close ish");
                } else {
                    System.out.println("Ehhh... you picked a number? That's close ish.");
                }
            }
        }
        System.out.println("You got it! Only took you " + guessCount + " tries.");
    }
}
