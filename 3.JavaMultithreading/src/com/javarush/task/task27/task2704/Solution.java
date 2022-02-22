package com.javarush.task.task27.task2704;

/* 
Модификаторы и deadlock
*/

public class Solution {
    private final String field;

    public Solution(String field) {
        this.field = field;
    }

    public String getField() {
        return field;
    }

    public synchronized void sout(com.javarush.task.task27.task2704.Solution solution) {
        System.out.format("111:  %s: %s %n", this.field, solution.getField());
        solution.sout2(this);
    }

    public synchronized void sout2(com.javarush.task.task27.task2704.Solution solution) {
        System.out.format("222:  %s: %s %n", this.field, solution.getField());
        solution.sout(this);
    }

    public static void main(String[] args) {
        final com.javarush.task.task27.task2704.Solution solution = new com.javarush.task.task27.task2704.Solution("first");
        final com.javarush.task.task27.task2704.Solution solution2 = new com.javarush.task.task27.task2704.Solution("second");
        new Thread(new Runnable() {
            public void run() {
                solution.sout(solution2);
            }
        }).start();

        new Thread(new Runnable() {
            public void run() {
                solution2.sout(solution);
            }
        }).start();

    }
}
