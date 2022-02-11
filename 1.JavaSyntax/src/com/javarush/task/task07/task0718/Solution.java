package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> al=new ArrayList<>();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        for (int i=0; i<10; i++) {
            al.add(br.readLine());
        }

        for (int i=0; i<al.size()-1; i++) {
            if (al.get(i).length()<al.get(i+1).length()) {
                continue;
            }

            else {
                System.out.println(i+1);
                break;
            }
        }
    }
}

