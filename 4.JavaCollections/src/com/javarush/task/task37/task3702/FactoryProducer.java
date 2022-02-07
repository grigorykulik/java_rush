package com.javarush.task.task37.task3702;

import com.javarush.task.task37.task3702.female.FemaleFactory;
import com.javarush.task.task37.task3702.male.MaleFactory;

public class FactoryProducer {
    public enum HumanFactoryType {
        MALE,
        FEMALE
    }

    public static AbstractFactory getFactory(HumanFactoryType hft) {
        AbstractFactory af = (hft == HumanFactoryType.MALE) ? new MaleFactory() : new FemaleFactory();
        return af;
    }
}
