package com.javarush.task.task08.task0824;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {
        //Grandfather 1
        Human gf1=new Human();
        gf1.name="Grandfather1";
        gf1.sex=true;
        gf1.age=90;

        //Father
        Human f1=new Human();
        f1.name="Father 1";
        f1.sex=true;
        f1.age=30;

        gf1.children.add(f1);

        //Grandfather 2
        Human gf2=new Human();
        gf2.name="Grandfather2";
        gf2.sex=true;
        gf2.age=90;

        //Mother
        Human m1=new Human();
        m1.name="Mother 1";
        m1.sex=false;
        m1.age=30;

        gf2.children.add(m1);


        //Grandmother 1
        Human gm1=new Human();
        gm1.name="Grandmother1";
        gm1.sex=false;
        gm1.age=90;
        gm1.children.add(f1);

        //Grandmother 2
        Human gm2=new Human();
        gm2.name="Grandmother1";
        gm2.sex=false;
        gm2.age=90;
        gm2.children.add(m1);

        //Children
        Human ch1=new Human();
        ch1.name="Child1";
        ch1.sex=true;
        ch1.age=10;
        f1.children.add(ch1);
        m1.children.add(ch1);

        Human ch2=new Human();
        ch2.name="Child2";
        ch2.sex=true;
        ch2.age=10;
        f1.children.add(ch2);
        m1.children.add(ch2);

        Human ch3=new Human();
        ch3.name="Child3";
        ch3.sex=true;
        ch3.age=10;
        f1.children.add(ch3);
        m1.children.add(ch3);

        System.out.println(gf1.toString());
        System.out.println(gf2.toString());
        System.out.println(gm1.toString());
        System.out.println(gm2.toString());
        System.out.println(f1.toString());
        System.out.println(m1.toString());
        System.out.println(ch1.toString());
        System.out.println(ch2.toString());
        System.out.println(ch3.toString());
    }

    public static class Human {
        public String name;
        public boolean sex;
        public int age;
        public ArrayList<Human> children=new ArrayList<>();

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
