package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        for (int y = 0; y < 5; y++) {
            numbers[y] = y * 2 + 3;
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(numbers[i]);
        }
    }
}
