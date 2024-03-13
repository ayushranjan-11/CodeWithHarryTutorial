package org.example.practiceset;

public class RecursionPractiseSet {
    public static void main(String[] args) {
        fibonacciSeries(5);
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
    }
}
