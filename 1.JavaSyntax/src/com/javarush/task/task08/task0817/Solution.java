package com.javarush.task.task08.task0817;

import java.util.*;

/* 
Removing duplicates from a map
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> m=new HashMap<>();

        for (int i=0; i<10; i++) {
            m.put("lastName"+i, "firstName"+i);
        }

//        m.put("lastName20", "firstName5");

        return m;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        List<String> values=new ArrayList<>();
        Set<String> duplicates=new HashSet<>();
        Set<String> s1=new HashSet<>();

        Iterator<Map.Entry<String, String>> it=map.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<String, String> me=it.next();
            values.add(me.getValue());
        }

        //Finding duplicates in a list
        for (String s:values) {
            if (!s1.add(s)) {
                duplicates.add(s);
            }
        }

        for (String s:duplicates) {
            removeItemFromMapByValue(map, s);
        }

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Iterator<Map.Entry<String, String>> it2=map.entrySet().iterator();

        while (it2.hasNext()) {
            Map.Entry<String, String> entry= it2.next();
            if (value.equals(entry.getValue())) it2.remove();
        }
    }

    public static void main(String[] args) {
//        Map<String, String> m=createMap();
//
//        for (Map.Entry<String, String> me:m.entrySet()) {
//            System.out.println(me.getKey()+" "+me.getValue());
//        }
//
//        removeTheFirstNameDuplicates(m);
//
//        System.out.println();

//        for (Map.Entry<String, String> me:m.entrySet()) {
//            System.out.println(me.getKey()+" "+me.getValue());
//        }
    }
}
