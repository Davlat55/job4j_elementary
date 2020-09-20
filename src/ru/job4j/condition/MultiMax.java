package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        if (first > second) {
            return (first > third) ? first : third;
            }
        return second;
    }
}

    public static void main(String[] args) {
        MultiMax.max(2,4,6);
    }

