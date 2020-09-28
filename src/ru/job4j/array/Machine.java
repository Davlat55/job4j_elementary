package ru.job4j.array;
import java.util.Arrays;

public class Machine {
    private final int[] COINS = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
            for (size = 0; size < COINS.length; size++) {
                if (money > price) {
                    rsl[size] = COINS[size];
                    money -= COINS[size];
                } else
                    break;;
            }
        return Arrays.copyOf(rsl, size );
   }
}




