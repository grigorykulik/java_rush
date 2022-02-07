package com.javarush.task.task03.task0325;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Финансовые ожидания
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String n=br.readLine();

        Integer iN=Integer.parseInt(n);

        System.out.print("Я буду зарабатывать $"+iN+" в час");
    }
}
