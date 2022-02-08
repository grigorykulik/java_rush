package com.javarush.task.task04.task0429;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Положительные и отрицательные числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int positiveCounter=0;
        int negativeCounter=0;

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        for (int i=0; i<3; i++) {
            String sn=br.readLine();
            int in=Integer.parseInt(sn);

            if (isPositive(in)) positiveCounter++;
            else if (isNegative(in)) negativeCounter++;
            else continue;
        }

        System.out.println("количество отрицательных чисел: "+negativeCounter);
        System.out.println("количество положительных чисел: "+positiveCounter);

    }

    public static boolean isPositive (int i) {
        return i>0;
    }

    public static boolean isNegative (int i) {
        return i<0;
    }
}
