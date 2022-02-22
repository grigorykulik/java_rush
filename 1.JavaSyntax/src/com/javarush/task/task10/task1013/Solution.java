package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String firstName;
        private String lastName;
        private int age;
        private Human father;
        private Human mother;
        private Human child;

        //1
        public Human(String firstName) {
            this.firstName=firstName;
        }

        //2
        public Human() {
        }

        //3
        public Human(String firstName, String lastName) {
            this.lastName=lastName;
            this.firstName=firstName;
        }

        //4
        public Human(int age) {
            this.age=age;
        }

        //5
        public Human(String firstName, int age) {
            this.firstName=firstName;
            this.age=age;
        }

        //6
        public Human(String firstName, String lastName, int age) {
            this.age=age;
            this.firstName=firstName;
            this.lastName=lastName;
        }

        //7
        public Human(Human father) {
            this.father=father;
        }

        //8
        public Human(Human father, Human mother){
            this.father=father;
            this.mother=mother;
        }

        //9
        public Human(Human father, Human mother, Human child){
            this.child=child;
            this.father=father;
            this.mother=mother;
        }

        //10
        public Human(String firstName, Human father) {
            this.firstName=firstName;
            this.father=father;
        }

    }
}
