package org.learning.practiceSet;

class Cylinder {
    private double radius;
    private double height;

    public void setRadius(double radiusValue) {
        radius = radiusValue;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setHeight(double heightValue) {
        height = heightValue;
    }

    public double getHeight() {
        return this.height;
    }

    public double volumeOfCyclinder() {
        return Math.PI * radius * radius * height;
    }

    public double baseArea() {
        return Math.PI*radius*radius;
    }

    public double lateralSurface() {
        return 2 * Math.PI * radius * height;
    }
}

public class ConstructorPractiseSet {

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        cylinder.setHeight(2.443);
        cylinder.setRadius(0.3);

        System.out.println("Volume of the cyclinder is: " + cylinder.volumeOfCyclinder());
        System.out.println("Base Area of the cyclinder is: " + cylinder.baseArea());
        System.out.println("Lateral surface for the cylinder is: "+ cylinder.lateralSurface());
    }
}
