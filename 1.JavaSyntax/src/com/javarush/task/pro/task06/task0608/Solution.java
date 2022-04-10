package com.javarush.task.pro.task06.task0608;

/* 
Кубический калькулятор
*/

public class Solution {
    public static void main(String[] args) {
cube(34567);
    }
    public static long cube(long num){

        long result = num*num*num;
        System.out.println(result);
        return result;


    }

}
