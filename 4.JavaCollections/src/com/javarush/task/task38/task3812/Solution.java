package com.javarush.task.task38.task3812;

/* 
Обработка аннотаций
*/

public class Solution {
    public static void main(String[] args) {
        printFullyQualifiedNames(com.javarush.task.task38.task3812.Solution.class);
        printFullyQualifiedNames(SomeTest.class);

        printValues(com.javarush.task.task38.task3812.Solution.class);
        printValues(SomeTest.class);
    }

    public static boolean printFullyQualifiedNames(Class c) {
        try {
            PrepareMyTest prepareMyTest = (PrepareMyTest) c.getAnnotation(PrepareMyTest.class);
            for (String fullyQualifiedName : prepareMyTest.fullyQualifiedNames()) {
                System.out.println(fullyQualifiedName);
            }
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public static boolean printValues(Class c) {
        try {
            PrepareMyTest prepareMyTest = (PrepareMyTest) c.getAnnotation(PrepareMyTest.class);
            for (Class clazz : prepareMyTest.value()) {
                System.out.println(clazz.getSimpleName());
            }
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
