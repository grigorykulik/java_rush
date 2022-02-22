package com.javarush.task.task30.task3005;

import java.util.ArrayList;
import java.util.List;

/* 
Такие хитрые исключения!
*/

public class Solution {
    public static void main(String[] args) {
        checkAFlag(new com.javarush.task.task30.task3005.Solution.D());
    }

    public static void checkAFlag(com.javarush.task.task30.task3005.Solution.D d) {
        if (d != null && d.cs != null && d.cs.size() > 0
                && d.cs.get(0).bs != null && d.cs.get(0).bs.size() > 0
                && d.cs.get(0).bs.get(0).as != null && d.cs.get(0).bs.get(0).as.size() > 0
                && d.cs.get(0).bs.get(0).as.get(0).flag) {
            System.out.println("A's flag is true");
        } else { //all other cases
            System.out.println("Oops!");
        }
    }

    static class A {
        boolean flag = true;
    }

    static class B {
        List<com.javarush.task.task30.task3005.Solution.A> as = new ArrayList<>();

        {
            as.add(new com.javarush.task.task30.task3005.Solution.A());
        }
    }

    static class C {
        List<com.javarush.task.task30.task3005.Solution.B> bs = new ArrayList<>();

        {
            bs.add(new com.javarush.task.task30.task3005.Solution.B());
        }
    }

    static class D {
        List<com.javarush.task.task30.task3005.Solution.C> cs = new ArrayList<>();

        {
            cs.add(new com.javarush.task.task30.task3005.Solution.C());
        }
    }
}
