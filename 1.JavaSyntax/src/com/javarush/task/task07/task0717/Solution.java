package com.javarush.task.task07.task0717;

import com.sun.org.apache.xpath.internal.objects.XString;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удваиваем слова
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> words=new ArrayList<>();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        for (int i=0; i<10; i++) {
            words.add(br.readLine());
        }

        ArrayList<String> result = doubleValues(words);
        for (String s:words) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        for (int i=0; i<list.size(); i+=2) {
            list.add(i+1, list.get(i));
        }
        return list;
    }
}
