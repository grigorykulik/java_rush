package com.javarush.task.task18.task1820;

import java.io.*;
import java.util.Scanner;

/* 
Округление чисел
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String source = scanner.nextLine();
        String target = scanner.nextLine();

        try (BufferedWriter fw = new BufferedWriter(new FileWriter(target));
             BufferedInputStream fis = new BufferedInputStream(new FileInputStream(source))) {

            Scanner inputScanner = new Scanner(fis);

            if (inputScanner.hasNextDouble()) {
                fw.append(String.valueOf(Math.round(inputScanner.nextDouble())));

                while (inputScanner.hasNextDouble()) {
                    fw.append(" " + Math.round(inputScanner.nextDouble()));
                }
            }

        }
    }
}
