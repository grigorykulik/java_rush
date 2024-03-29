package com.javarush.task.task08.task0820;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution {

    public static class Cat {

    }

    public static class Dog {

    }

    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        System.out.println();

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        Set<Cat> result = new HashSet<Cat>();

            Cat cat1=new Cat();
            Cat cat2=new Cat();
            Cat cat3=new Cat();
            Cat cat4=new Cat();

            result.add(cat1);
            result.add(cat2);
            result.add(cat3);
            result.add(cat4);

        return result;
    }

    public static Set<Dog> createDogs() {
        Set<Dog> result = new HashSet<Dog>();

        Dog dog1=new Dog();
        Dog dog2=new Dog();
        Dog dog3=new Dog();

        result.add(dog1);
        result.add(dog2);
        result.add(dog3);

        return result;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        Set<Object> pets=new HashSet<>();
        pets.addAll(cats);
        pets.addAll(dogs);
        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        Iterator<Object> it=pets.iterator();

        while (it.hasNext()) {
            Object o=it.next();
            if (cats.contains(o)) it.remove();
        }
    }

    public static void printPets(Set<Object> pets) {
        for (Object o:pets) {
            System.out.println(o);
        }
    }

    //напишите тут ваш код
}
