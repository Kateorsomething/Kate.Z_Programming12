package com.kate.module1.mod4;

public abstract class TwoDShape {

    public double width;
    public double height;
    public Colour colour;

    public TwoDShape(double width,double height,Colour colour) {
        this.width = width;
        this.height = height;
        this.colour = colour;
    }

    public TwoDShape() {
        this.height = 0;
        this.width = 0;
        this.colour = Colour.NONE;
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
