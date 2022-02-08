package com.javarush.task.task04.task0441;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Как-то средненько
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

        if (in1==in2 && in1==in3) {
            System.out.println(in1);
        }

        else if (in1==in2)
            System.out.println(in1);

        else if (in1==in3)
            System.out.println(in1);

        else if (in2==in3)
            System.out.println(in2);

        else {
                System.out.println(mid(in1, in2, in3));
            }

    }

    public static int mid(int a, int b, int c) {
        int mid=0;

        int min=a;
        if (b<min) min=b;
        if (c<min) min=c;

        int max=a;
        if (b>max) max=b;
        if (c>max) max=c;

        if (a>min && a<max) mid=a;
        if (b>min && b<max) mid=b;
        if (c>min && c<max) mid=c;

        return mid;
    }
}
