package com.javarush.task.task18.task1819;

import java.io.*;
import java.util.Scanner;

/* 
Объединение файлов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String targetFileName = scanner.nextLine();
        String sourceFileName = scanner.nextLine();

        byte[] bytes;

        try (InputStream fis = new FileInputStream(targetFileName)) {
            bytes = new byte[fis.available()];
            fis.read(bytes);
        }

        try (OutputStream fos = new BufferedOutputStream(new FileOutputStream(targetFileName));
            InputStream fis = new BufferedInputStream(new FileInputStream(sourceFileName))) {

            for (int b = fis.read(); b != -1; b = fis.read()) {
                fos.write(b);
            }

            for (int b : bytes) {
                fos.write(b);
            }
        }

//        try (BufferedReader fileReader = new BufferedReader(new FileReader(targetFileName))) {
//            String currentLine;
//            while ((currentLine = fileReader.readLine()) != null) {
//                sb.append(currentLine);
//            }
//        }
//
//        try (FileWriter fw = new FileWriter(targetFileName);
//             BufferedReader fileReader2 = new BufferedReader(new FileReader(sourceFileName))) {
//            String currentLine;
//            while ((currentLine = fileReader2.readLine()) != null) {
//                sb.insert(0, currentLine);
//            }
//
//
//            fw.write(sb.toString());
//        }
    }
}

