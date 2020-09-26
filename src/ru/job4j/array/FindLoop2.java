package ru.job4j.array;

public class FindLoop2 {

        public static int indexOf(int[] data, int el) {
            int rst;
            for (int i = 0; i < data.length; i++) {
                if(data[i] == el) {
                    rst = data[i];
                    break;
                }
                rst = -1; /* если элемента нет в массиве, то возвращаем -1. */
              }
            return rst;
        }

        public static int indexOf(int[] data, int el, int start, int finish) {
            int rst;
            for (int start = 0; start < finish; start++) {
                if(data[start] == el){
                    rst = data[start];
                    break;;
                }
                rst = -1;
            }
            return rst;
        }
}
