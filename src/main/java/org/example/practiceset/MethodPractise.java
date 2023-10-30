package org.example.practiceset;

public class MethodPractise {

    static void method1(int a) {
        System.out.println(a+2);
    }

    static void method2(int[] b) {
        b[0] *= 10;
        System.out.println(b[0]);
    }

    public static void main(String[] args) {
        int x = 5;
        method1(x);
        System.out.println(x);

        int[]y = {1,2,3,4,5};
        method2(y);
        System.out.println(y[0]);
        fibonacciSeries(10);
    }

    //Fibonacci series
    static void fibonacciSeries(int limit) {
        int start=0, start1 = 1, calculation=0;

        for (int i= 0; i<limit; i++) {
            calculation+=start1;
            System.out.print(" "+calculation);
            start=start1;
            start1=calculation;
            calculation=start;
        }
    }
}
