package com.kate.module1.mod2;
//note: I will be assuming side1 = base of triangle

public class Triangle extends TwoDShape {

    public double side1;
    public double side2;
    public double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.width = side1;
        this.height = this.heronsHeight();
    }


    /**
     * area != -1
     * @return height of triangle with base = side1 if conditions are met, else return -1
     */
    public double heronsHeight() {
        if (this.getArea() == -1) {
            return -1;
        } else {
            return (2*this.getArea())/side1;
        }
    }

    /**
     * side1, side2, side3 > 0 AND side1,side2,side3 < s, where s = (side1 + side2 + side3)/2
     * @return area of triangle if conditions are met, else return -1
     */
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        if (side1 >= s || side1 <= 0 || side2 >= s || side2 <= 0 || side3 >= s || side3 <= 0) {
            return -1;
        } else {
            return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        }
    }

    public String toString() {
        return "triangle with base " + side1 + " and height " + height;
    }
}
