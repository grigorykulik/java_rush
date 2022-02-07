package com.javarush.task.task31.task3101;

import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.*;
import java.util.stream.Collectors;

/*
Проход по дереву файлов
*/

public class MySolution {
    private ArrayList<File> allFiles = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        File oldName = new File(args[1]);

        if (!oldName.exists()) {
            oldName.createNewFile();
        }

        File newName = new File("/home/greg/Desktop/test/allFilesContent.txt");
        FileUtils.renameFile(oldName, newName);

        File folder = new File(args[0]);

        if (!folder.exists()) return;

        ArrayList<File> filesArray = new ArrayList<>();
        collectFilesToArray(folder, filesArray);

        List<File> sortedFiles = filesArray
                .stream()
                .filter(file -> (file.length() <= 50))
                .sorted(Comparator.comparing(File::getName))
                .collect(Collectors.toList());

        System.out.println(sortedFiles);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(newName))) {
            for (File file : sortedFiles) {
                try (BufferedReader reader = new BufferedReader(new FileReader(file))){
                    for (String s = reader.readLine(); s != null; s = reader.readLine()) {
                        writer.write(s);
                    }
                }

                writer.write("\n");
            }
        }

    }

    private static void collectFilesToArray(File f, ArrayList<File> filesArray) {
        for (File file : f.listFiles()) {
            if (file.isDirectory()) {
                collectFilesToArray(file, filesArray);
            } else {
                filesArray.add(file);
            }
        }
    }
}
