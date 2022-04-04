package com.javarush.task.pro.task04.task0414;

import java.util.Scanner;

/* 
Хорошего не бывает много
*/

public class Solution {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       String word = scanner.nextLine();
       int number = scanner.nextByte();
       int count = 0;
       if (number <= 0 || number >= 5){
           System.out.println(word);
       }
       else  do {
           System.out.println(word);
           count++;
       } while (count <= number-1);


    }
}