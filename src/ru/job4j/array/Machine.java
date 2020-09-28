package ru.job4j.array;

public class Machine {
    private final int[] COINS = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        size = money - price;
        for (int i = 0; i < COINS.length; i++) {
            if(size % COINS[i] != 0) {
                rsl[i] = COINS[i];
            }

        }
        return rsl;
    }


}
