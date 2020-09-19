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
        System.out.println(rsl1);
        int a3 = 0;
        int b3 = 1;
        int c3 = 1;
        int x3 = 1;
        int rsl3 = x2.calc(a3, b3, c3, x3);
        System.out.println(rsl3);
        int a4 = 1;
        int b4 = 1;
        int c4 = 0;
        int x4 = 1;
        int rsl4 = x2.calc(a4, b4, c4, x4);
        System.out.println(rsl4);
        int a5 = 1;
        int b5 = 1;
        int c5 = 1;
        int x5 = 0;
        int rsl5 = x2.calc(a5, b5, c5, x5);
        System.out.println(rsl5);
    }
}
