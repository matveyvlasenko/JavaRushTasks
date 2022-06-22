package com.javarush.task.pro.task15.task1506;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/* 
Фейсконтроль
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        List<String> lines;//создать новый список чтобы был виден за пределами try
        Scanner scanner = new Scanner(System.in);//новый сканнер
        lines = Files.readAllLines(Paths.get(scanner.nextLine()));//получает list
String temp = lines.get(0);
char [] tempChar = temp.toCharArray();
        //из файла и записывает его в список lines
        //дальше нужно проверять, является ли символ один из списка, и если нет,выводить его на экран
        for (String line : lines) {

            System.out.println(line.replaceAll("[.,\\s]",""));

            //String nextLine1 =nextLine.replace(".", "");
            //String nextLine2  =nextLine1.replace(",","");
            //String nextLine3 =nextLine2.replace(" ","");
            //System.out.println(nextLine3);



        }
    }
}
       


