package org.learning.oopsConcepts;

class InnerClassForConstructor {

    private int roll;
    private String name;

    // This is a constructor for this class
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

// Also we can do multiple inner class in JAVA
class ConstructorWithValues {
    // This class will have values and it will also be updated.

    private int employeeSalary;
    private String employeeDesignation;

    public ConstructorWithValues(int updatedSalary, String desginationChange) {
        this.employeeDesignation = desginationChange;
        this.employeeSalary = updatedSalary;
    }

    public void setSalary(int salaryInput) {
        employeeSalary = salaryInput;
    }

    public int getSalary() {
        return employeeSalary;
    }

    public void setDesignation(String updatedDesignation) {
        employeeDesignation = updatedDesignation;
    }

    public String getCurrentDesignation() {
        return employeeDesignation;
    }

}

class ConstructorWIthOverLoading {

    // Below is the example how we can overload constructors. Constructors can also be overloaded.
    //Both constructors can also be called in class
    public ConstructorWIthOverLoading() {

    }

    public ConstructorWIthOverLoading(int n) {

    }
}

public class Constructors {

    public static void main(String[] args) {

        InnerClassForConstructor innerClassForConstructor = new InnerClassForConstructor();
        /*
         * Here name and roll are getting prinited without even intializing or calling
         * the setters,
         * as in constructors the values are set for them already
         */
        System.out.println(innerClassForConstructor.getName());
        System.out.println(innerClassForConstructor.getRoll());
        innerClassForConstructor.setName("No argument constructor name display");
        innerClassForConstructor.setRoll(10);

        System.out.println(innerClassForConstructor.getName());
        System.out.println(innerClassForConstructor.getRoll());

        // Constructor with values initialied class working
        ConstructorWithValues constructorWithValues = new ConstructorWithValues(0, "null");
        constructorWithValues.setDesignation("null from set method");
        constructorWithValues.setSalary(0);
        System.out.println(constructorWithValues.getSalary());
        System.out.println(constructorWithValues.getCurrentDesignation());

        //Constructor overloading
        ConstructorWIthOverLoading constructorWIthOverLoading = new ConstructorWIthOverLoading();
        ConstructorWIthOverLoading constructorWIthOverLoadingWithValues = new ConstructorWIthOverLoading(4);
    }
}
