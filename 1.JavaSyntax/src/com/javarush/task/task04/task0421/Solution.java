package com.javarush.task.task04.task0421;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Настя или Настя?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String ss1=br.readLine();
        String ss2=br.readLine();

        if (ss1.equals(ss2))
            System.out.println("Имена идентичны");
        else if (ss1.length()==ss2.length()) {
            System.out.println("Длины имен равны");
        }
    }
}
