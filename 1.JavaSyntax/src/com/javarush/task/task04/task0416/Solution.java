package com.javarush.task.task04.task0416;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переходим дорогу вслепую
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String st=br.readLine();
        Double dt=Double.parseDouble(st);

        if (dt%5>=0 && dt%5<3) {
            System.out.println("зелёный");
        }

        else if (dt%5>=3 && dt%5<4) {
            System.out.println("жёлтый");
        }

        else if (dt%5>=4 && dt%5<5) {
            System.out.println("красный");
        }
    }
}