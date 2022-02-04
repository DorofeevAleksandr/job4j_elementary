package ru.job4j.condition;

public class X2 {
    public static int calc(int a, int b, int c, int x) {
        return a * x * x + b * x + c;
    }

   public static void main(String[] args) {
       int a, b, c, x;
       int whenA10B0C0X2Then40 = X2.calc(10, 0, 0, 2);
       int whenA1B1C1X1Then3 = X2.calc(1, 1, 1, 1);
       int whenA0B1C1X1Then2 = X2.calc(0, 1, 1, 1);
       int whenA1B1C0X1Then2 = X2.calc(1, 1, 0, 1);
       int whenA1B1C1X0Then1 = X2.calc(1, 1, 1, 0);
       System.out.println(whenA10B0C0X2Then40);
       System.out.println(whenA1B1C1X1Then3);
       System.out.println(whenA0B1C1X1Then2);
       System.out.println(whenA1B1C0X1Then2);
       System.out.println(whenA1B1C1X0Then1);

    }
}
