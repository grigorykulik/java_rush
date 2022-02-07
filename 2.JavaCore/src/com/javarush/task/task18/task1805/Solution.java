package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/*
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String filename = br.readLine();
        FileInputStream fis = new FileInputStream(filename);
        Set<Integer> set = new HashSet<>();

        while (fis.available() > 0) {
            int currentByte = fis.read();
            set.add(currentByte);
        }

        fis.close();

        set.stream()
                .sorted()
                .forEach(e -> System.out.print(e + " "));
    }
}