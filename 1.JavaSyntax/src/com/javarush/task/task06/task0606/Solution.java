package com.javarush.task.task06.task0606;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int input=Integer.parseInt(br.readLine());

        while (input!=0) {
            if (input%2==0) Solution.even++;
            else Solution.odd++;

            input=input/10;
        }

        System.out.println("Even: " + Solution.even + " Odd: " + Solution.odd);
    }
}
