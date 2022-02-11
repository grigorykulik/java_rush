package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> al=new ArrayList<>();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        for (int i=0; i<10; i++) {
            al.add(br.readLine());
        }

        if(getIndexLongest(al)<getIndexShortest(al))
            System.out.println(al.get(getIndexLongest(al)));
        else
            System.out.println(al.get(getIndexShortest(al)));
    }

    public static int getIndexShortest(ArrayList<String> al) {
        int minLength=al.get(0).length();
        int minIndex=0;

        for (int i=0; i<al.size(); i++) {
            if (al.get(i).length()<minLength) {
                minLength=al.get(i).length();
            }
        }

        for (String s:al) {
            if (s.length()==minLength) {
                minIndex=al.indexOf(s);
                break;
            }
        }

        return minIndex;
    }

    public static int getIndexLongest(ArrayList<String> al) {
        int maxLength=al.get(0).length();
        int maxIndex=0;

        for (int i=0; i<al.size(); i++) {
            if (al.get(i).length()>maxLength) {
                maxLength=al.get(i).length();
            }
        }

        for (String s:al) {
            if (s.length()==maxLength) {
                maxIndex=al.indexOf(s);
                break;
            }
        }

        return maxIndex;
    }
}
