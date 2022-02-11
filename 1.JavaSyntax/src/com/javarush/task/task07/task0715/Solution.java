package com.javarush.task.task07.task0715;

import java.util.ArrayList;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) {
       ArrayList<String> strings=new ArrayList<>();

       strings.add("мама");
       strings.add("мыла");
       strings.add("раму");

       for (int i=0; i<6; i+=2) {
           strings.add(i+1, "именно");
       }

        for (String s:strings) {
            System.out.println(s);
        }
    }
}
