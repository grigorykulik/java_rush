package com.javarush.task.task04.task0420;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Сортировка трех чисел
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

        int max, med, min;

        if (in1>in2) {
            if (in1>in3) {
                max=in1;
                if (in2>in3) {
                    med=in2;
                    min=in3;
                }

                else {
                    med=in3;
                    min=in2;
                }
            }

            else {
                med=in1;
                max=in3;
                min=in2;
            }
        }

        else {
            if (in2>in3) {
                max=in2;

                if (in1>in3) {
                    med=in1;
                    min=in3;
                }

                else {
                    med=in3;
                    min=in1;
                }
            }

            else {
                med=in2;
                max=in3;
                min=in1;
            }
        }

        System.out.print(max + " " + med + " " + min);

    }
}
