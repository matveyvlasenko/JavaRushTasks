package com.javarush.task.pro.task05.task0508;

import java.util.Scanner;

/*
Удаляем одинаковые строки
*/

public class Solution {
    public static String[] strings;

    public static void main(String[] args) {
        strings =  new String [6];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < strings.length; i++) {
                strings[i] = scanner.nextLine();
        }
        for (int i = 0; i < strings.length-1; i++) { //
            String temp = strings[i]; // сюда выбивает брейк
            for (int j = i+1; j < strings.length; j++) {
                if (temp ==null){
                    break;
                }
               if (temp.equals (strings[j])) {
                   strings[i] = null;
                   strings[j] = null;
               }
            }
        }
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}

// ("bob", "Oi", "rot", "bob", "rot", "bob")
//tmp = bob
// tmp ? oi
// tmp ? rot
// tmp ? bob (null, "Oi", "rot", null, "rot", "bob")
// tmp ? rot
// tmp ? bob -> (null, "Oi", "rot", null, "rot", null)
// (null, "Oi", "rot", null, "rot", "null")
// tmp = oi
// tmp = rot
// tmp == null


