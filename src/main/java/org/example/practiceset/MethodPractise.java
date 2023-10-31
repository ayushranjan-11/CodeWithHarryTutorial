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

        //Class Object logic test below
        ArrayPractiseSet arrayPractiseSet = new ArrayPractiseSet();
        ArrayPractiseSet arrayPractiseSet1 = arrayPractiseSet;

        arrayPractiseSet1.ClassobjeectLogicTest();
        arrayPractiseSet=null;
        arrayPractiseSet1.ClassobjeectLogicTest();
        //arrayPractiseSet.ClassobjeectLogicTest(); //This will provide NullPointerException as arrayPractiseSet was set to null.
    }
}
