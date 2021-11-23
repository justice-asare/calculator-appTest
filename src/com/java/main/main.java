package com.java.main;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
//        System.out.println("Hello World");

//        Person person = new Person("001", "Justice", 24);
//        System.out.println(person.getName());
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("001", "Justice Owusu", 24));
        personList.add(new Person("002", "Priscilla Owusu", 21));
        personList.add(new Person("003", "Samuel", 25));
        personList.add(new Person("002", "Andrews", 23));

        for(Person person: personList){
            System.out.println(person.getName());
        }


    }

    static class Person {

        private final String id;
        private final String name;
        private final int age;

        public Person(String id, String name, int age) {
            this.id = id;
            this.name = name;
            this.age = age;
        }

        public String getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }
}
