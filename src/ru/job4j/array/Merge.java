package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        for (int i = 0; i < left.length; i++) {
            rsl[i] = left[i];
        }
        for (int y = left.length; y < left.length + right.length; y++) {
            rsl[y] =  right[y - left.length];
        }
        return rsl;
    }
}
