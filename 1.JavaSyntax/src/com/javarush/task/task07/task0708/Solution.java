package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        strings=new ArrayList<>();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int maxLength=0;

        for (int i=0; i<5; i++) {
            strings.add(br.readLine());
        }

        maxLength=strings.get(0).length();

        for (int i=0; i<4; i++) {
            if (strings.get(i).length()<strings.get(i+1).length()) {
                maxLength=strings.get(i+1).length();
            }
        }

        for (String s:strings) {
            if (s.length()==maxLength) {
                System.out.println(s);
            }
        }
    }
}
