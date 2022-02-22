package com.javarush.task.task10.task1019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> m=new HashMap();
        Set<String> s=new HashSet<>();

        do
            {
                String sId=reader.readLine();

                if (sId.equals("")) {
                    break;
                }

                int id = Integer.parseInt(sId);

                String name = reader.readLine();

                if (s.add(name))
                    {
                        m.put(name, id);
                    }
            }

            while (true);

        Iterator<Map.Entry<String, Integer>> it=m.entrySet().iterator();

        while (it.hasNext())
            {
                Map.Entry<String, Integer> pair = it.next();
                String key=pair.getKey();
                int value=pair.getValue();

                System.out.println(value + " " + key);
            }
    }
}
