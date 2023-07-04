package org.example;

public class Strings {
    public static void main(String[] args) {
        stringImmutableUnderstanding();
    }
    public static void stringImmutableUnderstanding() {
        //Strings are immutable
        String ab = "Hello";
        String aa = ab;
        ab= "Hillo";
        System.out.println(ab);
    }
}
