/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 22/06/21, 8:48 AM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.basic;

class Vehicle {
    int maxSpeed = 120;
}

class Car extends Vehicle{
    int maxSpeed = 180;

    void display(){
        System.out.println("Maximum speed: "+super.maxSpeed);
    }
}

class Person {

    public Person() {
        System.out.println("Person class constructor.");
    }

    void display(){
        System.out.println("This is person class.");
    }
}

class Student extends Person {

    public Student() {
        super();
        System.out.println("Student class constructor.");
    }

    void display(){
        System.out.println("This is student class.");
    }

    void print(){
        display();
        super.display();
    }
}

public class SuperTest {
    public static void main(String[] args) {
//        Car small = new Car();
//        small.display();
        Student student = new Student();
    }
}
