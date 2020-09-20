package ru.job4j.condition;

public class MultipleSwitchWeek {
    public static int nameDay(String day) {
        int name;
        switch (day) {
            case "Понедельник":
                name = 1;
                break;
            case "Вторник":
                name = 2;
                break;
            case "Среда":
                name = 3;
                break;
            case "Четверг":
                name = 4;
                break;
            case "Пятница":
                name = 5;
                break;
            case "Суббота":
                name = 6;
                break;
            case "Воскресенье":
                name = 7;
                break;
            default:
                name = 1;
                break;
        }
        return name;
    }

    public static void main(String[] args) {
        System.out.println(MultipleSwitchWeek.nameDay("Вторник"));
    }
}
