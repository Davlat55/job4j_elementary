package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        int start = 0;
        for (int i = start; i < data.length; i++) {
            int min = MinDiapason.findMin(data, 0, data.length);
            int index = FindLoop2.indexOf(data, min, 0, data.length);

            /* swap(...) */
        }
        return data;
    }
}
