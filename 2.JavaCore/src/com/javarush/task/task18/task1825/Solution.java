package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.*;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        List<Integer> fileNumbers = new ArrayList<>();


        input = scanner.nextLine();
        if (input.equals("end")) return;

        final String fileName = input.replaceFirst("\\.part[0-9]+$", "");

        fileNumbers.add(getPartNumber(input));

        for (input = scanner.nextLine(); !input.equals("end"); input = scanner.nextLine()) {
            fileNumbers.add(getPartNumber(input));
        }

        fileNumbers.stream()
                .sorted()
                .forEach(fileNumber -> {
                    try (BufferedInputStream fis = new BufferedInputStream(new FileInputStream(fileName + ".part" + fileNumber));
                         BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream(fileName, true))) {
                        for (int b = fis.read(); b != -1; b = fis.read()) {
                            fos.write(b);
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
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
}
