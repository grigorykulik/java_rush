package com.javarush.task.task03.task0318;

import sun.util.BuddhistCalendar;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
План по захвату мира
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

        String sTime=reader.readLine();
        String sName=reader.readLine();

        System.out.println(sName + " захватит мир через " + sTime + " лет. Му-ха-ха!");

    }
}
