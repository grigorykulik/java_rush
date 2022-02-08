package com.javarush.task.task04.task0428;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Положительное число
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int counter=0;

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        for (int i=0; i<3; i++)
            {
                String sn = br.readLine();
                int in = Integer.parseInt(sn);
                if (isPositive(in))
                    counter++;
            }

        System.out.println(counter);
    }

    public static boolean isPositive(int i) {
        return (i>0);
    }
}
