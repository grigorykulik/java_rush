package com.javarush.task.task16.task1622;

/* 
Последовательные выполнения нитей Ӏ Java Core: 6 уровень, 13 лекция
*/

public class Solution {

    // заводим какой-то непонятный счетчик
    public volatile static int COUNT = 4;

    public static void main(String[] args) throws InterruptedException {

        // в цикле создаем объекты класса SleepingThread
        for (int i = 0; i < COUNT; i++) {
            new SleepingThread().join();
        }
    }

    public static class SleepingThread extends Thread {
        private static volatile int threadCount = 0;
        private volatile int countdownIndex = COUNT;

        // Конструктор. Сначала вызываем конструктор родителя и передаем ему в качестве аргумента
        // значение поля threadCount. После этого запускаем метод
        public SleepingThread() throws InterruptedException {
            super(String.valueOf(++threadCount));
            start();
        }


        public void run() {
            while (true) {
                System.out.println(this);
                if (--countdownIndex == 0) return;

                if (Thread.interrupted()) {
                    System.out.println("Нить прервана");
                }

                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }


        }

        public String toString() {
            return "#" + getName() + ": " + countdownIndex;
        }
    }
}
