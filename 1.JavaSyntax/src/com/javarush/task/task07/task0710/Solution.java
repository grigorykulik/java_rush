package com.javarush.task.task07.task0710;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
В начало списка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> al=new ArrayList<>();

        for (int i=0; i<10; i++) {
            al.add("");
        }

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        al.get(9);
        for (int i=0; i<10; i++) {
            al.set(9-i, br.readLine());
        }

        for (String s:al) {
            System.out.println(s);
        }
    }
}
