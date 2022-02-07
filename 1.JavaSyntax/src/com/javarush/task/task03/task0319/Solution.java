package com.javarush.task.task03.task0319;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Предсказание на будущее
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

        String sName=reader.readLine();
        String sNumber1=reader.readLine();
        String sNumber2=reader.readLine();

        System.out.println(sName + " получает " + sNumber1 + " через " + sNumber2 + " лет.");

    }
}
