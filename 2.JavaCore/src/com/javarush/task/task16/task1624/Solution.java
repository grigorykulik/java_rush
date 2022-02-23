package com.javarush.task.task16.task1624;

/* 
Последовательные выполнения нитей Ӏ Java Core: 6 уровень, 13 лекция
*/

public class Solution {
    // Статическое поле. Новый поток
    public static MyThread t = new MyThread();

    // Поле с сообщением
    static String message = "inside main ";

    public static void main(String a[]) throws Exception {
        // Запускаем поток из строки 8
        t.start();
        t.join();

        // в цикле печатаем сообщение + номер и
        for (int i = 0; i < 10; i++) {
            System.out.println(message + i);
            sleep();
        }
    }

    public static void sleep() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
        }
    }


    static class MyThread extends Thread {
        String message = "inside MyThread ";

        // метод ран класса MyThread.
        // Каждый раз, когда запускаем поток, 10 раз печатаем сообщение "inside MyThread "
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println(message + i);
                Solution.sleep();
            }
        }
    }
}