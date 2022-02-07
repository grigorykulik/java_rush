package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("А");
        words.add("Б");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        String fileName;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName = reader.readLine();
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String currentLine;
            while ((currentLine = reader.readLine()) != null) {
                String[] wordsInLine = currentLine.split(" ");

                int counter = 0;

                for (String s : wordsInLine) {
                    if (words.contains(s)) {
                        counter++;
                    }
                }

                if (counter == 2) {
                    System.out.println(currentLine);
                    counter = 0;
                } else {
                    counter = 0;
                }

            }
        }
    }
}
