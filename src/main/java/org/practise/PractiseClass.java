package org.practise;

import java.util.Arrays;

public class PractiseClass {

    public static void main(String[] args) {
        int[] array = {2, 3, 4};
        int primitiveValue = 9;
        passingValue(array, primitiveValue);
        System.out.println(Arrays.toString(array) + " " + primitiveValue);
    }

    public static void passingValue(int[] arrayInsideMethod, int primitiveValueInsideMethod) {
        //Let's check array value passing and primitive data type passing in the method

        arrayInsideMethod[0] = 5;
        primitiveValueInsideMethod += 1;

        System.out.println(Arrays.toString(arrayInsideMethod) + " " + primitiveValueInsideMethod);

        /*
         * While running this method and output from the main method it is clear that non-primitive data type pass the
         * reference of the actual value and because of that any change made changes the original value.
         * Output: [5, 3, 4] 10
                   [5, 3, 4] 9
           Here on the above output array value is changed for both but int value varies
         * */
    }
}
