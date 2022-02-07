package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException
        {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) throws IOException
        {
        String sN=Integer.toString(number);
        char[] ch=sN.toCharArray();
        int sum=0;
        for (int i=0; i<ch.length; i++) {
            String stp=Character.toString(ch[i]);
            sum=sum+Integer.parseInt(stp);
        }
            return sum;
    }
}