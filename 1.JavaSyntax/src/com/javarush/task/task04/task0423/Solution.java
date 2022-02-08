package com.javarush.task.task04.task0423;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Фейс-контроль
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String name=br.readLine();
        String sage=br.readLine();
        int iage=Integer.parseInt(sage);

        if (iage>20)
            System.out.println("И 18-ти достаточно");

    }
}
