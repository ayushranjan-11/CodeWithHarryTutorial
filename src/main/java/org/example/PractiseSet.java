package org.example;

import java.util.Scanner;

public class PractiseSet {
    public static void main(String[] args) {

//        expressionSolution();
//        characterArithmeticOperations();
//        inputCheckAndCompare();

        //String practise papers
        stringLowerCaseAndUpperCase("abcd");
        spaceReplaceInStringWithUnderscore("ayush ranjan is coding");
        replaceStaticLetterWithName("Testing");
        findDoubleAndTripleSpaceInString();
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

    public static void stringLowerCaseAndUpperCase(String str) {
        //Program to convert given string to lowercase and Uppercase
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
    }

    public static void spaceReplaceInStringWithUnderscore(String str1) {
        if(str1.isBlank() || str1.isEmpty()) {
            System.out.println("Please check your input");
        } else {
            str1=str1.replace(" ","_");
        }
        System.out.println(str1);
    }

    public static void replaceStaticLetterWithName(String name) {
        String staticText = "Dear <|name|>, Thanks a lot";

        System.out.println(staticText.replace("<|name|>", name));

    }

    public static void findDoubleAndTripleSpaceInString() {

        String text = "This sentence contains  double and  triple   spaces";
        System.out.println(text.indexOf("  "));
        System.out.println(text.indexOf("   "));
        //indexOf return first value if occurred and ignore other/next to the 1st appearance.
    }
}
