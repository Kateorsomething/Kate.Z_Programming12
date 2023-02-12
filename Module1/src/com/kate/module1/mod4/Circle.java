package com.kate.module1.mod4;

public class Circle extends TwoDShape implements Rotate {

    public final double PI = 3.14;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        this.height = 2*radius;
        this.width = 2*radius;
    }

    /**
     * radius > 0
     * @return are of circle if conditions met, else return -1
     */
    public double getArea() {
        if (radius <= 0) {
            return -1;
        } else {
            return PI*(radius*radius);
        }
    }

    public double getRadius() {
        return radius;
    }

    public String toString() {
        return "circle with radius " + radius +". colour:" + colour + ".";
    }

    @Override
    public void rotate90(){}
    @Override
    public void rotate180(){}
    @Override
    public void rotate(double degree){}

}
