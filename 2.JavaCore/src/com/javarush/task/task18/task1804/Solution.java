package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String filename = br.readLine();
        FileInputStream fis = new FileInputStream(filename);
        Map<Integer, Integer> map = new HashMap<>();

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

        int minCount = map.values()
                .stream()
                .mapToInt(v -> v)
                .min()
                .orElseThrow(NoSuchFieldException::new);

        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(pair -> {
                    if (pair.getValue() == minCount) {
                        System.out.print(pair.getKey() + " ");
                    }
                });
    }
}
