/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 21/07/21, 9:49 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.oop.polymorphism;

import java.util.Calendar;

public class Greeter {
    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        Calendar c = Calendar.getInstance();
        int timeOfDay = c.get(Calendar.HOUR_OF_DAY);

        Greeting goodMorningGreeting = () -> {
            System.out.println("Good Morning");
        };

        Greeting goodEveningGreeting = new Greeting() {
            @Override
            public void perform() {
                System.out.println("Good Evening.");
            }
        };

        if (timeOfDay > 18){
            greeter.greet(new GoodNightGreeting());
        } else {
            greeter.greet(new HelloWorldGreeting());
        }

        Greeting myLambdaFunction = () -> {
            System.out.println("Lambda expression");
        };

        GetSum findSumOfElements = (int a, int b) -> {
            System.out.println(a+b);
        };
    }

    private void greet(Greeting greeting) {
        greeting.perform();
    }
}

interface GetSum {
    void sum(int x, int y);
}