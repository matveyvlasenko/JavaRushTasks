package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        while (true){
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("ENTER")){
                break;
            }
            int newNumber = Integer.parseInt(input);
            sum = sum+newNumber;

        }
        System.out.println(sum);

    }
}