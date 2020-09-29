package ru.job4j.array;
import java.util.Arrays;

public class Machine {
    private final int[] COINS = {10, 5, 2, 1};
    int size = 0;
    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        if ((money -= price) > 0) {                          // отдаем кофе и считаем остаток
            for (size = 0; size < COINS.length; size++) {    // начинаем делит сдачу на монеты
                while (money % COINS[size] >= 0) {           // сдачу на монету
                    rsl[size] = COINS[size];                 // помещаем первую монету
                    money -= COINS[size];                    // вычитаем монету
                    if (money < COINS[size]) {               // если остаток меньше монеты,
                         break;                              // прериваем цикл, и переходим к следующей монете
                     }
                }
                if (money == 0) {
                    break;
                }
            }
        }
        return Arrays.copyOf(rsl, size+1 );
   }
}




