package org.example;

import java.util.Scanner;

public class PractiseSet {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

//        expressionSolution();
//        characterArithmeticOperations();
//        inputCheckAndCompare();

//        //String practise papers
//        stringLowerCaseAndUpperCase("abcd");
//        spaceReplaceInStringWithUnderscore("ayush ranjan is coding");
//        replaceStaticLetterWithName("Testing");
//        findDoubleAndTripleSpaceInString();

        //Switch practise paper
        //studentPassFailExercise(scr);
        //incomeTaxCalculation(scr);
        //dayOfTheWeek(scr);
        leapYearCheck(scr);
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

    public static void studentPassFailExercise(Scanner scr) {
        /*
        3 subject input
        Every subject marks should be at least 33% to pass and 40% total
        */
        int subject1Marks = 0, subject2Marks = 0, subject3Marks = 0;
        System.out.println("Please provide marks for 1st subject");
        if(scr.hasNextInt()) {

            subject1Marks=scr.nextInt();

            System.out.println("Please provide marks for 2nd subject");
            subject2Marks=scr.nextInt();

            System.out.println("Please provide marks for 3rd subject");
            subject3Marks=scr.nextInt();

        } else System.out.println("Please check your input and try again");
        scr.close();
        int overallAverage = (subject1Marks+subject2Marks+subject3Marks)/3;
        if(subject1Marks>=33 && subject2Marks>=33 && subject3Marks>=33) {
            if(overallAverage>=40) {
                System.out.println("PASS");
            } else System.out.println("Overall average is: "+overallAverage+ " which is less than 40%");
        } else System.out.println("FAIL");
    }

    public static void incomeTaxCalculation(Scanner scanner) {
        int income =0,category=0, tax=0;
        System.out.println("Please provide your CTC");
        if(scanner.hasNextInt()) {
            income = scanner.nextInt();
        } else System.out.println("Please provide input in numbers only");

        if (income<=250000) {
            category=1;
        } else if (income>250000 && income<=500000) {
            category=2;
        } else if(income>500000 && income<=1000000) {
            category=3;
        } else if (income>1000000) {
            category=4;
        }

        switch (category) {
            case 1 : {
                System.out.println("No income tax for this range");
                break;
            }
            case 2 : {
                tax+=0.05*(income-250000);
                System.out.println("Net Income tax payable is "+tax);
                break;
            }
            case 3 : {
                tax+=0.05*(500000-250000);
                tax+=0.20*(income-500000);
                System.out.println("Net Income tax payable is "+tax);
                break;
            }
            case 4 : {
                tax+=0.05*(500000-250000);
                tax+=0.20*(1000000-500000);
                tax+=0.30*(income-1000000);
                System.out.println("Net Income tax payable is "+tax);
                break;
            } default:
                System.out.println("Something went wrong! please try again.");

        }
    }

    public static void dayOfTheWeek(Scanner scanner) {
        int numberProvided = 0;
        System.out.println("Please provide number between 1 to 7 to know Day of the week");
        if(scanner.hasNextInt()) {
            numberProvided = scanner.nextInt();
        } else System.out.println("Please check your input and try again.");
        switch (numberProvided) {
            case 1 -> {System.out.println("Sunday");}
            case 2 -> {System.out.println("Monday");}
            case 3 -> {System.out.println("Tuesday");}
            case 4 -> {System.out.println("Wednesday");}
            case 5 -> {System.out.println("Thursday");}
            case 6 -> {System.out.println("Friday");}
            case 7 -> {System.out.println("Saturday");}
            default -> {
                System.out.println("Wrong choice");
            }
        }
    }

    public static void leapYearCheck(Scanner scanner) {
        System.out.println("Please provide year to check: ");
        int year = 0;
        if(scanner.hasNextInt()) {
            year+= scanner.nextInt();
        }

        if(((year%4==0) && (year% 100!=0) || (year%400 == 0))) {
            System.out.println(year+" is a Leap Year");
        } else System.out.println(year+" is not a Leap Year");
    }
    /* To check Leap year is:
    *   1. It should get divided by 4 and have remainder 0
    *       also when dividing the number with 100 it should not have reminder as 0,
    *      or it should have reminder 0 when dividing with 400*/
}
