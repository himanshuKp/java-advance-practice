/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 09/03/21, 11:50 AM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshu.java8features.predicate;

import java.util.function.Predicate;

public class PredicateStringDemo {
    public static void main(String[] args) {
        Predicate<String> stringPredicate = value -> (value.length()>5);
        System.out.println("XYZ length: "+stringPredicate.test("xyz"));
        System.out.println("Himanshu length: "+stringPredicate.test("himanshu"));
    }
}
