package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double sumRaznAndDiv(double first, double second) {
        return razn(first, second) + div(first, second);
    }

    public static double sumFull(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                + razn(first, second)
                + div(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + sumRaznAndDiv(10, 20));
        System.out.println("Результат расчета равен: " + sumFull(10, 20));

    }
}
