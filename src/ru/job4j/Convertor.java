package ru.job4j;

public class Convertor {
    public static class Converter {

        public static float rubleToEuro(float value) {
            float rsl = value / 70;
            return rsl;
        }

        public static float rubleToDollar(float value) {
            float rsl = value / 60; /* формула перевода рублей в доллары. */
            return rsl;
        }

        public static void main(String[] args) {
            float euro = Converter.rubleToEuro(140);
            float dollor = rubleToDollar(140);
            System.out.println("140 rubles are " + euro + " euro.");
            System.out.println("140 rubles are " + dollor + " dollor.");
            int in = 140;
            int expected = 2;
            float out = Converter.rubleToEuro(in);
            boolean passed = expected == out;
            System.out.println("140 rubles are 2. Test result : " + passed);
        }
    }
}
