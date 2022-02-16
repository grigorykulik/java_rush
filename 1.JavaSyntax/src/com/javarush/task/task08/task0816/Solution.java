package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Смирнов1", dateFormat.parse("MAY 1 2012"));
        map.put("Смирнов2", dateFormat.parse("JUNE 1 2012"));
        map.put("Смирнов3", dateFormat.parse("MAY 1 2012"));
        map.put("Смирнов4", dateFormat.parse("MAY 1 2012"));
        map.put("Смирнов5", dateFormat.parse("MAY 1 2012"));
        map.put("Смирнов6", dateFormat.parse("MAY 1 2012"));
        map.put("Смирнов7", dateFormat.parse("MAY 1 2012"));
        map.put("Смирнов8", dateFormat.parse("MAY 1 2012"));
        map.put("Смирнов9", dateFormat.parse("MAY 1 2012"));
        map.put("Смирнов10", dateFormat.parse("MAY 1 2012"));

        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        Iterator<Map.Entry<String, Date>> it=map.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<String, Date> pair=it.next();
            int d=pair.getValue().getMonth();
            if (d>=5 && d<=7) it.remove();
        }

    }

    public static void main(String[] args) throws ParseException
        {


    }
}
