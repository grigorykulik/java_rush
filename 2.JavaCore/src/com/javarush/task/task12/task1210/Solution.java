package com.javarush.task.task12.task1210;

/* 
Три метода и максимум
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static int max(int i, int j) {
        int max = i;

        if (j > max) {
            max = j;
        }

        return max;
    }


    public static long max(long i, long j) {
        long max = i;
        if (j > max) {
            max = j;
        }

        return max;
    }

    public static double max(double i, double j) {
        double max = i;
        if (j > max) {
            max = j;
        }

        return max;
    }
}
