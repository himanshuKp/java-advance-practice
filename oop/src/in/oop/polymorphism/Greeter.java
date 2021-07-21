/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 21/07/21, 9:49 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.oop.polymorphism;

import java.time.LocalTime;
import java.util.Calendar;

public class Greeter {

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        Calendar c = Calendar.getInstance();
        int timeOfDay = c.get(Calendar.HOUR_OF_DAY);

        if (timeOfDay > 6){
            greeter.greet(new GoodNightGreeting());
        } else {
            greeter.greet(new HelloWorldGreeting());
        }

    }

    private void greet(Greeting greeting) {
        greeting.perform();
    }
}
