package org.example.chapters;

public class Methods {

    static int checkNumberAndAdd(int a, int b) {
        int result;
        if((a%b)>2) {
            result= a+b;
        } else {
            result=a*b;
        }
        return result;
    }

    //Method Overloading
    static void method1() {
        System.out.println("This is a method 1");
    }static void method1(int ...a) {
        int c =0;
        for (int b:a
             ) {
            c +=b;
            System.out.println("Number provided in the methods are "+b);
        }
        //System.out.println("This is a method "+a);
        System.out.println("Sum of given number is: "+c);
    }static void method1(String text) {
        System.out.println("This is a method with "+text);
    }
    static void methodForTestingVarargs(String ...text) {
        for (String a:text
             ) {
            System.out.println(a);
        }
//        System.out.println("This is a method with "+text);
    }
    public static void main(String[] args) {
        System.out.println(checkNumberAndAdd(10,12));
//        method1("text");
//        method1(2,3,4,5,6);
//        method1();
        methodForTestingVarargs();
        methodForTestingVarargs("Test");
    }
}
