package com.javarush.task.task19.task1908;

import java.io.*;
import java.util.Arrays;

/* 
Выделяем числа
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String sourceFile;
        String tagetFile;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            sourceFile = br.readLine();
            tagetFile = br.readLine();
        }

        try (BufferedReader fileReader = new BufferedReader(new FileReader(sourceFile));
             BufferedWriter fileWriter = new BufferedWriter(new FileWriter(tagetFile))) {

            String currentLine;

            while ((currentLine = fileReader.readLine()) != null) {
                String[] strings = currentLine.split(" ");

                Arrays.stream(strings)
                        .forEach(s -> {
                            if (isNumber(s)) {
                                try {
                                    fileWriter.write(s + " ");
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                            }
                        });
            }
        }

    }

    public static boolean isNumber(String s) {
        for (char c : s.toCharArray()) {
            if (c < 48 || c > 57) {
                return false;
            }
        }

        return true;
    }
}
