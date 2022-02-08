package com.javarush.task.task04.task0425;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Цель установлена!
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int quarter=0;

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String sPointX=br.readLine();
        int iPointX=Integer.parseInt(sPointX);

        String sPointY=br.readLine();
        int iPointY=Integer.parseInt(sPointY);

        if (iPointX>0 && iPointY>0) quarter=1;
        else if (iPointX<0 && iPointY>0) quarter=2;
        else if (iPointX<0 && iPointY<0) quarter=3;
        else if (iPointX>0 && iPointY<0) quarter=4;

        System.out.println(quarter);
    }
}
