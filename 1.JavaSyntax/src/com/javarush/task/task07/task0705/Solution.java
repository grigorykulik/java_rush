package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] arr1=new int[20];
        int[] arr2=new int[10];
        int[] arr3=new int[10];

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        for (int i=0; i<20; i++) {
            int in=Integer.parseInt(br.readLine());
            arr1[i]=in;
        }

        for (int i=0; i<10; i++) {
            arr2[i]=arr1[i];
            arr3[i]=arr1[i+arr1.length/2];
        }

        for (int i:arr3) {
            System.out.println(i);
        }


    }
}
