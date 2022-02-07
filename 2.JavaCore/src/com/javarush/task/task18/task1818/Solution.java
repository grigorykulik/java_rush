package com.javarush.task.task18.task1818;

import java.io.*;
import java.util.Scanner;

/* 
Два в одном
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String filename1 = scanner.nextLine();
        String filename2 = scanner.nextLine();
        String filename3 = scanner.nextLine();

        try (FileReader fileReader1 = new FileReader(filename2);
            FileReader fileReader2 = new FileReader(filename3);
            FileWriter fileWriter = new FileWriter(filename1, true)) {

            int c;
            while ((c = fileReader1.read()) != -1) {
                char character = (char) c;
                fileWriter.write(character);
            }

            while ((c = fileReader2.read()) != -1) {
                char character = (char) c;
                fileWriter.write(character);
            }
        }

    }
}
