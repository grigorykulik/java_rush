package com.javarush.task.task10.task1011;

/* 
Большая зарплата
*/

public class Solution {
    public static void main(String[] args) {
        String text = "Я не хочу изучать Java, я хочу большую зарплату";
        System.out.println(text);

        for (int i=0; i<39; i++) {
            text=text.substring(1);
            System.out.println(text);
        }
    }

}

