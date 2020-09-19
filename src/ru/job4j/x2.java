package ru.job4j;

public class x2 {
    public static int calc(int a, int b, int c, int x) {
        return a * x * x + b * x + c;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c = 0;
        int x = 1;
        int rsl = x2.calc(a, b, c, x);
        System.out.println(rsl);
        int a1 = 1;
        int b1 = 1;
        int c1 = 1;
        int x1 = 1;
        int rsl1 = x2.calc(a1, b1, c1, x1);
        System.out.println(rsl);
    }
}
