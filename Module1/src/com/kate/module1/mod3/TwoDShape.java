package com.kate.module1.mod3;

public abstract class TwoDShape {

    public double width;
    public double height;
    public double rotation;

    public TwoDShape(double width,double height) {
        this.width = width;
        this.height = height;
    }

    public TwoDShape() {
        this.height = 0;
        this.width = 0;
        this.rotation = 0;
    }



    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public abstract double getArea();

}
