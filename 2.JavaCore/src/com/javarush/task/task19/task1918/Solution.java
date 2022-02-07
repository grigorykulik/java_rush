package com.javarush.task.task19.task1918;

import java.io.*;
import java.util.ArrayList;

/* 
Знакомство с тегами
*/

public class Solution {
    public static void main(String[] args) {
        String filename = "";

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            filename = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            String[] tags;
            StringBuilder lineToPrint = new StringBuilder();

            while ((line = reader.readLine()) != null) {

                if (line.contains(args[0])) {
                    tags = line.split("><");

                    for (String s : tags) {
                        if (s.startsWith("<")) {
                            lineToPrint.append(s + ">");
                        }
                    }

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
