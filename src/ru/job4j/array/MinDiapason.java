package ru.job4j.array;

public class MinDiapason {
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int i = start; i < finish+1; i++) {   // без +1 последный элемент не проверяется, ничего лучшего не нашел
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}

