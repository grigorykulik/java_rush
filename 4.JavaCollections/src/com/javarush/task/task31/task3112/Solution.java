package com.javarush.task.task31.task3112;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.*;

import static java.nio.file.StandardCopyOption.ATOMIC_MOVE;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

/* 
Загрузчик файлов
*/

/**
 * URL, copying a URL-resource into a file
 * Creating a temp file. Moving a file to another folder.
 */

public class Solution {

    public static void main(String[] args) throws IOException {
        Path passwords = downloadFile("https://javarush.ru/testdata/secretPasswords.txt",
                Paths.get("/home/greg/Desktop/test"));

        for (String line : Files.readAllLines(passwords)) {
            System.out.println(line);
        }
    }

    public static Path downloadFile(String urlString, Path downloadDirectory) throws IOException {
        URL url = new URL(urlString);
        InputStream is = url.openStream();

        String[] nameParts = urlString.split("/");
        String filename = nameParts[nameParts.length - 1];
        String[] filenameParts = filename.split("\\.");

        Path tempFile = Files.createTempFile("", "");
        Files.copy(is, tempFile, REPLACE_EXISTING);

        return Files.move(tempFile, downloadDirectory.resolve(filenameParts[0] + "." + filenameParts[1]), REPLACE_EXISTING);

    }
}
