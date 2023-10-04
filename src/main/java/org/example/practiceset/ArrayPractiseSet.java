package org.example.practiceset;

public class ArrayPractiseSet {
    public static void main(String[] args) {
        problemOne();
        checkNumberPresentInArray(2);
        averageMarksFromArray();
    }

    public static void problemOne() {
        //Initialize array here
        float [] numbers = new float[5];
        float sumOfAllInput = 0;

        //Providing input in the array
        for (int i =0;i< numbers.length; i++) {
            numbers[i] = (i*2);

            //Adding array content 1 by 1
            sumOfAllInput+=numbers[i];
        }

        System.out.println(sumOfAllInput);
    }

    public static void checkNumberPresentInArray(int searchNumber) {
        int[] numbers = new int[5];
        for (int i =0;i< numbers.length; i++) {
            numbers[i] = (i*2);

            if (numbers[i]==searchNumber) {
                System.out.println("Search number is present at "+i);
            } else System.out.println(searchNumber +" is not present in the array");
        }


    }

    public static void averageMarksFromArray() {
        int[] marks = new int[5];
        int total =0;
        float average=0;
        marks[0] = 74;
        marks[1] = 83;
        marks[2] = 54;
        marks[3] = 96;
        marks[4] = 29;

        for (int subjectMarks:marks
             ) {
            total+=subjectMarks;
        }
        System.out.println(average= (float) total /5);
    }


}
