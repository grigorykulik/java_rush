package com.javarush.task.task16.task1633;

/* 
Отдебажим все на свете
*/

public class Solution {

    // создаем обработчик исключений
    public static Thread.UncaughtExceptionHandler handler = new OurUncaughtExceptionHandler();

    public static void main(String[] args) {

        // создаем объект типа commonThread, который наследуется от Thread
        // передаем в качестве параметра обработчик исключений
        TestedThread commonThread = new TestedThread();

        // создаем два потока, передаем в них наш объект
        Thread threadA = new Thread(commonThread, "Нить 1");
        Thread threadB = new Thread(commonThread, "Нить 2");

        Thread.setDefaultUncaughtExceptionHandler(handler);

        // запускаем потоки
        threadA.start();
        threadB.start();

        // прерываем потоки
        threadA.interrupt();
        threadB.interrupt();
    }



    public static class TestedThread extends Thread {
        public TestedThread() {
            start();
        }


        public void run() {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException("My exception message");
            }
        }
    }

    public static class OurUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
        @Override
        public void uncaughtException(Thread t, Throwable e) {
            System.out.println(t.getName() + ": " + e.getMessage());
        }
    }
}
