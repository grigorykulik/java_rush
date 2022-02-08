package com.javarush.task.task04.task0418;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Минимум двух чисел Ӏ Java Syntax: 4 уровень, 6 лекция
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String sn1=br.readLine();
        int in1=Integer.parseInt(sn1);

        String sn2=br.readLine();
        int in2=Integer.parseInt(sn2);

        if (in1<in2) {
            System.out.println(in1);
        }

        else if (in1==in2) {
            System.out.println(in1);
        }

        else
            System.out.println(in2);
    }
}