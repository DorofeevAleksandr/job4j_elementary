package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax245To115Then245() {
        int left = 245;
        int right = 115;
        int result = Max.max(left, right);
        int expected = 245;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax5To18Then18() {
        int left = 5;
        int right = 18;
        int result = Max.max(left, right);
        int expected = 18;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax77To77Then77() {
        int left = 77;
        int right = 77;
        int result = Max.max(left, right);
        int expected = 77;
        Assert.assertEquals(result, expected);
    }
}