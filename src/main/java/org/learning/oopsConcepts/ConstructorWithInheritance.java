package org.learning.oopsConcepts;

public class ConstructorWithInheritance {
    int x = 10;
    

    public ConstructorWithInheritance() {
        System.out.println("This is a constructor from parent class");
        this.x = 20;
    }

    int inheritanceCheck() {
        return x * x;
    }

    static int inheritanceCheck(int x) {
        return x * x;
    }
}

class classInheritingConstructor extends ConstructorWithInheritance {

    public static void main(String[] args) {
        classInheritingConstructor classInheritingConstructor = new classInheritingConstructor();
        classInheritingConstructor.x = 30;
        System.out.println(classInheritingConstructor);
        System.out.println(classInheritingConstructor.x);
        System.out.println(inheritanceCheck(classInheritingConstructor.x));
    }
}