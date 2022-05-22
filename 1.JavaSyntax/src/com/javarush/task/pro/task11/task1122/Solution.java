package com.javarush.task.pro.task11.task1122;

/* 
Затенение поля класса
*/

public class Solution {
    public static int salary;

    public static void add(int increase) {
        int oldSalary = Solution.salary;
        salary += increase;
    }
    public static void main(String[] args) {
        add(100500);
        System.out.println(salary);
        new Vasya().meth();
    }
}
class Vasya {
    static int d = Solution.salary;
    public void meth (){
        System.out.println(d);
    }
}