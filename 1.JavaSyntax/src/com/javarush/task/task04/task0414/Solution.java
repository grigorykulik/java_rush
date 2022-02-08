package com.javarush.task.task04.task0414;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Количество дней в году
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String sY=br.readLine();
        int nY=Integer.parseInt(sY);
        boolean isLeapYear;

        if (nY%400==0) {
            System.out.println("количество дней в году: 366");
        }
        else if (nY%100==0) {
            System.out.println("количество дней в году: 365");
        }
        else if (nY%4==0) {
            System.out.println("количество дней в году: 366");
        }
        else {
                System.out.println("количество дней в году: 365");
        }
    }
}