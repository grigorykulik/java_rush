package com.javarush.task.task20.task2025;

import java.util.*;

/* 
Алгоритмы-числа
*/

public class Solution {

    public static long[] getNumbers(long N) {
        ArrayList<Long> results = new ArrayList<>();

        long number = 0;
        while (number < N) {
            double sum = 0;
            char[] digits = String.valueOf(number).toCharArray();
                for (int i = 0; i < digits.length; i++) {
                    sum = sum + Math.pow(Integer.parseInt(String.valueOf(digits[i])), digits.length);
                    if ((long) sum == number) {
                        results.add(number);
                    }
                }

//            System.out.println(number + ", " + sum);
            number++;
        }

        long[] result = new long[results.size()];

        for (int i = 0; i < result.length; i++) {
            result[i] = results.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        long a = System.currentTimeMillis();
        System.out.println(Arrays.toString(getNumbers(1000)));
        long b = System.currentTimeMillis();
        System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (8 * 1024));
        System.out.println("time = " + (b - a) / 1000);

        a = System.currentTimeMillis();
        System.out.println(Arrays.toString(getNumbers(1000000)));
        b = System.currentTimeMillis();
        System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (8 * 1024));
        System.out.println("time = " + (b - a) / 1000);
    }
}
