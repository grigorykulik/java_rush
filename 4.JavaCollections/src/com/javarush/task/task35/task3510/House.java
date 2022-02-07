package com.javarush.task.task35.task3510;

import java.util.ArrayList;
import java.util.List;

/* 
Вход воспрещен!
*/

public class House<T> {

    private List<T> residents = new ArrayList<T>();

    public void enter(T resident) {
        residents.add(resident);
    }

    public void leave(T resident) {
        residents.remove(resident);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("В доме находятся:\n");
        for (T resident : residents) {
            builder.append(resident.toString()).append("\n");
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        Dog bruno = new Dog("Bruno");
        Puppy larsik = new Puppy("Larsik");
        Cat barsik = new Cat("Barsik");
        Kitten keksik = new Kitten("Keksik");

        com.javarush.task.task35.task3510.House<Dog> dogHouse = new com.javarush.task.task35.task3510.House<>();
        dogHouse.enter(bruno);
        dogHouse.enter(larsik);
        System.out.println(dogHouse.toString());

        com.javarush.task.task35.task3510.House<Cat> catHouse = new House<>();
        catHouse.enter(barsik);
        catHouse.enter(keksik);
        System.out.println(catHouse.toString());
    }
}
