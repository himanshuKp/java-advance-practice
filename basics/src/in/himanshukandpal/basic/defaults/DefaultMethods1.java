/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 03/10/21, 2:43 AM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.basic.defaults;

interface Greeting {
    default void hello(){
        System.out.println("hello from greeting");
    }
}

interface GreetingExt extends Greeting {
    default void hello(){
        System.out.println("Hello from greeting extension.");
    }
}

class Greet implements GreetingExt {
    @Override
    public void hello() {
        System.out.println("hello from greet.");
    }
}

public class DefaultMethods1 extends Greet implements GreetingExt, Greeting {
    public static void main(String[] args) {
        new DefaultMethods1().hello();
    }
}
