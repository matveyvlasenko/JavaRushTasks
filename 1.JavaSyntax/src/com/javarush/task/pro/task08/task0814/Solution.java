package com.javarush.task.pro.task08.task0814;

/* 
Флаги
*/

public class Solution {

    public static int setFlag(int number, int flagPos) {
        //на позицию flagPos поставь 1 вместо 0
        //для числа number
//111 | 1000 => 1111
        return number|(1 << flagPos);
    }

    public static int resetFlag(int number, int flagPos) {
//было 0000001111, хотим 0111. 0001111 & 000111 = 000111. 001111>>
        //0101111>> 0010111
        //сдвиг на 4 позиции, инвертируем то что получилось
        //000001 <<100000 +> 011111
        //0101111 & 0011111 = 0001111
        return number &~(1 << flagPos);
    }

    public static boolean checkFlag(int number, int flagPos) {
        //напишите тут ваш код
        //(a & (1 << b)) == (1 << b)
        return (number & (1 << flagPos)) == (1 << flagPos);
    }
}
