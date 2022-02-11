package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int[] iArr=new int[10];

        for (int i=0; i<10; i++) {
            int in=Integer.parseInt(br.readLine());
            iArr[i]=in;
        }

        for (int j=9; j>-1; j--) {
                System.out.println(iArr[j]);
            }
    }
}

