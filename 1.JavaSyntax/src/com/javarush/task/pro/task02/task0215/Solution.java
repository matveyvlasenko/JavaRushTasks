package com.javarush.task.pro.task02.task0215;

import java.util.Scanner;

/* 
Чтение чисел
*/

public class Solution {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n1 = keyboard.nextInt();
        int n2 = keyboard.nextInt();
        int n3 = keyboard.nextInt();
        System.out.println((n1+n2+n3)/3);

    }
}
