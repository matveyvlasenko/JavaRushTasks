package com.javarush.task.pro.task13.task1319;

/* 
Месяцы в сезоне
*/

import java.util.Arrays;


public enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    public static Month[] getWinterMonths() {
        Month[] WinterMonths = new Month[3];
        //Collections.addAll(Month, 12,1,2);
        return WinterMonths;
    }

    public static String[] getSpringMonths() {
        String[] SpringMonths = new String[3];
        // Collections.addAll(Month, 3,4,5);
        return SpringMonths;
    }

    public static String[] getSummerMonths() {
        String[] SummerMonths = new String[3];
        //Collections.addAll(Month, 6,7,8);
        return null;
    }

    public static Month[] getAutumnMonths() {
        //return new Month[] {Month.SEPTEMBER,Month.OCTOBER,Month.NOVEMBER};
        //return new Month[]{Month.values()[8],Month.values()[9],Month.values()[10]};
        return Arrays.copyOfRange(Month.values(),8,11);
    }
}
//доделать остальные месяцы