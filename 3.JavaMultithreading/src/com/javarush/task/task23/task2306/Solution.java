package com.javarush.task.task23.task2306;

/* 
Inner 2
*/

public class Solution {
    private String country;
    private String city;

    public Solution(String country, String city) {
        this.country = country;
        this.city = city;
    }

    public com.javarush.task.task23.task2306.Solution.SuperUser getTrickyUser(String name) {
        return new com.javarush.task.task23.task2306.Solution.SuperUser(name);
    }

    public String getUserDescription(String name) {
        return getTrickyUser(name).getDescription();
    }

    private class SuperUser {
        private String name;

        public SuperUser(String name) {
            this.name = name;
        }

        //доступ к этому методу возможен только внутри класса Solution, т.к. модификатор класса private
        public String getDescription() {
            return String.format("My name is %s. I'm from %s in %s.", this.name, com.javarush.task.task23.task2306.Solution.this.city, com.javarush.task.task23.task2306.Solution.this.country);
        }
    }

    public static void main(String[] args) {
        com.javarush.task.task23.task2306.Solution solution = new com.javarush.task.task23.task2306.Solution("the United States", "Seattle");
        //внутри класса Solution (а сейчас мы внутри) к методу getDescription можно обращаться обоими способами
        System.out.println(solution.getTrickyUser("George").getDescription());
        //а из любого другого внешнего класса только так:
        System.out.println(solution.getUserDescription("George"));
    }
}
