/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 21/06/21, 11:48 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.staticconcept;

public class StaticConcept {
    public static void main(String[] args) {
        Base obj1 = new Derived();
        obj1.display();
        obj1.print();
    }
}

class Base {
    public static void display(){
        System.out.println("Static or class method from base.");
    }
    public void print(){
        System.out.println("Non-static or instance method from base.");
    }
}

class Derived extends Base {

    public static void display(){
        System.out.println("Static or class method from derived.");
    }

    @Override
    public void print() {
        System.out.println("Non-static or instance method from derived.");
    }
}
