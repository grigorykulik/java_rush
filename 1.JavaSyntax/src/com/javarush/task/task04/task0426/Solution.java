package com.javarush.task.task04.task0426;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Ярлыки и числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String sn=br.readLine();
        int in=Integer.parseInt(sn);

        if (in==0) {
            System.out.println("ноль");
        }

        else if (isEven(in) && !isNegative(in)) {
            System.out.println("положительное четное число");
        }

        else if (!isEven(in) && !isNegative(in)) {
            System.out.println("положительное нечетное число");
        }

        else if (isEven(in) && isNegative(in)) {
            System.out.println("отрицательное четное число");
        }

        else if (!isEven(in) && isNegative(in)) {
            System.out.println("отрицательное нечетное число");
        }
    }

    public static boolean isNegative(int i) {
        return i<0;
    }

    public static boolean isEven(int i) {
        return (i%2==0);
    }
}
