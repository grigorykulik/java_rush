package com.javarush.task.task31.task3113;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/**
Что внутри папки?

Что внутри папки?
Напиши программу, которая будет считать подробную информацию о папке и выводить ее на консоль.

Первым делом считай путь к папке с консоли.
Если введенный путь не является директорией - выведи "[полный путь] - не папка" и заверши работу.
Затем посчитай и выведи следующую информацию:

Всего папок - [количество папок в директории и поддиректориях]
Всего файлов - [количество файлов в директории и поддиректориях]
Общий размер - [общее количество байт, которое хранится в директории]

Используй только классы и методы из пакета java.nio.

Квадратные скобки [ ] выводить на экран не нужно.


Requirements:
1. Метод main должен считывать путь к папке с консоли.
2. Если введенный путь не является директорией - нужно вывести "[полный путь] - не папка" и завершить работу.
3. Используй только классы и методы из пакета java.nio.
4. На консоль должна быть выведена следующая информация: "Всего папок - [количество папок в директории и поддиректориях]".
5. На консоль должна быть выведена следующая информация: "Всего файлов - [количество файлов в директории и поддиректориях]".
6. На консоль должна быть выведена следующая информация: "Общий размер - [общее количество байт, которое хранится в директории]".
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Path startingDir = Paths.get(sc.nextLine());

        if (!Files.isDirectory(startingDir)) {
            System.out.println(startingDir.toAbsolutePath() + " - не папка");
            return;
        }

        FVisitor visitor = new FVisitor(startingDir);
        Files.walkFileTree(startingDir, visitor);

        System.out.println("Всего папок - " + visitor.getDirCounter());
        System.out.println("Всего файлов - " + visitor.getFileCounter());
        System.out.println("Общий размер - " + visitor.getTotalFileSize());

    }

    private static class FVisitor extends SimpleFileVisitor<Path> {
        private Path startingDir;
        private int dirCounter;
        private int fileCounter;
        private long totalFileSize;

        public FVisitor (Path startingDir) {
            this.startingDir = startingDir;
        }

        public int getDirCounter() {
            return this.dirCounter;
        }

        public int getFileCounter() {
            return this.fileCounter;
        }

        public long getTotalFileSize() {
            return this.totalFileSize;
        }

        @Override
        public FileVisitResult preVisitDirectory(Path file, BasicFileAttributes attrs) throws IOException {
            boolean searchFinished = Files.isSameFile(file, startingDir);
            if (!searchFinished) {
                dirCounter++;
            }

            return FileVisitResult.CONTINUE;
        }

        @Override
        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
            fileCounter++;
            totalFileSize += Files.size(file);

            return FileVisitResult.CONTINUE;
        }
    }
}
