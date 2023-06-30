package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int a$b = 10;
        long sa = 32111111111111114L;
        //System.out.println(a$b);
        //inputCheck();
        //percentageCalculation();
//        Scanner in = new Scanner(System.in);
//        System.out.println("Please input any positive number:");
//
//        if(in.hasNextInt()) {
//            int x = in.nextInt();
//            System.out.println(x);
//        } else {
//            System.out.println("Please check your input");
//        }
//        in.close();
        precedenceAndAssociative();
    }

    public static void inputCheck() {
        Scanner sin = new Scanner(System.in);
        System.out.println("Please provide input");
        System.out.println(sin.hasNext());
        String test = sin.next();
        System.out.println(test);
    }

    public static void percentageCalculation() {
        Scanner inputMarks = new Scanner(System.in);
        int total = 0;
        int validInputs=0;

        for (int i =0;i<5;i++) {
            System.out.println("Enter marks for Subject: "+(i+1));
            if(inputMarks.hasNextInt()) {
                total+=inputMarks.nextInt();
                validInputs++;
            } else {
                System.out.println("Please provide only whole number as input. Try again!");
                break;
            }

        }
        System.out.println("Average is: "+(total/validInputs));
    }

    public int addNumbers(int a, int b) {
        int c = a+b;
        return c;
    }

    public static void precedenceAndAssociative() {
        int a =5, b = 1, c = 4;

        int k = b*b -(4*a*c)/(2*a);
        System.out.println(k);

        int i =0;

        while(i<10) {
            i++;
            System.out.println(i);

        }
        assert i ==10:"Did not happened";
    }
}