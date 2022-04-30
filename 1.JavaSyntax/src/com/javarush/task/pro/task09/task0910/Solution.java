package com.javarush.task.pro.task09.task0910;

/* 
Кодировка Unicode
*/

public class Solution {
    public static void main(String[] args) {
        char[] symbols = new char[9];
        init(symbols);
        System.out.println(new String(symbols));
    }

    public static void init(char[] symbols) {
        symbols[0] = '\u00A9';
        symbols[1] = '\u004A';


    }
}
