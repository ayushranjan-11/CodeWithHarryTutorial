package org.example.practiceSet;

import org.example.oopsConcepts.AccessModifierAndGetterAndSetters;

public class OOPsPractiseSet {

    public static void main(String[] args) {
        setEmployeeDetails("Old name", 10);

        CellPhone cellPhone = new CellPhone();
        System.out.println("Phone is: " + cellPhone.phoneRinging());
        System.out.println("Phone is: " + cellPhone.phoneSilent());
        System.out.println("Phone is: " + cellPhone.phoneVibrating());

        //Square class within this class
        squareCalculation(2.45F);

        /*AccessModifierAndGetterAndSetters class methods
        (This was written just to verify difference between static and non-static methods in same class)
         */
        AccessModifierAndGetterAndSetters accessModifierAndGetterAndSetters = new AccessModifierAndGetterAndSetters();
        accessModifierAndGetterAndSetters.NonStaticCheck();
    }

    static void setEmployeeDetails(String name, int salary) {
        Employee employee = new Employee();
        employee.name = name;
        employee.salary = salary;

        System.out.println("Employee name: " + employee.name + " & " + "salary: " + employee.salary);
        employee.setName("new Name");
        System.out.println("Employee name: " + employee.name + " & " + "salary: " + employee.salary);

    }

    static void squareCalculation(float squareOneSide) {
        Square square = new Square();
        System.out.println("Area: " + Math.round(square.calculateArea(squareOneSide)));
        System.out.println("Perimeter: " + Math.round(square.calculatePerimeter(squareOneSide)));
        System.out.println("Diagonal: " + Math.round(square.calculateDiagonal(squareOneSide)));
    }
}

class Employee {
    int salary;
    String name;

    int getSalary() {
        return salary;
    }

    String getName() {
        return name;
    }

    void setName(String newName) {
        name = newName;
    }
}

class CellPhone {

    String phoneRinging() {
        return "Ringing";
    }

    String phoneVibrating() {
        return "Vibrating";
    }

    String phoneSilent() {
        return "Silent";
    }
}

class Square {

    double calculateArea(float sides) {
        return sides * sides;
    }

    float calculatePerimeter(float sides) {
        return 4 * sides;
    }

    double calculateDiagonal(float sides) {
        return Math.sqrt(2) * sides;
    }
}