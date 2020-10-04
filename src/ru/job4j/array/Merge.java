package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int indexL = 0, indexR = 0;
        for (int i = 0; i < left.length + right.length; i++) {
            if(indexL == left.length) {
                rsl[i] = right[indexR];
                indexR++;
            } else if(indexR == right.length){
                rsl[i] = left[indexL];
                indexL++;
            } else if(left[indexL] < right[indexR]) {
                rsl[i] = left[indexL];
                indexL++;
            } else {
                rsl[i] = right[indexR];
                indexR++;
            }
        }
        return rsl;
    }
}
