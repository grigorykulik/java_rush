package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.Scanner;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       String filename = reader.readLine();

       BufferedWriter writer = new BufferedWriter(new FileWriter(filename));

       StringBuilder sb = new StringBuilder();

       String s = "";

       while (!s.equals("exit")) {
           s = reader.readLine();
           sb.append(s).append("\n");
       }

       writer.write(sb.toString());
       writer.close();
    }
}
