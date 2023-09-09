package org.example.chapters;

public class Loops {
    public static void main(String[] args) {
        forLoop(50);
    }

    public static void forLoop(int limit) {
        //To print odd numbers in given range
        for(int i=0;i<=limit;i++) {
            //This outputs odd numbers within the provided range
//            if(i%2!=0) {
//                System.out.println(i);
//            }

            //This outputs total of odd numbers within the range
            System.out.println(2*i+1);
        }
    }
}
