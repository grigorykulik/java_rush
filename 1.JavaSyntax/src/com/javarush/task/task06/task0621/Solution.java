package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandFather = reader.readLine();
        Cat catGrandFather = new Cat(grandFather);

        String grandMother = reader.readLine();
        Cat catGrandMother = new Cat(grandMother);

        String father=reader.readLine();
        Cat catFather = new Cat(father, null, catGrandFather);

        String mother=reader.readLine();
        Cat catMother = new Cat(mother, catGrandMother, null);

        String son=reader.readLine();
        Cat catSon = new Cat(son, catMother, catFather);

        String daughter=reader.readLine();
        Cat catDaughter = new Cat(daughter, catMother, catFather);

        System.out.println(catGrandFather);
        System.out.println(catGrandMother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat mother;
        private Cat father;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat mother, Cat father) {
            this.name = name;
            this.mother = mother;
            this.father = father;
        }


        @Override
        public String toString() {
            if (mother == null && father !=null)
                return "The cat's name is " + name + ", no mother, father is " + father.name;
            else if (mother!= null && father == null)
                return "The cat's name is " + name + ", mother is " + mother.name + ", no father";
            else if (mother!=null && father != null)
                return "The cat's name is " + name + ", mother is " + mother.name + ", father is " + father.name;
            else
                return "The cat's name is " + name + ", no mother, no father";
        }
    }

}
