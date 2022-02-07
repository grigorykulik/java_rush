package com.javarush.task.task03.task0322;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Большая и чистая
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String sName1=br.readLine();
        String sName2=br.readLine();
        String sName3=br.readLine();

        System.out.println(sName1 + " + " + sName2 + " + " + sName3 + " = Чистая" +
                " любовь, да-да!");

    }
}