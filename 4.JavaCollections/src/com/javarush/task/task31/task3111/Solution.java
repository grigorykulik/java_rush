package com.javarush.task.task31.task3111;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/* 
Продвинутый поиск файлов
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        SearchFileVisitor searchFileVisitor = new SearchFileVisitor();

        searchFileVisitor.setPartOfName("amigo");
        searchFileVisitor.setPartOfContent("programmer");
        searchFileVisitor.setMinSize(500);
        searchFileVisitor.setMaxSize(10000);

        Files.walkFileTree(Paths.get("/home/greg/Desktop/test/testFolder/1"), searchFileVisitor);

        List<Path> foundFiles = searchFileVisitor.getFoundFiles();
        for (Path file : foundFiles) {
            System.out.println(file);
        }
    }

    public static class SearchFileVisitor extends SimpleFileVisitor<Path> {
        private String partOfName;
        private String partOfContent;
        private int minSize;
        private int maxSize;
        private List<Path> foundFiles = new ArrayList<>();
        private List<Path> allFiles = new ArrayList<>();

        public void setPartOfName(String partOfName) {
            this.partOfName = partOfName;
        }

        public void setPartOfContent(String partOfContent) {
            this.partOfContent = partOfContent;
        }

        public void setMinSize(int minSize) {
            this.minSize = minSize;
        }

        public void setMaxSize(int maxSize) {
            this.maxSize = maxSize;
        }

        @Override
        public FileVisitResult visitFile(Path path, BasicFileAttributes attrs) throws IOException {
            allFiles.add(path);
            return super.visitFile(path, attrs);
        }

        public List<Path> getFoundFiles() {
            foundFiles = allFiles
                    .stream()
                    .filter(this::containsPartOfName)
                    .filter(file -> {
                        boolean condition;
                        try {
                            condition = containsPartOfContent(file);
                        } catch (Exception e) {
                            throw new RuntimeException();
                        }
                        return condition;
                    })
                    .filter(file -> {
                        boolean condition;
                        try {
                            condition = sizeGreaterThan(file);
                        } catch (Exception e) {
                            throw new RuntimeException();
                        }
                        return condition;
                    })
                    .filter(file -> {
                        boolean condition;
                        try {
                            condition = sizeLessThan(file);
                        } catch (Exception e) {
                            throw new RuntimeException();
                        }
                        return condition;
                    })
                    .collect(Collectors.toList());

            return foundFiles;
        }

        public boolean containsPartOfName(Path file) {
            if (partOfName == null) {
                return true;
            } else {
                if (file.toString().contains(partOfName)) {
                    return true;
                }
            }
            return false;
        }


        public boolean containsPartOfContent(Path file) throws IOException {
            if (partOfContent == null) {
                return true;
            } else {
                try (BufferedReader reader = new BufferedReader(new FileReader(file.toString()))) {
                    for (String s = reader.readLine(); s != null; s = reader.readLine()) {
                        if (s.contains(partOfContent)) {
                            return true;
                        }
                    }
                }
            }

            return false;
        }


        public boolean sizeGreaterThan(Path file) throws IOException {
            if (minSize == 0) {
                return true;
            } else {
                if (Files.size(file) > minSize) {
                    return true;
                }
            }
            return false;
        }

        public boolean sizeLessThan(Path file) throws IOException {
            if (maxSize == 0) {
                return true;
            } else {
                if (Files.size(file) < maxSize) {
                    return true;
                }
            }
            return false;
        }

    }
}


