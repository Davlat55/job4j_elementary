package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        for (int i = 2; i <= number; i++) {
            if (!(number % 2 == 0)) {
                boolean prime = true;
                return prime;
            }
            break;
        }
        return false;
    }

}