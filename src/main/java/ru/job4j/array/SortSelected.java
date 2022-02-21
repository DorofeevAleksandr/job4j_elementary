package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int indexData = 0; indexData < data.length; indexData++) {
            int min = MinDiapason.findMin(data, indexData, data.length - 1);
            int index = FindLoop.indexOf(data, min, indexData, data.length - 1);
            SwitchArray.swap(data, index, indexData);
        }
        return data;
    }
}
