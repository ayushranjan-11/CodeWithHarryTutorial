package org.learning.oopsConcepts;

class InnerClassForConstructor {

    private int roll;
    private String name;

    public InnerClassForConstructor() {
        roll = 50;
        name = "Learning";
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int newRoll) {
        roll = newRoll;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }
}

public class Constructors {

    public static void main(String[] args) {

        InnerClassForConstructor innerClassForConstructor = new InnerClassForConstructor();
        System.out.println(innerClassForConstructor.getName());
        System.out.println(innerClassForConstructor.getRoll());
    }
}
