package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;

        ArrayList<String> options = new ArrayList<>();
        options.add("user");
        options.add("loser");
        options.add("coder");
        options.add("proger");

        ArrayList<String> input = new ArrayList<>();

        do {
            key = reader.readLine();
            if (options.contains(key)) {
                input.add(key);
            } else {
                break;
            }
        } while (options.contains(key));

        System.out.println(input);

        {
            for (String s:input) {
                switch (s){
                    case "user":
                        person = new Person.User();
                        break;
                    case "loser":
                        person = new Person.Loser();
                        break;
                    case "coder":
                        person = new Person.Coder();
                        break;
                    case "proger":
                        person = new Person.Proger();
                        break;
                }

                doWork(person);
            }

             //вызываем doWork

        }
    }

    public static void doWork(Person person) {
        if (person instanceof Person.User) {
            ((Person.User) person).live();
        } else if (person instanceof Person.Loser) {
            ((Person.Loser) person).doNothing();
        } else if (person instanceof Person.Coder) {
            ((Person.Coder) person).writeCode();
        } else if (person instanceof Person.Proger){
            ((Person.Proger) person).enjoy();
        }
    }

}
