package com.javarush.task.pro.task04.task0416;

import java.util.Scanner;

/* 
Share a Coke
*/

public class Solution {
    public static void main(String[] args) {
       Scanner scanner = new Scanner (System.in);
       int num1 = scanner.nextInt();
       int num2 = scanner.nextInt();
       double d = (num1/ (num2* 1.0));
        System.out.println(d);
    }
}