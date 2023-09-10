package org.example.practiceset;

public class LoopsPractiseSet {
    public static void main(String[] args) {
        patternPrint();
    }

    public static void patternPrint() {

        /* To print this
         *
         **
         ***
         ****
         *****
         */
//        for(int i=0;i<5;i++) {
//            for(int j=0;j<=i;j--) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        /* To print this
         *****
         ****
         ***
         **
         *
        */
        for(int i=0;i<5;i++) {
            for(int j=5;j>i;j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
