package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();

        for (int i=0; i<5; i++) {
            al.add("string"+i);
        }

        System.out.println(al.size());

        for (int i=0; i<5; i++) {
            System.out.println(al.get(i));
        }
    }
}
