package com.javarush.task.task19.task1920;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeMap;
import java.util.TreeSet;

/* 
Самый богатый
*/

public class Solution {
    public static void main(String[] args) throws IOException {
//        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
//            String currentLine;
//            Map<String, Double> nameToSalary = new HashMap<>();
//
//            while ((currentLine = reader.readLine()) != null) {
//                String[] nameAndSalary = currentLine.split(" ");
//                nameToSalary.compute(nameAndSalary[0], (k, v) -> (v != null ? v : 0) + Double.parseDouble(nameAndSalary[1]));
//            }
//
//            Optional<Map.Entry<String, Double>> maxEntry = nameToSalary.entrySet()
//                    .stream()
//                    .max(Comparator.comparing(Map.Entry::getValue));
//
//            Map.Entry<String, Double> maxEnt = maxEntry.get();
//            double maxSalary = maxEnt.getValue();
//
//            nameToSalary.entrySet()
//                    .stream()
//                    .sorted(Map.Entry.comparingByKey())
//                    .forEach(pair -> {
//                        if (pair.getValue() == maxSalary) {
//                            System.out.println(pair.getKey() + " " + pair.getValue());
//                        }
//                    });
//        }

        // блядская ебанина
        TreeMap<String, Double> salary = new TreeMap<>();

        String fileName = args[0];

        try (BufferedReader rd = new BufferedReader(new FileReader(fileName))) {
            String[] splitedLine;
            String line;
            Double currentValue;

            while ((line = rd.readLine()) != null) {
                splitedLine = line.split(" ");
                String name = splitedLine[0];
                double value = Double.parseDouble(splitedLine[1]);

                if (salary.containsKey(name)) {
                    currentValue = salary.get(name);
                    salary.put(name, value + currentValue);
                } else {
                    salary.put(name, value);
                }
            }
        } catch (IOException ignore) {
            /*NOP */
        }

        double maxSalary = salary.firstEntry().getValue();
        for (double value : salary.values()) {
            if (value > maxSalary) {
                maxSalary = value;
            }
        }

        TreeSet<String> names = new TreeSet<>();
        for (String name : salary.keySet()) {
            if (maxSalary == salary.get(name)) {
                names.add(name);
            }
        }

        for (String name : names) {
            System.out.println(name);
        }
    }

}



