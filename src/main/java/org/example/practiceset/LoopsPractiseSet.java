package org.example.practiceset;

public class LoopsPractiseSet {
    public static void main(String[] args) {
        patternPrint();
        evenNumbersAddition(10);
        multiplicationTable(12);
        multiplicationTableInReverse(10);
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

    public static void evenNumbersAddition(int n) { // n = limit
        int i=0, sum=0;
        while(i<=n) {
            if(i%2==0) {
                System.out.println("Number is "+i);
                sum+=i;
            }
            i++;
        }
        System.out.println(sum);
    }

    public static void multiplicationTable(int n) { //n = number for which table will be written
        for(int i=1;i<=10;i++) {
            System.out.println(n+"*"+i+"="+ (n * i));
        }
    }

    public static void multiplicationTableInReverse(int n) {
        for(int i=10; i>=1; i--) {
            System.out.println(n+"*"+i+"="+(n*i));
        }
    }
}
