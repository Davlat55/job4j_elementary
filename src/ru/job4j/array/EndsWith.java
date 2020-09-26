package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        for (int i = 0; i < word.length; i++) {
            if (!(word[word.length - 1 - i] == char[char.length - 1 - i])) {
                return false;
                break;
            }
         return true;
    }
}
