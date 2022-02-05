package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        double s = h * l;
        return s;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(4, 1);
        double result2 = SqArea.square(6, 2);
        double result3 = SqArea.square(7, 3);
        double result4 = SqArea.square(9, 4);
        double result5 = SqArea.square(15, 7);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result1);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result2);
        System.out.println(" p = 7, k = 3, s = 2.296875, real = " + result3);
        System.out.println(" p = 9, k = 4, s = 3.24, real = " + result4);
        System.out.println(" p = 15, k = 7, s = 6.15234375, real = " + result5);

    }
}
