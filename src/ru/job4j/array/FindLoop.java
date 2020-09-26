package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int el) {
        int rst = -1; /* если элемента нет в массиве, то возвращаем -1. */
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
               rst = data[i];
               break;
            } else
                rst = -1;
        }
        return rst;
    }

    public static int indexOf2(int[] data, int el, int start, int finish) {
        int rst = -1; /* если элемента нет в массиве, то возвращаем -1. */
        for (int i = start; i < finish; i++) {
            if (data[i] == el){
              rst = data[i];
              break;
            } else
          rst = -1;
        }
        return rst;
    }
}
