package com.javarush.task.task18.task1816;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* 
Английские буквы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String filename = args[0];

        try (FileInputStream fis = new FileInputStream(filename)) {

            int currentByte;
            int counter = 0;

            while (fis.available() > 0) {
                currentByte = fis.read();
                if ((currentByte > 64 && currentByte < 91) || (currentByte > 96 && currentByte < 123)) {
                    counter++;
                }
            }

            System.out.println(counter);
        }
    }
}
