package org.example.practiceset;

import java.util.Arrays;
import java.util.List;

public class ArrayPractiseSet {
    public static void main(String[] args) {
//        problemOne();
//        checkNumberPresentInArray(2);
//        averageMarksFromArray();
//        arrayListReversal();
//        maximumNumberInArray();
        sortedArrayCheck();
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
        average= (float) total /5;
        System.out.println(average);
    }

    public static void addTwoMatrix() {
        // will do this after understanding it properly
    }

    public static void arrayListReversal() {
        //This program reverse the given array
        int k =0;
        int[] givenArray = new int[5];
        int[] tempArray = new int[givenArray.length];
        for(int i =0;i<givenArray.length;i++) {
            givenArray[i]=3*i;
        }
//         To display array content
        System.out.println("Array content are:");
        for(int i =0;i<givenArray.length;i++) {
            System.out.println(givenArray[i]);
        }
        for (int j = tempArray.length-1; j>=0; j--) {
            if(k<givenArray.length) {
                tempArray[j]=givenArray[k];
                k++;
            }
        }

        System.out.println("Content when reversed");
        for(int l =0; l<tempArray.length; l++) {
            System.out.println(tempArray[l]);
        }
    }

    public static void maximumNumberInArray() {
        int [] arrayList = {10, 43, 56, 11, 85, 23, 97};
        int maximumNumberInArray=0;

        for (int i =0;i<arrayList.length;i++) {
            if(arrayList[i]>maximumNumberInArray) {
                maximumNumberInArray=arrayList[i];
            }
        }
        System.out.println(maximumNumberInArray);
    }

    public static void sortedArrayCheck() {
        int[] arrayList = {10, 43, 56, 11, 85, 23, 97};
        int tempNumber = 0;

        for(int i=0;i< arrayList.length;i++) {
            for(int j=i; j< arrayList.length-1;j++) {
                if(arrayList[i]>arrayList[j]) {
                    tempNumber= arrayList[i];
                    arrayList[i]=arrayList[j];
                    arrayList[j]=tempNumber;
                }
            }
        }
        System.out.println(Arrays.toString(arrayList));
    }
}