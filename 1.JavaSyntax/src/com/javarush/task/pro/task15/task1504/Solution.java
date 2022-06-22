package com.javarush.task.pro.task15.task1504;

import java.io.*;
import java.net.URI;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/* 
Перепутанные байты
*/

public class Solution {
    public static void main(String[] args) {
        //InputStream fileInputStream1 = new FileInputStream();
        //FileReader fileReader = new FileReader();

        //Paths.get(URI.create("https://javarush.ru/quests/lectures/questsyntaxpro.level15.lecture01"));
        //Path path1 = Paths.get("Inputfile.txt");
        //Path path2 = Paths.get("Outputfile.txt");


        try (Scanner scanner1 = new Scanner(System.in);
             InputStream inputStream1 = Files.newInputStream(Paths.get(scanner1.nextLine()));//открыли поток
             // на чтение
             OutputStream outputStream1 = Files.newOutputStream(Paths.get(scanner1.nextLine()));//открыли поток на
             // запись
             // (куда - написано в скобках)
        ) {
            byte[] byteInput = inputStream1.readAllBytes();//метод readaAllBytes читает все байты из потока
            // и сохраняем в массив байтов
            byte[] byteOutput = new byte[byteInput.length];//создаем новый пустой массив, где будем путать файлы


            for (int i = 0; i < byteInput.length; i = i + 2) {
                if (i < byteInput.length - 1) {
                    byteOutput[i] = byteInput[i + 1];//первый меняет а второй нет
                    byteOutput[i + 1] = byteInput[i];
                } else {
                    byteOutput[i] = byteInput[i];
                }
            }

            outputStream1.write(byteOutput);//записываем новый перепутанный массив по адресу который сохранен
            //в строчке 28

        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
