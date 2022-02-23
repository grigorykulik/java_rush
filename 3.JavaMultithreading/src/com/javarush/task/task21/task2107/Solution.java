package com.javarush.task.task21.task2107;

import java.util.LinkedHashMap;
import java.util.Map;

/* 
Глубокое клонирование карты
*/

public class Solution implements Cloneable {
    public static void main(String[] args) {
        com.javarush.task.task21.task2107.Solution solution = new com.javarush.task.task21.task2107.Solution();
        solution.users.put("Hubert", new com.javarush.task.task21.task2107.Solution.User(172, "Hubert"));
        solution.users.put("Zapp", new com.javarush.task.task21.task2107.Solution.User(41, "Zapp"));
        com.javarush.task.task21.task2107.Solution clone = null;
        try {
            clone = (com.javarush.task.task21.task2107.Solution) solution.clone();
            System.out.println(solution);
            System.out.println(clone);

            System.out.println(solution.users);
            System.out.println(clone.users);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace(System.err);
        }
    }

    protected Map<String, com.javarush.task.task21.task2107.Solution.User> users = new LinkedHashMap<>();

    public static class User implements Cloneable {
        int age;
        String name;

        public User(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            com.javarush.task.task21.task2107.Solution.User user = (com.javarush.task.task21.task2107.Solution.User) o;

            if (age != user.age) return false;
            return name != null ? name.equals(user.name) : user.name == null;
        }

        @Override
        public int hashCode() {
            int result = age;
            result = 31 * result + (name != null ? name.hashCode() : 0);
            return result;
        }
    }

    public Object clone() throws CloneNotSupportedException {
        com.javarush.task.task21.task2107.Solution o = (com.javarush.task.task21.task2107.Solution) super.clone();

        //clone users
        Map<String, com.javarush.task.task21.task2107.Solution.User> newUsers = new LinkedHashMap<>();
        for (String key : o.users.keySet()) {
            com.javarush.task.task21.task2107.Solution.User user = o.users.get(key);
            newUsers.put(key, (com.javarush.task.task21.task2107.Solution.User) user.clone());
        }
        o.users = newUsers;

        return o;
    }
}
