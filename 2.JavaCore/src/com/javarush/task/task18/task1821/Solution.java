package com.javarush.task.task18.task1821;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* 
Встречаемость символов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String filename = args[0];
        Map<Character, Integer> charToFrequency = new HashMap<>();

        try (FileReader fr = new FileReader(filename)) {
            while (fr.ready()) {
                charToFrequency.compute((char) fr.read(), (k, v) -> (v != null ? v : 0) + 1);
            }

            charToFrequency.entrySet()
                    .stream()
                    .sorted(Map.Entry.comparingByKey())
                    .forEach(pair -> System.out.println(pair.getKey() + " " + pair.getValue()));
        }
    }
}
