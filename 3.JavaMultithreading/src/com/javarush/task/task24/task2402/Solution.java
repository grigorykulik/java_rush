package com.javarush.task.task24.task2402;

/* 
Cloneable
*/

public class Solution {
    public static void main(String[] args) throws CloneNotSupportedException {
        com.javarush.task.task24.task2402.Solution.Test1 test1 = new com.javarush.task.task24.task2402.Solution.Test1();
        test1.clone();

        com.javarush.task.task24.task2402.Solution.Test2 test2 = new com.javarush.task.task24.task2402.Solution.Test2();
        test2.clone(new com.javarush.task.task24.task2402.Solution.Test2());

        com.javarush.task.task24.task2402.Solution.Test3 test3 = new com.javarush.task.task24.task2402.Solution.Test3();
        test3.c1one();

        com.javarush.task.task24.task2402.Solution.Test4 test4 = new com.javarush.task.task24.task2402.Solution.Test4();
        test4.clone();
    }

    public static class Test1 implements Cloneable {
        protected com.javarush.task.task24.task2402.Solution.Test1 clone() throws CloneNotSupportedException {
            return (com.javarush.task.task24.task2402.Solution.Test1) super.clone();
        }
    }

    public static class Test2 extends com.javarush.task.task24.task2402.Solution.Test1 {
        public com.javarush.task.task24.task2402.Solution.Test2 clone(com.javarush.task.task24.task2402.Solution.Test2 test2) throws CloneNotSupportedException {
            return (com.javarush.task.task24.task2402.Solution.Test2) test2.clone();
        }
    }

    public static class Test3 {
        protected Object c1one() throws CloneNotSupportedException {
            return new com.javarush.task.task24.task2402.Solution.Test3();
        }
    }

    public static class Test4 extends com.javarush.task.task24.task2402.Solution.Test3 implements Cloneable {
        protected Object c1one() throws CloneNotSupportedException {
            return super.c1one();
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }
}
