package com.javarush.task.pro.task09.task0916;

/* 
String.format()
*/

public class Solution {
    public static void main(String[] args) {
        String a = "bobrobshmobwerturtout111";
       StringBuilder str1 = new StringBuilder(a);
       int b;

       b = str1.indexOf("out",3);
        System.out.println(str1);
        System.out.println(b);
        str1.reverse();
        System.out.println(str1);
    }

    }

