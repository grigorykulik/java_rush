package com.javarush.task.task18.task1826;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
Шифровка
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String source = args[1];
        String target = args[2];

        FileInputStream fis = new FileInputStream(source);
        FileOutputStream fos = new FileOutputStream(target);

        int currentByte;

        switch (args[0]) {
            case "-e":
                while (fis.available() > 0) {
                    currentByte = fis.read();
                    currentByte++;
                    fos.write(currentByte);
                }

                break;

            case "-d":
                while (fis.available() > 0) {
                    currentByte = fis.read();
                    currentByte--;
                    fos.write(currentByte);
                }
                break;
        }

        fis.close();
        fos.close();
    }

}
