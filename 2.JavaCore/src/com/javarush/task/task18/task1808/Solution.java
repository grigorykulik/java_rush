package com.javarush.task.task18.task1808;

import java.io.*;

/* 
Разделение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String filename1 = br.readLine();
        String filename2 = br.readLine();
        String filename3 = br.readLine();

        int sizeFirst;
        int sizeSecond;

        FileInputStream fis = new FileInputStream(filename1);
        int count = fis.available();

        byte[] inputBuffer = new byte[count];

        FileOutputStream fosFirst = new FileOutputStream(filename2);
        FileOutputStream fosSecond = new FileOutputStream(filename3);

        if (count%2 == 0) {
            sizeFirst = count/2;
            sizeSecond = sizeFirst;
        } else {
            sizeSecond = fis.available() / 2;
            sizeFirst = fis.available() - sizeSecond;
        }

        fis.read(inputBuffer);

        byte[] outputBufferFirst = new byte[sizeFirst];
        byte[] outputBufferSecond = new byte[sizeSecond];

        for (int i = 0; i < sizeFirst; i++) {
            outputBufferFirst[i] = inputBuffer[i];
        }

        int j = 0;
        for (int i = sizeFirst; i < inputBuffer.length; i++) {
            outputBufferSecond[j] = inputBuffer[i];
            j++;
        }

        fosFirst.write(outputBufferFirst, 0, sizeFirst);
        fosSecond.write(outputBufferSecond, 0, sizeSecond);

        fis.close();
        fosFirst.close();
        fosSecond.close();
    }
}
