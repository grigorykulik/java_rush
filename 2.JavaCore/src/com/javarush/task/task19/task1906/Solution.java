package com.javarush.task.task19.task1906;

import java.io.*;
import java.util.ArrayList;

/* 
Четные символы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sourceFile = br.readLine();
        String targetFile = br.readLine();
        br.close();

        try (FileReader fr = new FileReader(sourceFile);
            FileWriter fw = new FileWriter(targetFile)) {
                int counter = 1;

                while (fr.ready()) {
                    int data = fr.read();
                    if (counter % 2 == 0) {
                        fw.write(data);
                    }

                    counter ++;
                }
        }
    }
}
