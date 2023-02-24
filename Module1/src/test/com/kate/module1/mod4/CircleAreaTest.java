package com.kate.module1.mod4;

import org.junit.Test;

import static org.junit.Assert.*;

public class CircleAreaTest {

    /** getArea test for circles
     * 1. normal circle (r=1) expected=3.14
     * 2. boundary case (r=0) expected=-1
     * 3. negative radius (r=-3) expected=-1
     */

    @Test
    public void normalCircleArea() {
        Circle circle = new Circle(1,Colour.NONE);
        assertEquals(3.14, circle.getArea(),0.01);
    }

    @Test
    public void zeroCircleArea() {
        Circle circle = new Circle(0,Colour.NONE);
        assertEquals(-1, circle.getArea(),0);
    }

    @Test
    public void negativeCircleArea() {
        Circle circle = new Circle(-3,Colour.NONE);
        assertEquals(-1, circle.getArea(),0);
    }

}