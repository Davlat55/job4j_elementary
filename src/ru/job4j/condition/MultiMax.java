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
        System.out.println(MultiMax.max(2,4,6));
    }

