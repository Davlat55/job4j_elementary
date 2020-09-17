package ru.job4j;

public class Argument {
    public static class ArgMethod {

        public static void hello(String name) {
            System.out.println("Hello, " + name);
        }

        public static void main(String[] args) {
            String name = "Davlat Raziev";


            ArgMethod.hello(name);

        }
    }
}
