package com.javarush.task.task31.task3102;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.*;

/* 
Находим все файлы
*/

/**
 * Tags:
 * List, LinkedList, SimpleFileVisitor, FileVisitor,
 * Files.walkFileTree(Path path, FileVisitor visitor),
 * <p>
 * Реализовать логику метода getFileTree, который должен в директории root найти список всех файлов включая вложенные.
 * Используй очередь, рекурсию не используй.
 * Верни список всех путей к найденным файлам, путь к директориям возвращать не надо.
 * Путь должен быть абсолютный.
 * <p>
 * Requirements:
 * 1. Метод getFileTree должен принимать аргументом String root, по которому нужно найти все вложенные файлы.
 * 2. Метод getFileTree должен возвращать список строк.
 * 3. Нужно реализовать метод getFileTree: найти все файлы по указанному пути и добавить их в список.
 * 4. Метод getFileTree должен быть вызван только 1 раз (рекурсию не использовать).
 */

public class Solution {
    public static List<String> getFileTree(String root) {
        List<String> filenames = new LinkedList<>();
        Queue<File> dirs = new LinkedList<>();
        dirs.offer(new File(root));

        while (!dirs.isEmpty()) {
            for (File f : dirs.poll().listFiles()) {
                if (f.isDirectory()) {
                    dirs.offer(f);
                } else {
                    filenames.add(f.getAbsolutePath());
                }
            }
        }
        return filenames;
    }

    public static void main(String[] args) {
        System.out.println(getFileTree("/home/greg/Desktop/test"));
    }
}
