package com.javarush.task.task31.task3106;

import java.io.*;
import java.util.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/**
Разархивируем файл
ZipEntry, SequenceInputStream, BufferedOutputStream
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        File result = new File(args[0]);

        if (!result.exists()) {
            result.createNewFile();
        }

        List<FileInputStream> fileInputStreams = new ArrayList<>();
        List<String> fileNames = new ArrayList<>();

        Arrays.stream(args)
                .skip(1)
                .forEach(e -> fileNames.add(e));

        Collections.sort(fileNames);

        for (String s : fileNames) {
            fileInputStreams.add(new FileInputStream(s));
        }

        try (ZipInputStream zis = new ZipInputStream(new SequenceInputStream(Collections.enumeration(fileInputStreams)))) {
            while (true) {
                ZipEntry entry = zis.getNextEntry();
                if (entry == null) break;

                try (OutputStream os = new BufferedOutputStream(new FileOutputStream(result))) {
                    final int bufferSize = 1024;
                    byte[] buffer = new byte[bufferSize];
                    for (int readBytes; (readBytes = zis.read(buffer, 0, bufferSize)) > -1;) {
                        os.write(buffer, 0, readBytes);
                    }
                }
            }
        }
    }
}
