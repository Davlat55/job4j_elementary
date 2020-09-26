package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 0; i < data.length ; i++) {
            if (data[0] && data[i + 1]) {
                return true;
                break;
            } else
                return false;
        }
        return result;
    }
}
