package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {

    @Test
    public void whenSortArrayOf3elements() {
        int[] data = new int[] {12, 28, 7};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {7, 12, 28};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayOf5elements() {
        int[] data = new int[] {43, 74, 21, 32, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {5, 21, 32, 43, 74};
        Assert.assertArrayEquals(expected, result);
    }
}