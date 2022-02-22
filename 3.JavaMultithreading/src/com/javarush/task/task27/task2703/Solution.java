package com.javarush.task.task27.task2703;

/* 
Создаем deadlock
*/

public class Solution {
    static class Friend {
        private final String name;

        public Friend(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public synchronized void bow(com.javarush.task.task27.task2703.Solution.Friend bower) {
            System.out.format("%s: %s"
                            + " bowed to me!%n",
                    this.name, bower.getName());
            bower.bowBack(this);
        }

        public synchronized void bowBack(com.javarush.task.task27.task2703.Solution.Friend bower) {
            System.out.format("%s: %s"
                            + " bowed back to me!%n",
                    this.name, bower.getName());
        }
    }

    public static void main(String[] args) {
        final com.javarush.task.task27.task2703.Solution.Friend alphonse =
                new com.javarush.task.task27.task2703.Solution.Friend("Alphonse");
        final com.javarush.task.task27.task2703.Solution.Friend gaston =
                new com.javarush.task.task27.task2703.Solution.Friend("Gaston");
        new Thread(new Runnable() {
            public void run() {
                alphonse.bow(gaston);
            }
        }).start();
        new Thread(new Runnable() {
            public void run() {
                gaston.bow(alphonse);
            }
        }).start();
    }
}
