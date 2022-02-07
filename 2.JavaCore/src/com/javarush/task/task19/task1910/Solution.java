package com.javarush.task.task19.task1910;

import java.io.*;
import java.util.ArrayList;

/* 
Пунктуация

Считать с консоли 2 имени файла.
Первый Файл содержит текст.
Считать содержимое первого файла, удалить все знаки пунктуации, включая символы новой строки. Результат вывести во второй файл.
Закрыть потоки.


Требования:
1.	Программа должна считывать имена файлов с консоли (используй BufferedReader).
2.	BufferedReader для считывания данных с консоли должен быть закрыт.
3.	Программа должна считывать содержимое первого файла (используй BufferedReader c конструктором FileReader).
4.	Поток чтения из файла (BufferedReader) должен быть закрыт.
5.	Программа должна записывать во второй файл содержимое первого файла, где удалены все знаки пунктуации, включая символы новой строки (Для записи в файл используй BufferedWriter с конструктором FileWriter).
6.	Поток записи в файл (BufferedWriter) должен быть закрыт.
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        String sourceFile;
        String targetFile;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            sourceFile = br.readLine();
            targetFile = br.readLine();
        }

        try(BufferedReader fileReader = new BufferedReader(new FileReader(sourceFile));
            BufferedWriter fileWriter = new BufferedWriter(new FileWriter(targetFile))) {

            for (String line = fileReader.readLine(); line != null; line = fileReader.readLine()) {
                fileWriter.write(line.replaceAll("\\p{Punct}", ""));
            }
        }
    }
}
