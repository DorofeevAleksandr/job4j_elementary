package ru.job4j.condition;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return rsl;
    }

    public static void main(String[] args) {
        double result1 = Point.distance(0, 0, 2, 0);
        double result2 = Point.distance(3, 4, 3, 8);
        double result3 = Point.distance(5, 7, 4, 6);
        double result4 = Point.distance(1, 6, 7, 10);
        double result5 = Point.distance(2, 15, 34, 47);

        System.out.println("result (0, 0) to (2, 0) " + result1);
        System.out.println("result (3, 4) to (3, 8) " + result2);
        System.out.println("result (5, 7) to (4, 6) " + result3);
        System.out.println("result (1, 6) to (7, 10) " + result4);
        System.out.println("result (2, 15) to (34, 47) " + result5);
    }

}
