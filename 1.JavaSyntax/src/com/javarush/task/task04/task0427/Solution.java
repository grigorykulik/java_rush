package com.javarush.task.task04.task0427;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Описываем числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String sn=br.readLine();
        int in=Integer.parseInt(sn);

        if (isInInterval(in)) {
            if (isEven(in) && isOneDigit(in))
                System.out.println("четное однозначное число");
            else if (!isEven(in) && isOneDigit(in))
                System.out.println("нечетное однозначное число");
            else if (isEven(in) && isTwoDigit(in))
                System.out.println("четное двузначное число");
            else if (!isEven(in) && isTwoDigit(in))
                System.out.println("нечетное двузначное число");
            else if (isEven(in) && isThreeDigit(in))
                System.out.println("четное трехзначное число");
            else if (!isEven(in) && isThreeDigit(in))
                System.out.println("нечетное трехзначное число");
        }

        else return;
    }

    public static boolean isInInterval(int i) {
        return (i>=1 && i<=999);
    }

    public static boolean isEven(int i) {
        return (i%2==0);
    }

    public static boolean isOneDigit(int i) {
        return (i<10);
    }

    public static boolean isTwoDigit(int i) {
        return (i>=10 && i<100);
    }

    public static boolean isThreeDigit(int i) {
        return (i>=100 && i<=999);
    }
}
