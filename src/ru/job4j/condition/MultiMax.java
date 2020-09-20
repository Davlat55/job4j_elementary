package ru.job4j.condition;

import static java.lang.System.out;

public class MultiMax {
    public static int max(int first, int second, int third) {
        if (first > second) {
            return (first > third) ? first : third;
            }
        return second;
    }
}

    public static void main(String[] args) {
        out.println(MultiMax.max(2,4,6));
    }

