package com.javarush.task.task04.task0413;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
День недели
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String sN=br.readLine();
        Integer iN=Integer.parseInt(sN);

        if (iN==1) {
            System.out.println("понедельник");
        }

        else if (iN==2) {
            System.out.println("вторник");
        }

        else if (iN==3) {
            System.out.println("среда");
        }

        else if (iN==4) {
            System.out.println("четверг");
        }

        else if (iN==5) {
            System.out.println("пятница");
        }

        else if (iN==6) {
            System.out.println("суббота");
        }

        else if (iN==7) {
            System.out.println("воскресенье");
        }

        else
            System.out.println("такого дня недели не существует");
    }
}