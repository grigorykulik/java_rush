package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine().trim();

        String[] words=string.split("\\s+");

        for (int i=0; i<words.length; i++) {
            String firstCharacter = words[i].substring(0, 1).toUpperCase();
            String end = words[i].substring(1);
            String newString = firstCharacter + end;
            words[i] = newString;
        }

        for (String s:words)
            System.out.print(s+" ");
    }
}
