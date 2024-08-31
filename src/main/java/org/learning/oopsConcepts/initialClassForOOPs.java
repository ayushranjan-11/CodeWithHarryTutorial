package org.learning.oopsConcepts;

class EmployeeDetails {
    String name;
    String designation;
    int employeeId;

    public void getEmployeeDetails() {
        System.out.println("Name of the employee is " + name);
        System.out.println("Employee working as " + designation);
        System.out.println("Employee ID is " + employeeId);
    }
}


public class initialClassForOOPs {
    public static void main(String[] args) {
        EmployeeDetails employeeDetailsOfUserOne = new EmployeeDetails();
        setEmployeeDetails(employeeDetailsOfUserOne, "New user 2", "Manager", 2);
        employeeDetailsOfUserOne.getEmployeeDetails();
    }

    public static void setEmployeeDetails(EmployeeDetails employeeDetails, String name, String designation, int employeeId) {
        //EmployeeDetails employeeDetailsOfUserOne = new EmployeeDetails();
        employeeDetails.name = name;
        employeeDetails.designation = designation;
        employeeDetails.employeeId = employeeId;
    }
}
