package ru.job4j.array;
import java.util.Arrays;

public class Machine {
    private final int[] COINS = {10, 5, 2, 1};
    int size = 0;
    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        if ((money -= price) > 0) {
            for (size = 0; size < COINS.length; size++) {
                while (money % COINS[size] >= 0) {
                    rsl[size] = COINS[size];
                    money -= COINS[size];
                    if (money < COINS[size]) {
                         break;
                     }
                }
                if (money == 0) {
                    break;
                }
            }
        }
        return Arrays.copyOf(rsl, size );
   }
}




