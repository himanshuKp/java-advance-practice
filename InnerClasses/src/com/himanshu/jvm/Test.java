/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 25/03/21, 2:16 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package com.himanshu.jvm;

import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> name = Class.forName("com.himanshu.jvm.User");

        Method[] methods = name.getDeclaredMethods();

        for (Method method: methods){
            System.out.println("Method: "+method.getName());
        }
    }
}
