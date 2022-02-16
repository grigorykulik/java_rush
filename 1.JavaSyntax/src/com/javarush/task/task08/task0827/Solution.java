package com.javarush.task.task08.task0827;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) throws ParseException
        {
        System.out.println(isDateOdd("JANUARY 2 2020"));
    }

    public static boolean isDateOdd(String date) throws ParseException
        {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Date d=dateFormat.parse(date);
        Date d2=new Date(d.getYear(), 0, 1);

        long difference=d.getTime()-d2.getTime();
        long daysBetween = (difference / (1000*60*60*24))+1;

        if (daysBetween%2!=0) {
            return true;
        }
            return false;
    }
}
