package com.javarush.task.task19.task1902;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* 
Адаптер
*/

public class AdapterFileOutputStream implements AmigoStringWriter {
    private FileOutputStream fileOutputStream;

    public AdapterFileOutputStream(FileOutputStream fileOutputStream) {
        this.fileOutputStream = fileOutputStream;
    }

    public void flush() throws IOException {
        fileOutputStream.flush();
    }

    public void writeString(String s) throws IOException {
        fileOutputStream.write(s.getBytes(StandardCharsets.UTF_8));
    }

    public void close() throws IOException {
        fileOutputStream.close();
    }

    public static void main(String[] args) {

    }


}

