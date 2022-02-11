package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String[] stArr=new String[10];
        int[] iArr=new int[10];

        for (int i=0; i<10; i++) {
            String sInput=br.readLine();
            stArr[i]=sInput;
            iArr[i]=stArr[i].length();
            System.out.println(iArr[i]);
        }
    }
}
