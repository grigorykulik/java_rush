package com.javarush.task.task08.task0818;

import java.util.*;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        Map<String, Integer> m=new HashMap<>();

        for (int i=0; i<10; i++) {
            m.put("lastName"+i, i*100);
        }

        return m;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        List<Integer> values=new ArrayList<>();

        Iterator<Map.Entry<String, Integer>> it=map.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<String, Integer> me=it.next();
            if (me.getValue()<500) {
                    it.remove();
                }
        }

    }

    public static void main(String[] args) {

    }
}