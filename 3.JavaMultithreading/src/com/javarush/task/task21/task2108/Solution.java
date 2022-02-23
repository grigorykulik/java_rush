package com.javarush.task.task21.task2108;

/* 
Клонирование растений
*/

public class Solution {
    public static void main(String[] args) {
        com.javarush.task.task21.task2108.Solution.Tree tree = new com.javarush.task.task21.task2108.Solution.Tree("willow", new String[]{"s1", "s2", "s3", "s4"});
        com.javarush.task.task21.task2108.Solution.Tree clone = null;
        try {
            clone = (com.javarush.task.task21.task2108.Solution.Tree) tree.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println(tree);
        System.out.println(clone);

        System.out.println(tree.branches);
        System.out.println(clone.branches);
    }

    public static class Plant {
        private String name;

        public Plant(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static class Tree extends com.javarush.task.task21.task2108.Solution.Plant implements Cloneable {
        private String[] branches;

        public Tree(String name, String[] branches) {
            super(name);
            this.branches = branches;
        }

        public String[] getBranches() {
            return branches;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return new com.javarush.task.task21.task2108.Solution.Tree(getName(), branches == null ? null : branches.clone());
        }
    }
}
