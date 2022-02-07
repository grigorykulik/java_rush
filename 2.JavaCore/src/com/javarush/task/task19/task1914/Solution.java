package com.javarush.task.task19.task1914;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Решаем пример
В методе main подмени объект System.out написанной тобой ридер-оберткой по аналогии с лекцией.
Твоя ридер-обертка должна выводить на консоль решенный пример.
Вызови готовый метод printSomething(), воспользуйся testString.
Верни переменной System.out первоначальный поток.

Возможные операции: + - *
Шаблон входных данных и вывода: a [знак] b = c
Отрицательных и дробных чисел, унарных операторов - нет.

Пример вывода:
3 + 6 = 9


Требования:
1.	Класс Solution должен содержать класс TestString.
2.	Класс Solution должен содержать публичное статическое поле testString типа TestString, которое сразу проинициализировано.
3.	Класс TestString должен содержать публичный void метод printSomething().
4.	Метод printSomething() класса TestString должен выводить на экран строку &quot;3 + 6 = &quot;.
5.	Метод main(String[] args) класса Solution должен создавать поток PrintStream (используй PrintStream c параметром конструктора ByteArrayOutputStream).
6.	Метод main(String[] args) класса Solution должен подменять и восстанавливать поток вывода в консоль объекта System.out.
7.	Метод main(String[] args) класса Solution должен вызывать метод printSomething(),объекта testString.
8.	Метод main(String[] args) класса Solution должен модифицировать строку выведенную методом printSomething() согласно заданию, и выводить её в консоль.
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        testString.printSomething();
        System.setOut(consoleStream);

        String[] parts = outputStream.toString().split(" ");

        int res = 0;
        Integer x = Integer.parseInt(parts[0]);
        Integer y = Integer.parseInt(parts[2]);

        switch (parts[1]) {
            case "+":
                res = x + y;
                break;
            case "-":
                res = x - y;
                break;
            case "*":
                res = x * y;
                break;
        }

        System.out.println(x + " " + parts[1] + " " + y + " = " + res);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

