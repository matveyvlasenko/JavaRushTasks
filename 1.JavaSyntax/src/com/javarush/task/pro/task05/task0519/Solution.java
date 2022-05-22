package com.javarush.task.pro.task05.task0519;

import java.util.Arrays;

/* 
Есть ли кто?
*/

public class Solution {

    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    public static int element = 5;

    public static void main(String[] args) {

       int [] newArray = Arrays.copyOf(array, array.length);//скопировал туда старый
        //длина та же что была в старом
        Arrays.sort(newArray);//

        int searchResult = Arrays.binarySearch(newArray, element);
        /*boolean elementFound = (searchResult >0);
        if (elementFound)
          //  System.out.println("true");
        else {
            System.out.println("false");
        }

        //String str = elementFound ?  "true" :  "false";*/
        System.out.println(searchResult >= 0 ?  "true" :  "false");

        }
    }

