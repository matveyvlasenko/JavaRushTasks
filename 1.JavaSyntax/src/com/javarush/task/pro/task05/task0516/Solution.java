package com.javarush.task.pro.task05.task0516;

import java.util.Arrays;

/* 
Заполняем массив
*/

public class Solution {

    public static int[] array = new int[20];
    public static int valueStart = 10;
    public static int valueEnd = 13;

    public static void main(String[] args) {
        if (array.length % 2 == 0) {
            Arrays.fill(array, 0,array.length / 2, valueStart );//заполнил все меньшем
            Arrays.fill(array, array.length / 2, array.length, valueEnd);
            //заполнил начиная с 10 до конца большим значением
        } else {
            Arrays.fill(array, 0, array.length/2+1, valueStart);//заполнил весь массив меньшем
            Arrays.fill(array, array.length / 2 + 1, array.length, valueEnd);
        }


        System.out.println(Arrays.toString(array));
    }
}
