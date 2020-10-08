package ru.job4j.condition;

public class Game2 {
    public static int checkGame2(double percent, int prize, int pay) {
        int rsl = (int) (percent * prize)/10;
        return rsl;
    }
}
