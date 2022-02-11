package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int sum=0;

        while (true) {
            String sInput=br.readLine();

            if (sInput.equals("сумма")) break;

            Integer iInput=Integer.parseInt(sInput);
            sum=sum+iInput;
        }

        System.out.println(sum);
    }
}
