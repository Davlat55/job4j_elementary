package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        for (int i = 0; i < left.length; i++) {
            rsl[i] = left[i];
        }
        int i = left.length;
        for (; i < left.length + right.length; i++) {
            rsl[i] =  right[i - left.length];
        }
        return rsl;
    }
}
