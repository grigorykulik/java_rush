package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.*;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        Map<String, Integer> fileNameToNumber = new HashMap<>();
        final String fileName;

        input = scanner.nextLine();
        if (input.equals("end")) return;

        fileName = getFileName(input);
        int partNumber = getPartNumber(input);
        fileNameToNumber.put(input, partNumber);

        do {
            input = scanner.nextLine();
            if (input.equals("end")) break;
            partNumber = getPartNumber(input);
            fileNameToNumber.put(input, partNumber);
        } while (true);



        fileNameToNumber.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(pair -> {
                    try (FileInputStream fis = new FileInputStream(pair.getKey());
                    FileOutputStream fos = new FileOutputStream(fileName, true)) {
                        byte[] bytes = new byte[10];

                        while (fis.available() > 0) {
                            int count = fis.read(bytes);
                            fos.write(bytes, 0, count);
                        }
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });


    }

    public static int getPartNumber(String input) {
        String[] fileInfo = input.split("\\.");
        String partInfo = fileInfo[fileInfo.length - 1];
        String partNumberString = partInfo.substring(4);
        int partNumber = Integer.parseInt(partNumberString);
        return partNumber;
    }

    public static String getFileName(String input) {
        String[] fileInfo = input.split("\\.");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < fileInfo.length - 1; i++) {
            sb.append(fileInfo[i]);
            if (i != fileInfo.length - 2) {
                sb.append(".");
            }
        }

        return sb.toString();
    }
}
