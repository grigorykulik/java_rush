package com.javarush.task.task35.task3505;

import java.security.Key;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ConvertableUtil {

    public static <T, V extends Convertable<T>> Map<T, V> convert(List<V> list) {
        Map<T, V> result = new HashMap<>();
        list
                .stream()
                .forEach(l -> {
                        result.put(l.getKey(), l);
                });
        return result;
    }


}
