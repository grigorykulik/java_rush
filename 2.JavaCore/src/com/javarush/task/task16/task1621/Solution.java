package com.javarush.task.task16.task1621;

/* 
Thread.currentThread - всегда возвращает текущую нить
*/

public class Solution {

    // какое-то непонятное статическое поле
    static int count = 5;

    public static void main(String[] args) throws InterruptedException {

        // создаем объект класса ThreadNamePrinter, который наследуется от Thread
        ThreadNamePrinter tnp = new ThreadNamePrinter();

        // запускаем поток
        tnp.start();

        // в цикле вызываем метод printMsg(). Причем вызываем метод printMsg() из главного потока
        for (int i = 0; i < count; i++) {
            tnp.printMsg();
        }
    }


    public static class ThreadNamePrinter extends Thread {
        public void run() {
            for (int i = 0; i < count; i++) {
                try {
                    // вызываем метод printMsg() из дочернего потока
                    printMsg();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        public void printMsg() throws InterruptedException {
            Thread t = Thread.currentThread();//присвой переменной t текущую нить
            String name = t.getName();
            System.out.println("Name=" + name);

            Thread.sleep(1);
        }
    }
}
