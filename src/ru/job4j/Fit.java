package ru.job4j;

public class Fit {
    public static class Fit2 {

        public static double manWeight(short height) {
            double rsl = (height-100) * 1.15;

            return rsl;
        }

        public static double womanWeight(short height) {
            double rsl = (height-110) * 1.15;
            return rsl;
        }

        public static void main(String[] args) {
            short height = 187;
            double man = Fit2.manWeight(height);
            System.out.println("Man 187 is " + man);
            double woman = Fit2.womanWeight(height);
            System.out.println("Woman 187 is " + woman);
        }

    }
}
