package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when34to38then4() {
        double expected = 4;
        int x1 = 3;
        int y1 = 4;
        int x2 = 3;
        int y2 = 8;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when57to46then1dot41() {
        double expected = 1.41;
        int x1 = 5;
        int y1 = 7;
        int x2 = 4;
        int y2 = 6;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when16to7And10then7dot21() {
        double expected = 7.21;
        int x1 = 1;
        int y1 = 6;
        int x2 = 7;
        int y2 = 10;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when2And15to34And47Then45dot25() {
        double expected = 45.25;
        int x1 = 2;
        int y1 = 15;
        int x2 = 34;
        int y2 = 47;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}