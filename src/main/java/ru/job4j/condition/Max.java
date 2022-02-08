package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean condition = left >= right;
        int result = condition ? left : right;
        return result;
    }

    public static void main(String[] args) {
        int maximum1 = Max.max(1, 2);
        int maximum2 = Max.max(245, 115);
        int maximum3 = Max.max(5, 18);
        int maximum4 = Max.max(77, 77);
        System.out.println("Максимальное число " + maximum1);
        System.out.println("Максимальное число " + maximum2);
        System.out.println("Максимальное число " + maximum3);
        System.out.println("Максимальное число " + maximum4);
    }
}
