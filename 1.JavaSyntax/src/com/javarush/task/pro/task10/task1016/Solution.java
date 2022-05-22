package com.javarush.task.pro.task10.task1016;

/* 
Прогноз погоды
*/

public class Solution {

    public static void showWeather(City city) {
        System.out.println("в городе " + city.getName() +" "+
                "сегодня температура воздуха " + city.getTemperature());
    }

    public static void main(String[] args) {
        City Дубай = new City("Дубай", 40);
       showWeather(Дубай);
    }

}
