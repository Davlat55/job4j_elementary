package ru.job4j.array;
import java.util.Arrays;

public class Machine {
    private final int[] COINS = {10, 5, 2, 1};
    int size = 0;
    int y = 0;
    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        if ((money -= price) > 0) {                          // отдаем кофе и считаем остаток
            for (size = 0; size < COINS.length; size++) {    // начинаем делит сдачу на монеты
                while (money - COINS[size] >= 0) {           // сдачу на монету
                    rsl[y] = COINS[size];                    // помещаем первую монету
                    y++;                                     // добавляем место для следующей монеты
                    money -= COINS[size];                    // вычитаем монету
                }
            }
        }
        return Arrays.copyOf(rsl, y );
   }
}




