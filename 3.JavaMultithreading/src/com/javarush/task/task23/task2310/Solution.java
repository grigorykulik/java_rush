package com.javarush.task.task23.task2310;

/* 
Напряги извилины!
*/

public class Solution {
    private String name;

    Solution(String name) {
        this.name = name;
    }

    protected String getName() {
        return name;
    }

    private void sout() {
        new com.javarush.task.task23.task2310.Solution("The Darkside Hacker") {
            void printName() {
                System.out.println(getName());
            }
        }.printName();
    }

    public static void main(String[] args) {
        new com.javarush.task.task23.task2310.Solution("Риша").sout();
    }
}
