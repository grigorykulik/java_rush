package com.javarush.task.task18.task1807;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Подсчет запятых
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        int counter = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String filename = br.readLine();

        FileInputStream fis = new FileInputStream(filename);

        while (fis.available() > 0) {
            int currentByte = fis.read();
            if (currentByte == 44) {
                counter++;
            }
        }

        fis.close();
        System.out.println(counter);
    }
}
