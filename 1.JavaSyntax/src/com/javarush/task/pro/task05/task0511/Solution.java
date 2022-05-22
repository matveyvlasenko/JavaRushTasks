package com.javarush.task.pro.task05.task0511;

import java.util.Scanner;

/* 
Создаем двумерный массив
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int number = scanner.nextInt();

      if (number > 0 ){
         multiArray  = new int [number][];
          for (int i = 0; i < number; i++) {
              int secondNumber = scanner.nextInt();
              multiArray[i] = new int[secondNumber];

          }
      }
    }
}
