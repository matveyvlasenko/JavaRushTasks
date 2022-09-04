package com.javarush.task.pro.task18.task1803;

import java.util.Comparator;

/* 
Наставники JavaRush
*/

public class NameComparator implements Comparator<JavaRushMentor>{
    @Override
    public int compare(JavaRushMentor j1, JavaRushMentor j2) {
        return j1.getName().length()-j2.getName().length();
    }
    //напишите тут ваш код
}
