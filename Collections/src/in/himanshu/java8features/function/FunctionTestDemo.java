/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 09/03/21, 12:37 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshu.java8features.function;

import java.util.function.Function;

public class FunctionTestDemo {
    public static void main(String[] args) {
        Function<String, Integer> stringIntegerFunction = string -> (string.length());
        System.out.println("Length of himanshu: "+stringIntegerFunction.apply("Himanshu"));
        System.out.println("Length of santosh: "+stringIntegerFunction.apply("santosh"));
    }
}
