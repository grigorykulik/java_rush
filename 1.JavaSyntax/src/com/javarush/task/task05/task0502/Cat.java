package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        boolean win=false;

        if (this.age > anotherCat.age && this.weight>anotherCat.weight ||
        this.age>anotherCat.age && this.strength>anotherCat.strength ||
        this.weight > anotherCat.weight && this.strength > anotherCat.strength) {
            win=true;
        }

        if (this.age == anotherCat.age && this.weight == anotherCat.weight && this.strength>anotherCat.strength ||
                this.age==anotherCat.age && this.strength==anotherCat.strength && this.weight>anotherCat.weight ||
                this.weight==anotherCat.weight && this.strength==anotherCat.strength && this.age>anotherCat.age) {
            win=true;
        }

        return win;
    }

    public static void main(String[] args) {

    }
}
