package com.kate.module1.mod1;

public class TwoDShape {

    public double width;
    public double height;

    public TwoDShape(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public TwoDShape() {
        this.height = 0;
        this.width = 0;
    }


    /**
     * width & height > 0
     * @return width*height
     */
    public double getArea() {
        if (width <= 0 || height <= 0) {
            return -1;
        } else {
            return width * height;
        }
    }

    public void setHeight(double height) {
        this.height = height;
    }


}
