package com.javarush.task.task04.task0443;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Как назвали, так назвали
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String name=br.readLine();

        String sYear=br.readLine();
        int iYear=Integer.parseInt(sYear);

        String sMonth=br.readLine();
        int iMonth=Integer.parseInt(sMonth);

        String sDay=br.readLine();
        int iDay=Integer.parseInt(sDay);

        System.out.println("Меня зовут "+name+".");
        System.out.println("Я родился "+sDay+"."+sMonth+"."+sYear);

    }
}
