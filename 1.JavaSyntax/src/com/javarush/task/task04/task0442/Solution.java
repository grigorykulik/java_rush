package com.javarush.task.task04.task0442;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int sum=0;

        while (true) {
            String snumber = br.readLine();
            int inumber=Integer.parseInt(snumber);

            sum=sum+inumber;
            if (inumber==-1){
                System.out.println(sum);
                break;
            }
        }
    }
}
