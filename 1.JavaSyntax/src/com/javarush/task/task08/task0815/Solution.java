package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> m=new HashMap<>();

        for (int i=0; i<10; i++) {
            m.put("lastName"+i, "firstName"+i);
        }

        return m;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        Iterator<Map.Entry<String, String>> it=map.entrySet().iterator();
        int counter=0;

        for (Map.Entry<String,String> pair:map.entrySet())
            {
                String mName=pair.getValue();
                if (mName.equals(name)) counter++;
            }

        return counter;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int counter=0;

        for (Map.Entry<String, String> pair:map.entrySet())
            {
                String mName=pair.getKey();
                if (mName.equals(lastName)) counter++;
            }

        return counter;

    }

    public static void main(String[] args) {

    }
}
