package com.javarush.task.task04.task0422;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
18+
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String name=br.readLine();
        String sage=br.readLine();
        int iage=Integer.parseInt(sage);

        if (iage<18)
            System.out.println("Подрасти еще");
    }
}
