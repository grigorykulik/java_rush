package com.javarush.task.task18.task1809;

import java.io.*;

/* 
Реверс файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String filename1 = br.readLine();
        String filename2 = br.readLine();

        FileInputStream fis = new FileInputStream(filename1);
        FileOutputStream fos = new FileOutputStream(filename2);

        byte[] inputBuffer = new byte[fis.available()];
        byte[] outputBuffer = new byte[fis.available()];

        int count = fis.read(inputBuffer);

        for (int i = 0; i < inputBuffer.length; i++) {
            outputBuffer[inputBuffer.length - 1 - i] = inputBuffer[i];
        }

        fos.write(outputBuffer, 0, count);

        fis.close();
        fos.close();
    }
}
