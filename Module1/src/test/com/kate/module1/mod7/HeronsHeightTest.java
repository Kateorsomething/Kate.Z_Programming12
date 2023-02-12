package com.kate.module1.mod7;

import com.kate.module1.mod4.Triangle;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HeronsHeightTest {

    /**
     * heronsHeight test
     * 1. normal triangle (4,5,6) expected=~5
     * 2. boundary case: very thin triangle (1,9,7) expected:-1
     * 3. triangle with one side = zero (0,2,4) expected: -1
     * 4. triangle with one side = negative (-2,2,5) expected:-1
     */

    @Test
    public void normalTriangleHeight() {
        Triangle triangle = new Triangle(4,5,6);
        double expectedHeight = (triangle.getArea()*2)/triangle.side1;

        assertEquals(expectedHeight,triangle.heronsHeight());
    }

    @Test
    public void thinTriangleHeight() {
        Triangle triangle = new Triangle(1,9,7);
        assertEquals(-1,triangle.heronsHeight());
    }

    @Test
    public void zeroTriangleHeight() {
        Triangle triangle = new Triangle(-2,2,5);
        assertEquals(-1,triangle.heronsHeight());
    }

    @Test
    public void negativeTriangleHeight() {
        Triangle triangle = new Triangle(-2,9,7);
        assertEquals(-1,triangle.heronsHeight());
    }



}