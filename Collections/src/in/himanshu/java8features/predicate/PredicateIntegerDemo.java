/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 09/03/21, 11:46 AM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshu.java8features.predicate;

import java.util.function.Predicate;

public class PredicateIntegerDemo {
    public static void main(String[] args) {
        Predicate<Integer> integerPredicate = value -> (value>20);
        System.out.println("Value 15: "+integerPredicate.test(15));
        System.out.println("Value 20: "+integerPredicate.test(20));
        System.out.println("Value 21: "+integerPredicate.test(21));
    }
}
