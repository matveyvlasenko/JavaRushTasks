package com.javarush.task.pro.task03.task0302;

import java.util.Scanner;

/* 
Призывная кампания
*/

public class Solution {
    public static void main(String[] args) {

        String militaryCommissar = ", явитесь в военкомат";
        Scanner scanner = new Scanner (System.in);
        int age = scanner.nextInt();
        Scanner scanner1 = new Scanner (System.in);
        String name = scanner1.nextLine ();
        if (age >=18) {
             if (age <= 28){
                System.out.println(name + militaryCommissar);
            }
        }
    }
}
