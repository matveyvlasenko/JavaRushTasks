package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        grades.put("Bob", 3.5);
        grades.put("Rob", 3.3);
        grades.put("Mob", 3.6);
        grades.put("Lob", 3.7);
        grades.put("Sob", 3.9);
    }
}
