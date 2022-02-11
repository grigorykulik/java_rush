package com.javarush.task.task06.task0609;

/* 
Расстояние между двумя точками
*/

public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        double diffx=Math.pow((x2-x1), 2);
        double diffy=Math.pow((y2-y1), 2);
        double distance=Math.sqrt(diffx+diffy);
        return distance;
    }

    public static void main(String[] args) {

    }
}
