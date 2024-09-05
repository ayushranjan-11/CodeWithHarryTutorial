package org.learning;

import java.util.Scanner;

public class GuessTheNumberGame {

    private static int countStartNumber = 1; // Integer declaration for total guess count

    public static void main(String[] args) {

        GuessNumber guessNumber = new GuessNumber();
        System.out.println("Computer Generated no. was: " + guessNumber.getGeneratedRandomNumber());
        System.out.println("Provide your input for guess");
        guessGame(guessNumber);
        System.out.println("Computer Generated no. was: " + guessNumber.getGeneratedRandomNumber());
        System.out.println("Total number of guesses: " + guessNumber.getGuessCount());

    }

    // TODO: User provided number compare to generated number and let user know
    // large or small number from the generated number difference

    public static void guessGame(GuessNumber guessNumber) {
        Scanner takeInput = new Scanner(System.in);
        int userProvidedInput;

        if (takeInput.hasNextInt()) {
            guessNumber.setGuess(GuessTheNumberGame.countStartNumber++);
            userProvidedInput = takeInput.nextInt();

            if (userProvidedInput > 0 && userProvidedInput <= 100) {

                // boolean guessResult = guessNumber.checkUserGuess(userProvidedInput);
                if (guessNumber.checkUserGuess(userProvidedInput)) {
                    System.out.println("Congratulation on getting correct guess!!");
                } else {
                    System.out.println("Take another guess");
                    guessGame(guessNumber);
                }

            } else
                System.out.println("Please try again with input > 0 & <=100");
        } else
            System.out.println("Please provide number input between 1 to 100");
        // guessNumber.setGuess(totalGuessCount);
        takeInput.close();
    }
}

class GuessNumber {
    private int userGuess;
    private int guessCount;
    private int generatedRandomNumber;

    public GuessNumber() {
        double doubleRandomNumber = Math.random() * 100;
        generatedRandomNumber = (int) doubleRandomNumber;
    }

    public void setGuess(int noOfGuessCount) {
        guessCount = noOfGuessCount;
    }

    public int getGuessCount() {
        return guessCount;
    }

    public int getGeneratedRandomNumber() {
        return generatedRandomNumber;
    }

    public boolean checkUserGuess(int userGuessedNumber) {

        if (userGuessedNumber == generatedRandomNumber) {
            return true;
        }
        return false;
    }
}
