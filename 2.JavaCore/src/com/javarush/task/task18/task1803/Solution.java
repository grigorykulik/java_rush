package com.javarush.task.task18.task1803;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.stream.Collectors;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String filename = scanner.nextLine();

        Map<Integer, Integer> byteToFrequency = new HashMap<>();

        try (FileInputStream fis = new FileInputStream(filename)) {
            while (fis.available() > 0) byteToFrequency.compute(fis.read(), (k, v) -> (v != null ? v : 0) + 1);
        }

        int maxFrequency = byteToFrequency.values()
                .stream()
                .mapToInt(v -> v)
                .max()
                .orElseThrow(NoSuchElementException::new);

        byteToFrequency.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(pair -> {
                    if (pair.getValue() == maxFrequency) {
                        System.out.print(pair.getKey() + " ");
                    }
                });

        // Version 2
        System.out.println(byteToFrequency
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == maxFrequency)
                .map(Map.Entry::getKey)
                .sorted()
                .map(Object::toString)
                .collect(Collectors.joining(" ")));
    }
}
