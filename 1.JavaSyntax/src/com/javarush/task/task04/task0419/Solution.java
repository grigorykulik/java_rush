package com.javarush.task.task04.task0419;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Максимум четырех чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String sn1=br.readLine();
        int in1=Integer.parseInt(sn1);

        String sn2=br.readLine();
        int in2=Integer.parseInt(sn2);

        String sn3=br.readLine();
        int in3=Integer.parseInt(sn3);

        String sn4=br.readLine();
        int in4=Integer.parseInt(sn4);

        int max=in1;

        if (in1==in2 && in2==in3 && in3==in4) {
            System.out.println(in1);
            return;
        }

        if (max<in2) {
            max=in2;
        }

        if (max<in3) {
            max=in3;
        }

        if (max<in4) {
            max=in4;
        }

        System.out.println(max);
    }
}
