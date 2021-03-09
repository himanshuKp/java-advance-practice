/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 09/03/21, 11:55 AM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshu.java8features.predicate;

import java.util.function.Predicate;

public class PredicateArrayDemo {
    public static void main(String[] args) {
        int[] x = {0,4,10,20,30,40,50,60,77};

        Predicate<Integer> integerPredicate = value -> (value>10);
        Predicate<Integer> evenPredicate = value -> value%2==0;

        System.out.println("Greater than 10: ");
        checkArrayValue(integerPredicate, x);

        System.out.println("Even numbers: ");
        checkArrayValue(evenPredicate, x);

        System.out.println("Odd numbers: ");
        checkArrayValue(evenPredicate.negate(), x);

        System.out.println("Greater then 10 and even number: ");
        checkArrayValue(integerPredicate.and(evenPredicate), x);

        System.out.println("Greater then 10 or even number: ");
        checkArrayValue(integerPredicate.or(evenPredicate), x);
    }

    private static void checkArrayValue(Predicate<Integer> integerPredicate, int[] x) {
        for (int eachValue: x) {
            if(integerPredicate.test(eachValue)){
                System.out.println(eachValue);
            }
        }
    }
}
