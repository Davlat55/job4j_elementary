package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int p = array[i];
            array[i] = array[(array.length - 1) - i];
            array[(array.length - 1)- i] = p;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] input = new int[] {1, 2, 3,4,5};
        Turn.back(input);
        for (int i = 0; i < input.length; i++) {
            System.out.println(input[i]);
        }

    }
}
