package com.javarush.task.pro.task09.task0911;

/* 
Поздравление
*/

public class Solution {
    public static String partyFace = "";
    public static String balloon = "";
    public static String gift = "";
    public static String partyPopper = "";
    public static String cake = "";

    public static void main(String[] args) {
        printCongratulation();
    }

    public static void printCongratulation() {
        String happyBirthday = "С днем рождения!";
        String congratulation = partyFace + balloon + partyPopper + cake + gift;
        System.out.println(happyBirthday + congratulation);
    }
}
