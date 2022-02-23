package com.javarush.task.task15.task1529;

public class Plane implements CanFly {
    private int passNum;

    @Override
    public void fly() {

    }

    public Plane(int i) {
        this.passNum = i;
    }
}
