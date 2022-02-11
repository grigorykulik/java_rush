package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human gf1=new Human("gf1", true, 94);
        Human gm1=new Human("gm1", false, 94);

        Human f1=new Human("f1", true, 30, gf1, gm1);

        Human gf2=new Human("gf2", true, 90);
        Human gm2=new Human("gm1", false, 90);

        Human m1=new Human("m1", false, 30, gf2, gm2);

        Human c1=new Human("c1", true, 10, f1, m1);
        Human c2=new Human("c2", true, 10, f1, m1);
        Human c3=new Human("c3", true, 10, f1, m1);

        System.out.println(gf1.toString());
        System.out.println(gm1.toString());
        System.out.println(gf2.toString());
        System.out.println(gm2.toString());
        System.out.println(f1.toString());
        System.out.println(m1.toString());
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());
    }

    public static class Human {
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        public Human(String name, boolean sex, int age) {
            this.name=name;
            this.sex=sex;
            this.age=age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name=name;
            this.sex=sex;
            this.age=age;
            this.father=father;
            this.mother=mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}