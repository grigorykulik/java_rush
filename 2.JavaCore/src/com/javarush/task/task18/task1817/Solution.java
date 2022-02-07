package com.javarush.task.task18.task1817;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/* 
Пробелы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String filename = args[0];

        try (FileReader fr = new FileReader(filename);
             BufferedReader br = new BufferedReader(fr)) {

            int totalCounter = 0;
            int spaceCounter = 0;
            int c;

            while ((c = br.read()) != -1) {
                char character = (char) c;
                totalCounter++;

                if (character == ' ') {
                    spaceCounter++;
                }
            }

            System.out.printf("%,.2f", (float)spaceCounter/totalCounter*100);
        }
    }
}
