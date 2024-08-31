package org.learning.chapters;

public class Strings {
    public static void main(String[] args) {
        stringImmutableUnderstanding();
        stringCommonMethodsChecking();
    }
    public static void stringImmutableUnderstanding() {
        //Strings are immutable
        String ab = "Hello";
        String aa = ab;
        ab= "Hillo";
        System.out.println(ab);
        //Format printing
        System.out.printf("The strings are %s and %s", ab,aa);
        System.out.println();
        /*
        Substring index starts with 0
        int provided for substring will print the value available at provided int till end
        * */
        System.out.println(ab.substring(2));
    }

    public static void stringCommonMethodsChecking() {
        String nameForTesting = "Ayush";

        //They are case-sensitive
        System.out.println(nameForTesting.length()); //This will print the length of string. int output.

        System.out.println(nameForTesting.toLowerCase()); //This will create new string with all characters in Lowercase.

        System.out.println(nameForTesting.toUpperCase()); //This will create new string with all characters in Uppercase.

        System.out.println(nameForTesting.substring(2)); //This will print string from index number of input till last of available string.

        System.out.println(nameForTesting.substring(1,4)); //This will print string from start index to end index. (Start index is included but end index is excluded)

        System.out.println(nameForTesting.replace('a','B')); //This will replace the character in the string.(Will change for every character found in the string)
        //We can also replace set of characters i.e String with replace function.

        System.out.println(nameForTesting.replace("sh","js")); //This will replace the set of characters(string) in the string.(Will change for every character found in the string)

        System.out.println(nameForTesting.startsWith("AY")); //Returns boolean after checking if string starts matches with provided set of characters.

        System.out.println(nameForTesting.endsWith("sh")); //Returns boolean after checking if string ends matches with provided set of characters.

        System.out.println(nameForTesting.charAt(2)); //This checks and return what character is stored for given index number.

        System.out.println(nameForTesting.indexOf("yh")); //Returns index number for provided string. Will provide index of 1st substring from the string

        System.out.println(nameForTesting.indexOf("s",3)); //Returns index number for provided string, starting the search from Index number given

        System.out.println(nameForTesting.lastIndexOf("s")); //Provide last index of given string(If multiple are there, then it will provide index for last one.)

        System.out.println(nameForTesting.lastIndexOf("s",2));//Provide last index of given string starting from given index and searching backward(If multiple are there, then it will provide index for last one.)

        System.out.println(nameForTesting.equals("AYUSH")); //Provide boolean expression if string is equal to provided string or not.

        System.out.println(nameForTesting.equalsIgnoreCase("ayush")); //Provide boolean expression if string is equal to provided string or not ignoring cases.

        // If result is not successful for string then it will return -1
    }
}
