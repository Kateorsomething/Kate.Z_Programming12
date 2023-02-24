package com.kate.module1.mod4;

import org.junit.Test;
import static org.junit.Assert.*;

public class TriangleAreaTest {

    /**
     * getArea test for triangles
     * 1. normal triangle (4,4,5) expected:~7.8
     * 2. boundary case: very thin triangle (1,9,7) expected:-1
     * 3. triangle with one side = 0 (0,6,2) expected: -1
     * 4. triangle with one side = negative (-2,9,7) expected:-1
     */
    @Test
    public void normalTriangleArea() {
        Triangle triangle = new Triangle(4,4,5,Colour.NONE);
        assertEquals(7.8, triangle.getArea(),0.01);
    }

    @Test
    public void thinTriangleArea() {
        Triangle triangle = new Triangle(1,9,7, Colour.NONE);
        assertEquals(-1, triangle.getArea(),0);
    }

    @Test
    public void zeroTriangleArea() {
        Triangle triangle = new Triangle(0,6,2,Colour.NONE);
        assertEquals(-1, triangle.getArea(),0);
    }

    @Test
    public void negativeTriangleArea() {
        Triangle triangle = new Triangle(-2,8,7, Colour.NONE);
        assertEquals(-1, triangle.getArea(),0);
    }

}