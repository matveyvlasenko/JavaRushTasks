package com.javarush.task.pro.task04.task0418;

import java.util.Scanner;

/* 
Стакан наполовину пуст или наполовину полон?
*/

public class Solution {
    public static void main(String[] args) {
        double glass = 0.5;
        Scanner scanner = new Scanner (System.in);
        boolean what = scanner.nextBoolean();
        if (what){
            int newglass = (int)Math.ceil(glass);
            System.out.println(newglass);
        }
        else {
            int newglass = (int)Math.floor(glass);
            System.out.println(newglass);
        }

    }
}