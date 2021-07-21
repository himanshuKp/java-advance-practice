/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 21/07/21, 9:52 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.oop.polymorphism;

public class GoodNightGreeting implements Greeting{
    @Override
    public void perform() {
        System.out.println("Good Night Greeting.");
    }
}
