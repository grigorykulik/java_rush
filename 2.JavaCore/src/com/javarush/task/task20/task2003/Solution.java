package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* 
Знакомство с properties
*/

public class Solution {

    public static Map<String, String> runtimeStorage = new HashMap<>();

    public static void save(OutputStream outputStream) throws Exception {
        try {
            Properties p = new Properties();
            runtimeStorage.entrySet().stream()
                    .forEach(pair -> {
                        p.setProperty(pair.getKey(), pair.getValue());
                    });

            p.store(outputStream, "");
        } finally {
            outputStream.close();
        }

    }

    public static void load(InputStream inputStream) throws IOException {
        try {
            Properties p = new Properties();
            p.load(inputStream);
            p.forEach((k, v) -> runtimeStorage.put(k.toString(), v.toString()));
        } finally {
            inputStream.close();
        }

    }

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fos = new FileInputStream(reader.readLine())) {
            load(fos);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(runtimeStorage);
    }
}
