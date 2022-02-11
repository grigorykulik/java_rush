package com.javarush.task.task05.task0528;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/* 
Вывести на экран сегодняшнюю дату
*/

public class Solution {
    public static void main(String[] args) {
        Calendar c=new GregorianCalendar();
        System.out.println(c.get(Calendar.DAY_OF_MONTH) + " " + (c.get(Calendar.MONTH)+1) + " " + c.get(Calendar.YEAR));
    }
}
