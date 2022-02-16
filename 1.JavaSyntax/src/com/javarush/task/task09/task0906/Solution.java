package com.javarush.task.task09.task0906;

/* 
Логирование стек-трейса
*/

public class Solution {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String text) {
        StackTraceElement[] ste=Thread.currentThread().getStackTrace();

        System.out.print(ste[2].getClassName()+": "+ste[2].getMethodName()+": "+text);
    }
}
