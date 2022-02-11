package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        return s;
    }

    public static int readInt() throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int i=Integer.parseInt(br.readLine());
        return i;
    }

    public static double readDouble() throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        double d=Double.parseDouble(br.readLine());
        return d;
    }

    public static boolean readBoolean() throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        boolean b=Boolean.parseBoolean(br.readLine());
        return b;
    }

    public static void main(String[] args) throws Exception {

    }
}
