package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
        int p = 1;  // это ежегодный платеж
        while(p > 0){
          p = (((amount * percent) / 100) + amount) - salary;
          year++;
        }
        return year;

}
