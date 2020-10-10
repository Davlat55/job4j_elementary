package ru.job4j.condition;

public class HelloWorld {
    public static String checkNumber(int number) {
        String s;
       if (number % 3 == 0) {
           s = "Hello";
       }
        if (number % 5 == 0) {
            s = "World";
        }
        if (number % 3 == 0 && number % 5 == 0) {
            s = "Hello, World!!!";
        }  else
            s = "Operation not support";
        return s;
    }

    public static void main(String[] args) {
        checkNumber(3);
    }
}
