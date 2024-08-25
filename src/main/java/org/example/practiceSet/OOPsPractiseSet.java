package org.example.practiceSet;

public class OOPsPractiseSet {

    public static void main(String[] args) {
        setEmployeeDetails("Old name", 10);
        CellPhone cellPhone = new CellPhone();
        System.out.println("Phone is: "+cellPhone.phoneRinging());
        System.out.println("Phone is: "+cellPhone.phoneSilent());
        System.out.println("Phone is: "+cellPhone.phoneVibrating());

    }

     static void setEmployeeDetails(String name, int salary) {
        Employee employee = new Employee();
        employee.name = name;
        employee.salary = salary;

        System.out.println("Employee name: "+employee.name+" & "+"salary: "+employee.salary);
        employee.setName("new Name");
        System.out.println("Employee name: "+employee.name+" & "+"salary: "+employee.salary);

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

    String setName (String newName) {
        name = newName;
         return newName;
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
