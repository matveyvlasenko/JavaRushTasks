package com.javarush.task.pro.task12.task1206;

/* 
Анализ строк
*/

public class Solution {
    public static void main(String[] args) {
        String string = "Думаю, это будет новой фичей." +
                "Только не говорите никому, что она возникла случайно.";

        System.out.println("Количество цифр в строке : " + countDigits(string));
        System.out.println("Количество букв в строке : " + countLetters(string));
        System.out.println("Количество пробелов в строке : " + countSpaces(string));
    }

    public static int countDigits(String string) {
        char[] chars = string.toCharArray();
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (Character.isDigit(chars[i])) {
                count++;
            }
        }
        return count;
    }

    public static int countLetters(String string) {
        char[] chars = string.toCharArray();
        int count = 0;
        for (int i = 0; i <chars.length ; i++) {
            if (Character.isLetter(chars[i])) {
                count++;
            }
        }
        return count;
    }

    public static int countSpaces(String string) {
        char[] chars = string.toCharArray();
        int count = 0;
        for (int i = 0; i <chars.length ; i++) {
            if (Character.isSpaceChar(chars[i])) {
                count++;
            }
        }
        return count;
    }
}
