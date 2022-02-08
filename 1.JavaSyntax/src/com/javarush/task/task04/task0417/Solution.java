package com.javarush.task.task04.task0417;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Существует ли пара?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String sa=br.readLine();
        int ia=Integer.parseInt(sa);

        String sb=br.readLine();
        int ib=Integer.parseInt(sb);

        String sc=br.readLine();
        int ic=Integer.parseInt(sc);

        if (ia==ib && ib==ic) {
            System.out.print(ia + " " + ib + " " + ic);
        }

        else if (ia==ib) {
            System.out.print(ia + " " + ib);
        }

        else if (ia==ic) {
            System.out.print(ia + " " + ic);
        }

        else if (ib==ic) {
            System.out.print(ib + " " + ic);
        }
    }
}