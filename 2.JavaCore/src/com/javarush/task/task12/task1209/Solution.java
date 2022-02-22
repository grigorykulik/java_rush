package com.javarush.task.task12.task1209;

/* 
Три метода и минимум
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static int min(int i, int j) {
        int min = i;
        if (j < min) {
            min=j;
        }

        return min;
    }

    public static long min(long i, long j) {
        long min = i;
        if (j < min) {
            min=j;
        }

        return min;
    }

    public static double min(double i, double j) {
        double min = i;
        if (j < min) {
            min=j;
        }

        return min;
    }
}
