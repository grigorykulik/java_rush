package com.javarush.task.task03.task0314;

/* 
Таблица умножения Ӏ Java Syntax: 3 уровень, 6 лекция
*/

public class Solution {
    public static void main(String[] args) {
        int k=1;
        for (int j=0; j<10; j++)
            {
                for (int i = 1; i < 11; i++)
                    {
                        System.out.print(i*k + " ");
                    }
                System.out.println();
                k++;
            }
    }
}
