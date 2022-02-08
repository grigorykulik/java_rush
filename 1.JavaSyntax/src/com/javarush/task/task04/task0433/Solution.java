package com.javarush.task.task04.task0433;

/* 
Гадание на долларовый счет
*/

public class Solution {
    public static void main(String[] args) {
        int counter1=10;

        while (counter1!=0) {
            int counter2=10;
            while (counter2!=0) {
                System.out.print("S");
                counter2--;
            }
            System.out.println();
            counter1--;
        }
    }
}
