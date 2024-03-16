package org.example.practiceset;

public class RecursionPractiseSet {
    public static void main(String[] args) {
        fibonacciSeries(5);
        multiplicationTable(2);
    }

    static void fibonacciSeries(int position) {

        int start = 0, nextNumber = 1, end = 0;
        while(position>=0) {
            end = start+nextNumber;
            System.out.print(end+ " ");
            start = nextNumber;
            nextNumber = end;
            position--;
        }
        System.out.println();
    }

//    static void fibonacciWithRecursion(int lastNumber) {
//        if(lastNumber<=0) {
//            return;
//        }
//
//    }

    public static void multiplicationTable(int number) {
        if (number>0) {
            System.out.println("Table of "+number+ " till 10");
            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " " + "* " + i + " = " + number * i);
            }
        } else System.out.println("Only positive which is > 0 will be calculated");
    }
}
