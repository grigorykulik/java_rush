package com.javarush.task.task39.task3907.workers;

public class RobotWorker implements Worker {
    @Override
    public void work() {
        System.out.println("RobotWorker is working!");
    }

    public void eat() {
        // Do nothing
    }

    public void sleep() {
        // Do nothing
    }
}
