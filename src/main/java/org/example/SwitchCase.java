package org.example;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String arithmeticSign = null;
        System.out.println("Please provide arithmetic sign you wish to perform");
        if (scr.hasNext()) {
            arithmeticSign = scr.next();
        }

        ArithmeticOperations(scr,arithmeticSign);


    }
    public static void ArithmeticOperations(Scanner scr,String sign) {

        int number1 = 0,number2=0,solution;
        System.out.println("Please provide 1st number");
        if(scr.hasNextInt()) {
            number1+=scr.nextInt();
        }
        System.out.println("Please provide 2nd number");
        if (scr.hasNextInt()) {
            number2+=scr.nextInt();
        }
        scr.close();
        switch (sign) {
            case "+" -> {
                System.out.println(number1 + number2);
            }
            case "-" -> {
                System.out.println(number1 - number2);
            }
            case "*" -> {
                System.out.println(number1 * number2);
            }
            case "/" -> {
                System.out.println(number1 / number2);
            }
            default -> System.out.println("Please provide only basic arithmetic operation sign");
        }
    }

}
