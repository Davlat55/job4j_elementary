package ru.job4j.condition;

public class SqAreaT {
    public static double square(int p, int k) {
        double rsl = (p * k) / (2 * (k + 1));
        return rsl;
    }

    public static void main(String[] args) {
        double result1 = SqAreaT.square(4, 1);
        System.out.println(" p = 4, k = 1, real = " + result1);
    }
}
