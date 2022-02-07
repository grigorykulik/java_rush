package com.javarush.task.task19.task1925;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

/* 
Длинные слова
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]));
             BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]))) {

            String currentLine;
            ArrayList<String> wordsLongerThanSix = new ArrayList<>();

            while ((currentLine = reader.readLine()) != null) {
                String[] wordsInLine = currentLine.split(" ");


                Arrays.stream(wordsInLine)
                        .filter(s -> s.length() > 6)
                        .forEach(s -> wordsLongerThanSix.add(s));
            }

            writer.write(wordsLongerThanSix.get(0));
            wordsLongerThanSix.remove(wordsLongerThanSix.get(0));

            wordsLongerThanSix.stream()
                    .forEach(s -> {
                        try {
                            writer.write("," + s);
                        } catch (IOException e) {
                            throw new RuntimeException();
                        }
                    });
        }
    }
}
