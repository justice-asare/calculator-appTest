package com.java.main;

public class main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Person person = new Person("001", "Justice", 24);
        System.out.println(person.getName());

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
