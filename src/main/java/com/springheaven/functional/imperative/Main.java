package com.springheaven.functional.imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;


import static com.springheaven.functional.imperative.Main.Gender.FEMALE;

public class Main {


    static Logger logger = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("PraveenRaj",Gender.MALE),
                new Person("VasanthiraDevi", FEMALE)
        );

        //Imperative Approach
        logger.info("Imperative Approach");
        List<Person> females = new ArrayList<>();

        for (Person person : people) {
            if(FEMALE.equals(person.gender)){
                females.add(person);
            }
        }
        for(Person person : females){
            System.out.println(females);
        }

        //declarative approach
        //the way that we use declarative approach is streams with collection in java
        //I am going to write the same above code by the declarative way
        logger.info("Declarative Approach");
        people.stream().
                filter(person -> FEMALE.equals(person.gender))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    static class Person
    {
        private final String name;
        private final Gender gender;

        Person(String name,Gender gender){
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender{
        MALE,FEMALE
    }
}
