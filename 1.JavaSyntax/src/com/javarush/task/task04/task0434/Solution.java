package com.javarush.task.task04.task0434;

/* 
Таблица умножения Ӏ Java Syntax: 4 уровень, 10 лекция
*/

public class Solution {
    public static void main(String[] args) {
        int outerCounter=1;

        while (outerCounter!=11) {
            int innerCounter=1;
                while (innerCounter!=11) {
                    System.out.print(innerCounter*outerCounter + " ");
                    innerCounter++;
                }
            System.out.println();
                outerCounter++;
        }

    }
}
