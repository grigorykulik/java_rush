package com.javarush.task.task28.task2801;

/* 
Осваиваем switch
*/

public class Solution {
    public enum E1 {A, B, C, Y}

    public enum E2 {D, E, F}

    public enum E3 {D, E, F}

    public static void main(String[] args) {
        com.javarush.task.task28.task2801.Solution.switchTest(com.javarush.task.task28.task2801.Solution.E1.C);
        com.javarush.task.task28.task2801.Solution.switchTest(com.javarush.task.task28.task2801.Solution.E3.D);
        com.javarush.task.task28.task2801.Solution.switchTest(com.javarush.task.task28.task2801.Solution.E2.D);
        /* output
        it's E1.C
        undefined
        it's E2.D
         */
    }

    public static void switchTest(Enum obj) {
        String className = obj.getClass().getSimpleName();
        switch (className) {
            case "E1":
            case "E2":
                System.out.println("it's " + className + "." + obj.name());
                break;
            default:
                System.out.println("undefined");
                break;
        }
    }
}
