package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
       if ((first > second) && (first > third)) {
            return first;
        }
        if (second > first && second > third) {
            return  second;
        }
        return first;
    }

    public static void main(String[] args) {
        int rsl = MultiMax.max(3, 8, 5);
        System.out.println(rsl);
    }

}
