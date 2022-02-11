package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr=new int[5];

        for (int i=0; i<5; i++) {
            int input = Integer.parseInt(reader.readLine());
            arr[i]=input;
        }

        Arrays.sort(arr);

        for (Integer i:arr) {
            System.out.println(i);
        }
    }
}
