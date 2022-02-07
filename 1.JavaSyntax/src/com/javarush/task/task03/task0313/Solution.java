package com.javarush.task.task03.task0313;

/* 
Мама мыла раму
*/

public class Solution {
    public static void main(String[] args) {
        String[] array=new String[] {"Мама", "Мыла", "Раму"};

        int head=0;

        for (int i=0; i<3; i++) {
            System.out.println(array[head%3]+array[(head+1)%3]+array[(head+2)%3]);
            System.out.println(array[head%3]+array[(head+2)%3]+array[(head+1)%3]);
            head++;
        }

    }
}
