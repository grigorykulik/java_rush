package com.javarush.task.task19.task1909;

import java.io.*;
import java.util.ArrayList;

/* 
Замена знаков
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String sourceFile;
        String targetFile;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            sourceFile = br.readLine();
            targetFile = br.readLine();
        }

        try (BufferedReader br = new BufferedReader(new FileReader(sourceFile));
            BufferedWriter bw = new BufferedWriter(new FileWriter(targetFile))) {
            String currentLine = br.readLine();

            while (currentLine != null) {
                currentLine = currentLine.replace('.', '!');
                bw.write(currentLine);
                currentLine = br.readLine();
            }
        }
    }
}
