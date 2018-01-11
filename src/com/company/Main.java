package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner playerInput = new Scanner(System.in);

        //Welcome & Get player's name
        System.out.println("Hello! Welcome to the Number Guessing Game!");
        System.out.println("What is your name?");
        String playerName = playerInput.nextLine();

        //Greeting and play decision
        System.out.println("Hello " + playerName + "! Glad to meet you!");
        System.out.println("");
        System.out.println("The point of this game is to guess the number I am thinking of in three tries. Would you like to play? (Yes/No)");
        String playGame = playerInput.nextLine();

        //Loop to deal with any answer other than Yes or No, ignoring capitalization
        while (!(playGame.equalsIgnoreCase("yes")) && (!(playGame.equalsIgnoreCase("no")))){
            System.out.println("You seem uncertain, is it 'Yes' or 'No?'");
            playGame = playerInput.nextLine();
        }
//------MAIN WHILE LOOP START
        // Yes or No input, ignoring capitalized answers, with While loop for Yes answer
        while (playGame.equalsIgnoreCase("yes")) {
            System.out.println("Great! I'm so happy to play with you!");

            //Picks randomized number between 1 and 10.
            Random rand = new Random();
            int low = 1;
            int high = 10;
            int correctNumber = rand.nextInt(high - low + low);
            //TODO: Figure out how to make range of numbers only 1-10; currently the Random block does 0-10.

    //----------FIRST GUESS SECTION
            // Get player input for first try
            System.out.println("Let's play! Type a whole number between 0 and 10:");
            String playerGuess1s = playerInput.nextLine();

            //First try response
            System.out.println("Ooh, " + playerGuess1s + " is a good guess...");

            //code block to pause for dramatic effect :)
            try {
                Thread.sleep(1000);
            } catch (InterruptedException pause) {
                pause.printStackTrace();
            }
            //convert player input into new integer variable
            int playerGuess1i = Integer.parseInt(playerGuess1s);

            //evaluation and response if first guess is correct
            if (correctNumber == playerGuess1i) {
                System.out.println("And it's the right number!!  You win!!");
                //pause
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException pause) {
                    pause.printStackTrace();
                }
                //ask to play again
                System.out.println("Would you like to play again?");
                String playAgain = playerInput.nextLine();

                //Loop to deal with any answer other than Yes or No, ignoring capitalization
                while (!(playAgain.equalsIgnoreCase("yes")) && (!(playAgain.equalsIgnoreCase("no")))) {
                    System.out.println("C'mon! Make up your mind! Is it 'Yes' or 'No?'");
                    playAgain = playerInput.nextLine();
                }
                //if-else to return to Main While loop start or end game
                if ((playAgain.equalsIgnoreCase("yes"))) {
                    continue; //
                } else {
                    System.out.println("Aww, that's too bad " + playerName + "! I really wanted to play with you. Good-bye!");
                    System.exit(0);
                }
            //response if first guess is incorrect
            } else {
                System.out.println("But it's not the right number.");
            }
    //----------SECOND GUESS SECTION
            // Get player input for second guess
            System.out.println("You get two more guesses. What's your next guess?");
            String playerGuess2s = playerInput.nextLine();
            System.out.println(playerGuess2s + " is another good guess...");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException pause) {
                pause.printStackTrace();
            }

            int playerGuess2i = Integer.parseInt(playerGuess2s);

            if (correctNumber == playerGuess2i) {
                System.out.println("And it's the right number!!  You win!!");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException pause) {
                    pause.printStackTrace();
                }
                System.out.println("Would you like to play again?");
                String playAgain = playerInput.nextLine();

                while (!(playAgain.equalsIgnoreCase("yes")) && (!(playAgain.equalsIgnoreCase("no")))) {
                    System.out.println("C'mon! Make up your mind! Is it 'Yes' or 'No?'");
                    playAgain = playerInput.nextLine();
                }
                if ((playAgain.equalsIgnoreCase("yes"))) {
                    continue;
                } else {
                    System.out.println("Aww, that's too bad " + playerName + "! I really wanted to play with you. Good-bye!");
                    System.exit(0);
                }
            } else {
                System.out.println("but it's not the right number either.");
            }

    //----------THIRD GUESS SECTION
            // Get player input for third guess
            System.out.println("One more chance! What's your last guess?");
            String playerGuess3s = playerInput.nextLine();
            System.out.println("Hmm, " + playerGuess3s + "...that's a good guess too...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException pause) {
                pause.printStackTrace();
            }
            int playerGuess3i = Integer.parseInt(playerGuess3s);

            if (correctNumber == playerGuess3i) {
                System.out.println("And it's the right number!!  You win!!");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException pause) {
                    pause.printStackTrace();
                }
                System.out.println("Would you like to play again?");
                playGame = playerInput.nextLine();

                while (!(playGame.equalsIgnoreCase("yes")) && (!(playGame.equalsIgnoreCase("no")))){
                    System.out.println("C'mon! Make up your mind! is it 'Yes' or 'No?'");
                    playGame = playerInput.nextLine();
                }
            } else {
                System.out.println("...but the correct number is " + correctNumber + ". I'm so sorry you didn't win.");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException pause) {
                    pause.printStackTrace();
                }
                System.out.println("Would you like to play again?");
                playGame = playerInput.nextLine();
                while (!(playGame.equalsIgnoreCase("yes")) && (!(playGame.equalsIgnoreCase("no")))){
                    System.out.println("C'mon! Make up your mind! is it 'Yes' or 'No?'");
                    playGame = playerInput.nextLine();
                }
            }
        }
//------MAIN WHILE LOOP END
        if (playGame.equalsIgnoreCase("no")) {
            System.out.println("Aww, that's too bad " + playerName + "! I really wanted to play with you. Good-bye!");
            System.exit(0);
        }
    }
}