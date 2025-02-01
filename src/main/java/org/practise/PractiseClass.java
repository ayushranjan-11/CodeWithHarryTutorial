package org.practise;

import java.util.Arrays;
import java.util.Scanner;

public class PractiseClass {

    public static void main(String[] args) {
        int[] array = {2, 3, 4};
        int primitiveValue = 9;
        passingValue(array, primitiveValue);
        System.out.println(Arrays.toString(array) + " " + primitiveValue);
        PractiseClass practiseClass = new PractiseClass();
        practiseClass.scannerInputCheck();
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

    public void scannerInputCheck() {
        //This method was written to check scanner value passed and value hold

        System.out.println("Provide number input to check");
        Scanner scanner = new Scanner(System.in); //System.in -> to get system input (if more way to pass input then check on internet)

        if (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            System.out.println("Input was number and it was: " + x);

        } else if (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            System.out.println("Input was sentence and it was: " + input);

        } else {
            System.out.println("Input was neither number or sentence");
        }
    }
}
