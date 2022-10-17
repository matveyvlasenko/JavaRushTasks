package com.javarush.task.pro.task16.task1601;

import java.util.Calendar;
import java.util.Date;

/* 
Лишь бы не в понедельник :)
*/

public class Solution {

    static Date birthDate= new Date(1986, Calendar.JUNE, 25);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));

    }

    static String getDayOfWeek(Date date) {
        int dayOfTheWeak=  date.getDay();
        String []days = {"Воскресенье","Понедельник","Вторник", "Среда", "Четверг",
                "Пятница", "Суббота" };
        return days[dayOfTheWeak];
    }
}


