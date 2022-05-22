package com.javarush.task.pro.task10.task1015;

/* 
Ежик и яблоко
*/

public class Hedgehog {

    public void eat(Apple apple) {
        System.out.println("Яблоко было съедено!");
    }

    public static void main(String[] args) {
        Apple apple1 = new Apple();
        Hedgehog hedgehog1 = new Hedgehog();
        hedgehog1.eat(apple1);
    }

    public static class Apple {
    }
}
