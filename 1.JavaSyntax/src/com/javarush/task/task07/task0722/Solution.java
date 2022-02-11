package com.javarush.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Это конец
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arrayList=new ArrayList<>();

        while (true) {
            String string=reader.readLine();
            if (string.equals("end")) break;
            else arrayList.add(string);
        }

        for (String s:arrayList) {
            System.out.println(s);
        }
    }
}