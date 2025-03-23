package org.learning.oopsConcepts;

public class InheritanceLearning {
    //This class can be called Super class, Base class or parent class

    String testString = "made a modification on parent class";
}

class classInheritingClass extends InheritanceLearning {

    public static void main(String[] args) {
        inheritanceCheck();
    }

    static void inheritanceCheck() {
        classInheritingClass classInheritingClass = new classInheritingClass();
        System.out.println(classInheritingClass.testString + " but was called from child class");
        System.out.println("Now changing the string value in child class for the parent class variable");
        
        classInheritingClass.testString = "made a modification on child class";
        System.out.println(classInheritingClass.testString + " value changed from child class");
    }
}