package com.javarush.task.pro.task14.task1406;

import java.util.Scanner;

/* 
Купи слона
*/

class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        buyElephant(null);
    }

    static void buyElephant(String answer) {
        Scanner scanner = new Scanner(System.in);

        if (answer == null) {
            System.out.println("Купи слона");
        } else if (answer.toLowerCase().equals("ок")) {
            System.out.println("Так-то лучше :) Список твоих отговорок:");
            throw new SecurityException();
        } else {
            System.out.println("Все говорят \"" + answer + "\", а ты купи слона");
        }

        answer = scanner.nextLine();

        try {
            buyElephant(answer);
        } catch (Exception e) {
            System.out.println(answer);
            throw e ;
        }
    }




}
