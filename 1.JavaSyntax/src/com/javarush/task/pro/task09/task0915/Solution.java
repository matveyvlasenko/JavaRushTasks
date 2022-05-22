package com.javarush.task.pro.task09.task0915;

import java.util.Arrays;
import java.util.StringTokenizer;

/* 
StringTokenizer
*/

public class Solution {
    public static void main(String[] args) {

String s = String.format("name = %3$s, last name = %2$s, third word = %1$s",
        "1","2","bob");
        System.out.println(s);
    }
}
//сделать массив и заполнить разделенными словами