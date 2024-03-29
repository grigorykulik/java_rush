package com.javarush.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Закрепляем паттерн Singleton
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    {
        try {
            readKeyFromConsoleAndInitPlanet();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readKeyFromConsoleAndInitPlanet() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        switch (s) {
            case "earth":
                thePlanet = Earth.getInstance();
                break;
            case "moon":
                thePlanet = Moon.getInstance();
                break;
            case "sun":
                thePlanet = Sun.getInstance();
                break;
            default:
                thePlanet = null;
        }
    }
}
