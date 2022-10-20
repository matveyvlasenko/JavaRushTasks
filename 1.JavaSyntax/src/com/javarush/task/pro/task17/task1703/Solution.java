package com.javarush.task.pro.task17.task1703;

import java.util.ArrayList;

/* 
Космическая одиссея ч.1
*/

public class Solution {
    public static ArrayList<Astronaut> astronauts = new ArrayList<>();

    public static void main(String[] args) {
        createCrew();
        printCrewInfo();
    }

    public static void createCrew(){
       Human human1 = new Human();
        Human human2 = new Human();
        Dog dog1 = new Dog();
        Cat cat1 = new Cat();
        astronauts.add(human1);
        astronauts.add(human2);
        astronauts.add(dog1);
        astronauts.add(cat1);


    }

    public static void printCrewInfo() {
        System.out.println("На борт погружены члены экипажа: ");
        for (Astronaut astronaut : astronauts) {
            System.out.println(astronaut.getInfo());
        }
    }
}
