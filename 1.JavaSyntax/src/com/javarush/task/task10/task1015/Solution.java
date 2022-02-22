package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String>[] arrayLists=new ArrayList[3];

        for (int i=0; i<arrayLists.length; i++) {
            ArrayList<String> als=new ArrayList<>();
            arrayLists[i]=als;
        }

        for (int i=0; i<arrayLists.length; i++) {
            for (int j=0; j<3; j++) {
                String s="string";
                arrayLists[j].add(s);
            }
        }

        return arrayLists;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String string : list) {
                System.out.println(string);
            }
        }
    }
}