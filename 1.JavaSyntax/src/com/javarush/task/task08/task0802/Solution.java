package com.javarush.task.task08.task0802;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Iterator;
import java.util.Map;

/* 
Map из 10 пар
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> plants=new HashMap<>();

        plants.put("арбуз", "ягода");
        plants.put("банан", "трава");
        plants.put("вишня", "ягода");
        plants.put("груша", "фрукт");
        plants.put("дыня", "овощ");
        plants.put("ежевика", "куст");
        plants.put("жень-шень", "корень");
        plants.put("земляника", "ягода");

        plants.put("ирис", "цветок");
        plants.put("картофель", "клубень");

        Iterator<Map.Entry<String, String>> it= plants.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<String, String> pair=it.next();
            String key=pair.getKey();
            String value=pair.getValue();
            System.out.println(key+" "+"-"+" "+value);
        }

    }
}
