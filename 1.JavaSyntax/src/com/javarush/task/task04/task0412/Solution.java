package com.javarush.task.task04.task0412;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

/* 
Положительное и отрицательное число
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sn=br.readLine();
        Integer in=Integer.parseInt(sn);

        if (in>0) {
            in=in*2;
            System.out.println(in);
        }

        else if (in<0) {
            in=in+1;
            System.out.println(in);
        }

        else if (in==0) {
            System.out.println(in);
        }
    }

}