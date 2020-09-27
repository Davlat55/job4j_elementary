package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        int start = 0;
        for (int i = start; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length-1);
            int index = FindLoop2.indexOf(data, min, i, data.length-1);
            int temp = data[i];
            data[i] = data[index];
            data[index] = temp;
            start++;
        }
        return data;
    }
}
