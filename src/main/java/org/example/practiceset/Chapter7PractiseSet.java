package org.example.practiceset;

public class Chapter7PractiseSet {
    private static int sum = 0;
    public static void main(String[] args) {
//        fibonacciSeries(5);
//        multiplicationTable(2);
//        patterPrinting();
//        System.out.println(sumOfnNaturalNumbersRecursion(6));
        // System.out.println(fibonacciWithRecursion(6));
        // System.out.println(reversePatternPrintingWithRecursion(5));
        System.out.println(patternPrintingWithRecursion(5, 1));

    }

    static void fibonacciSeries(int position) {

        int start = 0, nextNumber = 1, end;
        while(position>=0) {
            end = start+nextNumber;
            System.out.print(end+ " ");
            start = nextNumber;
            nextNumber = end;
            position--;
        }
        System.out.println();
    }

    static int fibonacciWithRecursion(int lastNumber) {
        if(lastNumber<=1) { //This returns the 1st number for fibonacci series, i.e "0"
            return 0;
        } else if(lastNumber ==2) { //This returns the 2nd number for fibonacci series, i.e "1"
            return 1;
        } else {
        return fibonacciWithRecursion(lastNumber-1) + fibonacciWithRecursion(lastNumber - 2);
    }
        }

    public static void multiplicationTable(int number) {
        if (number>0) {
            System.out.println("Table of "+number+ " till 10");
            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " " + "* " + i + " = " + number * i);
            }
        } else System.out.println("Only positive which is > 0 will be calculated");
    }

    static void patterPrinting() {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static int sumOfnNaturalNumbersRecursion(int n) {
        if(n<=0) {
            return sum;
        }

        sum += n;
        sumOfnNaturalNumbersRecursion((n-1));
        return sum;
    }

    static String reversePatternPrintingWithRecursion(int limit) {
        if (limit<=0) {
            return "";
        }
        for(int i = limit; i>=1; i--) {
            System.out.print("* ");
        }
        System.out.println();
        return reversePatternPrintingWithRecursion(limit - 1);

        /* 
         This will print
         *****
         ****
         ***
         **
         *
        */
    }

    static String patternPrintingWithRecursion(int totalSize, int startNumber) {
       if (totalSize<=0) {
            return "";
        }
        for(int i = 0; i<startNumber; i++) {
            System.out.print("* ");
        }
        System.out.println();
        return patternPrintingWithRecursion(totalSize-1, startNumber+1);
        /* 
         This will print
        * 
        * * 
        * * * 
        * * * * 
        * * * * * 
        */
     }
    }
