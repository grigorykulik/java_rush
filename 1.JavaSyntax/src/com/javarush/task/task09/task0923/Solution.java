package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        ArrayList<Character> firstLine=new ArrayList<>();
        ArrayList<Character> secondLine=new ArrayList<>();

        Scanner sc=new Scanner(new InputStreamReader(System.in));

        String line=sc.nextLine();

        char[] chArray=line.toCharArray();

        for (char c:chArray) {
            if (isVowel(c)) {
                firstLine.add(c);
            }

            else if (c!=' ') {
                secondLine.add(c);
            }
        }

        for (Character c:firstLine) {
            System.out.print(c+" ");
        }

        System.out.println();

        for (Character c:secondLine) {
            System.out.print(c + " ");
        }
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char character) {
        character = Character.toLowerCase(character);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char vowel : vowels) {  // ищем среди массива гласных
            if (character == vowel) {
                return true;
            }
        }
        return false;
    }
}