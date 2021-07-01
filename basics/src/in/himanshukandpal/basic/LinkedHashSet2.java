/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 30/06/21, 10:07 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.basic;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSet2 {
    public static void main(String[] args) {
        Set<Integer> linkedSet = new LinkedHashSet<>();
        linkedSet.add(10);
        linkedSet.add(20);
        linkedSet.add(30);
        linkedSet.add(40);
        linkedSet.add(50);
        linkedSet.add(60);

//        Create array of integer to store linkedSet elements of size linkedSet.size()
        Integer[] elements = new Integer[linkedSet.size()];

//        convert linkedhashset to array
        elements = linkedSet.toArray(elements);

//        get the last element
        int lastElement = elements[elements.length - 1];

        System.out.println("Last element of linkedhashset: "+lastElement);
    }
}
