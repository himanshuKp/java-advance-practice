/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 22/07/21, 4:15 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.lambda.exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Unit1ExampleOOP {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Chales", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39)
                );

//        sort list by last name
        Collections.sort(people, Comparator.<Person, String>comparing(Person::getLastName));

//        create a method that prints all elements in the list
        System.out.println("Prints all peoples.");
        printAllElements(people);

//        create a method that prints all people that have last name beginning with c
        System.out.println("\nPrints persons whose last name starts with c.");
        printConditionally(people, p -> p.getLastName().startsWith("C"));
    }

    private static void printConditionally(List<Person> people, Predicate<Person> c) {
        for (Person p: people){
            if (c.test(p)) {
                System.out.println(p);
            }
        }
    }

    private static void printAllElements(List<Person> people) {
        for (Person person: people){
            System.out.println(person);
        }
    }
}