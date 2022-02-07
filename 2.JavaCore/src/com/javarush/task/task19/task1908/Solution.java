package com.javarush.task.task19.task1908;

import java.io.*;
import java.util.Arrays;

/* 
Выделяем числа
Считать с консоли 2 пути к файлам.
Вывести во второй файл все целые числа, которые есть в первом файле (54у не является числом).
Числа выводить через пробел.
Закрыть потоки.

Пример тела файла:
12 text var2 14 8ю 1

Результат:
12 14 1


Требования:
1.	Программа должна считывать пути к файлам с консоли (используй BufferedReader).
2.	BufferedReader для считывания данных с консоли должен быть закрыт.
3.	Программа должна считывать содержимое первого файла (используй BufferedReader c конструктором принимающим FileReader).
4.	Поток чтения из файла (BufferedReader) должен быть закрыт.
5.	Программа должна записывать во второй файл все числа, через пробел, из первого файла (используй BufferedWriter с конструктором FileWriter).
6.	Поток записи в файл (BufferedWriter) должен быть закрыт.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String sourceFile;
        String tagetFile;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            sourceFile = br.readLine();
            tagetFile = br.readLine();
        }

        try (BufferedReader fileReader = new BufferedReader(new FileReader(sourceFile));
             BufferedWriter fileWriter = new BufferedWriter(new FileWriter(tagetFile))) {

            for (String line = fileReader.readLine(); line != null; line = fileReader.readLine()) {

                Arrays.stream(line.split(" "))
                        .filter(Solution::isNumber)
                        .forEach(s -> {
                            try {
                                fileWriter.write(s + " ");
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        });
            }
        }

    }

    public static boolean isNumber(String s) {
        try {
            Long.parseLong(s);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
}
