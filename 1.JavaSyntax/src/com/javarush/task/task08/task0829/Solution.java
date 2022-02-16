package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, String> map=new HashMap<>();

        while (true) {
            String city = reader.readLine();
            if (city.isEmpty()) {
                break;
            }

            String family=reader.readLine();

            while (city.isEmpty()) {
                System.out.println("Enter the city");
            }

            map.put(city, family);
        }

        // Read the house number
        String city = reader.readLine();

        if (!city.isEmpty()) {
            Iterator<Map.Entry<String, String>> it=map.entrySet().iterator();

            while (it.hasNext()) {
                Map.Entry<String, String> pair=it.next();
                String cit=pair.getKey();
                if (cit.equals(city)) {
                    System.out.println(pair.getValue());
                    break;
                }
            }
        }
    }
}
