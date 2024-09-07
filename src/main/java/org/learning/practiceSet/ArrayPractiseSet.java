package org.learning.practiceSet;

import java.util.Arrays;

public class ArrayPractiseSet {
    public static void main(String[] args) {
//        problemOne();
//        checkNumberPresentInArray(2);
//        averageMarksFromArray();
        addTwoMatrix();
        arrayListReversal();
//        maximumNumberInArray();
//        sortedArrayCheck();
    }

    public static void problemOne() {
        //Initialize array here
        float[] numbers = new float[5];
        float sumOfAllInput = 0;

        //Providing input in the array
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (i * 2);

            //Adding array content 1 by 1
            sumOfAllInput += numbers[i];
        }

        System.out.println(sumOfAllInput);
    }

    public static void checkNumberPresentInArray(int searchNumber) {
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (i * 2);

            if (numbers[i] == searchNumber) {
                System.out.println("Search number is present at " + i);
                break;
            } else System.out.println(searchNumber + " is not present in the array");
        }


    }

    public static void averageMarksFromArray() {
        int[] marks = new int[5];
        int total = 0;
        float average = 0;
        marks[0] = 74;
        marks[1] = 83;
        marks[2] = 54;
        marks[3] = 96;
        marks[4] = 29;

        for (int subjectMarks : marks
        ) {
            total += subjectMarks;
        }
        average = (float) total / 5;
        System.out.println(average);
    }

    public static void addTwoMatrix() {
        // will do this after understanding it properly
        // Matrix is 2*3 size
        int[][] doubleMat1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] doubleMat2 = {{11, 22, 33}, {44, 55, 66}};
        int[][] totalMat = new int[2][3];

        for (int i = 0; i < doubleMat1.length; i++) {
            for (int j = 0; j < doubleMat1[i].length; j++) {
                totalMat[i][j] = doubleMat1[i][j] + doubleMat2[i][j];
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(totalMat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void arrayListReversal() {
        //This program reverse the given array
        int k = 0;
        int[] givenArray = new int[9];
        int[] tempArray = new int[givenArray.length];
        for (int i = 0; i < givenArray.length; i++) {
            givenArray[i] = 3 * i;
        }
//         To display array content
        System.out.println("Array content are:");
        for (int i = 0; i < givenArray.length; i++) {
            System.out.print(givenArray[i] + " ");
        }
        for (int j = tempArray.length - 1; j >= 0; j--) {
            if (k < givenArray.length) {
                tempArray[j] = givenArray[k];
                k++;
            }
        }
        System.out.println("\nContent when reversed");
        for (int l = 0; l < tempArray.length; l++) {
            System.out.print(tempArray[l] + " ");
        }

        //todo do this program with array finding the center and dividing it half half and then reversing it.

        //Alternate way

        int[] arr = {1, 21, 3, 4, 5, 34, 67};
        int arrayLength = arr.length;
        int n = Math.floorDiv(arrayLength, 2); //floorDiv() provide quotient without point value.
        int temp;

        for (int i = 0; i < n; i++) {
            // Swap a[i] and a[l-1-i]
            // a   b   temp
            // |4| |3| ||
            temp = arr[i];
            arr[i] = arr[arrayLength - i - 1];
            arr[arrayLength - i - 1] = temp;
        }

        for (int element : arr) {
            System.out.print(element + " ");
        }

    }

    public static void maximumNumberInArray() {
        int[] arrayList = {10, 43, 56, 11, 85, 23, 97};
        int maximumNumberInArray = 0;

        for (int i = 0; i < arrayList.length; i++) {
            if (arrayList[i] > maximumNumberInArray) {
                maximumNumberInArray = arrayList[i];
            }
        }
        System.out.println(maximumNumberInArray);
    }

    public static void sortedArrayCheck() {
        int[] arrayList = {10, 43, 56, 11, 85, 23, 97};
        int tempNumber = 0;

        for (int i = 0; i < arrayList.length; i++) { //
            for (int j = i; j < arrayList.length - 1; j++) {
                if (arrayList[i] > arrayList[j]) {
                    tempNumber = arrayList[i];
                    arrayList[i] = arrayList[j];
                    arrayList[j] = tempNumber;
                }
            }
        }
        System.out.println(Arrays.toString(arrayList));
    }

    public void ClassobjeectLogicTest() {
        System.out.println("This method was called");
    }

    public static void arrayListUse() {

    }
}
