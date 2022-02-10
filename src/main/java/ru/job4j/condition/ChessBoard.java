package ru.job4j.condition;

public class ChessBoard {

        public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        int substract1 = Math.abs(x2 - x1);
        int substract2 = Math.abs(y2 - y1);
        boolean isEven1 = substract1 % 2 == 0;
        boolean isEven2 = substract2 % 2 == 0;
        boolean notEven1 = substract1 % 2 != 0;
        boolean notEven2 = substract2 % 2 != 0;

        if (isValid(x1) && isValid(x2)
                && isValid(y1) && isValid(y2)) {
            if ((x1 != x2 && y1 != y2 && isEven1 == isEven2) || (x1 != x2 && y1 != y2 && notEven1 == notEven2)) {
                rsl = substract1 == substract2 ? Math.abs(x2 - x1) : Math.abs(y2 - y1);
            }
        }
        return rsl;
    }

    private static boolean isValid(int coordinate) {
        return coordinate >= 0 && coordinate <= 7;
    }
}
