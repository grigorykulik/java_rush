package com.javarush.task.task30.task3011;

/* 
Сделай одно изменение кода
*/

public class Solution {
    public static void main(String[] args) {
        com.javarush.task.task30.task3011.Solution solution = new com.javarush.task.task30.task3011.Solution();
        solution.doSmth(new com.javarush.task.task30.task3011.Solution.A(), null, null);
    }

    public void doSmth(com.javarush.task.task30.task3011.Solution.A a, com.javarush.task.task30.task3011.Solution.B b, com.javarush.task.task30.task3011.Solution.C c) {
        try {
            if (a != null && a.getName() != null) {
                //do nothing
            }
        } catch (NullPointerException e) {
            a = new com.javarush.task.task30.task3011.Solution.A();
            a.setName("A");
        }
        try {
            if (a != null && a.getName() == null) {
                a.setName("A");
            }
        } catch (NullPointerException e) {
        }
        if (a == null) {
            a = new com.javarush.task.task30.task3011.Solution.A();
            a.setName("A");
        }
        try {
            if (b != null && b.getName() != null) {
                //do nothing
            }
        } catch (NullPointerException e) {
            b = new com.javarush.task.task30.task3011.Solution.B();
            b.setName("B");
        }
        try {
            if (b != null && b.getName() == null) {
                b.setName("B");
            }
        } catch (NullPointerException e) {
        }
        if (b == null) {
            b = new com.javarush.task.task30.task3011.Solution.B();
            b.setName("B");
        }
        try {
            if (c != null & c.getName() != null) {
            }
        } catch (NullPointerException e) {
            c = new com.javarush.task.task30.task3011.Solution.C();
            c.setName("C");
        }
        try {
            if (c != null && c.getName() == null) {
                c.setName("C");
            }
        } catch (NullPointerException e) {
        }
        if (c == null) {
            c = new com.javarush.task.task30.task3011.Solution.C();
            c.setName("null");
        }
        System.out.print(a.getName());
        System.out.print(b.getName());
        System.out.print(c.getName());
    }

    static class A {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    static class B {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    static class C {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
