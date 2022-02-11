package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        int[] arr1=new int[15];

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int sumOdd=0;
        int sumEven=0;

        for (int i=0; i<15; i++) {
            arr1[i]=Integer.parseInt(br.readLine());
            if (i%2==0) {
                sumEven+=arr1[i];
            }
            else sumOdd+=arr1[i];
        }

        if (sumEven>sumOdd)
            System.out.println("В домах с четными номерами проживает больше жителей.");
        else
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
    }
}
