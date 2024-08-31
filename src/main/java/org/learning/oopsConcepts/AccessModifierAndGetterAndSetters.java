package org.learning.oopsConcepts;

//This class was created for getters and setters learning along with available access modifier in JAVA
public class AccessModifierAndGetterAndSetters {

    public static void main(String[] args) {
//        AccessModifierForEmployee accessModifierForEmployee = new AccessModifierForEmployee();
//        accessModifierForEmployee.setPhoneNumber(1234567890);
//        accessModifierForEmployee.setAddress("Unknown");
//
//        System.out.println(accessModifierForEmployee.getPhoneNumber());
//        System.out.println(accessModifierForEmployee.getAddress());

        AccessModifierForEmployee.setAddress("Address from static method");
        AccessModifierForEmployee.setPhoneNumber(920920920);

        System.out.println(AccessModifierForEmployee.getAddress());
        System.out.println(AccessModifierForEmployee.getPhoneNumber());
    }

    public static void staticCheck() {
        System.out.println("This method is static method for class AccessModifierAndGetterAndSetters");
    }

    public void NonStaticCheck() {
        System.out.println("This method is non-static method for class AccessModifierAndGetterAndSetters");
    }
}

class AccessModifierForEmployee {

    //These private identifiers will not be accessible to other class directly so through getters and setter we can do such
    private static int phoneNumber;
    private static String address;

    /*
    For getters and setters they have to have public as access modifier or else they will also be not able to call
    outside of the class. To check this sentence, change access modifier for available methods below.
    * */
    public static int getPhoneNumber() {
        return phoneNumber;
    }

    public static void setPhoneNumber(int phoneNumberOfEmployee) {
        phoneNumber = phoneNumberOfEmployee;
    }

    public static String getAddress() {
        return address;
    }

    public static void setAddress(String addressOfEmployee) {
        address = addressOfEmployee;
    }
}
