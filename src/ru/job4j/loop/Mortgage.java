package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        double p = 1;  // это ежегодный платеж
        while (p > 0) {
            p = (((amount * percent) / 100) + amount) - salary;
            amount = p;  // Здесь разные тип данных получилось, и из за этого тип amount сменил на double
            year++;
        }
        return year;

    }

}
