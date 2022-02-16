package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        ArrayList<Integer> list=new ArrayList<>();

        Scanner sc=new Scanner(new InputStreamReader(System.in));
        try {
                while (sc.hasNext()) {
                int n = sc.nextInt();
                list.add(n);
            }
        }
            catch (InputMismatchException e) {
                for (Integer i:list) {
                    System.out.println(i);
                }
            }

    }
}
