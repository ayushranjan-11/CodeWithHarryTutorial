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
        inputMarks.close();
    }

    public int addNumbers(int a, int b) {
        int c = a+b;
        return c;
    }

    public static void precedenceAndAssociative() {
        int a =5, b = 1, c = 4;

        int k = b*b -(4*a*c)/(2*a);
        System.out.println(k);

        //Increment and Decrement Operator
        //I guess pre increment(++i) can be used or valid if value is getting assigned somewhere else and have to pass the value
        int i =0;
        int j=++i;
        System.out.println(i);
        System.out.println(j);

        int y =7;
        int x = y++*8;
        System.out.println(x);

        charIncrement('z');
    }

    //Program to test character arthimetic operations
    public static void charIncrement(char a) {
        System.out.println(++a);
        System.out.println(a++);

        a='A';
        System.out.println(--a);
        System.out.println(a--);
    }
}