package org.learning.practiceSet;

public class LoopsPractiseSet {
    public static void main(String[] args) {

        // All the code written in this class can be more optimised if we can add input check.
        patternPrint();
//        evenNumbersAddition(4);
//        multiplicationTable(12);
//        multiplicationTableInReverse(10);
//        factorialOfNumber(5);
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

    public static void evenNumbersAddition(int n) { // n = count of even numbers
        int i=0, sum=0, tempN = n;
        while(tempN>0) {
            if(i%2==0) {
                System.out.println("Number is "+i);
                sum=sum+i;
                tempN--; //Here we are decreasing the count only after finding even number successfully.
            }
            i++;

        }
        System.out.println(sum);

//        //Alternate
//        int sum = 0;
//        for (int i =0;i<n;i++) {
//            sum = sum+((2*i));
//        }
//        System.out.println("Sum of "+n+" even numbers is "+sum);
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

    public static void factorialOfNumber(int number) {
        int result = 1,tempNumber=number;
        if (tempNumber>0) {
            while(tempNumber>0) {
                result *= tempNumber;
                tempNumber--;
            }
        }
        System.out.println("factorial of number "+number+" is "+result);
    }


}
