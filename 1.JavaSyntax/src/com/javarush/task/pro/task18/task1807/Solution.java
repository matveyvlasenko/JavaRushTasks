package com.javarush.task.pro.task18.task1807;

import java.util.ArrayList;
import java.util.Collections;

/* 
Прощание с foreach
*/

public class Solution {
    public static void main(String[] args) {
        var strings = new ArrayList<String>();
        Collections.addAll(strings, "Hello", "Amigo", "JavaRush", "CodeGym");

        print(strings);
    }

    public static void print(ArrayList<String> strings) {
        for (String string : strings) {

        }
        strings.forEach(System.out::println);
        //somecollection.forEach(какой-то-элемент-> some method (какой-то элемент)
        //тоже самое - somecollection.forEach(Myclass:: add(какакой-то элемент)
    }
}

