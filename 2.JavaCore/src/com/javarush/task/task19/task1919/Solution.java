package com.javarush.task.task19.task1919;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* 
Считаем зарплаты
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Map<String, Double> nameToSalary = new HashMap<>();
        String currentLine;

        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            while ((currentLine = reader.readLine()) != null) {
                String[] nameAndSalary = currentLine.split(" ");
                nameToSalary.compute(nameAndSalary[0], (k, v) -> (v != null ? v : 0) + Double.parseDouble(nameAndSalary[1]));
            }
        }

        nameToSalary.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(pair -> {
                    System.out.println(pair.getKey() + " " + pair.getValue());
                });
    }
}
