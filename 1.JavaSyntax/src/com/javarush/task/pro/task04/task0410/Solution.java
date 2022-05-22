package com.javarush.task.pro.task04.task0410;

import java.util.Scanner;

/* 
Второе минимальное число из введенных
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        int min = console.nextInt();//4
        int min2 = console.nextInt();//4
        if (min2 < min){
            int temp = min;
            min = min2;
            min2 = temp;
        }
        while (console.hasNextInt()){
            int num3 = console.nextInt();
            if (min == min2&& num3 > min){
                min2 = num3;
            } else if (num3 < min){
                min2 = min;
                min = num3;
            } else if (num3 > min && num3<min2 ){
                min2 = num3;
            }
        }
        System.out.println(min2);


    }
}