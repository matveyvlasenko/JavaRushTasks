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
        return new Month[]{Month.values()[11],Month.values()[0],Month.values()[1]};
    }

    public static Month[] getSpringMonths() {
        return new Month[]{Month.values()[2],Month.values()[3],Month.values()[4]};
    }

    public static Month[] getSummerMonths() {
        return new Month[]{Month.values()[5],Month.values()[6],Month.values()[7]};
    }

    public static Month[] getAutumnMonths() {
        return Arrays.copyOfRange(Month.values(),8,11);
    }
}
