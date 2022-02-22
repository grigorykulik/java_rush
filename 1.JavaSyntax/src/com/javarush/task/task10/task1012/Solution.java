package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String line = reader.readLine();
            list.add(line.toLowerCase());
        }

        ArrayList<Integer> al=new ArrayList<>();
        for (int i=0; i<33; i++) {
            al.add(0);
        }

        for (String s:list) {
            int counter=0;
            for (Character c:alphabet) {
                long count=s.chars().filter(ch->ch==c).count();
                count=count+al.get(counter);
                al.set(counter, (int) count);
                counter++;
            }

        }

        int counter=0;
        for (Character c:alphabet) {
            System.out.println(c + " " + al.get(counter));
            counter++;
        }
    }
}