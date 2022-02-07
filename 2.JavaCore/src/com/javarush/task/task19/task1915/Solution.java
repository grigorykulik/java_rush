package com.javarush.task.task19.task1915;

import java.io.*;
import java.util.Scanner;

/* 
Дублируем текст
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        String targetFile = "";

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            targetFile = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);
        testString.printSomething();
        System.setOut(consoleStream);
        String result = outputStream.toString();
        System.out.println(result);

        try (FileOutputStream fw = new FileOutputStream(targetFile)) {
            fw.write(outputStream.toByteArray());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

