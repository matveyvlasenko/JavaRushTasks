package com.javarush.task.task14.task1408;

public class BelaRusianHen extends Hen{
    @Override
    public int getCountOfEggsPerMonth() {
        return 3;
    }

    @Override
    public String toString() {
        return super.getDescription() + " Моя страна - " +
                Country.RUSSIA + ". Я несу " +
                this.getCountOfEggsPerMonth() +
                " яиц в месяц.";
    }
}
