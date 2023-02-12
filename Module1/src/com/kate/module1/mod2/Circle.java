package com.kate.module1.mod2;

public class Circle extends TwoDShape {

    public final double PI = 3.14;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        this.width = 2*radius;
        this.height = 2*radius;
    }


    public double getRadius() {
        return radius;
    }

    /**
     * radius > 0
     * @return are of circle if conditions are met, else return -1
     */
    public double getArea() {
        if (radius <= 0) {
            return -1;
        } else {
            return PI*(radius*radius);
        }
    }

    public String toString() {
        return "circle with radius " + radius;
    }

}
