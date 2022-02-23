package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String filename = br.readLine();
        Map<Integer, Integer> map = new HashMap<>();
        FileInputStream fis = new FileInputStream(filename);

        while (fis.available() > 0) {
            int currentByte = fis.read();
            if (!map.containsKey(currentByte)) {
                map.put(currentByte, 1);
            } else {
                int counter = map.get(currentByte);
                counter++;
                map.put(currentByte, counter);
            }
        }

        fis.close();

        int maxCount = map.values()
                        .stream()
                                .mapToInt(v -> v)
                                        .max()
                                                .orElseThrow(NoSuchElementException::new);

        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(pair -> {
                    if (pair.getValue() == maxCount) {
                        System.out.print(pair.getKey() + " ");
                    }
                });
    }
}
