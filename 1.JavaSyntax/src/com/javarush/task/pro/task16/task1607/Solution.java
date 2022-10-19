package com.javarush.task.pro.task16.task1607;

import java.time.LocalDate;
import java.time.Month;

/* 
Освоение нового API
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(nowExample());
        System.out.println(ofExample());
        System.out.println(ofYearDayExample());
        System.out.println(ofEpochDayExample());
    }

    static LocalDate nowExample() {
        LocalDate today = LocalDate.now();
        return today;
    }

    static LocalDate ofExample() {
        LocalDate today = LocalDate.of(2020, Month.SEPTEMBER, 12);
        return today;
    }

    static LocalDate ofYearDayExample() {
       LocalDate today = LocalDate.ofYearDay(2020, 256);
        return today;
    }

    static LocalDate ofEpochDayExample() {
        LocalDate today = LocalDate.ofEpochDay(18517);
        return today;
    }
}
