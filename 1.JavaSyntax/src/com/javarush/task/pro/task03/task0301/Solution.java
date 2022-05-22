package com.javarush.task.pro.task03.task0301;

import java.util.InputMismatchException;
import java.util.Scanner;

/* 
Тепло или холодно
*/

public class Solution {
    public static void main(String[] args) {
        String cold = "на улице холодно";
        String warm = "на улице тепло";
        /*try {
       // System.out.println(5/0);
        //} catch (ArithmeticException exception) {
          //  System.out.println("do not divide by zero");
        }*/
        
        Scanner console = new Scanner(System.in);
        int temperature;
        while (true) {

            if (console.hasNextInt()) {
                temperature = console.nextInt();
                break;
            } else if (console.hasNext()) {
                System.out.println("Вы ввели не число, пробуйте еще раз");
                temperature = console.nextInt();
            }
        }

        if (temperature < 0) {
            System.out.println(cold);
        } else {
            System.out.println(warm);
        }
    }
}
