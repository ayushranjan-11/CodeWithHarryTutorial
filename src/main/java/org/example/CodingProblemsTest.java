package org.example;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;


public class CodingProblemsTest {
    public static void main(String[] args) {
        arrayCreationAndIntegerInput();
    }

    public static void arrayCreationAndIntegerInput() {
        //This code takes input of integers in array and display it
        Scanner scanner = new Scanner(System.in);
        int limitOfNumberCount = 0;
        //To initialize array
        int[] ab = new int[0];
        ArrayList<Integer> numbersInput = null;
        System.out.println("Please define array size");
        if(scanner.hasNextInt()) {
            limitOfNumberCount = scanner.nextInt();
            ab = new int[limitOfNumberCount];

            System.out.println("Now provide integer input in created array");
             if(scanner.hasNextInt()) {
                for (int i = 0; i < limitOfNumberCount; i++) {
                    ab[i] = scanner.nextInt();
                }
            } else {
                 System.out.println("Provided input was not valid. Try again!");
                 arrayCreationAndIntegerInput();
             }
        } else {
            System.out.println("Please check your input and try again");
            arrayCreationAndIntegerInput();
        }
        scanner.close();

        for (int j=0;j< ab.length;j++){
            System.out.println(ab[j]);
        }
    }
}
