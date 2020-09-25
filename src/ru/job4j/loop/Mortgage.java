package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        double p = 1;
        while (p > 0) {
            p = ((amount * (percent/10)) + amount) - salary;
               year++;
        }
        return year;
   }

    public static void main(String[] args) {
        System.out.println(Mortgage.year(100,70,50));
    }
}
