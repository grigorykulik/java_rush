package com.javarush.task.task23.task2305;

/* 
Inner
*/

public class Solution {
    public com.javarush.task.task23.task2305.Solution.InnerClass[] innerClasses = new com.javarush.task.task23.task2305.Solution.InnerClass[2];

    public class InnerClass {
    }

    public static com.javarush.task.task23.task2305.Solution[] getTwoSolutions() {
        com.javarush.task.task23.task2305.Solution[] result = new com.javarush.task.task23.task2305.Solution[2];

        com.javarush.task.task23.task2305.Solution solution = new com.javarush.task.task23.task2305.Solution();
        solution.innerClasses[0] = solution.new InnerClass();
        solution.innerClasses[1] = solution.new InnerClass();

        com.javarush.task.task23.task2305.Solution solution2 = new com.javarush.task.task23.task2305.Solution();
        solution2.innerClasses[0] = solution.new InnerClass();
        solution2.innerClasses[1] = solution.new InnerClass();

        result[0] = solution;
        result[1] = solution2;

        return result;
    }

    public static void main(String[] args) {

    }
}
