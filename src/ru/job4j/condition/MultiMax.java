package ru.job4j.condition;



public class MultiMax {
    public static int max(int first, int second, int third) {
        if (first < second) && (first > third){
             return first;
            }
            return (second > third) ? second : third;
     }


    public static void main(String[] args) {
        int rsl = MultiMax.max(2, 4, 6);
        System.out.println(rsl);
    }
}


