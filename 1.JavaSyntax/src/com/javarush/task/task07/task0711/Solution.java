package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> al=new ArrayList<>();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        for (int i=0; i<5; i++) {
            al.add(br.readLine());
        }

        for (int i=0; i<13; i++) {
            String s=al.remove(4);
            al.add(0, s);
        }

        for (String s:al) {
            System.out.println(s);
        }
    }
}
