package com.javarush.task.task04.task0436;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Рисуем прямоугольник
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String sn1=br.readLine();
        int in1=Integer.parseInt(sn1);

        String sn2=br.readLine();
        int in2=Integer.parseInt(sn2);

        for (int i=0; i<in1; i++) {
            for (int j=0; j<in2; j++) {
                System.out.print("8");
            }
            System.out.println();
        }

    }
}
