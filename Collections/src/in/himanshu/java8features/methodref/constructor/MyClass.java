/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 09/03/21, 3:23 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshu.java8features.methodref.constructor;

public class MyClass {
    private String message;

    MyClass(String message) {
        this.message = message;
        System.out.println("Inside the constructor: "+message);
    }
}
