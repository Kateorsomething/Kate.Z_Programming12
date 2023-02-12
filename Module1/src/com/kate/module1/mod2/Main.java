package com.kate.module1.mod2;

public class Main {

    public static void main(String[] args) {

        TwoDShape[] shapes = {new Triangle(3,2,2), new Circle(1)};

        for (TwoDShape s : shapes) {
            System.out.println(s);
            System.out.println("area: " + s.getArea());
        }

    }

}
