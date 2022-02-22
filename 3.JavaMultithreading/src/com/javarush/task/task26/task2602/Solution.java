package com.javarush.task.task26.task2602;

import java.util.Set;
import java.util.TreeSet;

/* 
Был бы ум - будет и успех
*/

public class Solution {
    public static void main(String[] args) {
        Set<com.javarush.task.task26.task2602.Solution.Soldier> soldiers = new TreeSet<>();
        soldiers.add(new com.javarush.task.task26.task2602.Solution.Soldier("Ivanov", 170));
        soldiers.add(new com.javarush.task.task26.task2602.Solution.Soldier("Petrov", 180));
        soldiers.add(new com.javarush.task.task26.task2602.Solution.Soldier("Sidorov", 175));

        for (com.javarush.task.task26.task2602.Solution.Soldier soldier : soldiers) {
            System.out.println(soldier.name);
        }
    }

    public static class Soldier implements Comparable<com.javarush.task.task26.task2602.Solution.Soldier> {
        private String name;
        private int height;

        public Soldier(String name, int height) {
            this.name = name;
            this.height = height;
        }

        @Override
        public int compareTo(com.javarush.task.task26.task2602.Solution.Soldier o) {
            return o.height - height;
        }
    }
}
