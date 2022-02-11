package com.javarush.task.task05.task0532;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Задача по алгоритмам Ӏ Java Syntax: 5 уровень, 12 лекция
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = Integer.parseInt(reader.readLine());
        int max=0;

        if (maximum>0)
            {
                int previous = Integer.parseInt(reader.readLine());
                max=previous;
                for (int i = 0; i < maximum-1; i++)
                    {
                        int next = Integer.parseInt(reader.readLine());

                        if (next > max)
                            max = next;
                    }
            }

        if (maximum>0)
            {
                System.out.println(max);
            }
    }
}
