package com.javarush.task.task16.task1603;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Список и нити
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        Thread t1 = new Thread(new SpecialThread());
        Thread t2 = new Thread(new SpecialThread());
        Thread t3 = new Thread(new SpecialThread());
        Thread t4 = new Thread(new SpecialThread());
        Thread t5 = new Thread(new SpecialThread());

        list.addAll(Arrays.asList(t1, t2, t3, t4, t5));
    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}
