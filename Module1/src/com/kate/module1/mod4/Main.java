package com.kate.module1.mod4;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<TwoDShape> shapes = new ArrayList <TwoDShape> ();
        shapes.add(new Circle(1));
        shapes.add(new Triangle(1,1,1));
        shapes.get(0).colour = Colour.RED;
        shapes.get(1).rotate90();
        shapes.get(1).rotate(55);

        for (TwoDShape s : shapes) {
            System.out.println(s);
            System.out.println("area:" + s.getArea());
        }

    }

}
