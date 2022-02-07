package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String filename = br.readLine();

        FileInputStream fis = new FileInputStream(filename);
        int result = 0;

        while (fis.available() > 0) {
            int currentByte = fis.read();
            if (currentByte > result) {
                result = currentByte;
            }
        }

        fis.close();

        System.out.println(result);
    }
}
