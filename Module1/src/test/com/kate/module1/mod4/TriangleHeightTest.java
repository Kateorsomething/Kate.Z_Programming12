package com.kate.module1.mod4;

import org.junit.Test;
import static org.junit.Assert.*;

public class TriangleHeightTest {

    /**
     * heronsHeight test
     * 1. normal triangle (4,5,6) expected=~4.96
     * 2. boundary case: very thin triangle (1,9,7) expected:-1
     * 3. triangle with one side = zero (0,2,4) expected: -1
     * 4. triangle with one side = negative (-2,2,5) expected:-1
     */

    @Test
    public void normalTriangleHeight() {
        Triangle triangle = new Triangle(4, 5, 6, Colour.NONE);

        assertEquals(4.96, triangle.height,0.01);
    }

    @Test
    public void thinTriangleHeight() {
        Triangle triangle = new Triangle(1,9,7,Colour.NONE);
        assertEquals(-1,triangle.height,0);
    }

    @Test
    public void zeroTriangleHeight() {
        Triangle triangle = new Triangle(0,2,4,Colour.NONE);
        assertEquals(-1,triangle.height,0);
    }

    @Test
    public void negativeTriangleHeight() {
        Triangle triangle = new Triangle(-2,2,5,Colour.NONE);
        assertEquals(-1,triangle.height,0);
    }

}