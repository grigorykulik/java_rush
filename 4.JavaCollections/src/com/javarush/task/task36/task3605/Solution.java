package com.javarush.task.task36.task3605;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Comparator;
import java.util.Locale;
import java.util.TreeSet;
import java.util.function.Predicate;
import java.util.stream.Stream;

/* 
Использование TreeSet
*/

/**
 * Использование TreeSet
 * <p>
 * Отсортируй буквы по алфавиту и выведи на экран первые 5 различных букв в одну строку без разделителей.
 * Если файл1 содержит менее 5 различных букв, то выведи их все. Буквы различного регистра считаются одинаковыми.
 * Регистр выводимых букв не влияет на результат. Закрой потоки. Пример 1 данных входного файла:
 * zBk yaz b-kN
 * <p>
 * Пример 1 вывода:
 * abkny
 * <p>
 * Пример 2 данных входного файла:
 * caAC
 * A, aB? bB
 * <p>
 * Пример 2 вывода:
 * abc
 * <p>
 * Подсказка: использовать TreeSet
 * Requirements:
 * 1. Программа должна использовать класс TreeSet.
 * 2. У объекта типа TreeSet вызови метод add для добавления элементов.
 * 3. Программа должна выводить результат на экран.
 * 4. Вывод программы должен соответствовать условию задачи.
 */

public class Solution {
    public static void main(String[] args) throws IOException {
        TreeSet<String> tree = new TreeSet<>();

        try (FileReader fr = new FileReader(args[0])) {
            while (fr.ready()) {
                String c = String.valueOf((char) fr.read());
                tree.add(c.toLowerCase(Locale.ROOT));
            }

            Predicate<String> predicate = s -> (s.charAt(0) >= 'A' && s.charAt(0) <= 'Z') || (s.charAt(0) >= 'a' && s.charAt(0) <= 'z');
            Stream<String> stream = tree.size() < 5 ?
                    tree.stream().filter(predicate) : tree.stream().filter(predicate).limit(5);
            stream.forEach(System.out::println);
        }
    }
}

