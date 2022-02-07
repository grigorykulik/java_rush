package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String filename = br.readLine();

        FileInputStream fis = new FileInputStream(filename);

        int min = fis.read();

        while (fis.available() > 0) {
            int currentByte = fis.read();
            if (currentByte < min) {
                min = currentByte;
            }
        }

        fis.close();

        System.out.println(min);
    }
}
