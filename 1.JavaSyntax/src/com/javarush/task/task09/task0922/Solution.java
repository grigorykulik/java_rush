package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(new InputStreamReader(System.in));
        String line=sc.nextLine();

        SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd");
        Date d=sdf1.parse(line);

        SimpleDateFormat sdf2=new SimpleDateFormat("MMM dd, yyyy");
        String outDate=sdf2.format(d);
        System.out.println(outDate.toUpperCase());
    }
}
