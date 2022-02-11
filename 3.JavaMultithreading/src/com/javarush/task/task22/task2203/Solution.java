package com.javarush.task.task22.task2203;

/* 
Между табуляциями
*/

public class Solution {
    public static String getPartOfString(String string) throws TooShortStringException {
        try {
            int firstTab = string.indexOf("\t");
            StringBuilder sb = new StringBuilder();
            int tabCounter = 1;

            for (int i = firstTab + 1; i < string.length(); i++) {
                if (string.charAt(i) == '\t') {
                    tabCounter++;
                    break;
                } else {
                    sb.append(string.charAt(i));
                }
            }

            if (tabCounter < 2) {
                throw new TooShortStringException();
            } else {
                return sb.toString();
            }
        } catch (NullPointerException e) {
            throw new TooShortStringException();
        }
    }

    public static class TooShortStringException extends Exception {
    }

    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString("JavaRush - лучший сервис \tобучения Java."));
    }
}
