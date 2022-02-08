package com.javarush.task.task04.task0415;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Правило треугольника
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String sA=br.readLine();
        int iA=Integer.parseInt(sA);

        String sB=br.readLine();
        int iB=Integer.parseInt(sB);

        String sC=br.readLine();
        int iC=Integer.parseInt(sC);

        if (iA+iB<=iC || iB+iC<=iA || iA+iC<=iB) {
            System.out.println("Треугольник не существует.");
        }

        else
            System.out.println("Треугольник существует.");
    }
}