package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> al=new ArrayList<>();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int minLength=0;

        for (int i=0; i<5; i++) {
            al.add(br.readLine());
        }

        minLength=al.get(0).length();

        for (int i=0; i<5; i++) {
            if (al.get(i).length()<minLength) minLength=al.get(i).length();
        }

        for (String s:al) {
            if (s.length()==minLength) {
                System.out.println(s);
            }
        }

    }
}
