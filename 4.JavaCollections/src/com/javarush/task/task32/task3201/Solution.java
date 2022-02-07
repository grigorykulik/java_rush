package com.javarush.task.task32.task3201;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* 
Запись в существующий файл
*/

public class Solution {
    public static void main(String... args) throws IOException {
        try (RandomAccessFile raf = new RandomAccessFile(args[0], "rw")) {

            StringBuilder text = new StringBuilder();
            Arrays.stream(args)
                    .skip(2)
                    .forEach(text::append);

            long position = (raf.length() < Integer.parseInt(args[1])) ? raf.length() : Integer.parseInt(args[1]);
            raf.seek(position);
            raf.write(text.toString().getBytes(StandardCharsets.UTF_8));
        }
    }
}
