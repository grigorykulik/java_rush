package com.javarush.task.task04.task0424;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Три числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int result=0;

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String sn1=br.readLine();
        int in1=Integer.parseInt(sn1);

        String sn2=br.readLine();
        int in2=Integer.parseInt(sn2);

        String sn3=br.readLine();
        int in3=Integer.parseInt(sn3);

        if (in1-in2!=0 && in2-in3==0) result=1;
        else if (in1-in2==0 && in2-in3!=0) result=3;
        else if (in1-in2!=0 && in1-in3==0) result=2;
        else if (in1-in2==0 && in2-in3==0) return;
        else if (in1-in2!=0 && in2-in3!=0) return;
        System.out.println(result);
    }
}
