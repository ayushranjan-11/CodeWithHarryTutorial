package org.learning.practiceSet;

public class Chapter7PractiseSet {
    private static int sum = 0;

    public static void main(String[] args) {
//        fibonacciSeries(5);
//        multiplicationTable(2);
//        patterPrinting();
        patternPrintingUsingRecursion(5);
//        System.out.println(sumOfnNaturalNumbersRecursion(6));
//        reversePatternPrinting(5);
//        System.out.println(fibonacciWithRecursion(6));

    }

    static void fibonacciSeries(int position) {

        int start = 0, nextNumber = 1, end;
        while (position >= 0) {
            end = start + nextNumber;
            System.out.print(end + " ");
            start = nextNumber;
            nextNumber = end;
            position--;
        }
        System.out.println();
    }

    static int fibonacciWithRecursion(int lastNumber) {
//        if(lastNumber<=1) { //This returns the 1st number for fibonacci series, i.e "0"
//            return 0;
//        } else if(lastNumber ==2) { //This returns the 2nd number for fibonacci series, i.e "1"
//            return 1;
        if (lastNumber == 1 || lastNumber == 2) {
            return lastNumber - 1;
        } else {
            return fibonacciWithRecursion(lastNumber - 1) + fibonacciWithRecursion(lastNumber - 2);
        }
        /* REMEMBER THIS:
        The logic behind fibonacciWithRecursion(lastNumber-1) + fibonacciWithRecursion(lastNumber - 2) is that
          it's not the actual number which is getting calculated it's the position which is getting into consideration
          For ex:
          fibonacci of 10 !=(is not equal) to find for 10
          It's actually what is the number in 10th position under fibonacci series
          */
    }

    public static void multiplicationTable(int number) {
        if (number > 0) {
            System.out.println("Table of " + number + " till 10");
            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " " + "* " + i + " = " + number * i);
            }
        } else System.out.println("Only positive which is > 0 will be calculated");
    }

    static void patterPrinting() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void patternPrintingUsingRecursion(int patternSize) {
        if (patternSize <= 0) {
            return;
        }
//        //Reverse pattern printing
//        for (int j = patternSize-1;j>=0;j--) {
//            System.out.print("*");
//        }

        patternPrintingUsingRecursion(patternSize - 1);
        //Straight pattern printing
        /*
        For straight pattern printing before loop method is called so that lowest number should get called first
        till last
        */
        for (int j = 0; j < patternSize; j++) {
            System.out.print("*");
        }
        System.out.println();
    }

    static int sumOfnNaturalNumbersRecursion(int n) {
        if (n <= 0) {
            return sum;
        }

        sum += n;
        sumOfnNaturalNumbersRecursion((n - 1));
        return sum;
    }

    static void reversePatternPrinting(int sizeOfThePattern) {


        if (sizeOfThePattern >= 1) {
            for (int i = 0; i <= sizeOfThePattern; i++) {
                for (int j = sizeOfThePattern - i; j >= 1; j--) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else System.out.println("Minimum accepted number should be >=1 ");

    }
}
