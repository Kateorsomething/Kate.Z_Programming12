package com.kate.module1.mod7;

import com.kate.module1.mod4.Triangle;
import com.kate.module1.mod4.Circle;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class getAreaTest {

    /**
     * getArea test for triangles
     * 1. normal triangle (4,4,5) expected:~7.8
     * 2. boundary case: very thin triangle (1,9,7) expected:-1
     * 3. triangle with one side = 0 (0,6,2) expected: -1
     * 4. triangle with one side = negative (-2,9,7) expected:-1
     */
    @Test
    public void normalTriangleArea() {
        Triangle triangle = new Triangle(4,4,5);
        double s = ((triangle.side1 + triangle.side2 + triangle.side3) / 2);
        double expectedArea = Math.sqrt(s * (s - triangle.side1) * (s - triangle.side2) * (s - triangle.side3));

        assertEquals(expectedArea, triangle.getArea());
    }

    @Test
    public void thinTriangleArea() {
        Triangle triangle = new Triangle(1,9,7);
        assertEquals(-1, triangle.getArea());
    }

    @Test
    public void zeroTriangleArea() {
        Triangle triangle = new Triangle(0,6,2);
        assertEquals(-1, triangle.getArea());
    }

    @Test
    public void negativeTriangleArea() {
        Triangle triangle = new Triangle(-2,8,7);
        assertEquals(-1, triangle.getArea());
    }


    /** getArea test for circles
     * 1. normal circle (r=1) expected=3.14
     * 2. boundary case (r=0) expected=-1
     * 3. negative radius (r=-3) expected=-1
     */

    @Test
    public void normalCircleArea() {
        Circle circle = new Circle(1);
        assertEquals(3.14, circle.getArea());
    }

    @Test
    public void zeroCircleArea() {
        Circle circle = new Circle(0);
        assertEquals(-1, circle.getArea());
    }

    @Test
    public void negativeCircleArea() {
        Circle circle = new Circle(-3);
        assertEquals(-1, circle.getArea());
    }

}