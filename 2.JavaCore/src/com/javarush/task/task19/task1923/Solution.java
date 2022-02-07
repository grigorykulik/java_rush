package com.javarush.task.task19.task1923;

import java.io.*;
import java.util.Arrays;

/* 
Слова с цифрами
*/

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]));
             BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]))) {

            String currentLine;

            while ((currentLine = reader.readLine()) != null) {
                String[] wordsInLine = currentLine.split(" ");

                Arrays.stream(wordsInLine)
                        .filter(Solution::containsNumber)
                        .forEach(st -> {
                            try {
                                writer.write(st + " ");
                            } catch (IOException e) {
                                throw new RuntimeException();
                            }
                        });
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static boolean containsNumber(String s) {
        boolean result = false;
        for (char c : s.toCharArray()) {
            if (c > 47 && c < 58) {
                result = true;
            }
        }
        return result;
    }

}
