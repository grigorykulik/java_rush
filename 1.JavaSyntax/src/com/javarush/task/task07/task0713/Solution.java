package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> alMain=new ArrayList<>();
        ArrayList<Integer> al1=new ArrayList<>();
        ArrayList<Integer> al2=new ArrayList<>();
        ArrayList<Integer> al3=new ArrayList<>();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        for (int i=0; i<20; i++) {
            int in=Integer.parseInt(br.readLine());
            alMain.add(in);
        }

        for (Integer i:alMain) {
            if (i%3==0) al1.add(i);
            if (i%2==0) al2.add(i);
            if (i%3!=0 && i%2!=0) al3.add(i);
        }

        printList(al1);
        printList(al2);
        printList(al3);
    }

    public static void printList(ArrayList<Integer> list) {
        for (int i:list) {
            System.out.println(i);
        }
    }
}
