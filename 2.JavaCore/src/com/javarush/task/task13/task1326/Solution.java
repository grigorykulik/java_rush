package com.javarush.task.task13.task1326;

import java.io.*;
import java.util.*;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        Scanner scanner = new Scanner(new FileInputStream(fileName));
        ArrayList<Integer> array = new ArrayList<>();

        while (scanner.hasNextInt()) {
            Integer number = scanner.nextInt();
            array.add(number);
        }

        scanner.close();

        Collections.sort(array);

        for (int i = 0; i < array.size(); i++) {
            if (array.get(i)%2 == 0) {
                System.out.println(array.get(i));
            }
        }
    }
}
