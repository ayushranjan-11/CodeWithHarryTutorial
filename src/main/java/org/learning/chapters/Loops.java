package org.learning.chapters;

public class Loops {
    public static void main(String[] args) {
        forLoop(50);
        whileAndDoWhileLoop();
        breakAndContinue();
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

    public static void whileAndDoWhileLoop() {
        int x= 0;
        while (x<=10) {
            System.out.println("This is a result of while loop");
            x++;
        }

        do {
            x++;
            System.out.println("This is coming from do while loop");
        } while (x<20);
    }

    //Now let's use break and continue inside the loops

    public static void breakAndContinue() {
        int y= 0;
        while (y<=10) {
            System.out.println(y+" is less than 10");
            y++;

            if(y==5) {
                System.out.println("Number is now "+y);
                continue;
                //System.out.println("Coming out of the count");

            }
            System.out.println("Checking continue in JAVA");
        }
    }
}
