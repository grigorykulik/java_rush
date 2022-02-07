package com.javarush.task.task38.task3803;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/* 
Runtime исключения (unchecked exception)
*/

public class VeryComplexClass {
    public void methodThrowsClassCastException() {
        String[] strArray = new String[] { "John", "Snow" };
        ArrayList<String> strList = (ArrayList<String>) Arrays.asList(strArray);
        System.out.println("String list: " + strList);
    }

    public void methodThrowsNullPointerException() {
        System.out.print(String.valueOf(null));
    }

    public static void main(String[] args) {
        VeryComplexClass vcc = new VeryComplexClass();
        vcc.methodThrowsClassCastException();
    }
}
