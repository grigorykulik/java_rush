package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int counter=0;
        double sum=0;

        while (true) {
            String sNumber=br.readLine();
            int iNumber=Integer.parseInt(sNumber);

            if (iNumber==-1)
                {
                    System.out.println(sum/counter);
            break;
        }


        counter=counter+1;
        sum=sum+iNumber;


        }

    }
}

