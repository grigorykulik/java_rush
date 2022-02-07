package com.javarush.task.task18.task1808;

import java.io.*;
import java.util.Scanner;

/* 
Разделение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String sourceFile = scanner.nextLine();
        String targetFileFirst = scanner.nextLine();
        String targetFileSecond = scanner.nextLine();

        try (BufferedInputStream fis = new BufferedInputStream(new FileInputStream(sourceFile));
             BufferedOutputStream fosFirst = new BufferedOutputStream(new FileOutputStream(targetFileFirst));
             BufferedOutputStream fosSecond = new BufferedOutputStream(new FileOutputStream(targetFileSecond))) {

            int count = fis.available();
            int sizeFirst = count % 2 == 0 ? count / 2 : count / 2 + 1;

            for (int i = 0; i < sizeFirst; i++) {
                fosFirst.write(fis.read());
            }

            for (int b = fis.read(); b != -1; b = fis.read()) {
                fosSecond.write(b);
            }
        }
    }
}
