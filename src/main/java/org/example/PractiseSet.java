package org.example;

import java.util.Scanner;

public class PractiseSet {
    public static void main(String[] args) {

        expressionSolution();
        characterArithmeticOperations();
        inputCheckAndCompare();
    }
    public static void expressionSolution() {
        float a = (float) 7 /4*9/2;
        System.out.println(a);
    }

    public static void characterArithmeticOperations() {
        char a = 'a';
        System.out.println(--a);
        System.out.println(a++);
    }

    public static void inputCheckAndCompare() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input any Integer");

        if(scanner.hasNextInt()) {
            int b = scanner.nextInt();
            if(b>10) {
                System.out.println("Number is greater than 10");
            } else System.out.println("Provided number is small than 10");
        } else {
            System.out.println("Please check your input and try again");
            inputCheckAndCompare();
        }
    }
}
