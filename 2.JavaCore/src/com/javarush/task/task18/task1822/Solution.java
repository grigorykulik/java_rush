package com.javarush.task.task18.task1822;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/* 
Поиск данных внутри файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String filename = scanner.nextLine();
        String id = " ";

        id = args[0];

        try (BufferedReader fileReader = new BufferedReader(new FileReader(filename))) {
            String currentLine;

            while ((currentLine = fileReader.readLine()) != null) {
                String[] productInfo = currentLine.split(" ");

                if (productInfo[0].equals(id)) {
                    System.out.println(currentLine);
                }
            }
        }
    }
}
