package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        switch (args[0]) {
            case "-c":
                String sDate = args[3];
                Date date = new SimpleDateFormat("dd/MM/yyyy").parse(sDate);

                if (args[2].equals("м")) {
                    allPeople.add(Person.createMale(args[1], date));
                } else {
                    allPeople.add(Person.createFemale(args[1], date));
                }

//                Person testPerson = allPeople.get(allPeople.size() - 1);
//                System.out.println(testPerson.getName() + " " + testPerson.getSex() + " " + testPerson.getBirthDate());
                System.out.println(allPeople.size() - 1);
                break;

            case "-i":
                Person person2 = allPeople.get(Integer.parseInt(args[1]));

                SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
                String formatted = sdf.format(person2.getBirthDate());

                Sex sex = person2.getSex();
                String s = sex.equals(Sex.MALE) ? "м" : "ж";


                System.out.println(person2.getName() + " " + s + " " + formatted);
                break;

            case "-u":
                String sDate2 = args[4];
                Date date2 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate2);

                Person person = allPeople.get(Integer.parseInt(args[1]));
                person.setName(args[2]);

                if (args[3].equals("м")) {
                    person.setSex(Sex.MALE);
                } else {
                    person.setSex(Sex.FEMALE);
                }

                person.setBirthDate(date2);
                allPeople.set(Integer.parseInt(args[1]), person);
                break;

            case "-d":
                Person person1 = allPeople.get(Integer.parseInt(args[1]));

                person1.setName(null);
                person1.setSex(null);
                person1.setBirthDate(null);

                allPeople.set(Integer.parseInt(args[1]), person1);
                break;
        }
    }
}
