package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int n = 5;
        int result = Factorial.calc(n);
        int expected = 120;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int n = 0;
        int result = Factorial.calc(n);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenCalculateFactorialForOneThenOne() {
        int n = 1;
        int result = Factorial.calc(n);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenCalculateFactorialForSixThenSevenHundredTwenty() {
        int n = 6;
        int result = Factorial.calc(n);
        int expected = 720;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenCalculateFactorialForFourThenTwentyFour() {
        int n = 4;
        int result = Factorial.calc(n);
        int expected = 24;
        Assert.assertEquals(expected, result);
    }
}