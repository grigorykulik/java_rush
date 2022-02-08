package com.javarush.task.task04.task0432;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Хорошего много не бывает
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String ss=br.readLine();

        String sn=br.readLine();
        int in=Integer.parseInt(sn);

        if (in<=0) {
            return;
        }
        else
            {
                while (in != 0)
                    {
                        System.out.println(ss);
                        in--;
                    }
            }

    }
}
