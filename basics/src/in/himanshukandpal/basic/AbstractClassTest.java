/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 25/06/21, 9:37 AM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.basic;

abstract class Animal {
    public abstract void animalSound();
//    regular method
    public void sleep(){
        System.out.println("ZZZZ");
    }
}

class Dog extends Animal {
    @Override
    public void animalSound() {
        System.out.println("The pig says: wee wee.");
    }
}

public class AbstractClassTest {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.animalSound();
        dog.sleep();
    }
}
