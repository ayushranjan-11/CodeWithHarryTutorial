package org.example.practiceset;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scr = new Scanner(System.in);
        inputFromTheUserAndResult(scr, random);
    }

    public static void inputFromTheUserAndResult(Scanner scanner, Random random) {
        System.out.println("Please provide input from 1 to 3 where \n 1: Rock \n 2: Paper \n 3: Scissor");
        int userInput = 0;
        if(scanner.hasNextInt()) {
            if(scanner.nextInt()<=3) {
                userInput = scanner.nextInt();

                int computerChoice= random.nextInt(1,4);
                System.out.println("Computer choose: "+computerChoice);

                //Logic for the game
//        if (userInput!=computerChoice) {
//            if(userInput==1 && computerChoice==3) {
//                System.out.println("Computer Won!");
//            }
//            else if(userInput==2 && computerChoice==3) {
//                System.out.println("Computer Won!");
//            }
//            else if(userInput==3 && computerChoice==1) {
//                System.out.println("Computer Won!");
//            }
//            else System.out.println("You Won!!");
//
//        } else System.out.println("Match is drawn");
//
                //2nd logic
                if (userInput!=computerChoice) {
                    if(userInput<=computerChoice || (userInput==3 && computerChoice == 1)) {
                        System.out.println("Computer Won!");
                    } else System.out.println("You Won!!");

                } else System.out.println("Match is drawn");

            } else System.out.println("Please choose number between provided range!");
        } else System.out.println("Please check your input and provide number input from defined range only!");
        scanner.close();

    }
}
