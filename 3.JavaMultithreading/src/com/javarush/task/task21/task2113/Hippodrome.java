package com.javarush.task.task21.task2113;

import org.w3c.dom.html.HTMLObjectElement;

import java.util.*;

public class Hippodrome {
    private List<Horse> horses;
    public static Hippodrome game;

    public Hippodrome(List horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public void run() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            Thread.sleep(200);
        }
    }

    public void move() {
        for (Horse h : horses) {
            h.move();
        }
    }

    public void print() {
        for (Horse h : horses) {
            h.print();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }

    public Horse getWinner() {
        return horses
                .stream()
                .max(Comparator.comparing(Horse::getDistance))
                .orElseThrow(NoSuchElementException::new);
    }

    public void printWinner() {
        System.out.println("Winner is " + getWinner().getName() + "!");
    }

    public static void main(String[] args) throws InterruptedException {
        Horse h1 = new Horse("horse1", 3, 0);
        Horse h2 = new Horse("horse2", 3, 0);
        Horse h3 = new Horse("horse3", 3, 0);

        ArrayList<Horse> horses = new ArrayList<>();
        horses.addAll(Arrays.asList(h1, h2, h3));

        game = new Hippodrome(horses);
        game.run();

        game.printWinner();
    }
}
