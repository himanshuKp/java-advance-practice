/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 03/03/21, 4:10 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package set;

import comparator.StringLengthComparator;

import java.util.Set;
import java.util.TreeSet;

public class SetOrderLengthDemo {
    public static void main(String[] args) {
        Set<String> lengthSet = new TreeSet<>(new StringLengthComparator());
        lengthSet.add("abc");
        lengthSet.add("d");
        lengthSet.add("asdfdsf");

        System.out.println(lengthSet);
    }
}
